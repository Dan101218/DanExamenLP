package com.pe.upeu.examen.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pe.upeu.examen.dao.TipoOrdenDao;
import com.pe.upeu.examen.entity.TipoOrden;
import com.pe.upeu.examen.repository.TipoOrdenRepository;


@Component
public class TipoOrdenDaoImpl implements TipoOrdenDao{

	@Autowired TipoOrdenRepository tipoordenRepository;
	
	@Override
	public TipoOrden create(TipoOrden a) {
		// TODO Auto-generated method stub
		return tipoordenRepository.save(a);
	}

	@Override
	public TipoOrden update(TipoOrden a) {
		// TODO Auto-generated method stub
		return tipoordenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoordenRepository.deleteById(id);
	}

	@Override
	public Optional<TipoOrden> read(Long id) {
		// TODO Auto-generated method stub
		return tipoordenRepository.findById(id);
	}

	@Override
	public List<TipoOrden> readAll() {
		// TODO Auto-generated method stub
		return tipoordenRepository.findAll();
	}
	

}