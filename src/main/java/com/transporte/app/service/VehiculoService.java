/**
 * 
 */
package com.transporte.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.transporte.app.models.entity.Vehiculo;
import com.transporte.app.repository.IVehiculoRepository;

/**
 * @author abenalcazar
 *
 */
@Service
public class VehiculoService implements IVehiculoService {
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoRepository.findAll();
	}

	@Override
	public void save(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
	}

	@Override
	@Transactional
	public Vehiculo findById(Long id) {
		return vehiculoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Vehiculo vehiculo) {
		vehiculoRepository.delete(vehiculo);
	}

}
