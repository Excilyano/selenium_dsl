/*
* generated by Xtext
*/
package fr.imta.tp.selenium.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.imta.tp.selenium.services.SeleniumGrammarAccess;

public class SeleniumParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SeleniumGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.imta.tp.selenium.parser.antlr.internal.InternalSeleniumParser createParser(XtextTokenStream stream) {
		return new fr.imta.tp.selenium.parser.antlr.internal.InternalSeleniumParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public SeleniumGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SeleniumGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
