/**
 */
package fr.imta.tp.selenium.selenium.util;

import fr.imta.tp.selenium.selenium.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage
 * @generated
 */
public class SeleniumSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SeleniumPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SeleniumPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SeleniumPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.PROCEDURE:
      {
        Procedure procedure = (Procedure)theEObject;
        T result = caseProcedure(procedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.PROCEDURE_PARAMETER:
      {
        ProcedureParameter procedureParameter = (ProcedureParameter)theEObject;
        T result = caseProcedureParameter(procedureParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.PROCEDURE_BODY:
      {
        ProcedureBody procedureBody = (ProcedureBody)theEObject;
        T result = caseProcedureBody(procedureBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseStatement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.FIND_MULTIPLE:
      {
        FindMultiple findMultiple = (FindMultiple)theEObject;
        T result = caseFindMultiple(findMultiple);
        if (result == null) result = caseStatement(findMultiple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.PROCEDURE_CALL:
      {
        ProcedureCall procedureCall = (ProcedureCall)theEObject;
        T result = caseProcedureCall(procedureCall);
        if (result == null) result = caseVariableDeclaration(procedureCall);
        if (result == null) result = caseStatement(procedureCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseVariableDeclaration(operation);
        if (result == null) result = caseStatement(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.CALL_NATIVE:
      {
        CallNative callNative = (CallNative)theEObject;
        T result = caseCallNative(callNative);
        if (result == null) result = caseStatement(callNative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT:
      {
        CallNativeWithResult callNativeWithResult = (CallNativeWithResult)theEObject;
        T result = caseCallNativeWithResult(callNativeWithResult);
        if (result == null) result = caseVariableDeclaration(callNativeWithResult);
        if (result == null) result = caseStatement(callNativeWithResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.OPEN:
      {
        Open open = (Open)theEObject;
        T result = caseOpen(open);
        if (result == null) result = caseCallNative(open);
        if (result == null) result = caseStatement(open);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.CLOSE:
      {
        Close close = (Close)theEObject;
        T result = caseClose(close);
        if (result == null) result = caseCallNative(close);
        if (result == null) result = caseStatement(close);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.GO:
      {
        Go go = (Go)theEObject;
        T result = caseGo(go);
        if (result == null) result = caseCallNative(go);
        if (result == null) result = caseStatement(go);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.FIND:
      {
        Find find = (Find)theEObject;
        T result = caseFind(find);
        if (result == null) result = caseCallNativeWithResult(find);
        if (result == null) result = caseVariableDeclaration(find);
        if (result == null) result = caseStatement(find);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = caseCallNative(fill);
        if (result == null) result = caseStatement(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = caseCallNative(click);
        if (result == null) result = caseStatement(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.VERIFY:
      {
        Verify verify = (Verify)theEObject;
        T result = caseVerify(verify);
        if (result == null) result = caseCallNative(verify);
        if (result == null) result = caseStatement(verify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.SHOW:
      {
        Show show = (Show)theEObject;
        T result = caseShow(show);
        if (result == null) result = caseCallNative(show);
        if (result == null) result = caseStatement(show);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.SHOW_MULTIPLE:
      {
        ShowMultiple showMultiple = (ShowMultiple)theEObject;
        T result = caseShowMultiple(showMultiple);
        if (result == null) result = caseCallNative(showMultiple);
        if (result == null) result = caseStatement(showMultiple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.GET:
      {
        Get get = (Get)theEObject;
        T result = caseGet(get);
        if (result == null) result = caseCallNativeWithResult(get);
        if (result == null) result = caseVariableDeclaration(get);
        if (result == null) result = caseStatement(get);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.LEN:
      {
        Len len = (Len)theEObject;
        T result = caseLen(len);
        if (result == null) result = caseCallNativeWithResult(len);
        if (result == null) result = caseVariableDeclaration(len);
        if (result == null) result = caseStatement(len);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.SELENIUM_TYPE:
      {
        SeleniumType seleniumType = (SeleniumType)theEObject;
        T result = caseSeleniumType(seleniumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseSeleniumType(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.ARRAY:
      {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = caseSeleniumType(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumPackage.ARRAY_ACCESS:
      {
        ArrayAccess arrayAccess = (ArrayAccess)theEObject;
        T result = caseArrayAccess(arrayAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureParameter(ProcedureParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureBody(ProcedureBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Find Multiple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Find Multiple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFindMultiple(FindMultiple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureCall(ProcedureCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Native</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Native</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallNative(CallNative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Native With Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Native With Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallNativeWithResult(CallNativeWithResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpen(Open object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Close</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Close</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClose(Close object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGo(Go object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Find</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Find</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFind(Find object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFill(Fill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClick(Click object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verify</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verify</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerify(Verify object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShow(Show object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Multiple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Multiple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowMultiple(ShowMultiple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGet(Get object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Len</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Len</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLen(Len object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeleniumType(SeleniumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray(Array object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayAccess(ArrayAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SeleniumSwitch
