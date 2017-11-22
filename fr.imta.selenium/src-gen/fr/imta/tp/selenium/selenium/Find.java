/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Find#getProp <em>Prop</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Find#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFind()
 * @model
 * @generated
 */
public interface Find extends CallNativeWithResult
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFind_Prop()
   * @model
   * @generated
   */
  PROPERTY getProp();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Find#getProp <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.PROPERTY
   * @see #getProp()
   * @generated
   */
  void setProp(PROPERTY value);

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFind_Value()
   * @model
   * @generated
   */
  SeleniumType getValue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Find#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SeleniumType value);

} // Find
