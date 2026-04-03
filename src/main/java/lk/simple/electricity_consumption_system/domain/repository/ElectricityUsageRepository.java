package lk.simple.electricity_consumption_system.domain.repository;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;

import java.util.List;

public interface ElectricityUsageRepository {

    //get all usage
    List<ElectricityUsage> getAllUsage();

    //save usage
    void saveUsage(ElectricityUsage electricityUsage);
}