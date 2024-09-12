package com.pe.upeu.examen.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.upeu.examen.dao.ProveedorDao;
import com.pe.upeu.examen.entity.Proveedor;
import com.pe.upeu.examen.service.ProveedorService;


@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorDao proveedorDao;
	
	@Override
	public Proveedor create(Proveedor a) {
		// TODO Auto-generated method stub
		return proveedorDao.create(a);
	}

	@Override
	public Proveedor update(Proveedor a) {
		// TODO Auto-generated method stub
		return proveedorDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorDao.delete(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorDao.read(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorDao.readAll();
	}

}