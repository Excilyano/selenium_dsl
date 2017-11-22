/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Procedure#getParams <em>Params</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Procedure#getType <em>Type</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.Procedure#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.selenium.selenium.ProcedureParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedure_Params()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureParameter> getParams();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.tp.selenium.selenium.TYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.TYPE
   * @see #setType(TYPE)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedure_Type()
   * @model
   * @generated
   */
  TYPE getType();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Procedure#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.TYPE
   * @see #getType()
   * @generated
   */
  void setType(TYPE value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ProcedureBody)
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedure_Body()
   * @model containment="true"
   * @generated
   */
  ProcedureBody getBody();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.Procedure#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ProcedureBody value);

} // Procedure
