package lk.simple.electricity_consumption_system.usecase;

import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import lk.simple.electricity_consumption_system.infrastructure.persistence.ElectricityUsageImpl;

public class ElectricityUsageUseCaseImpl implements ElectricityUsageUseCase{

    //inject model repo as constructor
    private final ElectricityUsageRepository electricityUsageRepository;

    public ElectricityUsageUseCaseImpl(ElectricityUsageRepository electricityUsageRepository){
        this.electricityUsageRepository = electricityUsageRepository;
    }
}