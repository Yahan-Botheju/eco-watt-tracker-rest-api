package lk.simple.electricity_consumption_system.infrastructure.persistence;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
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

    //turn domain model to entity and save in db
    @Override
    public void saveUsage(ElectricityUsage electricityUsage){
       ElectricityUsageEntity entity = new ElectricityUsageEntity();
       entity.setDate(electricityUsage.getDate());
       entity.setUnitConsumed(electricityUsage.getUnitConsumed());
       entity.setCategory(electricityUsage.getCategory());
       entity.setDeleted(false);
       entity.setCreatedAt(LocalDateTime.now());

       //save in db
       jpaElectricityUsageRepository.save(entity);
    }

}