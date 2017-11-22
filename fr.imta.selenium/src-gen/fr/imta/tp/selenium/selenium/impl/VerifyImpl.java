/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.COMPARATOR;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;
import fr.imta.tp.selenium.selenium.Verify;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl#getElem <em>Elem</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl#getLeftArrayAccess <em>Left Array Access</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.VerifyImpl#getRightArrayAccess <em>Right Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerifyImpl extends CallNativeImpl implements Verify
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
   * The cached value of the '{@link #getLeftArrayAccess() <em>Left Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftArrayAccess()
   * @generated
   * @ordered
   */
  protected ArrayAccess leftArrayAccess;

  /**
   * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected static final COMPARATOR COMP_EDEFAULT = COMPARATOR.EQUALS;

  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected COMPARATOR comp = COMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SeleniumType value;

  /**
   * The cached value of the '{@link #getRightArrayAccess() <em>Right Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightArrayAccess()
   * @generated
   * @ordered
   */
  protected ArrayAccess rightArrayAccess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerifyImpl()
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
    return SeleniumPackage.Literals.VERIFY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.VERIFY__ELEM, oldElem, elem));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__ELEM, oldElem, elem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess getLeftArrayAccess()
  {
    return leftArrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftArrayAccess(ArrayAccess newLeftArrayAccess, NotificationChain msgs)
  {
    ArrayAccess oldLeftArrayAccess = leftArrayAccess;
    leftArrayAccess = newLeftArrayAccess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS, oldLeftArrayAccess, newLeftArrayAccess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftArrayAccess(ArrayAccess newLeftArrayAccess)
  {
    if (newLeftArrayAccess != leftArrayAccess)
    {
      NotificationChain msgs = null;
      if (leftArrayAccess != null)
        msgs = ((InternalEObject)leftArrayAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS, null, msgs);
      if (newLeftArrayAccess != null)
        msgs = ((InternalEObject)newLeftArrayAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS, null, msgs);
      msgs = basicSetLeftArrayAccess(newLeftArrayAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS, newLeftArrayAccess, newLeftArrayAccess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COMPARATOR getComp()
  {
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComp(COMPARATOR newComp)
  {
    COMPARATOR oldComp = comp;
    comp = newComp == null ? COMP_EDEFAULT : newComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__COMP, oldComp, comp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (SeleniumType)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.VERIFY__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SeleniumType newValue)
  {
    SeleniumType oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess getRightArrayAccess()
  {
    return rightArrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightArrayAccess(ArrayAccess newRightArrayAccess, NotificationChain msgs)
  {
    ArrayAccess oldRightArrayAccess = rightArrayAccess;
    rightArrayAccess = newRightArrayAccess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS, oldRightArrayAccess, newRightArrayAccess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightArrayAccess(ArrayAccess newRightArrayAccess)
  {
    if (newRightArrayAccess != rightArrayAccess)
    {
      NotificationChain msgs = null;
      if (rightArrayAccess != null)
        msgs = ((InternalEObject)rightArrayAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS, null, msgs);
      if (newRightArrayAccess != null)
        msgs = ((InternalEObject)newRightArrayAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS, null, msgs);
      msgs = basicSetRightArrayAccess(newRightArrayAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS, newRightArrayAccess, newRightArrayAccess));
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
      case SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS:
        return basicSetLeftArrayAccess(null, msgs);
      case SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS:
        return basicSetRightArrayAccess(null, msgs);
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
      case SeleniumPackage.VERIFY__ELEM:
        if (resolve) return getElem();
        return basicGetElem();
      case SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS:
        return getLeftArrayAccess();
      case SeleniumPackage.VERIFY__COMP:
        return getComp();
      case SeleniumPackage.VERIFY__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS:
        return getRightArrayAccess();
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
      case SeleniumPackage.VERIFY__ELEM:
        setElem((SeleniumType)newValue);
        return;
      case SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS:
        setLeftArrayAccess((ArrayAccess)newValue);
        return;
      case SeleniumPackage.VERIFY__COMP:
        setComp((COMPARATOR)newValue);
        return;
      case SeleniumPackage.VERIFY__VALUE:
        setValue((SeleniumType)newValue);
        return;
      case SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS:
        setRightArrayAccess((ArrayAccess)newValue);
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
      case SeleniumPackage.VERIFY__ELEM:
        setElem((SeleniumType)null);
        return;
      case SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS:
        setLeftArrayAccess((ArrayAccess)null);
        return;
      case SeleniumPackage.VERIFY__COMP:
        setComp(COMP_EDEFAULT);
        return;
      case SeleniumPackage.VERIFY__VALUE:
        setValue((SeleniumType)null);
        return;
      case SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS:
        setRightArrayAccess((ArrayAccess)null);
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
      case SeleniumPackage.VERIFY__ELEM:
        return elem != null;
      case SeleniumPackage.VERIFY__LEFT_ARRAY_ACCESS:
        return leftArrayAccess != null;
      case SeleniumPackage.VERIFY__COMP:
        return comp != COMP_EDEFAULT;
      case SeleniumPackage.VERIFY__VALUE:
        return value != null;
      case SeleniumPackage.VERIFY__RIGHT_ARRAY_ACCESS:
        return rightArrayAccess != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (comp: ");
    result.append(comp);
    result.append(')');
    return result.toString();
  }

} //VerifyImpl
