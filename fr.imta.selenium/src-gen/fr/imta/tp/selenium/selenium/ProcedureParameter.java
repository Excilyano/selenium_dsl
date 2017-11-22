/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureParameter#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.tp.selenium.selenium.ProcedureParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureParameter()
 * @model
 * @generated
 */
public interface ProcedureParameter extends EObject
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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.ProcedureParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getProcedureParameter_Type()
   * @model
   * @generated
   */
  TYPE getType();

  /**
   * Sets the value of the '{@link fr.imta.tp.selenium.selenium.ProcedureParameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.imta.tp.selenium.selenium.TYPE
   * @see #getType()
   * @generated
   */
  void setType(TYPE value);

} // ProcedureParameter
