package com.pluralsight;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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


}
