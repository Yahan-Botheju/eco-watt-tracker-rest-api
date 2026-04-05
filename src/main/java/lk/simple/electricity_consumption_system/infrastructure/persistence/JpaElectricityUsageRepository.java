package lk.simple.electricity_consumption_system.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JpaElectricityUsageRepository extends JpaRepository<ElectricityUsageEntity, Long> {

    //implement custom query for get the highest usage of day
    @Query(value =
            "select * from electricity_usage " +
                    "where is_deleted = false " +
                    "order by unit_consumed desc limit 1",nativeQuery = true)

    Optional<ElectricityUsageEntity> findDayWithHighestUsage();
}