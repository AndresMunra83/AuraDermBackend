package com.auraderm_db.AuraDerm2.repository;
import com.auraderm_db.AuraDerm2.model.PedidoProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoProductoRepository extends JpaRepository<PedidoProductoModel,Long>{

}
