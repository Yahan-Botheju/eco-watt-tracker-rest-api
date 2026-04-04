package lk.simple.electricity_consumption_system.usecase;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import lk.simple.electricity_consumption_system.infrastructure.persistence.ElectricityUsageImpl;

import java.util.List;

public class ElectricityUsageUseCaseImpl implements ElectricityUsageUseCase{

    //inject model repo as constructor
    private final ElectricityUsageRepository electricityUsageRepository;

    public ElectricityUsageUseCaseImpl(ElectricityUsageRepository electricityUsageRepository){
        this.electricityUsageRepository = electricityUsageRepository;
    }

    //get all data and return to domain repo
    @Override
    public List<ElectricityUsage> getAllUsage(){
        return electricityUsageRepository.getAllUsage();
    }

    @Override
    public void saveUsage(ElectricityUsage electricityUsage){
        //logic not implemented yet
    }
}