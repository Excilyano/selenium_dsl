/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureCall#getProc <em>Proc</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureCall#getParams <em>Params</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureCall#getArrayAccess <em>Array Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureCall()
 * @model
 * @generated
 */
public interface ProcedureCall extends VariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' reference.
   * @see #setProc(Procedure)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureCall_Proc()
   * @model
   * @generated
   */
  Procedure getProc();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.ProcedureCall#getProc <em>Proc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc</em>' reference.
   * @see #getProc()
   * @generated
   */
  void setProc(Procedure value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' reference list.
   * The list contents are of type {@link fr.imta.tp.selenium.selenium.SeleniumType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' reference list.
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureCall_Params()
   * @model
   * @generated
   */
  EList<SeleniumType> getParams();

  /**
   * Returns the value of the '<em><b>Array Access</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.selenium.selenium.ArrayAccess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Access</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Access</em>' containment reference list.
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureCall_ArrayAccess()
   * @model containment="true"
   * @generated
   */
  EList<ArrayAccess> getArrayAccess();

} // ProcedureCall
