/**
 */
package fr.imta.tp.selenium.selenium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PROPERTY</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.tp.selenium.selenium.SeleniumPackage#getPROPERTY()
 * @model
 * @generated
 */
public enum PROPERTY implements Enumerator
{
  /**
   * The '<em><b>Byclassname</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYCLASSNAME_VALUE
   * @generated
   * @ordered
   */
  BYCLASSNAME(0, "byclassname", "class"),

  /**
   * The '<em><b>Byid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYID_VALUE
   * @generated
   * @ordered
   */
  BYID(1, "byid", "id"),

  /**
   * The '<em><b>Bycss</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYCSS_VALUE
   * @generated
   * @ordered
   */
  BYCSS(2, "bycss", "cssSelector"),

  /**
   * The '<em><b>Byxpath</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYXPATH_VALUE
   * @generated
   * @ordered
   */
  BYXPATH(3, "byxpath", "xpath"),

  /**
   * The '<em><b>Byname</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYNAME_VALUE
   * @generated
   * @ordered
   */
  BYNAME(4, "byname", "name"),

  /**
   * The '<em><b>Bytag</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYTAG_VALUE
   * @generated
   * @ordered
   */
  BYTAG(5, "bytag", "tagName");

  /**
   * The '<em><b>Byclassname</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Byclassname</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYCLASSNAME
   * @model name="byclassname" literal="class"
   * @generated
   * @ordered
   */
  public static final int BYCLASSNAME_VALUE = 0;

  /**
   * The '<em><b>Byid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Byid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYID
   * @model name="byid" literal="id"
   * @generated
   * @ordered
   */
  public static final int BYID_VALUE = 1;

  /**
   * The '<em><b>Bycss</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bycss</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYCSS
   * @model name="bycss" literal="cssSelector"
   * @generated
   * @ordered
   */
  public static final int BYCSS_VALUE = 2;

  /**
   * The '<em><b>Byxpath</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Byxpath</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYXPATH
   * @model name="byxpath" literal="xpath"
   * @generated
   * @ordered
   */
  public static final int BYXPATH_VALUE = 3;

  /**
   * The '<em><b>Byname</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Byname</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYNAME
   * @model name="byname" literal="name"
   * @generated
   * @ordered
   */
  public static final int BYNAME_VALUE = 4;

  /**
   * The '<em><b>Bytag</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bytag</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYTAG
   * @model name="bytag" literal="tagName"
   * @generated
   * @ordered
   */
  public static final int BYTAG_VALUE = 5;

  /**
   * An array of all the '<em><b>PROPERTY</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PROPERTY[] VALUES_ARRAY =
    new PROPERTY[]
    {
      BYCLASSNAME,
      BYID,
      BYCSS,
      BYXPATH,
      BYNAME,
      BYTAG,
    };

  /**
   * A public read-only list of all the '<em><b>PROPERTY</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PROPERTY> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>PROPERTY</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PROPERTY get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PROPERTY result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>PROPERTY</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PROPERTY getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PROPERTY result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>PROPERTY</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PROPERTY get(int value)
  {
    switch (value)
    {
      case BYCLASSNAME_VALUE: return BYCLASSNAME;
      case BYID_VALUE: return BYID;
      case BYCSS_VALUE: return BYCSS;
      case BYXPATH_VALUE: return BYXPATH;
      case BYNAME_VALUE: return BYNAME;
      case BYTAG_VALUE: return BYTAG;
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
  private PROPERTY(int value, String name, String literal)
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
  
} //PROPERTY
