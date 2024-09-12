package com.pe.upeu.examen.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.upeu.examen.dao.FormaPagoDao;
import com.pe.upeu.examen.entity.FormaPago;
import com.pe.upeu.examen.service.FormaPagoService;


@Service
public class FormaPagoServiceImpl implements FormaPagoService{

	@Autowired
	private FormaPagoDao formapagoDao;
	
	@Override
	public FormaPago create(FormaPago a) {
		// TODO Auto-generated method stub
		return formapagoDao.create(a);
	}

	@Override
	public FormaPago update(FormaPago a) {
		// TODO Auto-generated method stub
		return formapagoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		formapagoDao.delete(id);
	}

	@Override
	public Optional<FormaPago> read(Long id) {
		// TODO Auto-generated method stub
		return formapagoDao.read(id);
	}

	@Override
	public List<FormaPago> readAll() {
		// TODO Auto-generated method stub
		return formapagoDao.readAll();
	}

}