//Given a list of 10 strings, write a function that returns a list of the strings at even indices.
//Given a list of people’s heights in metres. Write a function that returns the average height and the total height.
//Given a list of Person objects, each with the attributes, name, age, height and weight. Sort the list in order of descending age
//Given a list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one go.
//Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
fun main(){
    println(evenElements(listOf("Hydrogen", "Oxygen", "Carbon", "Copper", "Nitrogen", "Potassium", "Zinc", "Sodium", "Helium", "Iron")))
    var height = listOf(1.8, 1.5, 1.6, 1.7, 1.55, 1.4, 1.2)
    var averageAndTotal = averageTotal(height)
    println(averageAndTotal)
    sorting()
    person2()
    println(carObject(listOf(Cars("KBR 780Y",23186.45),
        Cars("KCM 453X",12000.35),
        Cars("KBW 145Z", 42420.20))))
}

fun evenElements(elements: List<Any>): List<Any> {
   var  elements=elements.filter{element->
       elements.indexOf(element)%2==0 }
return elements
}

data class AvTotal(var average: Double, var total: Double)
fun averageTotal(height: List<Double>): AvTotal{
    var average = height.average()
    var total = height.sum()
    var averageTotal = AvTotal(average, total)
    return averageTotal
}

data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
fun sorting(){
    var person=listOf(Person("Vicky", 21,1.63,55.1),
        Person("Catherine",39,1.56,44.3),
        Person("Akal",45, 1.8,57.4))
    var sortedAge=person.sortedByDescending { person->person.age }
    println(sortedAge)
}

fun person2(){
    var originalList = mutableListOf<String>()
    var modifiedList =originalList.plus(listOf(Person("Brenda",25,1.65,65.5),
    Person("Belyse",12,1.8,70.1)))
    println(modifiedList)
}

data class Cars(var registration: String, var mileage: Double)
fun carObject(car:List<Cars>): Double{
    var averageMileage = car.map{car ->car.mileage}.average()
    return averageMileage
}

