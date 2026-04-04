package lk.simple.electricity_consumption_system.usecase;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import lk.simple.electricity_consumption_system.infrastructure.persistence.ElectricityUsageImpl;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class ElectricityUsageUseCaseImpl implements ElectricityUsageUseCase{

    //inject model repo as constructor
    private final ElectricityUsageRepository electricityUsageRepository;

    //get all data and return to domain repo
    @Override
    public List<ElectricityUsage> getAllUsage(){
        return electricityUsageRepository.getAllUsage();
    }

    //get domain model from controller set to domain repo
    @Override
    public void saveUsage(ElectricityUsage electricityUsage){
        electricityUsageRepository.saveUsage(electricityUsage);
    }
}