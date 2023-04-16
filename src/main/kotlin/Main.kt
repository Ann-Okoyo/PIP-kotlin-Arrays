fun main() {
work()
    courses()
    doit()
    areas()
    given("Cherry","Kanban","Jakes")

}
//Write down an array in Kotlin and sort it in ascending order.

fun work(){
    var numbersArray= arrayOf(10,14,32,6,43,2,75,8)
    var sortedNumbers = numbersArray.sortedArray()
    println(sortedNumbers)
}



//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun areas(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    var capitalised =cities.map{it.capitalize()}
    println(capitalised)
}

//Create a function that takes in 4 strings and
//creates an array out of them then
//prints out the array
fun courses(){
    var units= arrayOf("Kotlin","JavaScript","Python","HTML/CSS")
    println(units.contentToString())
}


//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order

fun doit(){
    var digits = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    val sum=digits[2]+digits[5]
    println(digits.indexOf(158))
    println(digits.sortedArray().contentToString())


}
//Create a function that takes in 3 names and
//returns a string array containing
//all 3 names.
fun given (name1:String ,name2:String, name3:String):Array<String>{
    return arrayOf(name1 ,name2,name3)

}