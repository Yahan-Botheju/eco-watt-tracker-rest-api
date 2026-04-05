package lk.simple.electricity_consumption_system.usecase;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;

import java.util.List;

public interface ElectricityUsageUseCase {

    //get all usage
    List<ElectricityUsage> getAllUsage();

    //save usage
    void saveUsage(ElectricityUsage electricityUsage);

    //update usage
    void updateUsage(Long id, ElectricityUsage electricityUsage);

    //delete usage
    void deleteUsage(Long id);

    //get the highest usage of the day
    ElectricityUsage getHighestUsage();

    //define public method for calculate carbon wastage
    double calculateCarbonFootPrint(int unitConsumed);
}