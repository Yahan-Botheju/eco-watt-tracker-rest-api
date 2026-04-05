package lk.simple.electricity_consumption_system.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SoftDelete;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "electricity_usage")
@SoftDelete(columnName = "isDeleted")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityUsageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private int unitConsumed;
    private String category;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}