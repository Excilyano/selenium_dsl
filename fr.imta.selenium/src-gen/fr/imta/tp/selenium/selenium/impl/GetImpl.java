/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.Get;
import fr.imta.tp.selenium.selenium.PROPERTY;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.GetImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.GetImpl#getElem <em>Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetImpl extends CallNativeWithResultImpl implements Get
{
  /**
   * The default value of the '{@link #getProp() <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected static final PROPERTY PROP_EDEFAULT = PROPERTY.BYCLASSNAME;

  /**
   * The cached value of the '{@link #getProp() <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected PROPERTY prop = PROP_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetImpl()
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
    return SeleniumPackage.Literals.GET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PROPERTY getProp()
  {
    return prop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProp(PROPERTY newProp)
  {
    PROPERTY oldProp = prop;
    prop = newProp == null ? PROP_EDEFAULT : newProp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.GET__PROP, oldProp, prop));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.GET__ELEM, oldElem, elem));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.GET__ELEM, oldElem, elem));
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
      case SeleniumPackage.GET__PROP:
        return getProp();
      case SeleniumPackage.GET__ELEM:
        if (resolve) return getElem();
        return basicGetElem();
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
      case SeleniumPackage.GET__PROP:
        setProp((PROPERTY)newValue);
        return;
      case SeleniumPackage.GET__ELEM:
        setElem((SeleniumType)newValue);
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
      case SeleniumPackage.GET__PROP:
        setProp(PROP_EDEFAULT);
        return;
      case SeleniumPackage.GET__ELEM:
        setElem((SeleniumType)null);
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
      case SeleniumPackage.GET__PROP:
        return prop != PROP_EDEFAULT;
      case SeleniumPackage.GET__ELEM:
        return elem != null;
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
    result.append(" (prop: ");
    result.append(prop);
    result.append(')');
    return result.toString();
  }

} //GetImpl
