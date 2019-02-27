/**
 * 
 */
package com.transporte.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.app.models.entity.Vehiculo;
import com.transporte.app.service.IVehiculoService;

/**
 * @author abenalcazar
 *
 */
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class VehiculoController {
	
	@Autowired
	private IVehiculoService vehiculoService;

	@GetMapping("/vehiculos")
	public List<Vehiculo> index() {
		return vehiculoService.findAll();
	}

	@GetMapping("/vehiculos/{id}")
	public Vehiculo show(@PathVariable Long id) {
		return this.vehiculoService.findById(id);
	}

	@PostMapping("/vehiculos")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo create(@RequestBody Vehiculo vehiculo) {
		this.vehiculoService.save(vehiculo);
		return vehiculo;
	}

	@PutMapping("/vehiculos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable Long id) {
		Vehiculo currentVehiculo = this.vehiculoService.findById(id);
		currentVehiculo.setMarca(vehiculo.getMarca());
		currentVehiculo.setModelo(vehiculo.getModelo());
		currentVehiculo.setAnio(vehiculo.getAnio());
		currentVehiculo.setCapacidadTanque(vehiculo.getCapacidadTanque());
		currentVehiculo.setCapacidadCarga(vehiculo.getCapacidadCarga());
		currentVehiculo.setNumPasajeros(vehiculo.getNumPasajeros());
		currentVehiculo.setTipo(vehiculo.getTipo());		
		this.vehiculoService.save(currentVehiculo);
		return currentVehiculo;
	}

	@DeleteMapping("/vehiculos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Vehiculo currentVehiculo = this.vehiculoService.findById(id);
		this.vehiculoService.delete(currentVehiculo);
	}

}
