package com.pe.upeu.examen.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pe.upeu.examen.dao.OrdenDao;
import com.pe.upeu.examen.entity.Orden;
import com.pe.upeu.examen.repository.OrdenRepository;


@Component
public class OrdenDaoImpl implements OrdenDao{

	@Autowired OrdenRepository ordenRepository;
	
	@Override
	public Orden create(Orden a) {
		// TODO Auto-generated method stub
		return ordenRepository.save(a);
	}

	@Override
	public Orden update(Orden a) {
		// TODO Auto-generated method stub
		return ordenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenRepository.deleteById(id);
	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return ordenRepository.findById(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}
	

}