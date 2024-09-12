package com.pe.upeu.examen.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.upeu.examen.dao.TipoOrdenDao;
import com.pe.upeu.examen.entity.TipoOrden;
import com.pe.upeu.examen.service.TipoOrdenService;


@Service
public class TipoOrdenServiceImpl implements TipoOrdenService{

	@Autowired
	private TipoOrdenDao tipoordenDao;
	
	@Override
	public TipoOrden create(TipoOrden a) {
		// TODO Auto-generated method stub
		return tipoordenDao.create(a);
	}

	@Override
	public TipoOrden update(TipoOrden a) {
		// TODO Auto-generated method stub
		return tipoordenDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoordenDao.delete(id);
	}

	@Override
	public Optional<TipoOrden> read(Long id) {
		// TODO Auto-generated method stub
		return tipoordenDao.read(id);
	}

	@Override
	public List<TipoOrden> readAll() {
		// TODO Auto-generated method stub
		return tipoordenDao.readAll();
	}

}