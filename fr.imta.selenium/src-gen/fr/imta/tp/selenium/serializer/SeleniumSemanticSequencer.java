package fr.imta.tp.selenium.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.tp.selenium.selenium.Array;
import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.Click;
import fr.imta.tp.selenium.selenium.Close;
import fr.imta.tp.selenium.selenium.Fill;
import fr.imta.tp.selenium.selenium.Find;
import fr.imta.tp.selenium.selenium.FindMultiple;
import fr.imta.tp.selenium.selenium.Get;
import fr.imta.tp.selenium.selenium.Go;
import fr.imta.tp.selenium.selenium.Len;
import fr.imta.tp.selenium.selenium.Model;
import fr.imta.tp.selenium.selenium.Open;
import fr.imta.tp.selenium.selenium.Operation;
import fr.imta.tp.selenium.selenium.Procedure;
import fr.imta.tp.selenium.selenium.ProcedureBody;
import fr.imta.tp.selenium.selenium.ProcedureCall;
import fr.imta.tp.selenium.selenium.ProcedureParameter;
import fr.imta.tp.selenium.selenium.Program;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.Show;
import fr.imta.tp.selenium.selenium.ShowMultiple;
import fr.imta.tp.selenium.selenium.Variable;
import fr.imta.tp.selenium.selenium.Verify;
import fr.imta.tp.selenium.services.SeleniumGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SeleniumSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SeleniumGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SeleniumPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SeleniumPackage.ARRAY:
				if(context == grammarAccess.getArrayRule() ||
				   context == grammarAccess.getSeleniumTypeRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.ARRAY_ACCESS:
				if(context == grammarAccess.getArrayAccessRule()) {
					sequence_ArrayAccess(context, (ArrayAccess) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.CLICK:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getClickRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Click(context, (Click) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.CLOSE:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getCloseRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Close(context, (Close) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.FILL:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getFillRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Fill(context, (Fill) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.FIND:
				if(context == grammarAccess.getCallNativeWithResultRule() ||
				   context == grammarAccess.getFindRule()) {
					sequence_Find(context, (Find) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Find_VariableDeclaration(context, (Find) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.FIND_MULTIPLE:
				if(context == grammarAccess.getFindMultipleRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_FindMultiple(context, (FindMultiple) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.GET:
				if(context == grammarAccess.getCallNativeWithResultRule() ||
				   context == grammarAccess.getGetRule()) {
					sequence_Get(context, (Get) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Get_VariableDeclaration(context, (Get) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.GO:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getGoRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Go(context, (Go) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.LEN:
				if(context == grammarAccess.getCallNativeWithResultRule() ||
				   context == grammarAccess.getLenRule()) {
					sequence_Len(context, (Len) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Len_VariableDeclaration(context, (Len) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.OPEN:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getOpenRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Open(context, (Open) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Operation_VariableDeclaration(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.PROCEDURE_BODY:
				if(context == grammarAccess.getProcedureBodyRule()) {
					sequence_ProcedureBody(context, (ProcedureBody) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.PROCEDURE_CALL:
				if(context == grammarAccess.getProcedureCallRule()) {
					sequence_ProcedureCall(context, (ProcedureCall) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_ProcedureCall_VariableDeclaration(context, (ProcedureCall) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.PROCEDURE_PARAMETER:
				if(context == grammarAccess.getProcedureParameterRule()) {
					sequence_ProcedureParameter(context, (ProcedureParameter) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.SHOW:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getShowRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Show(context, (Show) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.SHOW_MULTIPLE:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getShowMultipleRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ShowMultiple(context, (ShowMultiple) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.VARIABLE:
				if(context == grammarAccess.getSeleniumTypeRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case SeleniumPackage.VERIFY:
				if(context == grammarAccess.getCallNativeRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVerifyRule()) {
					sequence_Verify(context, (Verify) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     id=INT
	 */
	protected void sequence_ArrayAccess(EObject context, ArrayAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.ARRAY_ACCESS__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.ARRAY_ACCESS__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayAccessAccess().getIdINTTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=VAR_NAME
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.SELENIUM_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.SELENIUM_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayAccess().getNameVAR_NAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Click(EObject context, Click semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     browser=BROWSER
	 */
	protected void sequence_Close(EObject context, Close semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.CLOSE__BROWSER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.CLOSE__BROWSER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCloseAccess().getBrowserBROWSEREnumRuleCall_1_0(), semanticObject.getBrowser());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] value=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Fill(EObject context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prop=PROPERTY value=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess? array=Array)
	 */
	protected void sequence_FindMultiple(EObject context, FindMultiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prop=PROPERTY value=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Find(EObject context, Find semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prop=PROPERTY value=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess? variable=Variable)
	 */
	protected void sequence_Find_VariableDeclaration(EObject context, Find semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prop=PROPERTY elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Get(EObject context, Get semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prop=PROPERTY elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess? variable=Variable)
	 */
	protected void sequence_Get_VariableDeclaration(EObject context, Get semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (location=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Go(EObject context, Go semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Len(EObject context, Len semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess? variable=Variable)
	 */
	protected void sequence_Len_VariableDeclaration(EObject context, Len semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     program=Program
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.MODEL__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.MODEL__PROGRAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_0(), semanticObject.getProgram());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     browser=BROWSER
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.OPEN__BROWSER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.OPEN__BROWSER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpenAccess().getBrowserBROWSEREnumRuleCall_1_0(), semanticObject.getBrowser());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (strvalue=STRING | intvalue=INT)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((strvalue=STRING | intvalue=INT) variable=Variable)
	 */
	protected void sequence_Operation_VariableDeclaration(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement* value=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_ProcedureBody(EObject context, ProcedureBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (proc=[Procedure|PROC_NAME] (params+=[SeleniumType|VAR_NAME] arrayAccess+=ArrayAccess?)*)
	 */
	protected void sequence_ProcedureCall(EObject context, ProcedureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (proc=[Procedure|PROC_NAME] (params+=[SeleniumType|VAR_NAME] arrayAccess+=ArrayAccess?)* variable=Variable)
	 */
	protected void sequence_ProcedureCall_VariableDeclaration(EObject context, ProcedureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VAR_NAME type=TYPE)
	 */
	protected void sequence_ProcedureParameter(EObject context, ProcedureParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.PROCEDURE_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.PROCEDURE_PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.PROCEDURE_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.PROCEDURE_PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcedureParameterAccess().getNameVAR_NAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProcedureParameterAccess().getTypeTYPEEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PROC_NAME params+=ProcedureParameter* type=TYPE body=ProcedureBody)
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (procedures+=Procedure* statements+=Statement+)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_ShowMultiple(EObject context, ShowMultiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] arrayAccess=ArrayAccess?)
	 */
	protected void sequence_Show(EObject context, Show semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=VAR_NAME
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SeleniumPackage.Literals.SELENIUM_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumPackage.Literals.SELENIUM_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameVAR_NAMETerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elem=[SeleniumType|VAR_NAME] leftArrayAccess=ArrayAccess? comp=COMPARATOR value=[SeleniumType|VAR_NAME] rightArrayAccess=ArrayAccess?)
	 */
	protected void sequence_Verify(EObject context, Verify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
