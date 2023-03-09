/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.starrocks.connector.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2022-10-12")
public class TColumnType implements org.apache.thrift.TBase<TColumnType, TColumnType._Fields>, java.io.Serializable, Cloneable, Comparable<TColumnType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumnType");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LEN_FIELD_DESC = new org.apache.thrift.protocol.TField("len", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField INDEX_LEN_FIELD_DESC = new org.apache.thrift.protocol.TField("index_len", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PRECISION_FIELD_DESC = new org.apache.thrift.protocol.TField("precision", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("scale", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TColumnTypeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TColumnTypeTupleSchemeFactory();

  /**
   * 
   * @see TPrimitiveType
   */
  public @org.apache.thrift.annotation.Nullable TPrimitiveType type; // required
  public int len; // optional
  public int index_len; // optional
  public int precision; // optional
  public int scale; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TPrimitiveType
     */
    TYPE((short)1, "type"),
    LEN((short)2, "len"),
    INDEX_LEN((short)3, "index_len"),
    PRECISION((short)4, "precision"),
    SCALE((short)5, "scale");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // LEN
          return LEN;
        case 3: // INDEX_LEN
          return INDEX_LEN;
        case 4: // PRECISION
          return PRECISION;
        case 5: // SCALE
          return SCALE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LEN_ISSET_ID = 0;
  private static final int __INDEX_LEN_ISSET_ID = 1;
  private static final int __PRECISION_ISSET_ID = 2;
  private static final int __SCALE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LEN,_Fields.INDEX_LEN,_Fields.PRECISION,_Fields.SCALE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPrimitiveType.class)));
    tmpMap.put(_Fields.LEN, new org.apache.thrift.meta_data.FieldMetaData("len", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INDEX_LEN, new org.apache.thrift.meta_data.FieldMetaData("index_len", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRECISION, new org.apache.thrift.meta_data.FieldMetaData("precision", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCALE, new org.apache.thrift.meta_data.FieldMetaData("scale", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumnType.class, metaDataMap);
  }

  public TColumnType() {
  }

  public TColumnType(
    TPrimitiveType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumnType(TColumnType other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.len = other.len;
    this.index_len = other.index_len;
    this.precision = other.precision;
    this.scale = other.scale;
  }

  public TColumnType deepCopy() {
    return new TColumnType(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setLenIsSet(false);
    this.len = 0;
    setIndex_lenIsSet(false);
    this.index_len = 0;
    setPrecisionIsSet(false);
    this.precision = 0;
    setScaleIsSet(false);
    this.scale = 0;
  }

  /**
   * 
   * @see TPrimitiveType
   */
  @org.apache.thrift.annotation.Nullable
  public TPrimitiveType getType() {
    return this.type;
  }

  /**
   * 
   * @see TPrimitiveType
   */
  public TColumnType setType(@org.apache.thrift.annotation.Nullable TPrimitiveType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getLen() {
    return this.len;
  }

  public TColumnType setLen(int len) {
    this.len = len;
    setLenIsSet(true);
    return this;
  }

  public void unsetLen() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEN_ISSET_ID);
  }

  /** Returns true if field len is set (has been assigned a value) and false otherwise */
  public boolean isSetLen() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEN_ISSET_ID);
  }

  public void setLenIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEN_ISSET_ID, value);
  }

  public int getIndex_len() {
    return this.index_len;
  }

  public TColumnType setIndex_len(int index_len) {
    this.index_len = index_len;
    setIndex_lenIsSet(true);
    return this;
  }

  public void unsetIndex_len() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INDEX_LEN_ISSET_ID);
  }

  /** Returns true if field index_len is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex_len() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INDEX_LEN_ISSET_ID);
  }

  public void setIndex_lenIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INDEX_LEN_ISSET_ID, value);
  }

  public int getPrecision() {
    return this.precision;
  }

  public TColumnType setPrecision(int precision) {
    this.precision = precision;
    setPrecisionIsSet(true);
    return this;
  }

  public void unsetPrecision() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  /** Returns true if field precision is set (has been assigned a value) and false otherwise */
  public boolean isSetPrecision() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  public void setPrecisionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRECISION_ISSET_ID, value);
  }

  public int getScale() {
    return this.scale;
  }

  public TColumnType setScale(int scale) {
    this.scale = scale;
    setScaleIsSet(true);
    return this;
  }

  public void unsetScale() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  /** Returns true if field scale is set (has been assigned a value) and false otherwise */
  public boolean isSetScale() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  public void setScaleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCALE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TPrimitiveType)value);
      }
      break;

    case LEN:
      if (value == null) {
        unsetLen();
      } else {
        setLen((Integer)value);
      }
      break;

    case INDEX_LEN:
      if (value == null) {
        unsetIndex_len();
      } else {
        setIndex_len((Integer)value);
      }
      break;

    case PRECISION:
      if (value == null) {
        unsetPrecision();
      } else {
        setPrecision((Integer)value);
      }
      break;

    case SCALE:
      if (value == null) {
        unsetScale();
      } else {
        setScale((Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LEN:
      return getLen();

    case INDEX_LEN:
      return getIndex_len();

    case PRECISION:
      return getPrecision();

    case SCALE:
      return getScale();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LEN:
      return isSetLen();
    case INDEX_LEN:
      return isSetIndex_len();
    case PRECISION:
      return isSetPrecision();
    case SCALE:
      return isSetScale();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TColumnType)
      return this.equals((TColumnType)that);
    return false;
  }

  public boolean equals(TColumnType that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_len = true && this.isSetLen();
    boolean that_present_len = true && that.isSetLen();
    if (this_present_len || that_present_len) {
      if (!(this_present_len && that_present_len))
        return false;
      if (this.len != that.len)
        return false;
    }

    boolean this_present_index_len = true && this.isSetIndex_len();
    boolean that_present_index_len = true && that.isSetIndex_len();
    if (this_present_index_len || that_present_index_len) {
      if (!(this_present_index_len && that_present_index_len))
        return false;
      if (this.index_len != that.index_len)
        return false;
    }

    boolean this_present_precision = true && this.isSetPrecision();
    boolean that_present_precision = true && that.isSetPrecision();
    if (this_present_precision || that_present_precision) {
      if (!(this_present_precision && that_present_precision))
        return false;
      if (this.precision != that.precision)
        return false;
    }

    boolean this_present_scale = true && this.isSetScale();
    boolean that_present_scale = true && that.isSetScale();
    if (this_present_scale || that_present_scale) {
      if (!(this_present_scale && that_present_scale))
        return false;
      if (this.scale != that.scale)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetLen()) ? 131071 : 524287);
    if (isSetLen())
      hashCode = hashCode * 8191 + len;

    hashCode = hashCode * 8191 + ((isSetIndex_len()) ? 131071 : 524287);
    if (isSetIndex_len())
      hashCode = hashCode * 8191 + index_len;

    hashCode = hashCode * 8191 + ((isSetPrecision()) ? 131071 : 524287);
    if (isSetPrecision())
      hashCode = hashCode * 8191 + precision;

    hashCode = hashCode * 8191 + ((isSetScale()) ? 131071 : 524287);
    if (isSetScale())
      hashCode = hashCode * 8191 + scale;

    return hashCode;
  }

  @Override
  public int compareTo(TColumnType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLen()).compareTo(other.isSetLen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.len, other.len);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex_len()).compareTo(other.isSetIndex_len());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex_len()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_len, other.index_len);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrecision()).compareTo(other.isSetPrecision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrecision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.precision, other.precision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScale()).compareTo(other.isSetScale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scale, other.scale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TColumnType(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetLen()) {
      if (!first) sb.append(", ");
      sb.append("len:");
      sb.append(this.len);
      first = false;
    }
    if (isSetIndex_len()) {
      if (!first) sb.append(", ");
      sb.append("index_len:");
      sb.append(this.index_len);
      first = false;
    }
    if (isSetPrecision()) {
      if (!first) sb.append(", ");
      sb.append("precision:");
      sb.append(this.precision);
      first = false;
    }
    if (isSetScale()) {
      if (!first) sb.append(", ");
      sb.append("scale:");
      sb.append(this.scale);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TColumnTypeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColumnTypeStandardScheme getScheme() {
      return new TColumnTypeStandardScheme();
    }
  }

  private static class TColumnTypeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TColumnType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumnType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = TPrimitiveType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.len = iprot.readI32();
              struct.setLenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INDEX_LEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index_len = iprot.readI32();
              struct.setIndex_lenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRECISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.precision = iprot.readI32();
              struct.setPrecisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.scale = iprot.readI32();
              struct.setScaleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumnType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetLen()) {
        oprot.writeFieldBegin(LEN_FIELD_DESC);
        oprot.writeI32(struct.len);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIndex_len()) {
        oprot.writeFieldBegin(INDEX_LEN_FIELD_DESC);
        oprot.writeI32(struct.index_len);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPrecision()) {
        oprot.writeFieldBegin(PRECISION_FIELD_DESC);
        oprot.writeI32(struct.precision);
        oprot.writeFieldEnd();
      }
      if (struct.isSetScale()) {
        oprot.writeFieldBegin(SCALE_FIELD_DESC);
        oprot.writeI32(struct.scale);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnTypeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColumnTypeTupleScheme getScheme() {
      return new TColumnTypeTupleScheme();
    }
  }

  private static class TColumnTypeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TColumnType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumnType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLen()) {
        optionals.set(0);
      }
      if (struct.isSetIndex_len()) {
        optionals.set(1);
      }
      if (struct.isSetPrecision()) {
        optionals.set(2);
      }
      if (struct.isSetScale()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetLen()) {
        oprot.writeI32(struct.len);
      }
      if (struct.isSetIndex_len()) {
        oprot.writeI32(struct.index_len);
      }
      if (struct.isSetPrecision()) {
        oprot.writeI32(struct.precision);
      }
      if (struct.isSetScale()) {
        oprot.writeI32(struct.scale);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumnType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.type = TPrimitiveType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.len = iprot.readI32();
        struct.setLenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.index_len = iprot.readI32();
        struct.setIndex_lenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.precision = iprot.readI32();
        struct.setPrecisionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.scale = iprot.readI32();
        struct.setScaleIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

