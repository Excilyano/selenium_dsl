/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.tp.selenium.selenium.SeleniumFactory
 * @model kind="package"
 * @generated
 */
public interface SeleniumPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "selenium";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imta.fr/tp/selenium/Selenium";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "selenium";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SeleniumPackage eINSTANCE = fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ModelImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ProgramImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROCEDURES = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ProcedureImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__BODY = 3;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureParameterImpl <em>Procedure Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ProcedureParameterImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedureParameter()
   * @generated
   */
  int PROCEDURE_PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_PARAMETER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Procedure Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureBodyImpl <em>Procedure Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ProcedureBodyImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedureBody()
   * @generated
   */
  int PROCEDURE_BODY = 4;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_BODY__STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_BODY__VALUE = 1;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_BODY__ARRAY_ACCESS = 2;

  /**
   * The number of structural features of the '<em>Procedure Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_BODY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.StatementImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.VariableDeclarationImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.FindMultipleImpl <em>Find Multiple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.FindMultipleImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getFindMultiple()
   * @generated
   */
  int FIND_MULTIPLE = 7;

  /**
   * The feature id for the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_MULTIPLE__PROP = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_MULTIPLE__VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_MULTIPLE__ARRAY_ACCESS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_MULTIPLE__ARRAY = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Find Multiple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_MULTIPLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedureCall()
   * @generated
   */
  int PROCEDURE_CALL = 8;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__VARIABLE = VARIABLE_DECLARATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__PROC = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__PARAMS = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__ARRAY_ACCESS = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Procedure Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.OperationImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 9;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VARIABLE = VARIABLE_DECLARATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Strvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__STRVALUE = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Intvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__INTVALUE = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.CallNativeImpl <em>Call Native</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.CallNativeImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getCallNative()
   * @generated
   */
  int CALL_NATIVE = 10;

  /**
   * The number of structural features of the '<em>Call Native</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NATIVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.CallNativeWithResultImpl <em>Call Native With Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.CallNativeWithResultImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getCallNativeWithResult()
   * @generated
   */
  int CALL_NATIVE_WITH_RESULT = 11;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NATIVE_WITH_RESULT__VARIABLE = VARIABLE_DECLARATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Call Native With Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NATIVE_WITH_RESULT_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.OpenImpl <em>Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.OpenImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getOpen()
   * @generated
   */
  int OPEN = 12;

  /**
   * The feature id for the '<em><b>Browser</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__BROWSER = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.CloseImpl <em>Close</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.CloseImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getClose()
   * @generated
   */
  int CLOSE = 13;

  /**
   * The feature id for the '<em><b>Browser</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE__BROWSER = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Close</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.GoImpl <em>Go</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.GoImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getGo()
   * @generated
   */
  int GO = 14;

  /**
   * The feature id for the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO__LOCATION = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO__ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Go</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.FindImpl <em>Find</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.FindImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getFind()
   * @generated
   */
  int FIND = 15;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND__VARIABLE = CALL_NATIVE_WITH_RESULT__VARIABLE;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND__ARRAY_ACCESS = CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS;

  /**
   * The feature id for the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND__PROP = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND__VALUE = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Find</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_FEATURE_COUNT = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.FillImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getFill()
   * @generated
   */
  int FILL = 16;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__ELEM = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__VALUE = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ClickImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getClick()
   * @generated
   */
  int CLICK = 17;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__ELEM = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl <em>Verify</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.VerifyImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getVerify()
   * @generated
   */
  int VERIFY = 18;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__ELEM = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__LEFT_ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Comp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__COMP = CALL_NATIVE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__VALUE = CALL_NATIVE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__RIGHT_ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Verify</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ShowImpl <em>Show</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ShowImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getShow()
   * @generated
   */
  int SHOW = 19;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW__ELEM = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW__ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Show</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ShowMultipleImpl <em>Show Multiple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ShowMultipleImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getShowMultiple()
   * @generated
   */
  int SHOW_MULTIPLE = 20;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MULTIPLE__ELEM = CALL_NATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MULTIPLE__ARRAY_ACCESS = CALL_NATIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Show Multiple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MULTIPLE_FEATURE_COUNT = CALL_NATIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.GetImpl <em>Get</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.GetImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getGet()
   * @generated
   */
  int GET = 21;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET__VARIABLE = CALL_NATIVE_WITH_RESULT__VARIABLE;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET__ARRAY_ACCESS = CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS;

  /**
   * The feature id for the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET__PROP = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET__ELEM = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Get</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_FEATURE_COUNT = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.LenImpl <em>Len</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.LenImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getLen()
   * @generated
   */
  int LEN = 22;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEN__VARIABLE = CALL_NATIVE_WITH_RESULT__VARIABLE;

  /**
   * The feature id for the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEN__ARRAY_ACCESS = CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS;

  /**
   * The feature id for the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEN__ELEM = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Len</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEN_FEATURE_COUNT = CALL_NATIVE_WITH_RESULT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.SeleniumTypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumTypeImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getSeleniumType()
   * @generated
   */
  int SELENIUM_TYPE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELENIUM_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELENIUM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.VariableImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = SELENIUM_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = SELENIUM_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ArrayImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__NAME = SELENIUM_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = SELENIUM_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.impl.ArrayAccessImpl <em>Array Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.impl.ArrayAccessImpl
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getArrayAccess()
   * @generated
   */
  int ARRAY_ACCESS = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__ID = 0;

  /**
   * The number of structural features of the '<em>Array Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.BROWSER <em>BROWSER</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.BROWSER
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getBROWSER()
   * @generated
   */
  int BROWSER = 27;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.PROPERTY <em>PROPERTY</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.PROPERTY
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getPROPERTY()
   * @generated
   */
  int PROPERTY = 28;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.COMPARATOR <em>COMPARATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.COMPARATOR
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getCOMPARATOR()
   * @generated
   */
  int COMPARATOR = 29;

  /**
   * The meta object id for the '{@link fr.imta.tp.selenium.selenium.TYPE <em>TYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.selenium.selenium.TYPE
   * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getTYPE()
   * @generated
   */
  int TYPE = 30;


  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.imta.tp.selenium.selenium.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Model#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see fr.imta.tp.selenium.selenium.Model#getProgram()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Program();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see fr.imta.tp.selenium.selenium.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.selenium.selenium.Program#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see fr.imta.tp.selenium.selenium.Program#getProcedures()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Procedures();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.selenium.selenium.Program#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see fr.imta.tp.selenium.selenium.Program#getStatements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Statements();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see fr.imta.tp.selenium.selenium.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp.selenium.selenium.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.selenium.selenium.Procedure#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see fr.imta.tp.selenium.selenium.Procedure#getParams()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Params();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Procedure#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.imta.tp.selenium.selenium.Procedure#getType()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Type();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Procedure#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see fr.imta.tp.selenium.selenium.Procedure#getBody()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Body();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.ProcedureParameter <em>Procedure Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Parameter</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureParameter
   * @generated
   */
  EClass getProcedureParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.ProcedureParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureParameter#getName()
   * @see #getProcedureParameter()
   * @generated
   */
  EAttribute getProcedureParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.ProcedureParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureParameter#getType()
   * @see #getProcedureParameter()
   * @generated
   */
  EAttribute getProcedureParameter_Type();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.ProcedureBody <em>Procedure Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Body</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureBody
   * @generated
   */
  EClass getProcedureBody();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.selenium.selenium.ProcedureBody#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureBody#getStatements()
   * @see #getProcedureBody()
   * @generated
   */
  EReference getProcedureBody_Statements();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.ProcedureBody#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureBody#getValue()
   * @see #getProcedureBody()
   * @generated
   */
  EReference getProcedureBody_Value();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.ProcedureBody#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureBody#getArrayAccess()
   * @see #getProcedureBody()
   * @generated
   */
  EReference getProcedureBody_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see fr.imta.tp.selenium.selenium.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see fr.imta.tp.selenium.selenium.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.VariableDeclaration#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see fr.imta.tp.selenium.selenium.VariableDeclaration#getVariable()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Variable();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.FindMultiple <em>Find Multiple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Find Multiple</em>'.
   * @see fr.imta.tp.selenium.selenium.FindMultiple
   * @generated
   */
  EClass getFindMultiple();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.FindMultiple#getProp <em>Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop</em>'.
   * @see fr.imta.tp.selenium.selenium.FindMultiple#getProp()
   * @see #getFindMultiple()
   * @generated
   */
  EAttribute getFindMultiple_Prop();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.FindMultiple#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.imta.tp.selenium.selenium.FindMultiple#getValue()
   * @see #getFindMultiple()
   * @generated
   */
  EReference getFindMultiple_Value();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.FindMultiple#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.FindMultiple#getArrayAccess()
   * @see #getFindMultiple()
   * @generated
   */
  EReference getFindMultiple_ArrayAccess();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.FindMultiple#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see fr.imta.tp.selenium.selenium.FindMultiple#getArray()
   * @see #getFindMultiple()
   * @generated
   */
  EReference getFindMultiple_Array();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.ProcedureCall <em>Procedure Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Call</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureCall
   * @generated
   */
  EClass getProcedureCall();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.ProcedureCall#getProc <em>Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Proc</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureCall#getProc()
   * @see #getProcedureCall()
   * @generated
   */
  EReference getProcedureCall_Proc();

  /**
   * Returns the meta object for the reference list '{@link fr.imta.tp.selenium.selenium.ProcedureCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Params</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureCall#getParams()
   * @see #getProcedureCall()
   * @generated
   */
  EReference getProcedureCall_Params();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.selenium.selenium.ProcedureCall#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.ProcedureCall#getArrayAccess()
   * @see #getProcedureCall()
   * @generated
   */
  EReference getProcedureCall_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see fr.imta.tp.selenium.selenium.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Operation#getStrvalue <em>Strvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strvalue</em>'.
   * @see fr.imta.tp.selenium.selenium.Operation#getStrvalue()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Strvalue();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Operation#getIntvalue <em>Intvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intvalue</em>'.
   * @see fr.imta.tp.selenium.selenium.Operation#getIntvalue()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Intvalue();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.CallNative <em>Call Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Native</em>'.
   * @see fr.imta.tp.selenium.selenium.CallNative
   * @generated
   */
  EClass getCallNative();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.CallNativeWithResult <em>Call Native With Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Native With Result</em>'.
   * @see fr.imta.tp.selenium.selenium.CallNativeWithResult
   * @generated
   */
  EClass getCallNativeWithResult();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.CallNativeWithResult#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.CallNativeWithResult#getArrayAccess()
   * @see #getCallNativeWithResult()
   * @generated
   */
  EReference getCallNativeWithResult_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open</em>'.
   * @see fr.imta.tp.selenium.selenium.Open
   * @generated
   */
  EClass getOpen();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Open#getBrowser <em>Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Browser</em>'.
   * @see fr.imta.tp.selenium.selenium.Open#getBrowser()
   * @see #getOpen()
   * @generated
   */
  EAttribute getOpen_Browser();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Close <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Close</em>'.
   * @see fr.imta.tp.selenium.selenium.Close
   * @generated
   */
  EClass getClose();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Close#getBrowser <em>Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Browser</em>'.
   * @see fr.imta.tp.selenium.selenium.Close#getBrowser()
   * @see #getClose()
   * @generated
   */
  EAttribute getClose_Browser();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Go <em>Go</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go</em>'.
   * @see fr.imta.tp.selenium.selenium.Go
   * @generated
   */
  EClass getGo();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Go#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Location</em>'.
   * @see fr.imta.tp.selenium.selenium.Go#getLocation()
   * @see #getGo()
   * @generated
   */
  EReference getGo_Location();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Go#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.Go#getArrayAccess()
   * @see #getGo()
   * @generated
   */
  EReference getGo_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Find <em>Find</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Find</em>'.
   * @see fr.imta.tp.selenium.selenium.Find
   * @generated
   */
  EClass getFind();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Find#getProp <em>Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop</em>'.
   * @see fr.imta.tp.selenium.selenium.Find#getProp()
   * @see #getFind()
   * @generated
   */
  EAttribute getFind_Prop();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Find#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.imta.tp.selenium.selenium.Find#getValue()
   * @see #getFind()
   * @generated
   */
  EReference getFind_Value();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill</em>'.
   * @see fr.imta.tp.selenium.selenium.Fill
   * @generated
   */
  EClass getFill();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Fill#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.Fill#getElem()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Elem();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Fill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.imta.tp.selenium.selenium.Fill#getValue()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Value();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Fill#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.Fill#getArrayAccess()
   * @see #getFill()
   * @generated
   */
  EReference getFill_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click</em>'.
   * @see fr.imta.tp.selenium.selenium.Click
   * @generated
   */
  EClass getClick();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Click#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.Click#getElem()
   * @see #getClick()
   * @generated
   */
  EReference getClick_Elem();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Click#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.Click#getArrayAccess()
   * @see #getClick()
   * @generated
   */
  EReference getClick_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Verify <em>Verify</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verify</em>'.
   * @see fr.imta.tp.selenium.selenium.Verify
   * @generated
   */
  EClass getVerify();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Verify#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.Verify#getElem()
   * @see #getVerify()
   * @generated
   */
  EReference getVerify_Elem();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Verify#getLeftArrayAccess <em>Left Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.Verify#getLeftArrayAccess()
   * @see #getVerify()
   * @generated
   */
  EReference getVerify_LeftArrayAccess();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Verify#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comp</em>'.
   * @see fr.imta.tp.selenium.selenium.Verify#getComp()
   * @see #getVerify()
   * @generated
   */
  EAttribute getVerify_Comp();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Verify#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.imta.tp.selenium.selenium.Verify#getValue()
   * @see #getVerify()
   * @generated
   */
  EReference getVerify_Value();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Verify#getRightArrayAccess <em>Right Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.Verify#getRightArrayAccess()
   * @see #getVerify()
   * @generated
   */
  EReference getVerify_RightArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Show <em>Show</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show</em>'.
   * @see fr.imta.tp.selenium.selenium.Show
   * @generated
   */
  EClass getShow();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Show#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.Show#getElem()
   * @see #getShow()
   * @generated
   */
  EReference getShow_Elem();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.Show#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.Show#getArrayAccess()
   * @see #getShow()
   * @generated
   */
  EReference getShow_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.ShowMultiple <em>Show Multiple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Multiple</em>'.
   * @see fr.imta.tp.selenium.selenium.ShowMultiple
   * @generated
   */
  EClass getShowMultiple();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.ShowMultiple#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.ShowMultiple#getElem()
   * @see #getShowMultiple()
   * @generated
   */
  EReference getShowMultiple_Elem();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.selenium.selenium.ShowMultiple#getArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.ShowMultiple#getArrayAccess()
   * @see #getShowMultiple()
   * @generated
   */
  EReference getShowMultiple_ArrayAccess();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Get <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get</em>'.
   * @see fr.imta.tp.selenium.selenium.Get
   * @generated
   */
  EClass getGet();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.Get#getProp <em>Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop</em>'.
   * @see fr.imta.tp.selenium.selenium.Get#getProp()
   * @see #getGet()
   * @generated
   */
  EAttribute getGet_Prop();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Get#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.Get#getElem()
   * @see #getGet()
   * @generated
   */
  EReference getGet_Elem();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Len <em>Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Len</em>'.
   * @see fr.imta.tp.selenium.selenium.Len
   * @generated
   */
  EClass getLen();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.selenium.selenium.Len#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elem</em>'.
   * @see fr.imta.tp.selenium.selenium.Len#getElem()
   * @see #getLen()
   * @generated
   */
  EReference getLen_Elem();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.SeleniumType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see fr.imta.tp.selenium.selenium.SeleniumType
   * @generated
   */
  EClass getSeleniumType();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.SeleniumType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp.selenium.selenium.SeleniumType#getName()
   * @see #getSeleniumType()
   * @generated
   */
  EAttribute getSeleniumType_Name();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see fr.imta.tp.selenium.selenium.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see fr.imta.tp.selenium.selenium.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.selenium.selenium.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Access</em>'.
   * @see fr.imta.tp.selenium.selenium.ArrayAccess
   * @generated
   */
  EClass getArrayAccess();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.selenium.selenium.ArrayAccess#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.imta.tp.selenium.selenium.ArrayAccess#getId()
   * @see #getArrayAccess()
   * @generated
   */
  EAttribute getArrayAccess_Id();

  /**
   * Returns the meta object for enum '{@link fr.imta.tp.selenium.selenium.BROWSER <em>BROWSER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BROWSER</em>'.
   * @see fr.imta.tp.selenium.selenium.BROWSER
   * @generated
   */
  EEnum getBROWSER();

  /**
   * Returns the meta object for enum '{@link fr.imta.tp.selenium.selenium.PROPERTY <em>PROPERTY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>PROPERTY</em>'.
   * @see fr.imta.tp.selenium.selenium.PROPERTY
   * @generated
   */
  EEnum getPROPERTY();

  /**
   * Returns the meta object for enum '{@link fr.imta.tp.selenium.selenium.COMPARATOR <em>COMPARATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>COMPARATOR</em>'.
   * @see fr.imta.tp.selenium.selenium.COMPARATOR
   * @generated
   */
  EEnum getCOMPARATOR();

  /**
   * Returns the meta object for enum '{@link fr.imta.tp.selenium.selenium.TYPE <em>TYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TYPE</em>'.
   * @see fr.imta.tp.selenium.selenium.TYPE
   * @generated
   */
  EEnum getTYPE();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SeleniumFactory getSeleniumFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ModelImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAM = eINSTANCE.getModel_Program();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ProgramImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROCEDURES = eINSTANCE.getProgram_Procedures();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ProcedureImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__PARAMS = eINSTANCE.getProcedure_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__TYPE = eINSTANCE.getProcedure_Type();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__BODY = eINSTANCE.getProcedure_Body();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureParameterImpl <em>Procedure Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ProcedureParameterImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedureParameter()
     * @generated
     */
    EClass PROCEDURE_PARAMETER = eINSTANCE.getProcedureParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_PARAMETER__NAME = eINSTANCE.getProcedureParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_PARAMETER__TYPE = eINSTANCE.getProcedureParameter_Type();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureBodyImpl <em>Procedure Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ProcedureBodyImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedureBody()
     * @generated
     */
    EClass PROCEDURE_BODY = eINSTANCE.getProcedureBody();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_BODY__STATEMENTS = eINSTANCE.getProcedureBody_Statements();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_BODY__VALUE = eINSTANCE.getProcedureBody_Value();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_BODY__ARRAY_ACCESS = eINSTANCE.getProcedureBody_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.StatementImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.VariableDeclarationImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getVariableDeclaration_Variable();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.FindMultipleImpl <em>Find Multiple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.FindMultipleImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getFindMultiple()
     * @generated
     */
    EClass FIND_MULTIPLE = eINSTANCE.getFindMultiple();

    /**
     * The meta object literal for the '<em><b>Prop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIND_MULTIPLE__PROP = eINSTANCE.getFindMultiple_Prop();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIND_MULTIPLE__VALUE = eINSTANCE.getFindMultiple_Value();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIND_MULTIPLE__ARRAY_ACCESS = eINSTANCE.getFindMultiple_ArrayAccess();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIND_MULTIPLE__ARRAY = eINSTANCE.getFindMultiple_Array();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getProcedureCall()
     * @generated
     */
    EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

    /**
     * The meta object literal for the '<em><b>Proc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__PROC = eINSTANCE.getProcedureCall_Proc();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__PARAMS = eINSTANCE.getProcedureCall_Params();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__ARRAY_ACCESS = eINSTANCE.getProcedureCall_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.OperationImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Strvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__STRVALUE = eINSTANCE.getOperation_Strvalue();

    /**
     * The meta object literal for the '<em><b>Intvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__INTVALUE = eINSTANCE.getOperation_Intvalue();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.CallNativeImpl <em>Call Native</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.CallNativeImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getCallNative()
     * @generated
     */
    EClass CALL_NATIVE = eINSTANCE.getCallNative();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.CallNativeWithResultImpl <em>Call Native With Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.CallNativeWithResultImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getCallNativeWithResult()
     * @generated
     */
    EClass CALL_NATIVE_WITH_RESULT = eINSTANCE.getCallNativeWithResult();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS = eINSTANCE.getCallNativeWithResult_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.OpenImpl <em>Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.OpenImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getOpen()
     * @generated
     */
    EClass OPEN = eINSTANCE.getOpen();

    /**
     * The meta object literal for the '<em><b>Browser</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN__BROWSER = eINSTANCE.getOpen_Browser();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.CloseImpl <em>Close</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.CloseImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getClose()
     * @generated
     */
    EClass CLOSE = eINSTANCE.getClose();

    /**
     * The meta object literal for the '<em><b>Browser</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSE__BROWSER = eINSTANCE.getClose_Browser();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.GoImpl <em>Go</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.GoImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getGo()
     * @generated
     */
    EClass GO = eINSTANCE.getGo();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO__LOCATION = eINSTANCE.getGo_Location();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO__ARRAY_ACCESS = eINSTANCE.getGo_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.FindImpl <em>Find</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.FindImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getFind()
     * @generated
     */
    EClass FIND = eINSTANCE.getFind();

    /**
     * The meta object literal for the '<em><b>Prop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIND__PROP = eINSTANCE.getFind_Prop();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIND__VALUE = eINSTANCE.getFind_Value();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.FillImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getFill()
     * @generated
     */
    EClass FILL = eINSTANCE.getFill();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__ELEM = eINSTANCE.getFill_Elem();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__VALUE = eINSTANCE.getFill_Value();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__ARRAY_ACCESS = eINSTANCE.getFill_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ClickImpl <em>Click</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ClickImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getClick()
     * @generated
     */
    EClass CLICK = eINSTANCE.getClick();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK__ELEM = eINSTANCE.getClick_Elem();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK__ARRAY_ACCESS = eINSTANCE.getClick_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl <em>Verify</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.VerifyImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getVerify()
     * @generated
     */
    EClass VERIFY = eINSTANCE.getVerify();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY__ELEM = eINSTANCE.getVerify_Elem();

    /**
     * The meta object literal for the '<em><b>Left Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY__LEFT_ARRAY_ACCESS = eINSTANCE.getVerify_LeftArrayAccess();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFY__COMP = eINSTANCE.getVerify_Comp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY__VALUE = eINSTANCE.getVerify_Value();

    /**
     * The meta object literal for the '<em><b>Right Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY__RIGHT_ARRAY_ACCESS = eINSTANCE.getVerify_RightArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ShowImpl <em>Show</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ShowImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getShow()
     * @generated
     */
    EClass SHOW = eINSTANCE.getShow();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW__ELEM = eINSTANCE.getShow_Elem();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW__ARRAY_ACCESS = eINSTANCE.getShow_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ShowMultipleImpl <em>Show Multiple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ShowMultipleImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getShowMultiple()
     * @generated
     */
    EClass SHOW_MULTIPLE = eINSTANCE.getShowMultiple();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW_MULTIPLE__ELEM = eINSTANCE.getShowMultiple_Elem();

    /**
     * The meta object literal for the '<em><b>Array Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW_MULTIPLE__ARRAY_ACCESS = eINSTANCE.getShowMultiple_ArrayAccess();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.GetImpl <em>Get</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.GetImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getGet()
     * @generated
     */
    EClass GET = eINSTANCE.getGet();

    /**
     * The meta object literal for the '<em><b>Prop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET__PROP = eINSTANCE.getGet_Prop();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET__ELEM = eINSTANCE.getGet_Elem();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.LenImpl <em>Len</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.LenImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getLen()
     * @generated
     */
    EClass LEN = eINSTANCE.getLen();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEN__ELEM = eINSTANCE.getLen_Elem();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.SeleniumTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumTypeImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getSeleniumType()
     * @generated
     */
    EClass SELENIUM_TYPE = eINSTANCE.getSeleniumType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELENIUM_TYPE__NAME = eINSTANCE.getSeleniumType_Name();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.VariableImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ArrayImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.impl.ArrayAccessImpl <em>Array Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.impl.ArrayAccessImpl
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getArrayAccess()
     * @generated
     */
    EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ACCESS__ID = eINSTANCE.getArrayAccess_Id();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.BROWSER <em>BROWSER</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.BROWSER
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getBROWSER()
     * @generated
     */
    EEnum BROWSER = eINSTANCE.getBROWSER();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.PROPERTY <em>PROPERTY</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.PROPERTY
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getPROPERTY()
     * @generated
     */
    EEnum PROPERTY = eINSTANCE.getPROPERTY();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.COMPARATOR <em>COMPARATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.COMPARATOR
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getCOMPARATOR()
     * @generated
     */
    EEnum COMPARATOR = eINSTANCE.getCOMPARATOR();

    /**
     * The meta object literal for the '{@link fr.imta.tp.selenium.selenium.TYPE <em>TYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.selenium.selenium.TYPE
     * @see fr.imta.tp.selenium.selenium.impl.SeleniumPackageImpl#getTYPE()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getTYPE();

  }

} //SeleniumPackage
