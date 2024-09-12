package com.pe.upeu.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pe.upeu.examen.entity.Almacen;
@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long> {

}
