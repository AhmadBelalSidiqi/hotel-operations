package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        Employee employee = new Employee(111,"AA","Tech",20.5,1);
        employee.punchIn(12);
        LocalDateTime actualDateTime = employee.getPunchIn() ;
        LocalDateTime expectedDateTim = LocalDateTime.of(LocalDate.now(), LocalTime.of(12,1,1));
        assertEquals(actualDateTime,expectedDateTim);
    }

    @Test
    void is_worked_hours_added_to_total_hoursWorked() {
        Employee employee = new Employee(111,"AA","Tech",20.5,0);
        employee.punchIn(11);
        employee.punchOut(23);
        double expectedHoursWorked = 12;
        double actualHoursWorked = employee.getHoursWorked();
        assertEquals(expectedHoursWorked,actualHoursWorked);
    }
}