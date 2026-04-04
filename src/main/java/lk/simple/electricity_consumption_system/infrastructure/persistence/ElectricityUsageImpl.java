package lk.simple.electricity_consumption_system.infrastructure.persistence;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ElectricityUsageImpl implements ElectricityUsageRepository {

    //inject jpa repository as constructor
    private final JpaElectricityUsageRepository jpaElectricityUsageRepository;

    public ElectricityUsageImpl(JpaElectricityUsageRepository jpaElectricityUsageRepository ){
        this.jpaElectricityUsageRepository = jpaElectricityUsageRepository;
    }

    //get all data from db, show to user
    @Override
    public List<ElectricityUsage> getAllUsage(){

        List<ElectricityUsageEntity> electricityUsage = jpaElectricityUsageRepository.findAll();

       return electricityUsage.stream()
               .map(entity -> new ElectricityUsage(
                       entity.getId(),
                       entity.getDate(),
                       entity.getUnitConsumed(),
                       entity.getCategory())).toList();
    }

    @Override
    public void saveUsage(ElectricityUsage electricityUsage){
        //not implement yet
    }

}