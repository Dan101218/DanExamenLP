package com.pe.upeu.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pe.upeu.examen.entity.Proveedor;
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

}
