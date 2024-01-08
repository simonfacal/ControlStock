package com.simonfacal.controlStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_producto")
    private Long codigoProducto;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String marca;
    @Positive
    private Double costo;
    @Column(name="cantidad_disponible")
    private Double cantidadDisponible;

    public Producto() {
    }

    public Producto(String nombre, String marca, Double costo, Double cantidadDisponible) {
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Long getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto=" + codigoProducto +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", costo=" + costo +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
