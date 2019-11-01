package webec

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class PersonControllerSpec extends Specification implements ControllerUnitTest<PersonController> {

    def setup() {
    }

    def cleanup() {
    }

    void "construction and access"() {
        given:
            Person dierk = new Person(firstName: "Dierk", lastName: "König")
        expect:"one can access the parameters"
            dierk.firstName == "Dierk"
            dierk.lastName == "König"
    }
}
