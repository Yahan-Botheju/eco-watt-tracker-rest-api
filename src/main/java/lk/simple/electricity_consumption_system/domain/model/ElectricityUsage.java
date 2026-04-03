package lk.simple.electricity_consumption_system.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityUsage {
    private Long id;
    private LocalDate date;
    private int unitConsumed;
    private String category;
}