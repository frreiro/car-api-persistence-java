package com.modelaai.api.dto;

public record CarDTO(
		String modelo,
		String fabricante,
		String dataFabricacao,
		int valor,
		int anoModelo) {

}
