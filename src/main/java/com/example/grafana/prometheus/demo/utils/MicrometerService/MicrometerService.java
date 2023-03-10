package com.example.grafana.prometheus.demo.utils.MicrometerService;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;

@Service
public class MicrometerService {

	@Autowired
	private MeterRegistry registry;

	public void logMetrics(Map<String, String> teste) {
		Iterable<Tag> tags = teste
				.keySet()
				.stream()
				.map(key -> Tag.of(key, teste.get(key)))
				.collect(Collectors.toList());
		
		Counter
		.builder("pre_analise_executadas")
		.description("pre_analise_executadas_total")
		.tags(tags)
		.register(registry)
		.increment();
				

	}

}
