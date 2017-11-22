/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.Procedure;
import fr.imta.tp.selenium.selenium.ProcedureCall;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl#getProc <em>Proc</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl#getParams <em>Params</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.ProcedureCallImpl#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureCallImpl extends VariableDeclarationImpl implements ProcedureCall
{
  /**
   * The cached value of the '{@link #getProc() <em>Proc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProc()
   * @generated
   * @ordered
   */
  protected Procedure proc;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<SeleniumType> params;

  /**
   * The cached value of the '{@link #getArrayAccess() <em>Array Access</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayAccess()
   * @generated
   * @ordered
   */
  protected EList<ArrayAccess> arrayAccess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SeleniumPackage.Literals.PROCEDURE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure getProc()
  {
    if (proc != null && proc.eIsProxy())
    {
      InternalEObject oldProc = (InternalEObject)proc;
      proc = (Procedure)eResolveProxy(oldProc);
      if (proc != oldProc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.PROCEDURE_CALL__PROC, oldProc, proc));
      }
    }
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure basicGetProc()
  {
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProc(Procedure newProc)
  {
    Procedure oldProc = proc;
    proc = newProc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.PROCEDURE_CALL__PROC, oldProc, proc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SeleniumType> getParams()
  {
    if (params == null)
    {
      params = new EObjectResolvingEList<SeleniumType>(SeleniumType.class, this, SeleniumPackage.PROCEDURE_CALL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayAccess> getArrayAccess()
  {
    if (arrayAccess == null)
    {
      arrayAccess = new EObjectContainmentEList<ArrayAccess>(ArrayAccess.class, this, SeleniumPackage.PROCEDURE_CALL__ARRAY_ACCESS);
    }
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SeleniumPackage.PROCEDURE_CALL__ARRAY_ACCESS:
        return ((InternalEList<?>)getArrayAccess()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SeleniumPackage.PROCEDURE_CALL__PROC:
        if (resolve) return getProc();
        return basicGetProc();
      case SeleniumPackage.PROCEDURE_CALL__PARAMS:
        return getParams();
      case SeleniumPackage.PROCEDURE_CALL__ARRAY_ACCESS:
        return getArrayAccess();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SeleniumPackage.PROCEDURE_CALL__PROC:
        setProc((Procedure)newValue);
        return;
      case SeleniumPackage.PROCEDURE_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends SeleniumType>)newValue);
        return;
      case SeleniumPackage.PROCEDURE_CALL__ARRAY_ACCESS:
        getArrayAccess().clear();
        getArrayAccess().addAll((Collection<? extends ArrayAccess>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SeleniumPackage.PROCEDURE_CALL__PROC:
        setProc((Procedure)null);
        return;
      case SeleniumPackage.PROCEDURE_CALL__PARAMS:
        getParams().clear();
        return;
      case SeleniumPackage.PROCEDURE_CALL__ARRAY_ACCESS:
        getArrayAccess().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SeleniumPackage.PROCEDURE_CALL__PROC:
        return proc != null;
      case SeleniumPackage.PROCEDURE_CALL__PARAMS:
        return params != null && !params.isEmpty();
      case SeleniumPackage.PROCEDURE_CALL__ARRAY_ACCESS:
        return arrayAccess != null && !arrayAccess.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcedureCallImpl
