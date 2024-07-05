package com.holidaywebservice.www.HolidayService_v2Client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HolidayClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.holidaywebservice.com/HolidayService_v2/HolidayService2.asmx?WSDL");
			QName qname = new QName("http://www.holidaywebservice.com/HolidayService_v2/HolidayService2.asmx", "GetCountriesAvailable");
			Service service = Service.create(url, qname);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		HolidayService2Locator cdt= new HolidayService2Locator();
//		try {
//			HolidayService2Soap fggf=cdt.getHolidayService2Soap();
//			for (CountryCode string : fggf.getCountriesAvailable()) {
//				System.out.println(string.getCode());
//			}
//		} catch (ServiceException | RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}

}
