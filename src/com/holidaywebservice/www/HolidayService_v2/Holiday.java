/**
 * Holiday.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public class Holiday  implements java.io.Serializable {
    private com.holidaywebservice.www.HolidayService_v2.Country country;

    private java.lang.String holidayCode;

    private java.lang.String descriptor;

    private com.holidaywebservice.www.HolidayService_v2.HolidayType holidayType;

    private com.holidaywebservice.www.HolidayService_v2.HolidayDateType dateType;

    private com.holidaywebservice.www.HolidayService_v2.BankHoliday bankHoliday;

    private java.util.Calendar date;

    private java.lang.String relatedHolidayCode;

    private com.holidaywebservice.www.HolidayService_v2.RegionCode[] applicableRegions;

    public Holiday() {
    }

    public Holiday(
           com.holidaywebservice.www.HolidayService_v2.Country country,
           java.lang.String holidayCode,
           java.lang.String descriptor,
           com.holidaywebservice.www.HolidayService_v2.HolidayType holidayType,
           com.holidaywebservice.www.HolidayService_v2.HolidayDateType dateType,
           com.holidaywebservice.www.HolidayService_v2.BankHoliday bankHoliday,
           java.util.Calendar date,
           java.lang.String relatedHolidayCode,
           com.holidaywebservice.www.HolidayService_v2.RegionCode[] applicableRegions) {
           this.country = country;
           this.holidayCode = holidayCode;
           this.descriptor = descriptor;
           this.holidayType = holidayType;
           this.dateType = dateType;
           this.bankHoliday = bankHoliday;
           this.date = date;
           this.relatedHolidayCode = relatedHolidayCode;
           this.applicableRegions = applicableRegions;
    }


    /**
     * Gets the country value for this Holiday.
     * 
     * @return country
     */
    public com.holidaywebservice.www.HolidayService_v2.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Holiday.
     * 
     * @param country
     */
    public void setCountry(com.holidaywebservice.www.HolidayService_v2.Country country) {
        this.country = country;
    }


    /**
     * Gets the holidayCode value for this Holiday.
     * 
     * @return holidayCode
     */
    public java.lang.String getHolidayCode() {
        return holidayCode;
    }


    /**
     * Sets the holidayCode value for this Holiday.
     * 
     * @param holidayCode
     */
    public void setHolidayCode(java.lang.String holidayCode) {
        this.holidayCode = holidayCode;
    }


    /**
     * Gets the descriptor value for this Holiday.
     * 
     * @return descriptor
     */
    public java.lang.String getDescriptor() {
        return descriptor;
    }


    /**
     * Sets the descriptor value for this Holiday.
     * 
     * @param descriptor
     */
    public void setDescriptor(java.lang.String descriptor) {
        this.descriptor = descriptor;
    }


    /**
     * Gets the holidayType value for this Holiday.
     * 
     * @return holidayType
     */
    public com.holidaywebservice.www.HolidayService_v2.HolidayType getHolidayType() {
        return holidayType;
    }


    /**
     * Sets the holidayType value for this Holiday.
     * 
     * @param holidayType
     */
    public void setHolidayType(com.holidaywebservice.www.HolidayService_v2.HolidayType holidayType) {
        this.holidayType = holidayType;
    }


    /**
     * Gets the dateType value for this Holiday.
     * 
     * @return dateType
     */
    public com.holidaywebservice.www.HolidayService_v2.HolidayDateType getDateType() {
        return dateType;
    }


    /**
     * Sets the dateType value for this Holiday.
     * 
     * @param dateType
     */
    public void setDateType(com.holidaywebservice.www.HolidayService_v2.HolidayDateType dateType) {
        this.dateType = dateType;
    }


    /**
     * Gets the bankHoliday value for this Holiday.
     * 
     * @return bankHoliday
     */
    public com.holidaywebservice.www.HolidayService_v2.BankHoliday getBankHoliday() {
        return bankHoliday;
    }


    /**
     * Sets the bankHoliday value for this Holiday.
     * 
     * @param bankHoliday
     */
    public void setBankHoliday(com.holidaywebservice.www.HolidayService_v2.BankHoliday bankHoliday) {
        this.bankHoliday = bankHoliday;
    }


    /**
     * Gets the date value for this Holiday.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this Holiday.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the relatedHolidayCode value for this Holiday.
     * 
     * @return relatedHolidayCode
     */
    public java.lang.String getRelatedHolidayCode() {
        return relatedHolidayCode;
    }


    /**
     * Sets the relatedHolidayCode value for this Holiday.
     * 
     * @param relatedHolidayCode
     */
    public void setRelatedHolidayCode(java.lang.String relatedHolidayCode) {
        this.relatedHolidayCode = relatedHolidayCode;
    }


    /**
     * Gets the applicableRegions value for this Holiday.
     * 
     * @return applicableRegions
     */
    public com.holidaywebservice.www.HolidayService_v2.RegionCode[] getApplicableRegions() {
        return applicableRegions;
    }


    /**
     * Sets the applicableRegions value for this Holiday.
     * 
     * @param applicableRegions
     */
    public void setApplicableRegions(com.holidaywebservice.www.HolidayService_v2.RegionCode[] applicableRegions) {
        this.applicableRegions = applicableRegions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Holiday)) return false;
        Holiday other = (Holiday) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.holidayCode==null && other.getHolidayCode()==null) || 
             (this.holidayCode!=null &&
              this.holidayCode.equals(other.getHolidayCode()))) &&
            ((this.descriptor==null && other.getDescriptor()==null) || 
             (this.descriptor!=null &&
              this.descriptor.equals(other.getDescriptor()))) &&
            ((this.holidayType==null && other.getHolidayType()==null) || 
             (this.holidayType!=null &&
              this.holidayType.equals(other.getHolidayType()))) &&
            ((this.dateType==null && other.getDateType()==null) || 
             (this.dateType!=null &&
              this.dateType.equals(other.getDateType()))) &&
            ((this.bankHoliday==null && other.getBankHoliday()==null) || 
             (this.bankHoliday!=null &&
              this.bankHoliday.equals(other.getBankHoliday()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.relatedHolidayCode==null && other.getRelatedHolidayCode()==null) || 
             (this.relatedHolidayCode!=null &&
              this.relatedHolidayCode.equals(other.getRelatedHolidayCode()))) &&
            ((this.applicableRegions==null && other.getApplicableRegions()==null) || 
             (this.applicableRegions!=null &&
              java.util.Arrays.equals(this.applicableRegions, other.getApplicableRegions())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getHolidayCode() != null) {
            _hashCode += getHolidayCode().hashCode();
        }
        if (getDescriptor() != null) {
            _hashCode += getDescriptor().hashCode();
        }
        if (getHolidayType() != null) {
            _hashCode += getHolidayType().hashCode();
        }
        if (getDateType() != null) {
            _hashCode += getDateType().hashCode();
        }
        if (getBankHoliday() != null) {
            _hashCode += getBankHoliday().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getRelatedHolidayCode() != null) {
            _hashCode += getRelatedHolidayCode().hashCode();
        }
        if (getApplicableRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicableRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicableRegions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Holiday.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Descriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "DateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayDateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankHoliday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "BankHoliday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "BankHoliday"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedHolidayCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "RelatedHolidayCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableRegions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ApplicableRegions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "RegionCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "RegionCode"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
