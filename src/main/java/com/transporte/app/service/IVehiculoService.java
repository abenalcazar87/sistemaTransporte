/**
 * 
 */
package com.transporte.app.service;

import java.util.List;

import com.transporte.app.models.entity.Vehiculo;

/**
 * @author abenalcazar
 *
 */
public interface IVehiculoService {
	
    public List<Vehiculo> findAll();
	
	public void save(Vehiculo vehiculo);
	
	public Vehiculo findById(Long id);
	
	public void delete(Vehiculo vehiculo);

}
