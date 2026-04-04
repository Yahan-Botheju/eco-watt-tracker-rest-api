package lk.simple.electricity_consumption_system.infrastructure.persistence;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;

import java.util.List;

public class ElectricityUsageImpl implements ElectricityUsageRepository {

    //inject jpa repository as constructor
    private final JpaElectricityUsageRepository jpaElectricityUsageRepository;

    public ElectricityUsageImpl(JpaElectricityUsageRepository jpaElectricityUsageRepository ){
        this.jpaElectricityUsageRepository = jpaElectricityUsageRepository;
    }


}