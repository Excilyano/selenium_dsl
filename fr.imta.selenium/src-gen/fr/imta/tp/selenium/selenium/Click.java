/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Click#getElem <em>Elem</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Click#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getClick()
 * @model
 * @generated
 */
public interface Click extends CallNative
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getClick_Elem()
   * @model
   * @generated
   */
  SeleniumType getElem();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Click#getElem <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' reference.
   * @see #getElem()
   * @generated
   */
  void setElem(SeleniumType value);

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getClick_ArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Click#getArrayAccess <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Access</em>' containment reference.
   * @see #getArrayAccess()
   * @generated
   */
  void setArrayAccess(ArrayAccess value);

} // Click
