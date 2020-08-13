package com.example.helloworld

import kotlin.math.max

fun main(){
/*    val a = 37
    val b = 40
    val value = largerNumber(a,b)*/
/*    val student1 = Student()
    val student2 = Student("Jim",21)
    val student3 = Student("a1",6,"Lily",23)*/
/*    val p =Person("Jack",19)*/
/*    val student = Student("a123",5,"Tom",20)*/
/*    p.eat()*/
/*    student.eat()
    doStudy(student)
    Singleton.singletonTest()*/
/*    student1.eat()
    student2.eat()
    student3.eat()*/
/*    println("larger number is " + value)
    println(getScore("Tom"))*/

    val list = mutableListOf("Apple","Banana","Orange","Pear","Grape")
    list.add("Watermelon")
    val maxLengthFilter = list.maxBy{it.length}

}
fun largerNumber(num1:Int,num2:Int):Int = if ( num1 > num2 ) num1 else num2

fun getScore(name:String)=when (name){
    "Tom" -> 86
    "Jim" -> 77
    "Jack"-> 95
    "Lily"-> 100
    else  -> 0
}
fun doStudy(study: Study){
    study.readBooks()
    study.doHomnework()
}



