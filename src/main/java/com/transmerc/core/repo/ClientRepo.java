/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transmerc.core.repo;

import com.root101.clean.core.app.repo.CRUDRepository;
import com.transmerc.core.domain.Client;

/**
 *
 * @author Jorge
 */
public interface ClientRepo extends CRUDRepository<Client>{ 
	
	public Client crearCliente();
		
}
