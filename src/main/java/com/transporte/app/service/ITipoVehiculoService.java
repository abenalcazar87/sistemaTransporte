/**
 * 
 */
package com.transporte.app.service;

import java.util.List;

import com.transporte.app.models.entity.TipoVehiculo;

/**
 * @author abenalcazar
 *
 */
public interface ITipoVehiculoService {
	
    public List<TipoVehiculo> findAll();
	
	public void save(TipoVehiculo vehiculo);
	
	public TipoVehiculo findById(Long id);
	
	public void delete(TipoVehiculo vehiculo);

}
