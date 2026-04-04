package lk.simple.electricity_consumption_system.web.mappers;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.web.DTOs.ElectricityUsageRequestDTO;
import lk.simple.electricity_consumption_system.web.DTOs.ElectricityUsageResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ElectricityUsageMapper {

    //request DTO to domain model
    ElectricityUsage toDomainModel(ElectricityUsageRequestDTO electricityUsageRequestDTO);

    //domain model to response DTO
    ElectricityUsageResponseDTO toResponseDTO(ElectricityUsage electricityUsage);
}