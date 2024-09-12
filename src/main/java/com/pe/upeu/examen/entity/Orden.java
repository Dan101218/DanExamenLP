package com.pe.upeu.examen.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="fecha_orden")
	private Date fecha_orden;
	@Column(name="fecha_solicita")
	private Date fecha_solicita ;
	@Column(name="estado", length = 1)
	private char estado ;
	
	@ManyToOne
	@JoinColumn(name = "tipo_orden_id", nullable = false)
	private TipoOrden tipoordenes;
	
	@ManyToOne
	@JoinColumn(name = "forma_pago_id", nullable = false)
	private FormaPago formapagos;
	
	@ManyToOne
	@JoinColumn(name = "almacen_id", nullable = false)
	private Almacen almacenes;
	
	@ManyToOne
	@JoinColumn(name = "proveedor_id", nullable = false)
	private Proveedor proveedores;
}
