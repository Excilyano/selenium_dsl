/**
 */
package fr.imta.tp.selenium.selenium;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage
 * @generated
 */
public interface SeleniumFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SeleniumFactory eINSTANCE = fr.imta.tp.selenium.selenium.impl.SeleniumFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure</em>'.
   * @generated
   */
  Procedure createProcedure();

  /**
   * Returns a new object of class '<em>Procedure Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Parameter</em>'.
   * @generated
   */
  ProcedureParameter createProcedureParameter();

  /**
   * Returns a new object of class '<em>Procedure Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Body</em>'.
   * @generated
   */
  ProcedureBody createProcedureBody();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Find Multiple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Find Multiple</em>'.
   * @generated
   */
  FindMultiple createFindMultiple();

  /**
   * Returns a new object of class '<em>Procedure Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Call</em>'.
   * @generated
   */
  ProcedureCall createProcedureCall();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Call Native</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Native</em>'.
   * @generated
   */
  CallNative createCallNative();

  /**
   * Returns a new object of class '<em>Call Native With Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Native With Result</em>'.
   * @generated
   */
  CallNativeWithResult createCallNativeWithResult();

  /**
   * Returns a new object of class '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open</em>'.
   * @generated
   */
  Open createOpen();

  /**
   * Returns a new object of class '<em>Close</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Close</em>'.
   * @generated
   */
  Close createClose();

  /**
   * Returns a new object of class '<em>Go</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Go</em>'.
   * @generated
   */
  Go createGo();

  /**
   * Returns a new object of class '<em>Find</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Find</em>'.
   * @generated
   */
  Find createFind();

  /**
   * Returns a new object of class '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fill</em>'.
   * @generated
   */
  Fill createFill();

  /**
   * Returns a new object of class '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Click</em>'.
   * @generated
   */
  Click createClick();

  /**
   * Returns a new object of class '<em>Verify</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verify</em>'.
   * @generated
   */
  Verify createVerify();

  /**
   * Returns a new object of class '<em>Show</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show</em>'.
   * @generated
   */
  Show createShow();

  /**
   * Returns a new object of class '<em>Show Multiple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Multiple</em>'.
   * @generated
   */
  ShowMultiple createShowMultiple();

  /**
   * Returns a new object of class '<em>Get</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get</em>'.
   * @generated
   */
  Get createGet();

  /**
   * Returns a new object of class '<em>Len</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Len</em>'.
   * @generated
   */
  Len createLen();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  SeleniumType createSeleniumType();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array</em>'.
   * @generated
   */
  Array createArray();

  /**
   * Returns a new object of class '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Access</em>'.
   * @generated
   */
  ArrayAccess createArrayAccess();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SeleniumPackage getSeleniumPackage();

} //SeleniumFactory
