package com.batch.demo

class Person {
    lateinit var firstName: String
    lateinit var lastName: String

    constructor() {}
    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return "firstName: $firstName, lastName: $lastName"
    }
}