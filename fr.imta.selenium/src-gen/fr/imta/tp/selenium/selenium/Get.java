/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Get#getProp <em>Prop</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Get#getElem <em>Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getGet()
 * @model
 * @generated
 */
public interface Get extends CallNativeWithResult
{
  /**
   * Returns the value of the '<em><b>Prop</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.tp.selenium.selenium.PROPERTY}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.PROPERTY
   * @see #setProp(PROPERTY)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getGet_Prop()
   * @model
   * @generated
   */
  PROPERTY getProp();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Get#getProp <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.PROPERTY
   * @see #getProp()
   * @generated
   */
  void setProp(PROPERTY value);

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getGet_Elem()
   * @model
   * @generated
   */
  SeleniumType getElem();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Get#getElem <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' reference.
   * @see #getElem()
   * @generated
   */
  void setElem(SeleniumType value);

} // Get
