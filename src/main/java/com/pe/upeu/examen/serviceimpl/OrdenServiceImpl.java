package com.pe.upeu.examen.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.upeu.examen.dao.OrdenDao;
import com.pe.upeu.examen.entity.Orden;
import com.pe.upeu.examen.service.OrdenService;


@Service
public class OrdenServiceImpl implements OrdenService{

	@Autowired
	private OrdenDao ordenDao;
	
	@Override
	public Orden create(Orden a) {
		// TODO Auto-generated method stub
		return ordenDao.create(a);
	}

	@Override
	public Orden update(Orden a) {
		// TODO Auto-generated method stub
		return ordenDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenDao.delete(id);
	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return ordenDao.read(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return ordenDao.readAll();
	}

}