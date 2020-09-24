/*
 * Exercício 5:
 * Desenvolva um algoritmo que utilize os operadores aritméticos 
 * e imprima o antecessor e o sucessor de um número
 * 
 */

fun main(args: Array<String>) {
    val number : Int = 10

    val beforeNumber : Int = number - 1
    val afterNumber : Int = number + 1
    
    println("O antecessor do número $number é $beforeNumber e o sucessor é $afterNumber")
}
