/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.transmerc.core.usecase.impl;

import com.root101.clean.core.app.usecase.DefaultCRUDUseCase;
import com.transmerc.core.domain.Address;
import com.transmerc.core.usecase.AddressUseCase;

/**
 * 
 * JoBits
 * @author Jorge
 * 
 */
public class AddressUseCaseImpl extends DefaultCRUDUseCase<Address> implements AddressUseCase{

    @Override
    public double[] getCoordinates(Address a) throws NullPointerException {
        throw new UnsupportedOperationException();
//        LocationProvider.getAuthenticationService().getCoordinatesFrom(streetA, StreetB, zipCode)
    }

}
