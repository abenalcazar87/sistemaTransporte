package com.transporte.app;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transporte.app.models.entity.TipoVehiculo;
import com.transporte.app.models.entity.Vehiculo;
import com.transporte.app.service.TipoVehiculoService;
import com.transporte.app.service.VehiculoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransporteBackendApplicationTests {
	
	@Autowired
	TipoVehiculoService service;
	
	@Autowired
	VehiculoService vehiculoService;

	@Ignore
	public void crearTipoVehiculo() {
		TipoVehiculo tipoVehiculo = new TipoVehiculo();
		tipoVehiculo.setNombre("camioneta");
		
		service.save(tipoVehiculo);
		
	}
	
	@Test
	public void crearVehiculo() {
		
		TipoVehiculo tipoVehiculo = new TipoVehiculo();
		tipoVehiculo.setId_tipo((long) 1);
		tipoVehiculo.setNombre("automóvil");
		
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Volkswagen");
		vehiculo.setModelo("Jetta");
		vehiculo.setAnio("2011");
		vehiculo.setCapacidadTanque((double) 50);
		vehiculo.setCapacidadCarga((double) 200);
		vehiculo.setNumPasajeros(5);
		vehiculo.setTipo(tipoVehiculo);
		
		vehiculoService.save(vehiculo);
		
	}

}
