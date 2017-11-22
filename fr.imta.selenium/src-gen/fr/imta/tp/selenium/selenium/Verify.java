/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Verify#getElem <em>Elem</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Verify#getLeftArrayAccess <em>Left Array Access</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Verify#getComp <em>Comp</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Verify#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Verify#getRightArrayAccess <em>Right Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVerify()
 * @model
 * @generated
 */
public interface Verify extends CallNative
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVerify_Elem()
   * @model
   * @generated
   */
  SeleniumType getElem();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Verify#getElem <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' reference.
   * @see #getElem()
   * @generated
   */
  void setElem(SeleniumType value);

  /**
   * Returns the value of the '<em><b>Left Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Array Access</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Array Access</em>' containment reference.
   * @see #setLeftArrayAccess(ArrayAccess)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVerify_LeftArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getLeftArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Verify#getLeftArrayAccess <em>Left Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Array Access</em>' containment reference.
   * @see #getLeftArrayAccess()
   * @generated
   */
  void setLeftArrayAccess(ArrayAccess value);

  /**
   * Returns the value of the '<em><b>Comp</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.tp.selenium.selenium.COMPARATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.COMPARATOR
   * @see #setComp(COMPARATOR)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVerify_Comp()
   * @model
   * @generated
   */
  COMPARATOR getComp();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Verify#getComp <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.COMPARATOR
   * @see #getComp()
   * @generated
   */
  void setComp(COMPARATOR value);

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVerify_Value()
   * @model
   * @generated
   */
  SeleniumType getValue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Verify#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SeleniumType value);

  /**
   * Returns the value of the '<em><b>Right Array Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Array Access</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Array Access</em>' containment reference.
   * @see #setRightArrayAccess(ArrayAccess)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVerify_RightArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getRightArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Verify#getRightArrayAccess <em>Right Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Array Access</em>' containment reference.
   * @see #getRightArrayAccess()
   * @generated
   */
  void setRightArrayAccess(ArrayAccess value);

} // Verify
