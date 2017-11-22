/*
 * generated by Xtext
 */
package fr.imta.tp.selenium.generator

import fr.imta.tp.selenium.selenium.Array
import fr.imta.tp.selenium.selenium.BROWSER
import fr.imta.tp.selenium.selenium.COMPARATOR
import fr.imta.tp.selenium.selenium.CallNative
import fr.imta.tp.selenium.selenium.CallNativeWithResult
import fr.imta.tp.selenium.selenium.Click
import fr.imta.tp.selenium.selenium.Close
import fr.imta.tp.selenium.selenium.Fill
import fr.imta.tp.selenium.selenium.Find
import fr.imta.tp.selenium.selenium.FindMultiple
import fr.imta.tp.selenium.selenium.Get
import fr.imta.tp.selenium.selenium.Go
import fr.imta.tp.selenium.selenium.Len
import fr.imta.tp.selenium.selenium.Open
import fr.imta.tp.selenium.selenium.Operation
import fr.imta.tp.selenium.selenium.Procedure
import fr.imta.tp.selenium.selenium.ProcedureCall
import fr.imta.tp.selenium.selenium.Program
import fr.imta.tp.selenium.selenium.Show
import fr.imta.tp.selenium.selenium.ShowMultiple
import fr.imta.tp.selenium.selenium.TYPE
import fr.imta.tp.selenium.selenium.Variable
import fr.imta.tp.selenium.selenium.VariableDeclaration
import fr.imta.tp.selenium.selenium.Verify
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SeleniumGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (p : resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile(
	        	"Main.java",
	        	p.generateProgram)
		}
	}
	
	def generateProgram(Program p) '''
		import org.junit.Assert;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.By;
		
		import java.util.List;
		import java.lang.StringBuilder;
		
		public class Main {
			«FOR pr : p.procedures»
                «pr.generateProcedure»
            «ENDFOR»
		
			public static void main(String[] args) {
					«FOR st : p.statements»
		                «st.generate»
		            «ENDFOR»
			}
		}
	'''
	
	def generateProcedure(Procedure pr) '''
		«val procT = getType(pr.type)»
		public static «procT» «pr.name»(«FOR par : pr.params»«val t = getType(par.type)»«t» «par.name»«IF pr.params.indexOf(par) < (pr.params.length -1)», «ENDIF»«ENDFOR») {
				«FOR st : pr.body.statements»
					«st.generate»
				«ENDFOR»
				return «pr.body.value.name»;
		}
	'''
	
	def getType(TYPE type){
		switch(type){
			case TYPE.INTEGER: "Integer"
			case TYPE.STRING: "String"
			case TYPE.WEBELEMENT: "WebElement"
			case TYPE.ARRAY: "List<WebElement>"
		}
	}
	
	def dispatch generate(VariableDeclaration vd) '''
		«vd.generateVariableDeclaration»
	'''
	
	def dispatch generateVariableDeclaration(ProcedureCall pc) '''
		«val procT = getType(pc.proc.getType)»
		«procT» «pc.variable.name» = «pc.proc.name»(«FOR par : pc.params»«par.name»«IF pc.params.indexOf(par) < (pc.params.length -1)», «ENDIF»«ENDFOR»);
	'''
	
	def dispatch generateVariableDeclaration(Operation op) '''
		«IF op.strvalue != null»
			String «op.variable.name» = "«op.strvalue»";
		«ELSE»
			Integer «op.variable.name» = «op.intvalue»;
		«ENDIF»
	'''
	
	// def dispatch generateCallNative(Open op)
	def dispatch generate(CallNative cn) '''
		«cn.generateCallNative»
	'''
	
	def dispatch generateVariableDeclaration(CallNativeWithResult cn) '''
		«cn.generateCallNativeWithResult(cn.variable.name)»
	'''
	
	def dispatch generateCallNative(Open op) '''
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		«IF op.browser == BROWSER.CHROME»
			WebDriver driver = new ChromeDriver();
		«ELSEIF op.browser == BROWSER.FIREFOX»
			WebDriver driver = new FirefoxDriver();
		«ENDIF»
		driver.manage().window().maximize();
	'''
	
	def dispatch generateCallNative(Close cl) '''
		driver.close();
	'''
	
	def dispatch generateCallNative(Go g) '''
		driver.get(«g.location.name»);
	'''
	
	def dispatch generateCallNative(Fill f) '''
		«f.elem.name».sendKeys("«f.value.name»");
	'''
	
	def dispatch generateCallNative(Click cl) '''
		«cl.elem».click();
	'''
	
	def dispatch generateCallNative(Verify v) '''
		«IF v.comp == COMPARATOR.EQUALS»
			Assert.assertEquals(«v.elem.name», «v.value.name»);
		«ELSEIF v.comp == COMPARATOR.CONTAINS»
			Assert.assertTrue(«v.elem.name».contains(«v.value.name»));
		«ELSEIF v.comp == COMPARATOR.DIFFERENT»
			Assert.assertNotEquals(«v.elem.name», «v.value.name»);
		«ELSEIF v.comp == COMPARATOR.GREATER»
			Assert.assertTrue(«v.elem.name» > «v.value.name»);
		«ELSEIF v.comp == COMPARATOR.LOWER»
			Assert.assertTrue(«v.elem.name» < «v.value.name»);
		«ELSEIF v.comp == COMPARATOR.STARTS»
			Assert.assertTrue(«v.elem.name».startsWith(«v.value.name»));
		«ELSEIF v.comp == COMPARATOR.ENDS»
			Assert.assertTrue(«v.elem.name».endsWith(«v.value.name»));
		«ENDIF»
	'''
	
	def dispatch generateCallNative(Show sh) '''
		«IF sh.arrayAccess != null»
			System.out.println(«sh.elem.name».get(«sh.arrayAccess.id»).toString());
		«ELSE»
			System.out.println(«sh.elem.name».toString());
		«ENDIF»
	'''
	
	def dispatch generateCallNative(ShowMultiple sm) '''
	StringBuilder sb = new StringBuilder();
	sb.append("«sm.elem.name» => [\n");
	for(WebElement elem : «sm.elem.name») {
		sb.append("\tElement : " + elem.getTagName() + ", \n");
		sb.append("\tId : " + elem.getAttribute("id") + ", \n");
		sb.append("\tName : " + elem.getAttribute("name") + ", \n");
		sb.append("\tClass : " + elem.getAttribute("class") + ", \n");
		sb.append("\tValue : " + elem.getAttribute("value") + ", \n");
		sb.append("\tContent : " + elem.getText() + "\n\n");
	}
	sb.append("]\n");
	System.out.println(sb.toString());
	'''
	
	def dispatch generateCallNativeWithResult(Find f, String variableName) '''
		WebElement «variableName» = driver.findElement(By.«f.prop»(«f.value.name»));
	'''
	
	def dispatch generate(FindMultiple f) '''
		List<WebElement> «f.array.name» = driver.findElements(By.«f.prop»(«f.value.name»));
	'''
	
	def dispatch generateCallNativeWithResult(Get g, String variableName) '''
		String «variableName» = «g.elem.name».getAttribute("«g.prop»");
	'''
	
	def dispatch generateCallNativeWithResult(Len l, String variableName) '''
		«l.elem.generateLength(variableName)»
	'''
	
	def dispatch generateLength(Variable v, String variableName) '''
		Integer «variableName» = «v.name».length();
	'''
	
	def dispatch generateLength(Array a, String variableName) '''
		Integer «variableName» = «a.name».size();
	'''
	
	}
