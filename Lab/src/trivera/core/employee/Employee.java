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


public class Employee extends Person implements Mailable
{
    private int empID;

    private Employee manager;

    public Employee() {
    }

    public Employee(String name, int empID) {
        super(name);
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double calcSalary() {
        return 0.0;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append(" - empID: ").append(empID);
        return sb.toString();
    }

    public void mailNote (String note){
        System.out.println ("Employee note:" + note);
    }

}
