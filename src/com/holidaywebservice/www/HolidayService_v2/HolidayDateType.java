/**
 * HolidayDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public class HolidayDateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HolidayDateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Observed = "Observed";
    public static final java.lang.String _Actual = "Actual";
    public static final java.lang.String _ObservedActual = "ObservedActual";
    public static final HolidayDateType Observed = new HolidayDateType(_Observed);
    public static final HolidayDateType Actual = new HolidayDateType(_Actual);
    public static final HolidayDateType ObservedActual = new HolidayDateType(_ObservedActual);
    public java.lang.String getValue() { return _value_;}
    public static HolidayDateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HolidayDateType enumeration = (HolidayDateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HolidayDateType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HolidayDateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayDateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
