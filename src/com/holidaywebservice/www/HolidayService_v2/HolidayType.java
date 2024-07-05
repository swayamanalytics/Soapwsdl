/**
 * HolidayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public class HolidayType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HolidayType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Notable = "Notable";
    public static final java.lang.String _Religious = "Religious";
    public static final java.lang.String _NotableReligious = "NotableReligious";
    public static final java.lang.String _Other = "Other";
    public static final HolidayType Notable = new HolidayType(_Notable);
    public static final HolidayType Religious = new HolidayType(_Religious);
    public static final HolidayType NotableReligious = new HolidayType(_NotableReligious);
    public static final HolidayType Other = new HolidayType(_Other);
    public java.lang.String getValue() { return _value_;}
    public static HolidayType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HolidayType enumeration = (HolidayType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HolidayType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HolidayType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
