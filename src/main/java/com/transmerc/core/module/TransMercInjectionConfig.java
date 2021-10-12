/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmerc.core.module;

import com.google.inject.AbstractModule;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
class TransMercInjectionConfig extends AbstractModule {

    @Override
    protected void configure() {
        //  bind(ReservaUseCase.class).to(ReservaUseCaseImpl.class).in(Scopes.SINGLETON);
        // bind(CategoriaUseCase.class).to(CategoriaUseCaseImpl.class).in(Scopes.SINGLETON);
        //bind(UbicacionUseCase.class).to(UbicacionUseCaseImpl.class).in(Scopes.SINGLETON);

    }

}
