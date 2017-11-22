/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Open#getBrowser <em>Browser</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getOpen()
 * @model
 * @generated
 */
public interface Open extends CallNative
{
  /**
   * Returns the value of the '<em><b>Browser</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.tp.selenium.selenium.BROWSER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Browser</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Browser</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.BROWSER
   * @see #setBrowser(BROWSER)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getOpen_Browser()
   * @model
   * @generated
   */
  BROWSER getBrowser();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Open#getBrowser <em>Browser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Browser</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.BROWSER
   * @see #getBrowser()
   * @generated
   */
  void setBrowser(BROWSER value);

} // Open
