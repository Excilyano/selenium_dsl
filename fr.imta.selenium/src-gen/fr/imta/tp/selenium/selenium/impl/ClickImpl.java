/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.Click;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.ClickImpl#getElem <em>Elem</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.ClickImpl#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClickImpl extends CallNativeImpl implements Click
{
  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected SeleniumType elem;

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
  protected ClickImpl()
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
    return SeleniumPackage.Literals.CLICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType getElem()
  {
    if (elem != null && elem.eIsProxy())
    {
      InternalEObject oldElem = (InternalEObject)elem;
      elem = (SeleniumType)eResolveProxy(oldElem);
      if (elem != oldElem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.CLICK__ELEM, oldElem, elem));
      }
    }
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType basicGetElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem(SeleniumType newElem)
  {
    SeleniumType oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.CLICK__ELEM, oldElem, elem));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.CLICK__ARRAY_ACCESS, oldArrayAccess, newArrayAccess);
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
        msgs = ((InternalEObject)arrayAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.CLICK__ARRAY_ACCESS, null, msgs);
      if (newArrayAccess != null)
        msgs = ((InternalEObject)newArrayAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.CLICK__ARRAY_ACCESS, null, msgs);
      msgs = basicSetArrayAccess(newArrayAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.CLICK__ARRAY_ACCESS, newArrayAccess, newArrayAccess));
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
      case SeleniumPackage.CLICK__ARRAY_ACCESS:
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
      case SeleniumPackage.CLICK__ELEM:
        if (resolve) return getElem();
        return basicGetElem();
      case SeleniumPackage.CLICK__ARRAY_ACCESS:
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
      case SeleniumPackage.CLICK__ELEM:
        setElem((SeleniumType)newValue);
        return;
      case SeleniumPackage.CLICK__ARRAY_ACCESS:
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
      case SeleniumPackage.CLICK__ELEM:
        setElem((SeleniumType)null);
        return;
      case SeleniumPackage.CLICK__ARRAY_ACCESS:
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
      case SeleniumPackage.CLICK__ELEM:
        return elem != null;
      case SeleniumPackage.CLICK__ARRAY_ACCESS:
        return arrayAccess != null;
    }
    return super.eIsSet(featureID);
  }

} //ClickImpl
