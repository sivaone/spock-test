package com.sivanagireddy.spock

import spock.lang.Specification

class ExampleSpecification extends Specification {

    void setupSpec() {
        // once per test class
    }

    void setup() {
        // one per test method
    }

    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "should demonstrate given-when-then"() {
        given:
        def poly = new Polygon(4)

        when:
        int size = poly.numberOfSides

        then:
        size == 4
    }

    def "should throw exception"() {
        when:
        new Polygon(0)

        then:
        def exception = thrown(TooFewSidesException)
        exception.sides == 0
    }

    def "should throw exception for number of sides: #sides"() {
        when:
        new Polygon(sides)

        then:
        def exception = thrown(TooFewSidesException)
        exception.sides == sides

        where:
        sides << [-1, 0, 1, 2]
    }

    def "should create polygon for number of sides: #sides"() {
        expect:
        new Polygon(sides).numberOfSides == sides

        where:
        sides << [3, 10, 45, 100]
    }

    def "should use data tables for calculating max of #a and #b is #max"() {
        expect:
        Math.max(a, b) == max

        where:
        a  | b || max
        1  | 3 || 3
        9  | 0 || 9
        -1 | 0 || 0
    }


    void cleanup() {
        // once per test method
    }

    void cleanupSpec() {
        // once per test class
    }
}
