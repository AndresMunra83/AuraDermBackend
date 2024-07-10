package com.auraderm_db.AuraDerm2.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="pedidomodel")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Date fecha;

   @ManyToOne
   @JoinColumn(name = "id")
   private ClienteModel cliente;

   @OneToMany(mappedBy = "pedidomodel")
   private List<PedidoProductoModel> pedidomodelo;
}