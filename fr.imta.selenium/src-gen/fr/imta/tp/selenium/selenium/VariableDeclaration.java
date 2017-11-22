/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.VariableDeclaration#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Statement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getVariableDeclaration_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.VariableDeclaration#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // VariableDeclaration
