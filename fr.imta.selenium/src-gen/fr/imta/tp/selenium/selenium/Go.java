/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Go#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Go#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getGo()
 * @model
 * @generated
 */
public interface Go extends CallNative
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' reference.
   * @see #setLocation(SeleniumType)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getGo_Location()
   * @model
   * @generated
   */
  SeleniumType getLocation();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Go#getLocation <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(SeleniumType value);

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getGo_ArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Go#getArrayAccess <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Access</em>' containment reference.
   * @see #getArrayAccess()
   * @generated
   */
  void setArrayAccess(ArrayAccess value);

} // Go
