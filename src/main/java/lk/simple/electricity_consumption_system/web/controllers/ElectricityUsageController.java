package lk.simple.electricity_consumption_system.web.controllers;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.usecase.ElectricityUsageUseCase;
import lk.simple.electricity_consumption_system.web.DTOs.ElectricityUsageResponseDTO;
import lk.simple.electricity_consumption_system.web.mappers.ElectricityUsageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usage")
@RequiredArgsConstructor
public class ElectricityUsageController {

    //inject usecase interface
    private final ElectricityUsageUseCase electricityUsageUseCase;

    //inject mapper
    private final ElectricityUsageMapper electricityUsageMapper;

    //get all usages
    @GetMapping
    public List<ElectricityUsageResponseDTO> getAllUsage(){
         return electricityUsageUseCase.getAllUsage().stream().map(electricityUsageMapper::toResponseDTO).toList();
    }
}