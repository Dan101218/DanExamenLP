package com.pe.upeu.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pe.upeu.examen.entity.FormaPago;
@Repository
public interface FormaPagoRepository extends JpaRepository<FormaPago, Long> {

}
