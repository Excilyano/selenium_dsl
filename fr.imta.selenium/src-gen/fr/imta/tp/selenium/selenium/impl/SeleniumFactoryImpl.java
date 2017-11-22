/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeleniumFactoryImpl extends EFactoryImpl implements SeleniumFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SeleniumFactory init()
  {
    try
    {
      SeleniumFactory theSeleniumFactory = (SeleniumFactory)EPackage.Registry.INSTANCE.getEFactory(SeleniumPackage.eNS_URI);
      if (theSeleniumFactory != null)
      {
        return theSeleniumFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SeleniumFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SeleniumPackage.MODEL: return createModel();
      case SeleniumPackage.PROGRAM: return createProgram();
      case SeleniumPackage.PROCEDURE: return createProcedure();
      case SeleniumPackage.PROCEDURE_PARAMETER: return createProcedureParameter();
      case SeleniumPackage.PROCEDURE_BODY: return createProcedureBody();
      case SeleniumPackage.STATEMENT: return createStatement();
      case SeleniumPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case SeleniumPackage.FIND_MULTIPLE: return createFindMultiple();
      case SeleniumPackage.PROCEDURE_CALL: return createProcedureCall();
      case SeleniumPackage.OPERATION: return createOperation();
      case SeleniumPackage.CALL_NATIVE: return createCallNative();
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT: return createCallNativeWithResult();
      case SeleniumPackage.OPEN: return createOpen();
      case SeleniumPackage.CLOSE: return createClose();
      case SeleniumPackage.GO: return createGo();
      case SeleniumPackage.FIND: return createFind();
      case SeleniumPackage.FILL: return createFill();
      case SeleniumPackage.CLICK: return createClick();
      case SeleniumPackage.VERIFY: return createVerify();
      case SeleniumPackage.SHOW: return createShow();
      case SeleniumPackage.SHOW_MULTIPLE: return createShowMultiple();
      case SeleniumPackage.GET: return createGet();
      case SeleniumPackage.LEN: return createLen();
      case SeleniumPackage.SELENIUM_TYPE: return createSeleniumType();
      case SeleniumPackage.VARIABLE: return createVariable();
      case SeleniumPackage.ARRAY: return createArray();
      case SeleniumPackage.ARRAY_ACCESS: return createArrayAccess();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SeleniumPackage.BROWSER:
        return createBROWSERFromString(eDataType, initialValue);
      case SeleniumPackage.PROPERTY:
        return createPROPERTYFromString(eDataType, initialValue);
      case SeleniumPackage.COMPARATOR:
        return createCOMPARATORFromString(eDataType, initialValue);
      case SeleniumPackage.TYPE:
        return createTYPEFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SeleniumPackage.BROWSER:
        return convertBROWSERToString(eDataType, instanceValue);
      case SeleniumPackage.PROPERTY:
        return convertPROPERTYToString(eDataType, instanceValue);
      case SeleniumPackage.COMPARATOR:
        return convertCOMPARATORToString(eDataType, instanceValue);
      case SeleniumPackage.TYPE:
        return convertTYPEToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureParameter createProcedureParameter()
  {
    ProcedureParameterImpl procedureParameter = new ProcedureParameterImpl();
    return procedureParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureBody createProcedureBody()
  {
    ProcedureBodyImpl procedureBody = new ProcedureBodyImpl();
    return procedureBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FindMultiple createFindMultiple()
  {
    FindMultipleImpl findMultiple = new FindMultipleImpl();
    return findMultiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureCall createProcedureCall()
  {
    ProcedureCallImpl procedureCall = new ProcedureCallImpl();
    return procedureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallNative createCallNative()
  {
    CallNativeImpl callNative = new CallNativeImpl();
    return callNative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallNativeWithResult createCallNativeWithResult()
  {
    CallNativeWithResultImpl callNativeWithResult = new CallNativeWithResultImpl();
    return callNativeWithResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Open createOpen()
  {
    OpenImpl open = new OpenImpl();
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Close createClose()
  {
    CloseImpl close = new CloseImpl();
    return close;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Go createGo()
  {
    GoImpl go = new GoImpl();
    return go;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Find createFind()
  {
    FindImpl find = new FindImpl();
    return find;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill createFill()
  {
    FillImpl fill = new FillImpl();
    return fill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Click createClick()
  {
    ClickImpl click = new ClickImpl();
    return click;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verify createVerify()
  {
    VerifyImpl verify = new VerifyImpl();
    return verify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Show createShow()
  {
    ShowImpl show = new ShowImpl();
    return show;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowMultiple createShowMultiple()
  {
    ShowMultipleImpl showMultiple = new ShowMultipleImpl();
    return showMultiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Get createGet()
  {
    GetImpl get = new GetImpl();
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Len createLen()
  {
    LenImpl len = new LenImpl();
    return len;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType createSeleniumType()
  {
    SeleniumTypeImpl seleniumType = new SeleniumTypeImpl();
    return seleniumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess createArrayAccess()
  {
    ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BROWSER createBROWSERFromString(EDataType eDataType, String initialValue)
  {
    BROWSER result = BROWSER.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBROWSERToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PROPERTY createPROPERTYFromString(EDataType eDataType, String initialValue)
  {
    PROPERTY result = PROPERTY.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPROPERTYToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COMPARATOR createCOMPARATORFromString(EDataType eDataType, String initialValue)
  {
    COMPARATOR result = COMPARATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCOMPARATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE createTYPEFromString(EDataType eDataType, String initialValue)
  {
    TYPE result = TYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumPackage getSeleniumPackage()
  {
    return (SeleniumPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SeleniumPackage getPackage()
  {
    return SeleniumPackage.eINSTANCE;
  }

} //SeleniumFactoryImpl
