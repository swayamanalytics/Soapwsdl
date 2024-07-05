/**
 * HolidayService2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public class HolidayService2Locator extends org.apache.axis.client.Service implements com.holidaywebservice.www.HolidayService_v2.HolidayService2 {

/**
 * Web service that calculates holiday dates. (Version 2.0.1)
 */

    public HolidayService2Locator() {
    }


    public HolidayService2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HolidayService2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HolidayService2Soap
    private java.lang.String HolidayService2Soap_address = "http://www.holidaywebservice.com/HolidayService_v2/HolidayService2.asmx";

    public java.lang.String getHolidayService2SoapAddress() {
        return HolidayService2Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HolidayService2SoapWSDDServiceName = "HolidayService2Soap";

    public java.lang.String getHolidayService2SoapWSDDServiceName() {
        return HolidayService2SoapWSDDServiceName;
    }

    public void setHolidayService2SoapWSDDServiceName(java.lang.String name) {
        HolidayService2SoapWSDDServiceName = name;
    }

    public com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap getHolidayService2Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HolidayService2Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHolidayService2Soap(endpoint);
    }

    public com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap getHolidayService2Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.holidaywebservice.www.HolidayService_v2.HolidayService2SoapStub _stub = new com.holidaywebservice.www.HolidayService_v2.HolidayService2SoapStub(portAddress, this);
            _stub.setPortName(getHolidayService2SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHolidayService2SoapEndpointAddress(java.lang.String address) {
        HolidayService2Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.holidaywebservice.www.HolidayService_v2.HolidayService2SoapStub _stub = new com.holidaywebservice.www.HolidayService_v2.HolidayService2SoapStub(new java.net.URL(HolidayService2Soap_address), this);
                _stub.setPortName(getHolidayService2SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HolidayService2Soap".equals(inputPortName)) {
            return getHolidayService2Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayService2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayService2Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HolidayService2Soap".equals(portName)) {
            setHolidayService2SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
