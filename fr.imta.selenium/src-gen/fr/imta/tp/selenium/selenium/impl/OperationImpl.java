/**
 */
package fr.imta.tp.selenium.selenium.impl;

import fr.imta.tp.selenium.selenium.Operation;
import fr.imta.tp.selenium.selenium.SeleniumPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.OperationImpl#getStrvalue <em>Strvalue</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.impl.OperationImpl#getIntvalue <em>Intvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends VariableDeclarationImpl implements Operation
{
  /**
   * The default value of the '{@link #getStrvalue() <em>Strvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrvalue()
   * @generated
   * @ordered
   */
  protected static final String STRVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrvalue() <em>Strvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrvalue()
   * @generated
   * @ordered
   */
  protected String strvalue = STRVALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getIntvalue() <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntvalue()
   * @generated
   * @ordered
   */
  protected static final int INTVALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntvalue() <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntvalue()
   * @generated
   * @ordered
   */
  protected int intvalue = INTVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return SeleniumPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStrvalue()
  {
    return strvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrvalue(String newStrvalue)
  {
    String oldStrvalue = strvalue;
    strvalue = newStrvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.OPERATION__STRVALUE, oldStrvalue, strvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntvalue()
  {
    return intvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntvalue(int newIntvalue)
  {
    int oldIntvalue = intvalue;
    intvalue = newIntvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumPackage.OPERATION__INTVALUE, oldIntvalue, intvalue));
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
      case SeleniumPackage.OPERATION__STRVALUE:
        return getStrvalue();
      case SeleniumPackage.OPERATION__INTVALUE:
        return getIntvalue();
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
      case SeleniumPackage.OPERATION__STRVALUE:
        setStrvalue((String)newValue);
        return;
      case SeleniumPackage.OPERATION__INTVALUE:
        setIntvalue((Integer)newValue);
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
      case SeleniumPackage.OPERATION__STRVALUE:
        setStrvalue(STRVALUE_EDEFAULT);
        return;
      case SeleniumPackage.OPERATION__INTVALUE:
        setIntvalue(INTVALUE_EDEFAULT);
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
      case SeleniumPackage.OPERATION__STRVALUE:
        return STRVALUE_EDEFAULT == null ? strvalue != null : !STRVALUE_EDEFAULT.equals(strvalue);
      case SeleniumPackage.OPERATION__INTVALUE:
        return intvalue != INTVALUE_EDEFAULT;
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
    result.append(" (strvalue: ");
    result.append(strvalue);
    result.append(", intvalue: ");
    result.append(intvalue);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
