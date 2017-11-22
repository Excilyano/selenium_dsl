/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.CallNativeWithResult;
import fr.imta.tp.selenium.selenium.SeleniumPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Native With Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.CallNativeWithResultImpl#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallNativeWithResultImpl extends VariableDeclarationImpl implements CallNativeWithResult
{
  /**
   * The cached value of the '{@link #getArrayAccess() <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayAccess()
   * @generated
   * @ordered
   */
  protected ArrayAccess arrayAccess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallNativeWithResultImpl()
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
    return SeleniumPackage.Literals.CALL_NATIVE_WITH_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess getArrayAccess()
  {
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayAccess(ArrayAccess newArrayAccess, NotificationChain msgs)
  {
    ArrayAccess oldArrayAccess = arrayAccess;
    arrayAccess = newArrayAccess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS, oldArrayAccess, newArrayAccess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayAccess(ArrayAccess newArrayAccess)
  {
    if (newArrayAccess != arrayAccess)
    {
      NotificationChain msgs = null;
      if (arrayAccess != null)
        msgs = ((InternalEObject)arrayAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS, null, msgs);
      if (newArrayAccess != null)
        msgs = ((InternalEObject)newArrayAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS, null, msgs);
      msgs = basicSetArrayAccess(newArrayAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS, newArrayAccess, newArrayAccess));
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
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS:
        return basicSetArrayAccess(null, msgs);
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
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS:
        return getArrayAccess();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS:
        setArrayAccess((ArrayAccess)newValue);
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
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS:
        setArrayAccess((ArrayAccess)null);
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
      case SeleniumPackage.CALL_NATIVE_WITH_RESULT__ARRAY_ACCESS:
        return arrayAccess != null;
    }
    return super.eIsSet(featureID);
  }

} //CallNativeWithResultImpl
