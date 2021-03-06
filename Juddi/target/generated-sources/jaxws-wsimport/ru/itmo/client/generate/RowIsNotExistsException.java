
package ru.itmo.client.generate;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RowIsNotExistsException", targetNamespace = "http://itmo.ru/")
public class RowIsNotExistsException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RowIsNotExistsFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RowIsNotExistsException(String message, RowIsNotExistsFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RowIsNotExistsException(String message, RowIsNotExistsFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ru.itmo.client.generate.RowIsNotExistsFault
     */
    public RowIsNotExistsFault getFaultInfo() {
        return faultInfo;
    }

}
