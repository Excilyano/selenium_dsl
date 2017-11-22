/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.Array;
import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.CallNative;
import fr.imta.tp.selenium.selenium.CallNativeWithResult;
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
import fr.imta.tp.selenium.selenium.SeleniumFactory;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;
import fr.imta.tp.selenium.selenium.Show;
import fr.imta.tp.selenium.selenium.ShowMultiple;
import fr.imta.tp.selenium.selenium.Statement;
import fr.imta.tp.selenium.selenium.Variable;
import fr.imta.tp.selenium.selenium.VariableDeclaration;
import fr.imta.tp.selenium.selenium.Verify;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeleniumPackageImpl extends EPackageImpl implements SeleniumPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass findMultipleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callNativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callNativeWithResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass findEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clickEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showMultipleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seleniumTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum browserEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum propertyEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SeleniumPackageImpl()
  {
    super(eNS_URI, SeleniumFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SeleniumPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SeleniumPackage init()
  {
    if (isInited) return (SeleniumPackage)EPackage.Registry.INSTANCE.getEPackage(SeleniumPackage.eNS_URI);

    // Obtain or create and register package
    SeleniumPackageImpl theSeleniumPackage = (SeleniumPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SeleniumPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SeleniumPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSeleniumPackage.createPackageContents();

    // Initialize created meta-data
    theSeleniumPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSeleniumPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SeleniumPackage.eNS_URI, theSeleniumPackage);
    return theSeleniumPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Program()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Procedures()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Statements()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Name()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Params()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Type()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Body()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureParameter()
  {
    return procedureParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedureParameter_Name()
  {
    return (EAttribute)procedureParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedureParameter_Type()
  {
    return (EAttribute)procedureParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureBody()
  {
    return procedureBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureBody_Statements()
  {
    return (EReference)procedureBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureBody_Value()
  {
    return (EReference)procedureBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureBody_ArrayAccess()
  {
    return (EReference)procedureBodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Variable()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFindMultiple()
  {
    return findMultipleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFindMultiple_Prop()
  {
    return (EAttribute)findMultipleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFindMultiple_Value()
  {
    return (EReference)findMultipleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFindMultiple_ArrayAccess()
  {
    return (EReference)findMultipleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFindMultiple_Array()
  {
    return (EReference)findMultipleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureCall()
  {
    return procedureCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureCall_Proc()
  {
    return (EReference)procedureCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureCall_Params()
  {
    return (EReference)procedureCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureCall_ArrayAccess()
  {
    return (EReference)procedureCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Strvalue()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Intvalue()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallNative()
  {
    return callNativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallNativeWithResult()
  {
    return callNativeWithResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallNativeWithResult_ArrayAccess()
  {
    return (EReference)callNativeWithResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpen()
  {
    return openEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOpen_Browser()
  {
    return (EAttribute)openEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClose()
  {
    return closeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClose_Browser()
  {
    return (EAttribute)closeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGo()
  {
    return goEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGo_Location()
  {
    return (EReference)goEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGo_ArrayAccess()
  {
    return (EReference)goEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFind()
  {
    return findEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFind_Prop()
  {
    return (EAttribute)findEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFind_Value()
  {
    return (EReference)findEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFill()
  {
    return fillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFill_Elem()
  {
    return (EReference)fillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFill_Value()
  {
    return (EReference)fillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFill_ArrayAccess()
  {
    return (EReference)fillEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClick()
  {
    return clickEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClick_Elem()
  {
    return (EReference)clickEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClick_ArrayAccess()
  {
    return (EReference)clickEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerify()
  {
    return verifyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerify_Elem()
  {
    return (EReference)verifyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerify_LeftArrayAccess()
  {
    return (EReference)verifyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerify_Comp()
  {
    return (EAttribute)verifyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerify_Value()
  {
    return (EReference)verifyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerify_RightArrayAccess()
  {
    return (EReference)verifyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShow()
  {
    return showEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShow_Elem()
  {
    return (EReference)showEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShow_ArrayAccess()
  {
    return (EReference)showEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowMultiple()
  {
    return showMultipleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShowMultiple_Elem()
  {
    return (EReference)showMultipleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShowMultiple_ArrayAccess()
  {
    return (EReference)showMultipleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGet()
  {
    return getEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGet_Prop()
  {
    return (EAttribute)getEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGet_Elem()
  {
    return (EReference)getEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLen()
  {
    return lenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLen_Elem()
  {
    return (EReference)lenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeleniumType()
  {
    return seleniumTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSeleniumType_Name()
  {
    return (EAttribute)seleniumTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray()
  {
    return arrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayAccess()
  {
    return arrayAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayAccess_Id()
  {
    return (EAttribute)arrayAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBROWSER()
  {
    return browserEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPROPERTY()
  {
    return propertyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCOMPARATOR()
  {
    return comparatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTYPE()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumFactory getSeleniumFactory()
  {
    return (SeleniumFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PROGRAM);

    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__PROCEDURES);
    createEReference(programEClass, PROGRAM__STATEMENTS);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__NAME);
    createEReference(procedureEClass, PROCEDURE__PARAMS);
    createEAttribute(procedureEClass, PROCEDURE__TYPE);
    createEReference(procedureEClass, PROCEDURE__BODY);

    procedureParameterEClass = createEClass(PROCEDURE_PARAMETER);
    createEAttribute(procedureParameterEClass, PROCEDURE_PARAMETER__NAME);
    createEAttribute(procedureParameterEClass, PROCEDURE_PARAMETER__TYPE);

    procedureBodyEClass = createEClass(PROCEDURE_BODY);
    createEReference(procedureBodyEClass, PROCEDURE_BODY__STATEMENTS);
    createEReference(procedureBodyEClass, PROCEDURE_BODY__VALUE);
    createEReference(procedureBodyEClass, PROCEDURE_BODY__ARRAY_ACCESS);

    statementEClass = createEClass(STATEMENT);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE);

    findMultipleEClass = createEClass(FIND_MULTIPLE);
    createEAttribute(findMultipleEClass, FIND_MULTIPLE__PROP);
    createEReference(findMultipleEClass, FIND_MULTIPLE__VALUE);
    createEReference(findMultipleEClass, FIND_MULTIPLE__ARRAY_ACCESS);
    createEReference(findMultipleEClass, FIND_MULTIPLE__ARRAY);

    procedureCallEClass = createEClass(PROCEDURE_CALL);
    createEReference(procedureCallEClass, PROCEDURE_CALL__PROC);
    createEReference(procedureCallEClass, PROCEDURE_CALL__PARAMS);
    createEReference(procedureCallEClass, PROCEDURE_CALL__ARRAY_ACCESS);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__STRVALUE);
    createEAttribute(operationEClass, OPERATION__INTVALUE);

    callNativeEClass = createEClass(CALL_NATIVE);

    callNativeWithResultEClass = createEClass(CALL_NATIVE_WITH_RESULT);
    createEReference(callNativeWithResultEClass, CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS);

    openEClass = createEClass(OPEN);
    createEAttribute(openEClass, OPEN__BROWSER);

    closeEClass = createEClass(CLOSE);
    createEAttribute(closeEClass, CLOSE__BROWSER);

    goEClass = createEClass(GO);
    createEReference(goEClass, GO__LOCATION);
    createEReference(goEClass, GO__ARRAY_ACCESS);

    findEClass = createEClass(FIND);
    createEAttribute(findEClass, FIND__PROP);
    createEReference(findEClass, FIND__VALUE);

    fillEClass = createEClass(FILL);
    createEReference(fillEClass, FILL__ELEM);
    createEReference(fillEClass, FILL__VALUE);
    createEReference(fillEClass, FILL__ARRAY_ACCESS);

    clickEClass = createEClass(CLICK);
    createEReference(clickEClass, CLICK__ELEM);
    createEReference(clickEClass, CLICK__ARRAY_ACCESS);

    verifyEClass = createEClass(VERIFY);
    createEReference(verifyEClass, VERIFY__ELEM);
    createEReference(verifyEClass, VERIFY__LEFT_ARRAY_ACCESS);
    createEAttribute(verifyEClass, VERIFY__COMP);
    createEReference(verifyEClass, VERIFY__VALUE);
    createEReference(verifyEClass, VERIFY__RIGHT_ARRAY_ACCESS);

    showEClass = createEClass(SHOW);
    createEReference(showEClass, SHOW__ELEM);
    createEReference(showEClass, SHOW__ARRAY_ACCESS);

    showMultipleEClass = createEClass(SHOW_MULTIPLE);
    createEReference(showMultipleEClass, SHOW_MULTIPLE__ELEM);
    createEReference(showMultipleEClass, SHOW_MULTIPLE__ARRAY_ACCESS);

    getEClass = createEClass(GET);
    createEAttribute(getEClass, GET__PROP);
    createEReference(getEClass, GET__ELEM);

    lenEClass = createEClass(LEN);
    createEReference(lenEClass, LEN__ELEM);

    seleniumTypeEClass = createEClass(SELENIUM_TYPE);
    createEAttribute(seleniumTypeEClass, SELENIUM_TYPE__NAME);

    variableEClass = createEClass(VARIABLE);

    arrayEClass = createEClass(ARRAY);

    arrayAccessEClass = createEClass(ARRAY_ACCESS);
    createEAttribute(arrayAccessEClass, ARRAY_ACCESS__ID);

    // Create enums
    browserEEnum = createEEnum(BROWSER);
    propertyEEnum = createEEnum(PROPERTY);
    comparatorEEnum = createEEnum(COMPARATOR);
    typeEEnum = createEEnum(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    variableDeclarationEClass.getESuperTypes().add(this.getStatement());
    findMultipleEClass.getESuperTypes().add(this.getStatement());
    procedureCallEClass.getESuperTypes().add(this.getVariableDeclaration());
    operationEClass.getESuperTypes().add(this.getVariableDeclaration());
    callNativeEClass.getESuperTypes().add(this.getStatement());
    callNativeWithResultEClass.getESuperTypes().add(this.getVariableDeclaration());
    openEClass.getESuperTypes().add(this.getCallNative());
    closeEClass.getESuperTypes().add(this.getCallNative());
    goEClass.getESuperTypes().add(this.getCallNative());
    findEClass.getESuperTypes().add(this.getCallNativeWithResult());
    fillEClass.getESuperTypes().add(this.getCallNative());
    clickEClass.getESuperTypes().add(this.getCallNative());
    verifyEClass.getESuperTypes().add(this.getCallNative());
    showEClass.getESuperTypes().add(this.getCallNative());
    showMultipleEClass.getESuperTypes().add(this.getCallNative());
    getEClass.getESuperTypes().add(this.getCallNativeWithResult());
    lenEClass.getESuperTypes().add(this.getCallNativeWithResult());
    variableEClass.getESuperTypes().add(this.getSeleniumType());
    arrayEClass.getESuperTypes().add(this.getSeleniumType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Program(), this.getProgram(), null, "program", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Procedures(), this.getProcedure(), null, "procedures", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Params(), this.getProcedureParameter(), null, "params", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcedure_Type(), this.getTYPE(), "type", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Body(), this.getProcedureBody(), null, "body", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureParameterEClass, ProcedureParameter.class, "ProcedureParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedureParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcedureParameter_Type(), this.getTYPE(), "type", null, 0, 1, ProcedureParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureBodyEClass, ProcedureBody.class, "ProcedureBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureBody_Statements(), this.getStatement(), null, "statements", null, 0, -1, ProcedureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureBody_Value(), this.getSeleniumType(), null, "value", null, 0, 1, ProcedureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureBody_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, ProcedureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(findMultipleEClass, FindMultiple.class, "FindMultiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFindMultiple_Prop(), this.getPROPERTY(), "prop", null, 0, 1, FindMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFindMultiple_Value(), this.getSeleniumType(), null, "value", null, 0, 1, FindMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFindMultiple_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, FindMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFindMultiple_Array(), this.getArray(), null, "array", null, 0, 1, FindMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureCallEClass, ProcedureCall.class, "ProcedureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureCall_Proc(), this.getProcedure(), null, "proc", null, 0, 1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureCall_Params(), this.getSeleniumType(), null, "params", null, 0, -1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureCall_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, -1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Strvalue(), ecorePackage.getEString(), "strvalue", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Intvalue(), ecorePackage.getEInt(), "intvalue", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callNativeEClass, CallNative.class, "CallNative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callNativeWithResultEClass, CallNativeWithResult.class, "CallNativeWithResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallNativeWithResult_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, CallNativeWithResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openEClass, Open.class, "Open", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOpen_Browser(), this.getBROWSER(), "browser", null, 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(closeEClass, Close.class, "Close", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClose_Browser(), this.getBROWSER(), "browser", null, 0, 1, Close.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goEClass, Go.class, "Go", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGo_Location(), this.getSeleniumType(), null, "location", null, 0, 1, Go.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGo_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, Go.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(findEClass, Find.class, "Find", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFind_Prop(), this.getPROPERTY(), "prop", null, 0, 1, Find.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFind_Value(), this.getSeleniumType(), null, "value", null, 0, 1, Find.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fillEClass, Fill.class, "Fill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFill_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFill_Value(), this.getSeleniumType(), null, "value", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFill_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clickEClass, Click.class, "Click", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClick_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, Click.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClick_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, Click.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verifyEClass, Verify.class, "Verify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerify_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerify_LeftArrayAccess(), this.getArrayAccess(), null, "leftArrayAccess", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerify_Comp(), this.getCOMPARATOR(), "comp", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerify_Value(), this.getSeleniumType(), null, "value", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerify_RightArrayAccess(), this.getArrayAccess(), null, "rightArrayAccess", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showEClass, Show.class, "Show", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShow_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, Show.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShow_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, Show.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showMultipleEClass, ShowMultiple.class, "ShowMultiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShowMultiple_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, ShowMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShowMultiple_ArrayAccess(), this.getArrayAccess(), null, "arrayAccess", null, 0, 1, ShowMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getEClass, Get.class, "Get", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGet_Prop(), this.getPROPERTY(), "prop", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGet_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lenEClass, Len.class, "Len", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLen_Elem(), this.getSeleniumType(), null, "elem", null, 0, 1, Len.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seleniumTypeEClass, SeleniumType.class, "SeleniumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSeleniumType_Name(), ecorePackage.getEString(), "name", null, 0, 1, SeleniumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayAccessEClass, ArrayAccess.class, "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrayAccess_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(browserEEnum, fr.imta.tp.selenium.selenium.BROWSER.class, "BROWSER");
    addEEnumLiteral(browserEEnum, fr.imta.tp.selenium.selenium.BROWSER.FIREFOX);
    addEEnumLiteral(browserEEnum, fr.imta.tp.selenium.selenium.BROWSER.CHROME);

    initEEnum(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.class, "PROPERTY");
    addEEnumLiteral(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.BYCLASSNAME);
    addEEnumLiteral(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.BYID);
    addEEnumLiteral(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.BYCSS);
    addEEnumLiteral(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.BYXPATH);
    addEEnumLiteral(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.BYNAME);
    addEEnumLiteral(propertyEEnum, fr.imta.tp.selenium.selenium.PROPERTY.BYTAG);

    initEEnum(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.class, "COMPARATOR");
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.EQUALS);
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.CONTAINS);
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.DIFFERENT);
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.GREATER);
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.LOWER);
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.STARTS);
    addEEnumLiteral(comparatorEEnum, fr.imta.tp.selenium.selenium.COMPARATOR.ENDS);

    initEEnum(typeEEnum, fr.imta.tp.selenium.selenium.TYPE.class, "TYPE");
    addEEnumLiteral(typeEEnum, fr.imta.tp.selenium.selenium.TYPE.STRING);
    addEEnumLiteral(typeEEnum, fr.imta.tp.selenium.selenium.TYPE.INTEGER);
    addEEnumLiteral(typeEEnum, fr.imta.tp.selenium.selenium.TYPE.WEBELEMENT);
    addEEnumLiteral(typeEEnum, fr.imta.tp.selenium.selenium.TYPE.ARRAY);

    // Create resource
    createResource(eNS_URI);
  }

} //SeleniumPackageImpl
