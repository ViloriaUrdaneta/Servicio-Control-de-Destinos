package com.edutecno.controldestinos.destinos.service;

import com.edutecno.controldestinos.destinos.dto.DestinoDTO;
import com.edutecno.controldestinos.destinos.modelo.Destino;

public interface DestinoService {

	DestinoDTO save(Destino destino);
	DestinoDTO findAll();
}
