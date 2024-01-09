package com.simonfacal.controlStock.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;
import java.util.List;
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="codigo_venta")
    private Long codigoVenta;
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_venta")
    private LocalDate fechaVenta;
    @Positive
    private Double total;
    @OneToMany()
    @Column(name="lista_productos")
    private List<Producto>listaProductos;
    @OneToOne
    @PrimaryKeyJoinColumn(name="un_cliente")
    private Cliente unCliente;

    public Venta(Long codigoVenta, LocalDate fechaVenta, Double total, List<Producto> listaProductos, Cliente unCliente) {
        this.codigoVenta = codigoVenta;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }

    public Long getCodigoVenta() {
        return codigoVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigoVenta=" + codigoVenta +
                ", fechaVenta=" + fechaVenta +
                ", total=" + total +
                ", listaProductos=" + listaProductos +
                ", unCliente=" + unCliente +
                '}';
    }
}
