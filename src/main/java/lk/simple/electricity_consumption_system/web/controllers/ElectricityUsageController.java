package lk.simple.electricity_consumption_system.web.controllers;

import lk.simple.electricity_consumption_system.usecase.ElectricityUsageUseCase;
import lk.simple.electricity_consumption_system.web.mappers.ElectricityUsageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/usage")
@RequiredArgsConstructor
public class ElectricityUsageController {

    //inject usecase interface
    private final ElectricityUsageUseCase electricityUsageUseCase;

    //inject mapper
    private final ElectricityUsageMapper electricityUsageMapper;
}