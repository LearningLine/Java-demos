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

public class Test {

    public static void main(String[] args) {
        Person pers = null;
        Employee emp = null;

        // Instantiate a person and an employee, using the two variables
        // supplied
        pers = new Person("Jennifer");
        emp = new Employee("Bob", 10);

        System.out.println("Person   : " + pers);
        System.out.println("Employee : " + emp);

        // verify the version of Java that is running
        System.out.println(System.getProperty("java.version"));
    }

}