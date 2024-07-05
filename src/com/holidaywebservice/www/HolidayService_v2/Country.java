/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public class Country implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Country(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Canada = "Canada";
    public static final java.lang.String _GreatBritain = "GreatBritain";
    public static final java.lang.String _IrelandNorthern = "IrelandNorthern";
    public static final java.lang.String _IrelandRepublicOf = "IrelandRepublicOf";
    public static final java.lang.String _Scotland = "Scotland";
    public static final java.lang.String _UnitedStates = "UnitedStates";
    public static final Country Canada = new Country(_Canada);
    public static final Country GreatBritain = new Country(_GreatBritain);
    public static final Country IrelandNorthern = new Country(_IrelandNorthern);
    public static final Country IrelandRepublicOf = new Country(_IrelandRepublicOf);
    public static final Country Scotland = new Country(_Scotland);
    public static final Country UnitedStates = new Country(_UnitedStates);
    public java.lang.String getValue() { return _value_;}
    public static Country fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Country enumeration = (Country)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Country fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Country.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
