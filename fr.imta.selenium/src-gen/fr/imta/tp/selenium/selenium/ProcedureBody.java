/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureBody#getStatements <em>Statements</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureBody#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureBody#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureBody()
 * @model
 * @generated
 */
public interface ProcedureBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.selenium.selenium.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureBody_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureBody_Value()
   * @model
   * @generated
   */
  SeleniumType getValue();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.ProcedureBody#getValue <em>Value</em>}' reference.
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureBody_ArrayAccess()
   * @model containment="true"
   * @generated
   */
  ArrayAccess getArrayAccess();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.ProcedureBody#getArrayAccess <em>Array Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Access</em>' containment reference.
   * @see #getArrayAccess()
   * @generated
   */
  void setArrayAccess(ArrayAccess value);

} // ProcedureBody
