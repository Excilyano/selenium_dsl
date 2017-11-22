/**
 */
package fr.imta.tp.selenium.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Operation#getStrvalue <em>Strvalue</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Operation#getIntvalue <em>Intvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends VariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Strvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strvalue</em>' attribute.
   * @see #setStrvalue(String)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getOperation_Strvalue()
   * @model
   * @generated
   */
  String getStrvalue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Operation#getStrvalue <em>Strvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strvalue</em>' attribute.
   * @see #getStrvalue()
   * @generated
   */
  void setStrvalue(String value);

  /**
   * Returns the value of the '<em><b>Intvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intvalue</em>' attribute.
   * @see #setIntvalue(int)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getOperation_Intvalue()
   * @model
   * @generated
   */
  int getIntvalue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Operation#getIntvalue <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intvalue</em>' attribute.
   * @see #getIntvalue()
   * @generated
   */
  void setIntvalue(int value);

} // Operation
