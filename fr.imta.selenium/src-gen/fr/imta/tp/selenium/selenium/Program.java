/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Program#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Program#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.selenium.selenium.Procedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProgram_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<Procedure> getProcedures();

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProgram_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Program
