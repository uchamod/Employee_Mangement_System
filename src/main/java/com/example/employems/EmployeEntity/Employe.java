package com.example.employems.EmployeEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="emplye")
public class Employe {

    @Id
    private int empId;
    private String empName;
    private String empAddress;
    private int empMobileNumber;

}
