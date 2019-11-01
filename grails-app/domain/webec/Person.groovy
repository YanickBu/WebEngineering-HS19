package webec

import groovy.transform.ToString

class Person {
    String firstName
    String lastName

    static constraints = {
    }

    @Override
    String toString(){
        return firstName + " " + lastName;
    }
}
