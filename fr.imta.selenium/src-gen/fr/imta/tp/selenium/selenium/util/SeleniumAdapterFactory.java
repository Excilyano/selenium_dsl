/**
 */
package fr.imta.tp.selenium.selenium.util;

import fr.imta.tp.selenium.selenium.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage
 * @generated
 */
public class SeleniumAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SeleniumPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SeleniumPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeleniumSwitch<Adapter> modelSwitch =
    new SeleniumSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseProcedureParameter(ProcedureParameter object)
      {
        return createProcedureParameterAdapter();
      }
      @Override
      public Adapter caseProcedureBody(ProcedureBody object)
      {
        return createProcedureBodyAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseFindMultiple(FindMultiple object)
      {
        return createFindMultipleAdapter();
      }
      @Override
      public Adapter caseProcedureCall(ProcedureCall object)
      {
        return createProcedureCallAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseCallNative(CallNative object)
      {
        return createCallNativeAdapter();
      }
      @Override
      public Adapter caseCallNativeWithResult(CallNativeWithResult object)
      {
        return createCallNativeWithResultAdapter();
      }
      @Override
      public Adapter caseOpen(Open object)
      {
        return createOpenAdapter();
      }
      @Override
      public Adapter caseClose(Close object)
      {
        return createCloseAdapter();
      }
      @Override
      public Adapter caseGo(Go object)
      {
        return createGoAdapter();
      }
      @Override
      public Adapter caseFind(Find object)
      {
        return createFindAdapter();
      }
      @Override
      public Adapter caseFill(Fill object)
      {
        return createFillAdapter();
      }
      @Override
      public Adapter caseClick(Click object)
      {
        return createClickAdapter();
      }
      @Override
      public Adapter caseVerify(Verify object)
      {
        return createVerifyAdapter();
      }
      @Override
      public Adapter caseShow(Show object)
      {
        return createShowAdapter();
      }
      @Override
      public Adapter caseShowMultiple(ShowMultiple object)
      {
        return createShowMultipleAdapter();
      }
      @Override
      public Adapter caseGet(Get object)
      {
        return createGetAdapter();
      }
      @Override
      public Adapter caseLen(Len object)
      {
        return createLenAdapter();
      }
      @Override
      public Adapter caseSeleniumType(SeleniumType object)
      {
        return createSeleniumTypeAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseArray(Array object)
      {
        return createArrayAdapter();
      }
      @Override
      public Adapter caseArrayAccess(ArrayAccess object)
      {
        return createArrayAccessAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.ProcedureParameter <em>Procedure Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.ProcedureParameter
   * @generated
   */
  public Adapter createProcedureParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.ProcedureBody <em>Procedure Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.ProcedureBody
   * @generated
   */
  public Adapter createProcedureBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.FindMultiple <em>Find Multiple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.FindMultiple
   * @generated
   */
  public Adapter createFindMultipleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.ProcedureCall <em>Procedure Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.ProcedureCall
   * @generated
   */
  public Adapter createProcedureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.CallNative <em>Call Native</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.CallNative
   * @generated
   */
  public Adapter createCallNativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.CallNativeWithResult <em>Call Native With Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.CallNativeWithResult
   * @generated
   */
  public Adapter createCallNativeWithResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Open
   * @generated
   */
  public Adapter createOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Close <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Close
   * @generated
   */
  public Adapter createCloseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Go <em>Go</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Go
   * @generated
   */
  public Adapter createGoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Find <em>Find</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Find
   * @generated
   */
  public Adapter createFindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Fill
   * @generated
   */
  public Adapter createFillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Click
   * @generated
   */
  public Adapter createClickAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Verify <em>Verify</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Verify
   * @generated
   */
  public Adapter createVerifyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Show <em>Show</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Show
   * @generated
   */
  public Adapter createShowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.ShowMultiple <em>Show Multiple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.ShowMultiple
   * @generated
   */
  public Adapter createShowMultipleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Get <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Get
   * @generated
   */
  public Adapter createGetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Len <em>Len</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Len
   * @generated
   */
  public Adapter createLenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.SeleniumType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.SeleniumType
   * @generated
   */
  public Adapter createSeleniumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.Array
   * @generated
   */
  public Adapter createArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imta.tp.selenium.selenium.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imta.tp.selenium.selenium.ArrayAccess
   * @generated
   */
  public Adapter createArrayAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SeleniumAdapterFactory
