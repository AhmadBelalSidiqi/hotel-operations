package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final double payRate;
    private double hoursWorked;
    private LocalDateTime punchIn;
    private LocalDateTime punchOut;

    public Employee(int id, String name, String department, double payRate, double hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        }
        return (40 * payRate) + (hoursWorked - 40) * (payRate * 1.5);
    }

    public double getRegularHours() {
        if (hoursWorked <= 40)
            return hoursWorked;
        return 40;

    }

    public double getOvertimeHours(){
        if (hoursWorked > 40 )
            return hoursWorked-40;
        return 0;
    }

    public void punchIn(int time ){
        punchIn = LocalDateTime.of(LocalDate.now(),LocalTime.of(time,1,1));
    }
    public void punchOut(int time ){
        punchOut = LocalDateTime.of(LocalDate.now(),LocalTime.of(time,1,1));;
        double hour = punchOut.getHour()-punchIn.getHour();
        double min = punchOut.getMinute()-punchIn.getMinute();
        this.hoursWorked += (hour+(min/60));

    }
    public void punchTimeCard(int punchInTime , int punchOutTime){
        this.punchIn=LocalDateTime.of(LocalDate.now(),LocalTime.of(punchInTime,1,1));
        this.punchOut=LocalDateTime.of(LocalDate.now(),LocalTime.of(punchOutTime,1,1));
    }

    public LocalDateTime getPunchOut() {
        return punchOut;
    }

    public LocalDateTime getPunchIn() {
        return punchIn;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setPunchIn(LocalDateTime punchIn) {
        this.punchIn = punchIn;
    }
}
