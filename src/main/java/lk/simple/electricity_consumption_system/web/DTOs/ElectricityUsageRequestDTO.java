package lk.simple.electricity_consumption_system.web.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityUsageRequestDTO {
    private LocalDate date;
    private int unitConsumed;
    private String category;
}