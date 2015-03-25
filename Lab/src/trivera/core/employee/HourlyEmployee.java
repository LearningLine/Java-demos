package trivera.core.employee;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of the Trivera Group, Inc.
 *
 * Copyright c 2015 The Trivera Group, LLC.
 * http://www.triveratech.com   http://www.triveragroup.com
 * </p>
 * @author The Trivera Group Tech Team.
 */


public class HourlyEmployee extends Employee {
    // Instance fields
    private double hoursWorked;

    private double hourRate;

    public HourlyEmployee() {
    }

    public double getHourRate() {
        return hourRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    // Define a constructor that accepts a name and a employee number, and use
    // the constructor of Employee
    public HourlyEmployee(String name, int empID) {
        super(name, empID);
    }

    // Override the calcSalary method and calculate the salary based on
    // hoursworked
    public double calcSalary() {
        return this.hourRate * this.hoursWorked;
    }
}