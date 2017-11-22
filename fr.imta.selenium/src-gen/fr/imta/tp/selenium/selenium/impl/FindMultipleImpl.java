/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.Array;
import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.FindMultiple;
import fr.imta.tp.selenium.selenium.PROPERTY;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.FindMultipleImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.FindMultipleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.FindMultipleImpl#getArrayAccess <em>Array Access</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.FindMultipleImpl#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindMultipleImpl extends StatementImpl implements FindMultiple
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
   * The cached value of the '{@link #getArrayAccess() <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayAccess()
   * @generated
   * @ordered
   */
  protected ArrayAccess arrayAccess;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected Array array;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FindMultipleImpl()
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
    return SeleniumPackage.Literals.FIND_MULTIPLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND_MULTIPLE__PROP, oldProp, prop));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.FIND_MULTIPLE__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND_MULTIPLE__VALUE, oldValue, value));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS, oldArrayAccess, newArrayAccess);
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
        msgs = ((InternalEObject)arrayAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS, null, msgs);
      if (newArrayAccess != null)
        msgs = ((InternalEObject)newArrayAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS, null, msgs);
      msgs = basicSetArrayAccess(newArrayAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS, newArrayAccess, newArrayAccess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(Array newArray, NotificationChain msgs)
  {
    Array oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND_MULTIPLE__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(Array newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.FIND_MULTIPLE__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.FIND_MULTIPLE__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.FIND_MULTIPLE__ARRAY, newArray, newArray));
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
      case SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS:
        return basicSetArrayAccess(null, msgs);
      case SeleniumPackage.FIND_MULTIPLE__ARRAY:
        return basicSetArray(null, msgs);
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
      case SeleniumPackage.FIND_MULTIPLE__PROP:
        return getProp();
      case SeleniumPackage.FIND_MULTIPLE__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS:
        return getArrayAccess();
      case SeleniumPackage.FIND_MULTIPLE__ARRAY:
        return getArray();
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
      case SeleniumPackage.FIND_MULTIPLE__PROP:
        setProp((PROPERTY)newValue);
        return;
      case SeleniumPackage.FIND_MULTIPLE__VALUE:
        setValue((SeleniumType)newValue);
        return;
      case SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS:
        setArrayAccess((ArrayAccess)newValue);
        return;
      case SeleniumPackage.FIND_MULTIPLE__ARRAY:
        setArray((Array)newValue);
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
      case SeleniumPackage.FIND_MULTIPLE__PROP:
        setProp(PROP_EDEFAULT);
        return;
      case SeleniumPackage.FIND_MULTIPLE__VALUE:
        setValue((SeleniumType)null);
        return;
      case SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS:
        setArrayAccess((ArrayAccess)null);
        return;
      case SeleniumPackage.FIND_MULTIPLE__ARRAY:
        setArray((Array)null);
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
      case SeleniumPackage.FIND_MULTIPLE__PROP:
        return prop != PROP_EDEFAULT;
      case SeleniumPackage.FIND_MULTIPLE__VALUE:
        return value != null;
      case SeleniumPackage.FIND_MULTIPLE__ARRAY_ACCESS:
        return arrayAccess != null;
      case SeleniumPackage.FIND_MULTIPLE__ARRAY:
        return array != null;
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

} //FindMultipleImpl
