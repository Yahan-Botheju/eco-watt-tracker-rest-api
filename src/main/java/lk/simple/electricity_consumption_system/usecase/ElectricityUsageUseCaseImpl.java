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
    public List<ElectricityUsage> getAllUsage(int page, int size){

        return electricityUsageRepository.getAllUsage(page, size);
    }

    //get domain model from controller set to domain repo
    @Override
    public void saveUsage(ElectricityUsage electricityUsage){

        electricityUsageRepository.saveUsage(electricityUsage);
    }

    //get domain model from controller and set to domain repo
    @Override
    public void updateUsage(Long id, ElectricityUsage electricityUsage){

        electricityUsageRepository.updateUsage(id, electricityUsage);
    }

    //set id to domain repo
    @Override
    public void deleteUsage(Long id){

        electricityUsageRepository.deleteUsage(id);
    }

    //get the highest usage of the day
    @Override
    public ElectricityUsage getHighestUsage(){
        return  electricityUsageRepository.getHighestUsage();
    };

    //create method that controller can access for calculate carbon wastage
    public double calculateCarbonFootPrint(int unitConsumed){
        return unitConsumed * 0.45;
    }
}