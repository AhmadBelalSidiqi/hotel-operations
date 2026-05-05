package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final double payRate;
    private double hoursWorked;
    private LocalTime punchIn;
    private LocalTime punchOut;

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

    public void punchIn(){
        punchIn = LocalTime.now();
    }
    public void punchOut(){
        punchOut = LocalTime.now();
        double hour = punchOut.getHour()-punchIn.getHour();
        double min = punchOut.getMinute()-punchIn.getMinute();
        hour += (min/60);
        this.hoursWorked += hour;

    }

    public LocalTime getPunchOut() {
        return punchOut;
    }

    public LocalTime getPunchIn() {
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

    public void setPunchIn(LocalTime punchIn) {
        this.punchIn = punchIn;
    }
}
