/**
 * HolidayService2SoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public class HolidayService2SoapStub extends org.apache.axis.client.Stub implements com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCountriesAvailable");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfCountryCode"));
        oper.setReturnClass(com.holidaywebservice.www.HolidayService_v2.CountryCode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetCountriesAvailableResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "CountryCode"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHolidaysAvailable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"), com.holidaywebservice.www.HolidayService_v2.Country.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHolidayCode"));
        oper.setReturnClass(com.holidaywebservice.www.HolidayService_v2.HolidayCode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysAvailableResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayCode"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHolidayDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"), com.holidaywebservice.www.HolidayService_v2.Country.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "holidayCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "year"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidayDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHolidaysForDateRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"), com.holidaywebservice.www.HolidayService_v2.Country.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHoliday"));
        oper.setReturnClass(com.holidaywebservice.www.HolidayService_v2.Holiday[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysForDateRangeResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHolidaysForYear");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"), com.holidaywebservice.www.HolidayService_v2.Country.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "year"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHoliday"));
        oper.setReturnClass(com.holidaywebservice.www.HolidayService_v2.Holiday[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysForYearResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHolidaysForMonth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country"), com.holidaywebservice.www.HolidayService_v2.Country.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "year"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "month"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHoliday"));
        oper.setReturnClass(com.holidaywebservice.www.HolidayService_v2.Holiday[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysForMonthResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public HolidayService2SoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public HolidayService2SoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public HolidayService2SoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfCountryCode");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.CountryCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "CountryCode");
            qName2 = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "CountryCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHoliday");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.Holiday[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday");
            qName2 = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHolidayCode");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.HolidayCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayCode");
            qName2 = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfRegionCode");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.RegionCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "RegionCode");
            qName2 = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "RegionCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "BankHoliday");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.BankHoliday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "CodeDescriptionBase");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.CodeDescriptionBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Country");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "CountryCode");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.CountryCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayCode");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.HolidayCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayDateType");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.HolidayDateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayType");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.HolidayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "RegionCode");
            cachedSerQNames.add(qName);
            cls = com.holidaywebservice.www.HolidayService_v2.RegionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.holidaywebservice.www.HolidayService_v2.CountryCode[] getCountriesAvailable() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.holidaywebservice.com/HolidayService_v2/GetCountriesAvailable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetCountriesAvailable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.holidaywebservice.www.HolidayService_v2.CountryCode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.holidaywebservice.www.HolidayService_v2.CountryCode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.holidaywebservice.www.HolidayService_v2.CountryCode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.holidaywebservice.www.HolidayService_v2.HolidayCode[] getHolidaysAvailable(com.holidaywebservice.www.HolidayService_v2.Country countryCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.holidaywebservice.com/HolidayService_v2/GetHolidaysAvailable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysAvailable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.holidaywebservice.www.HolidayService_v2.HolidayCode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.holidaywebservice.www.HolidayService_v2.HolidayCode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.holidaywebservice.www.HolidayService_v2.HolidayCode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar getHolidayDate(com.holidaywebservice.www.HolidayService_v2.Country countryCode, java.lang.String holidayCode, int year) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.holidaywebservice.com/HolidayService_v2/GetHolidayDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidayDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode, holidayCode, new java.lang.Integer(year)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForDateRange(com.holidaywebservice.www.HolidayService_v2.Country countryCode, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.holidaywebservice.com/HolidayService_v2/GetHolidaysForDateRange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysForDateRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.holidaywebservice.www.HolidayService_v2.Holiday[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.holidaywebservice.www.HolidayService_v2.Holiday[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.holidaywebservice.www.HolidayService_v2.Holiday[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForYear(com.holidaywebservice.www.HolidayService_v2.Country countryCode, int year) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.holidaywebservice.com/HolidayService_v2/GetHolidaysForYear");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysForYear"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode, new java.lang.Integer(year)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.holidaywebservice.www.HolidayService_v2.Holiday[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.holidaywebservice.www.HolidayService_v2.Holiday[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.holidaywebservice.www.HolidayService_v2.Holiday[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForMonth(com.holidaywebservice.www.HolidayService_v2.Country countryCode, int year, int month) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.holidaywebservice.com/HolidayService_v2/GetHolidaysForMonth");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.holidaywebservice.com/HolidayService_v2/", "GetHolidaysForMonth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode, new java.lang.Integer(year), new java.lang.Integer(month)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.holidaywebservice.www.HolidayService_v2.Holiday[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.holidaywebservice.www.HolidayService_v2.Holiday[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.holidaywebservice.www.HolidayService_v2.Holiday[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
