/**
 * 
 */
package com.transporte.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.transporte.app.models.entity.TipoVehiculo;
import com.transporte.app.repository.ITipoVehiculoRepository;

/**
 * @author abenalcazar
 *
 */
@Service
public class TipoVehiculoService implements ITipoVehiculoService {
	
	@Autowired
	private ITipoVehiculoRepository tipoVehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<TipoVehiculo> findAll() {
		return (List<TipoVehiculo>) tipoVehiculoRepository.findAll();
	}

	@Override
	public void save(TipoVehiculo tipoVehiculo) {
		tipoVehiculoRepository.save(tipoVehiculo);
	}

	@Override
	@Transactional
	public TipoVehiculo findById(Long id) {
		return tipoVehiculoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(TipoVehiculo tipoVehiculo) {
		tipoVehiculoRepository.delete(tipoVehiculo);
	}

}
