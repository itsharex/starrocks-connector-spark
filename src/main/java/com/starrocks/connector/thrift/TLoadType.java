/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.connector.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2022-10-12")
public enum TLoadType implements org.apache.thrift.TEnum {
  MANUL_LOAD(0),
  ROUTINE_LOAD(1),
  MINI_LOAD(2);

  private final int value;

  private TLoadType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TLoadType findByValue(int value) { 
    switch (value) {
      case 0:
        return MANUL_LOAD;
      case 1:
        return ROUTINE_LOAD;
      case 2:
        return MINI_LOAD;
      default:
        return null;
    }
  }
}