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


public class SalesEmployee extends Employee {
    // Instance fields
    private double salesAmount;

    private double commissionRate;

    // Define get- and set- methods for salesAmount and commissionRate
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Define a constructor which accepts a name and a employee number, and use
    // the constructor of Employee
    public SalesEmployee(String name, int empID) {
        super(name, empID);
    }

    // Override the calcSalary method and calculate the salary based on sales
    public double calcSalary() {
        return this.salesAmount * this.commissionRate;
    }

}