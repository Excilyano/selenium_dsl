/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Fill#getElem <em>Elem</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Fill#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Fill#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends CallNative
{
  /**
   * Returns the value of the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' reference.
   * @see #setElem(SeleniumType)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFill_Elem()
   * @model
   * @generated
   */
  SeleniumType getElem();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Fill#getElem <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' reference.
   * @see #getElem()
   * @generated
   */
  void setElem(SeleniumType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(SeleniumType)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFill_Value()
   * @model
   * @generated
   */
  SeleniumType getValue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Fill#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SeleniumType value);

  /**
   * Returns the value of the '<em><b>Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Access</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Access</em>' containment reference.
   * @see #setArrayAccess(ArrayAccess)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFill_ArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Fill#getArrayAccess <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Access</em>' containment reference.
   * @see #getArrayAccess()
   * @generated
   */
  void setArrayAccess(ArrayAccess value);

} // Fill
