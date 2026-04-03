package lk.simple.electricity_consumption_system.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaElectricityUsageRepository extends JpaRepository<ElectricityUsageEntity, Long> {
}