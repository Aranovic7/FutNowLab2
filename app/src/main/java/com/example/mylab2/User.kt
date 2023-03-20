package com.example.mylab2

class User (
    var email: String = ""
        ) {
    override fun toString(): String {
        return "Users(email='$email'"
    }
}