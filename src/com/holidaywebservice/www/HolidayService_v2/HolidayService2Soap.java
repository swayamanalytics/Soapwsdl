/**
 * HolidayService2Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.holidaywebservice.www.HolidayService_v2;

public interface HolidayService2Soap extends java.rmi.Remote {

    /**
     * Get the available countries.
     */
    public com.holidaywebservice.www.HolidayService_v2.CountryCode[] getCountriesAvailable() throws java.rmi.RemoteException;

    /**
     * Get the available holidays for a specified country.
     */
    public com.holidaywebservice.www.HolidayService_v2.HolidayCode[] getHolidaysAvailable(com.holidaywebservice.www.HolidayService_v2.Country countryCode) throws java.rmi.RemoteException;

    /**
     * Get the date of a specific holiday.
     */
    public java.util.Calendar getHolidayDate(com.holidaywebservice.www.HolidayService_v2.Country countryCode, java.lang.String holidayCode, int year) throws java.rmi.RemoteException;

    /**
     * Get the holidays for a date range.
     */
    public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForDateRange(com.holidaywebservice.www.HolidayService_v2.Country countryCode, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;

    /**
     * Get the holidays for an entire year.
     */
    public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForYear(com.holidaywebservice.www.HolidayService_v2.Country countryCode, int year) throws java.rmi.RemoteException;

    /**
     * Get the holidays for a specific month.
     */
    public com.holidaywebservice.www.HolidayService_v2.Holiday[] getHolidaysForMonth(com.holidaywebservice.www.HolidayService_v2.Country countryCode, int year, int month) throws java.rmi.RemoteException;
}
