class Employee {
     var firstName: String
        get() = field
        set(value) {
            field = value
        }
     var lastName: String
        get() = field
        set(value) {
            field = value
        }
     var monthlySalary: Double
        get() = field
        set(value) {
            field = value
        }

    constructor(firstName: String, lastName: String, monthlySalary: Double) {
        this.firstName = firstName
        this.lastName = lastName
        this.monthlySalary = monthlySalary
    }

    fun annualSalary(): Double {
        return this.monthlySalary * 12
    }

    fun earnsWell(): String {
        return if (this.monthlySalary >= 10000) {
            "You ean well"
        } else {
            "You don't earn well"
        }
    }
}


fun main() {

    val employee01 = Employee("Pedro Henrique", "Moreira", 12000.00)
    val employee02 = Employee("Manolo", "Silva", 2000.00)

    println(employee01.firstName)
    println("Annual Salary: $${employee01.annualSalary()}")
    println(employee01.earnsWell())
    println("==========================")
    println(employee02.firstName)
    println("Annual Salary: $${employee02.annualSalary()}")
    println(employee02.earnsWell())
    println("==========================")
    employee01.monthlySalary += employee01.monthlySalary * 0.1
    employee02.monthlySalary += employee02.monthlySalary * 0.1
    println("==========================")
    println(employee01.firstName)
    println("Annual Salary: R$${employee01.annualSalary()}")
    println(employee01.earnsWell())
    println("==========================")
    println(employee02.firstName)
    println("Annual Salary: $${employee02.annualSalary()}")
    println(employee02.earnsWell())
    println("==========================")
}

