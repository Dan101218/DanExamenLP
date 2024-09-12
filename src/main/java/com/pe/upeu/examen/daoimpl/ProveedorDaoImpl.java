package com.pe.upeu.examen.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pe.upeu.examen.dao.ProveedorDao;
import com.pe.upeu.examen.entity.Proveedor;
import com.pe.upeu.examen.repository.ProveedorRepository;


@Component
public class ProveedorDaoImpl implements ProveedorDao{

	@Autowired ProveedorRepository proveedorRepository;
	
	@Override
	public Proveedor create(Proveedor a) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(a);
	}

	@Override
	public Proveedor update(Proveedor a) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorRepository.deleteById(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorRepository.findById(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorRepository.findAll();
	}
	

}