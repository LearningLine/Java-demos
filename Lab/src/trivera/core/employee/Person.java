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


public class Person {
    // The name private instance field
    String name;

    public Person() {
    }

    public Person(String name) {
        super();

        // Calls the no-argument superclass constructor

        // Saves the name argument into the instance field
        this.name = name;

    }

    public boolean equals(Object other) {

        // If the other object is not a Person, return false
        if (!(other instanceof Person))
            return false;

        // Cast the other reference into a Person
        Person otherPerson = (Person) other;

        // Get the name of the other Person
        String otherName = otherPerson.getName();

        // If the other name is not null and it is equal (case insensitive)
        // to this Person's name, return true, otherwise return false
        return otherName != null && otherName.equalsIgnoreCase(this.name);

    }

    public String toString() {
        // return the name of the Person
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
