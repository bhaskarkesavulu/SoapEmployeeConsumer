//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.08 at 01:31:59 PM IST 
//


package com.soap.consumer.soapconsumer.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.consumer.soapconsumer.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.consumer.soapconsumer.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeInformationRequest }
     * 
     */
    public GetEmployeeInformationRequest createGetEmployeeInformationRequest() {
        return new GetEmployeeInformationRequest();
    }

    /**
     * Create an instance of {@link GetEmployeeInformationResponse }
     * 
     */
    public GetEmployeeInformationResponse createGetEmployeeInformationResponse() {
        return new GetEmployeeInformationResponse();
    }

    /**
     * Create an instance of {@link EmployeeInformation }
     * 
     */
    public EmployeeInformation createEmployeeInformation() {
        return new EmployeeInformation();
    }

}
