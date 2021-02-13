package com.example

class ExampleClass {
    static def printMessageToJenkins(Object script) {
        script.echo("Hello from inside ExampleClass")
    }

    static def add(int num1, int num2) {
        return num1 + num2
    }
}