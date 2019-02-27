/**
 * 
 */
package com.transporte.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.transporte.app.models.entity.Vehiculo;

/**
 * @author abenalcazar
 *
 */
public interface IVehiculoRepository extends CrudRepository<Vehiculo, Long>{

}
