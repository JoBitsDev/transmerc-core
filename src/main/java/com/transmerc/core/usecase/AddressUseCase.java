/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmerc.core.usecase;

import com.root101.clean.core.app.usecase.CRUDUseCase;
import com.transmerc.core.domain.Address;

/**
 *
 * @author Jorge
 */
public interface AddressUseCase extends CRUDUseCase<Address>{
    
    public double[] getCoordinates(Address a) throws NullPointerException;
   
}
