/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.connector.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2022-10-12")
public enum TTaskType implements org.apache.thrift.TEnum {
  CREATE(0),
  DROP(1),
  PUSH(2),
  CLONE(3),
  STORAGE_MEDIUM_MIGRATE(4),
  ROLLUP(5),
  SCHEMA_CHANGE(6),
  CANCEL_DELETE(7),
  MAKE_SNAPSHOT(8),
  RELEASE_SNAPSHOT(9),
  CHECK_CONSISTENCY(10),
  UPLOAD(11),
  DOWNLOAD(12),
  CLEAR_REMOTE_FILE(13),
  MOVE(14),
  REALTIME_PUSH(15),
  PUBLISH_VERSION(16),
  CLEAR_ALTER_TASK(17),
  CLEAR_TRANSACTION_TASK(18),
  RECOVER_TABLET(19),
  STREAM_LOAD(20),
  UPDATE_TABLET_META_INFO(21),
  ALTER_TASK(22);

  private final int value;

  private TTaskType(int value) {
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
  public static TTaskType findByValue(int value) { 
    switch (value) {
      case 0:
        return CREATE;
      case 1:
        return DROP;
      case 2:
        return PUSH;
      case 3:
        return CLONE;
      case 4:
        return STORAGE_MEDIUM_MIGRATE;
      case 5:
        return ROLLUP;
      case 6:
        return SCHEMA_CHANGE;
      case 7:
        return CANCEL_DELETE;
      case 8:
        return MAKE_SNAPSHOT;
      case 9:
        return RELEASE_SNAPSHOT;
      case 10:
        return CHECK_CONSISTENCY;
      case 11:
        return UPLOAD;
      case 12:
        return DOWNLOAD;
      case 13:
        return CLEAR_REMOTE_FILE;
      case 14:
        return MOVE;
      case 15:
        return REALTIME_PUSH;
      case 16:
        return PUBLISH_VERSION;
      case 17:
        return CLEAR_ALTER_TASK;
      case 18:
        return CLEAR_TRANSACTION_TASK;
      case 19:
        return RECOVER_TABLET;
      case 20:
        return STREAM_LOAD;
      case 21:
        return UPDATE_TABLET_META_INFO;
      case 22:
        return ALTER_TASK;
      default:
        return null;
    }
  }
}
