package com.chrisgmi.store.mappers;

import com.chrisgmi.store.dtos.OrderDto;
import com.chrisgmi.store.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
