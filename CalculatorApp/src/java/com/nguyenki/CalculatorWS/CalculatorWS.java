/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyenki.CalculatorWS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nguyenkimthuat
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

  
    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public Integer add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i+j;
        return k;
    }
}
