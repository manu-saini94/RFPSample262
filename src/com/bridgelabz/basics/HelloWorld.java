package com.bridgelabz.basics;


// JDK (Java Development Kit)-> It is a platform(OS) specific installation
// JDK => JRE + compiler + javadoc/java-debugger
// JRE (Java Runtime Environment) => JVM + ....
// JVM (Java Virtual Machine) =>

// When we run any program , the source code(.java file) is given to compiler.
// The compiler compiles the .java file and converts it into byte code(.class file).
// This .class file is loaded by the class loader into the method area of JVM memory
// This loaded .class file is interpreted by JVM and is converted into machine readable code.
// JVM has a main thread which is responsible for calling the main method.
// So the main thread calls the main method and the same main thread is responsible for executing the code(instructions)


public class HelloWorld {

    static int x = 20; // at the time of initialization stage actual value will be initialized , x = 20
                 // at the time of prapare stage default value will be taken , x =0
    void m1() {
        System.out.println("m1");
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        HelloWorld obj = new HelloWorld();

        // Multithreading
    }
}

// Naming convention
// class ,interface ,enum => Pascal case -> Eg:- EmployeeWage
// variables , methods => Camel Case -> Eg:- employeeCheck, calculateWage()
// constants => Upper case with underscores -> Eg:- WORKING_HOURS_PER_MONTH
// Always use meaningfull names.


// hardware based vm
// application based vm -> JVM , PVM , CLR

// JDK -> JRE -> JVM

// JVM => Class loader subsyatem -> 1> Loading 2> Linking 3> Initialization
// Linking =>  1> Verify 2> Prepare 3> Resolve
// Initialization

// Class loaders => 1> Bootstrap 2> Extension 3>Application
// Bootstrap => JDK -> JRE -> lib -> rt.jar  -> Bootstrap classpath -> Loading core java api classes
// Extension => JDK -> JRE -> lib -> ext -> *.jar   -> Child class of Bootstrap cp
// Application => it uses environment variable class path
