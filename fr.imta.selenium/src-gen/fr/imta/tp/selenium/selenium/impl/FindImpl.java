/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.Find;
import fr.imta.tp.selenium.selenium.PROPERTY;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.FindImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.FindImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindImpl extends CallNativeWithResultImpl implements Find
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
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SeleniumType value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FindImpl()
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
    return SeleniumPackage.Literals.FIND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND__PROP, oldProp, prop));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.FIND__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND__VALUE, oldValue, value));
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
      case SeleniumPackage.FIND__PROP:
        return getProp();
      case SeleniumPackage.FIND__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case SeleniumPackage.FIND__PROP:
        setProp((PROPERTY)newValue);
        return;
      case SeleniumPackage.FIND__VALUE:
        setValue((SeleniumType)newValue);
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
      case SeleniumPackage.FIND__PROP:
        setProp(PROP_EDEFAULT);
        return;
      case SeleniumPackage.FIND__VALUE:
        setValue((SeleniumType)null);
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
      case SeleniumPackage.FIND__PROP:
        return prop != PROP_EDEFAULT;
      case SeleniumPackage.FIND__VALUE:
        return value != null;
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

} //FindImpl
