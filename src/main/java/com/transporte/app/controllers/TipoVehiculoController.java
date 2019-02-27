/**
 * 
 */
package com.transporte.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.app.models.entity.TipoVehiculo;
import com.transporte.app.service.ITipoVehiculoService;

/**
 * @author abenalcazar
 *
 */
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/tipos")
public class TipoVehiculoController {
	
	@Autowired
	private ITipoVehiculoService tipoVehiculoService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoVehiculo>> listar() {
		List<TipoVehiculo> tipoVehiculo = new ArrayList<>();
		tipoVehiculo = tipoVehiculoService.findAll();
		return new ResponseEntity<List<TipoVehiculo>>(tipoVehiculo, HttpStatus.OK);
	}

}
