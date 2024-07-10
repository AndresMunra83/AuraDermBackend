package com.auraderm_db.AuraDerm2.model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "pedidoproducto")
public class PedidoProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private PedidoModel pedidomodel;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private ProductoModel productos;

}
