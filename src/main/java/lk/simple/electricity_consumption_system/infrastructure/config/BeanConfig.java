package lk.simple.electricity_consumption_system.infrastructure.config;

import lk.simple.electricity_consumption_system.domain.repository.ElectricityUsageRepository;
import lk.simple.electricity_consumption_system.usecase.ElectricityUsageUseCase;
import lk.simple.electricity_consumption_system.usecase.ElectricityUsageUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public ElectricityUsageUseCase electricityUsageUseCase(ElectricityUsageRepository electricityUsageRepository){
        return new ElectricityUsageUseCaseImpl(electricityUsageRepository);
    }
}