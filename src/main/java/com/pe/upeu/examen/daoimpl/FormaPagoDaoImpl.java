package com.pe.upeu.examen.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pe.upeu.examen.dao.FormaPagoDao;
import com.pe.upeu.examen.entity.FormaPago;
import com.pe.upeu.examen.repository.FormaPagoRepository;


@Component
public class FormaPagoDaoImpl implements FormaPagoDao{

	@Autowired FormaPagoRepository formapagoRepository;
	
	@Override
	public FormaPago create(FormaPago a) {
		// TODO Auto-generated method stub
		return formapagoRepository.save(a);
	}

	@Override
	public FormaPago update(FormaPago a) {
		// TODO Auto-generated method stub
		return formapagoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		formapagoRepository.deleteById(id);
	}

	@Override
	public Optional<FormaPago> read(Long id) {
		// TODO Auto-generated method stub
		return formapagoRepository.findById(id);
	}

	@Override
	public List<FormaPago> readAll() {
		// TODO Auto-generated method stub
		return formapagoRepository.findAll();
	}
	

}