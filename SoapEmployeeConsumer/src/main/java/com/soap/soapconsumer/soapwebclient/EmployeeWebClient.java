package com.soap.soapconsumer.soapwebclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.soap.consumer.soapconsumer.wsdl.EmployeeInformation;
import com.soap.consumer.soapconsumer.wsdl.GetEmployeeInformationRequest;
import com.soap.consumer.soapconsumer.wsdl.GetEmployeeInformationResponse;
import com.soap.soapconsumer.configuration.SOAPWebClient;

@RestController
@RequestMapping(value="/empinformation/{employeeId}", method = RequestMethod.GET)
public class EmployeeWebClient extends WebServiceGatewaySupport{
	
	 @Autowired
	    private SOAPWebClient soapWebClient;

	    @GetMapping
	    public EmployeeInformation getEmployeeInformation(@PathVariable("employeeId")String employeeId) {
	        System.out.println("controller method is invoked");
	        GetEmployeeInformationRequest request = new GetEmployeeInformationRequest();
	        request.setEmployeeId(employeeId);
	        GetEmployeeInformationResponse response = (GetEmployeeInformationResponse) soapWebClient
	                .callWebService("http://localhost:2021/ws", request);
	        return response.getEmployeeInformation();
	    }

}
