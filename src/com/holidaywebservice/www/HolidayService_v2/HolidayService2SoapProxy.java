package com.holidaywebservice.www.HolidayService_v2;

public class HolidayService2SoapProxy implements com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap {
  private String _endpoint = null;
  private com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap holidayService2Soap = null;
  
  public HolidayService2SoapProxy() {
    _initHolidayService2SoapProxy();
  }
  
  public HolidayService2SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initHolidayService2SoapProxy();
  }
  
  private void _initHolidayService2SoapProxy() {
    try {
      holidayService2Soap = (new com.holidaywebservice.www.HolidayService_v2.HolidayService2Locator()).getHolidayService2Soap();
      if (holidayService2Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)holidayService2Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)holidayService2Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (holidayService2Soap != null)
      ((javax.xml.rpc.Stub)holidayService2Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.holidaywebservice.www.HolidayService_v2.HolidayService2Soap getHolidayService2Soap() {
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap;
  }
  
  public com.holidaywebservice.www.HolidayService_v2.CountryCode[] getCountriesAvailable() throws java.rmi.RemoteException{
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap.getCountriesAvailable();
  }
  
  public com.holidaywebservice.www.HolidayService_v2.HolidayCode[] getHolidaysAvailable(com.holidaywebservice.www.HolidayService_v2.Country countryCode) throws java.rmi.RemoteException{
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap.getHolidaysAvailable(countryCode);
  }
  
  public java.util.Calendar getHolidayDate(com.holidaywebservice.www.HolidayService_v2.Country countryCode, java.lang.String holidayCode, int year) throws java.rmi.RemoteException{
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap.getHolidayDate(countryCode, holidayCode, year);
  }
  
  public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForDateRange(com.holidaywebservice.www.HolidayService_v2.Country countryCode, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap.getHolidaysForDateRange(countryCode, startDate, endDate);
  }
  
  public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForYear(com.holidaywebservice.www.HolidayService_v2.Country countryCode, int year) throws java.rmi.RemoteException{
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap.getHolidaysForYear(countryCode, year);
  }
  
  public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForMonth(com.holidaywebservice.www.HolidayService_v2.Country countryCode, int year, int month) throws java.rmi.RemoteException{
    if (holidayService2Soap == null)
      _initHolidayService2SoapProxy();
    return holidayService2Soap.getHolidaysForMonth(countryCode, year, month);
  }
  
  
}