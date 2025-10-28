package com.gussoft.inventario.core.business;

import com.gussoft.inventario.core.models.Order;
import com.gussoft.inventario.core.models.OrderStatus;
import com.gussoft.inventario.intregation.transfer.record.ClientesFrecuentes;
import com.gussoft.inventario.intregation.transfer.record.ClientesMoreBuy;
import com.gussoft.inventario.intregation.transfer.record.CustomerSould;
import com.gussoft.inventario.intregation.transfer.record.IProductHot;
import com.gussoft.inventario.intregation.transfer.record.IProductStock;
import com.gussoft.inventario.intregation.transfer.record.ICategoriaVenta;
import com.gussoft.inventario.intregation.transfer.record.VentasProductos;
import com.gussoft.inventario.intregation.transfer.response.OrderResponse;
import com.gussoft.inventario.intregation.transfer.response.ReporteCliente;
import com.gussoft.inventario.intregation.transfer.response.ReportResponse;
import java.time.LocalDateTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReportService {

  ReportResponse generarReporteVentasPorPeriodo(LocalDateTime fechaInicio, LocalDateTime fechaFin);
  Page<VentasProducto> reporteVentasPorProducto(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);
  Page<VentasCategoria> reporteVentasPorCategoria(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);
  Page<reporteCliente> reporteVentasPorCliente(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);

  // Reportes de Productos
  Page<IProductHot> reporteProductosMasVendidos(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);
  Page<IProductStock> reporteProductosStockBajo(Integer stockMinimo, Pageable pageable);

  // Reportes de Clientes
  Page<ClientesFrecuentes> reporteClientesMasFrecuentes(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);
  Page<ClientesMoreBuy> reporteClientesMejorCompra(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);
  Page<CustomerSould> reporteClientesTop(LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);

  // Dashboard/Resumen
  ReportResponse obtenerDashboardVentas(LocalDateTime fechaInicio, LocalDateTime fechaFin);

  Page<OrderResponse> buscarPedidosPorDni(String dni, OrderStatus estado, LocalDateTime fechaInicio, LocalDateTime fechaFin, Pageable pageable);
}
