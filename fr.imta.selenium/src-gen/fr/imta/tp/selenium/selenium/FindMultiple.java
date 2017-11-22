/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.FindMultiple#getProp <em>Prop</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.FindMultiple#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.FindMultiple#getArrayAccess <em>Array Access</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.FindMultiple#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFindMultiple()
 * @model
 * @generated
 */
public interface FindMultiple extends Statement
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFindMultiple_Prop()
   * @model
   * @generated
   */
  PROPERTY getProp();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.FindMultiple#getProp <em>Prop</em>}' attribute.
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFindMultiple_Value()
   * @model
   * @generated
   */
  SeleniumType getValue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.FindMultiple#getValue <em>Value</em>}' reference.
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFindMultiple_ArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.FindMultiple#getArrayAccess <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Access</em>' containment reference.
   * @see #getArrayAccess()
   * @generated
   */
  void setArrayAccess(ArrayAccess value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(Array)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getFindMultiple_Array()
   * @model containment="true"
   * @generated
   */
  Array getArray();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.FindMultiple#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Array value);

} // FindMultiple
