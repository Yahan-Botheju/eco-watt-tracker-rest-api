package lk.simple.electricity_consumption_system.web.controllers;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.usecase.ElectricityUsageUseCase;
import lk.simple.electricity_consumption_system.web.DTOs.ElectricityUsageRequestDTO;
import lk.simple.electricity_consumption_system.web.DTOs.ElectricityUsageResponseDTO;
import lk.simple.electricity_consumption_system.web.mappers.ElectricityUsageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usage")
@RequiredArgsConstructor
public class ElectricityUsageController {

    //inject usecase interface
    private final ElectricityUsageUseCase electricityUsageUseCase;

    //inject mapper
    private final ElectricityUsageMapper electricityUsageMapper;

    private final ElectricityUsage electricityUsage;

    //get all usages
    @GetMapping
    public List<ElectricityUsageResponseDTO> getAllUsage(){
         return electricityUsageUseCase.getAllUsage().stream().map(electricityUsageMapper::toResponseDTO).toList();
    }

    //save new usage
    @PostMapping
    public ResponseEntity<String> saveUsage(
            @RequestBody ElectricityUsageRequestDTO electricityUsageRequestDTO
            ){
        electricityUsageUseCase.saveUsage(electricityUsageMapper.toDomainModel(electricityUsageRequestDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body("Details saved successful");
    }

    //update usage
    @PostMapping("/{id}")
    public ResponseEntity<String> updateUsage(
            @PathVariable Long id,
            @RequestBody ElectricityUsageRequestDTO electricityUsageRequestDTO
    ){
        //set request dto to domain model
        ElectricityUsage domainModel = electricityUsageMapper.toDomainModel(electricityUsageRequestDTO);

        //send value to usecase interface
        electricityUsageUseCase.updateUsage(id, domainModel);

        return ResponseEntity.status(HttpStatus.CREATED).body("Details updated successful");
    }
}