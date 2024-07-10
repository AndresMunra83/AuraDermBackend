package com.auraderm_db.AuraDerm2.model;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    @Column(precision = 10, scale = 2)
    private BigDecimal precio;
    private int stock;
    private String category;
    private String skin_type;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private CategoriaModel categoria;

//    @OneToMany(mappedBy = "pedidoproductomodel")
//    private List<PedidoProductoModel> pedido;
}
