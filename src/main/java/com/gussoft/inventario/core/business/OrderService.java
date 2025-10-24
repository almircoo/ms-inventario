package com.gussoft.inventario.core.business;

import com.gussoft.inventario.core.models.OrderStatus;
import com.gussoft.inventario.intregation.transfer.request.OrderRequest;
import com.gussoft.inventario.intregation.transfer.request.OrderUpdateRequest;
import com.gussoft.inventario.intregation.transfer.response.OrderResponse;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;

public interface OrderService {

  OrderResponse save(OrderRequest request);

  Page<OrderResponse> findAll(int page, int size, Authentication authentication);

  OrderResponse update(Long id, OrderUpdateRequest request);

  OrderResponse updateStatus(Long id, OrderStatus estado);

  void delete(Long id);

}
