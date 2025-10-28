package com.gussoft.inventario.intregation.transfer.record;

import java.math.BigDecimal;

public interface ICategoriaVenta {

  Long getIdCategoria();
  String getNombre();
  Long getTotalUnidades();
  BigDecimal getTotalVentas();

}
