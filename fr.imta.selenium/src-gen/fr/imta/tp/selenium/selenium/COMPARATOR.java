/**
 */
package fr.imta.tp.selenium.selenium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COMPARATOR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getCOMPARATOR()
 * @model
 * @generated
 */
public enum COMPARATOR implements Enumerator
{
  /**
   * The '<em><b>Equals</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUALS_VALUE
   * @generated
   * @ordered
   */
  EQUALS(0, "equals", "equals"),

  /**
   * The '<em><b>Contains</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTAINS_VALUE
   * @generated
   * @ordered
   */
  CONTAINS(1, "contains", "contains"),

  /**
   * The '<em><b>Different</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIFFERENT_VALUE
   * @generated
   * @ordered
   */
  DIFFERENT(2, "different", "different"),

  /**
   * The '<em><b>Greater</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_VALUE
   * @generated
   * @ordered
   */
  GREATER(3, "greater", "greater"),

  /**
   * The '<em><b>Lower</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOWER_VALUE
   * @generated
   * @ordered
   */
  LOWER(4, "lower", "lower"),

  /**
   * The '<em><b>Starts</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STARTS_VALUE
   * @generated
   * @ordered
   */
  STARTS(5, "starts", "starts"),

  /**
   * The '<em><b>Ends</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENDS_VALUE
   * @generated
   * @ordered
   */
  ENDS(6, "ends", "ends");

  /**
   * The '<em><b>Equals</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUALS
   * @model name="equals"
   * @generated
   * @ordered
   */
  public static final int EQUALS_VALUE = 0;

  /**
   * The '<em><b>Contains</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTAINS
   * @model name="contains"
   * @generated
   * @ordered
   */
  public static final int CONTAINS_VALUE = 1;

  /**
   * The '<em><b>Different</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Different</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIFFERENT
   * @model name="different"
   * @generated
   * @ordered
   */
  public static final int DIFFERENT_VALUE = 2;

  /**
   * The '<em><b>Greater</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER
   * @model name="greater"
   * @generated
   * @ordered
   */
  public static final int GREATER_VALUE = 3;

  /**
   * The '<em><b>Lower</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lower</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOWER
   * @model name="lower"
   * @generated
   * @ordered
   */
  public static final int LOWER_VALUE = 4;

  /**
   * The '<em><b>Starts</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Starts</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STARTS
   * @model name="starts"
   * @generated
   * @ordered
   */
  public static final int STARTS_VALUE = 5;

  /**
   * The '<em><b>Ends</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ends</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENDS
   * @model name="ends"
   * @generated
   * @ordered
   */
  public static final int ENDS_VALUE = 6;

  /**
   * An array of all the '<em><b>COMPARATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final COMPARATOR[] VALUES_ARRAY =
    new COMPARATOR[]
    {
      EQUALS,
      CONTAINS,
      DIFFERENT,
      GREATER,
      LOWER,
      STARTS,
      ENDS,
    };

  /**
   * A public read-only list of all the '<em><b>COMPARATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<COMPARATOR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>COMPARATOR</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static COMPARATOR get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      COMPARATOR result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>COMPARATOR</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static COMPARATOR getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      COMPARATOR result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>COMPARATOR</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static COMPARATOR get(int value)
  {
    switch (value)
    {
      case EQUALS_VALUE: return EQUALS;
      case CONTAINS_VALUE: return CONTAINS;
      case DIFFERENT_VALUE: return DIFFERENT;
      case GREATER_VALUE: return GREATER;
      case LOWER_VALUE: return LOWER;
      case STARTS_VALUE: return STARTS;
      case ENDS_VALUE: return ENDS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private COMPARATOR(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //COMPARATOR
