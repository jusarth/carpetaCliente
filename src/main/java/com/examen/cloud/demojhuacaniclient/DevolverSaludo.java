package com.examen.cloud.demojhuacaniclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/saludo/client/{nombre}")
public class DevolverSaludo {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String usuario(@PathVariable("nombre") String nombre) {
		String url ="http://demojhuacani-server/rest/saludo/server/"+nombre;		
		return restTemplate.getForObject(url,String.class);
	}
}
