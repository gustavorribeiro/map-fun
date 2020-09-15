package com.example.grafana.prometheus.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grafana.prometheus.demo.utils.MicrometerService.MicrometerService;

@RestController
public class TestController {
	
	@Autowired
	private MicrometerService micrometerService;
	
	@GetMapping("/message")
	public String teste() {
		Map<String, String> teste1 = new HashMap<>();
		teste1.put("id_parceiro", "111111");
		teste1.put("id_pessoa", "ID_PESSOA1");
		teste1.put("id_produto", "ID_PRODUTO1");
		teste1.put("id_proposta", "1111");
		teste1.put("numero_loja", "000000000001");
		teste1.put("numero_operador", "111.111.111-11");
		
		micrometerService.logMetrics(teste1);
		
			
		
		return "Funfou!!!";
	}
	
}
