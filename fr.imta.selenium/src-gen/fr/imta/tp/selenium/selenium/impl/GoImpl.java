/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.ArrayAccess;
import fr.imta.tp.selenium.selenium.Go;
import fr.imta.tp.selenium.selenium.SeleniumPackage;
import fr.imta.tp.selenium.selenium.SeleniumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Go</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.GoImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.GoImpl#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoImpl extends CallNativeImpl implements Go
{
  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected SeleniumType location;

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
  protected GoImpl()
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
    return SeleniumPackage.Literals.GO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType getLocation()
  {
    if (location != null && location.eIsProxy())
    {
      InternalEObject oldLocation = (InternalEObject)location;
      location = (SeleniumType)eResolveProxy(oldLocation);
      if (location != oldLocation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleniumPackage.GO__LOCATION, oldLocation, location));
      }
    }
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumType basicGetLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(SeleniumType newLocation)
  {
    SeleniumType oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.GO__LOCATION, oldLocation, location));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumPackage.GO__ARRAY_ACCESS, oldArrayAccess, newArrayAccess);
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
        msgs = ((InternalEObject)arrayAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.GO__ARRAY_ACCESS, null, msgs);
      if (newArrayAccess != null)
        msgs = ((InternalEObject)newArrayAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumPackage.GO__ARRAY_ACCESS, null, msgs);
      msgs = basicSetArrayAccess(newArrayAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.GO__ARRAY_ACCESS, newArrayAccess, newArrayAccess));
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
      case SeleniumPackage.GO__ARRAY_ACCESS:
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
      case SeleniumPackage.GO__LOCATION:
        if (resolve) return getLocation();
        return basicGetLocation();
      case SeleniumPackage.GO__ARRAY_ACCESS:
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
      case SeleniumPackage.GO__LOCATION:
        setLocation((SeleniumType)newValue);
        return;
      case SeleniumPackage.GO__ARRAY_ACCESS:
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
      case SeleniumPackage.GO__LOCATION:
        setLocation((SeleniumType)null);
        return;
      case SeleniumPackage.GO__ARRAY_ACCESS:
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
      case SeleniumPackage.GO__LOCATION:
        return location != null;
      case SeleniumPackage.GO__ARRAY_ACCESS:
        return arrayAccess != null;
    }
    return super.eIsSet(featureID);
  }

} //GoImpl
