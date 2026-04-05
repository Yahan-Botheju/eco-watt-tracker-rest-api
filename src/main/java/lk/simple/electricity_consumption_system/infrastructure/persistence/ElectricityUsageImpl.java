package lk.simple.electricity_consumption_system.infrastructure.persistence;

import lk.simple.electricity_consumption_system.domain.model.ElectricityUsage;
import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ElectricityUsageImpl implements ElectricityUsageRepository {

    //inject jpa repository as constructor
    private final JpaElectricityUsageRepository jpaElectricityUsageRepository;

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

    //domain model data copy into entity and save in db
    @Override
    public void updateUsage(Long id, ElectricityUsage electricityUsage){
        //check related details available in db using id
        ElectricityUsageEntity electricityUsageEntity = jpaElectricityUsageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Invalid ID"));

        electricityUsageEntity.setDate(electricityUsage.getDate());
        electricityUsageEntity.setUnitConsumed(electricityUsage.getUnitConsumed());
        electricityUsageEntity.setCategory(electricityUsage.getCategory());
        electricityUsageEntity.setDeleted(false);
        electricityUsageEntity.setUpdatedAt(LocalDateTime.now());

        //save in db
        jpaElectricityUsageRepository.save(electricityUsageEntity);
    }
}