/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmerc.repo.module;

import com.google.inject.AbstractModule;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
class TransMercRepoInjectionConfig extends AbstractModule {

    @Override
    protected void configure() {
        // bind(ReservaRepo.class).to(ReservaRepoImpl.class).in(Singleton.class);
        //bind(CategoriaRepo.class).to(CategoriaRepoImpl.class).in(Singleton.class);
        //bind(UbicacionRepo.class).to(UbicacionRepoImpl.class).in(Singleton.class);
    }

}
