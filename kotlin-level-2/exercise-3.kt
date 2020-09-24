/*

Exercício 3:
Utilizando a estrutura condicional e operadores relacionais, 
desenvolva um algoritmo que identifique se um determinado número inteiro é par ou ímpar

 */

 fun main(args: Array<String>) {
    var number : Int = 6

    var result = evenOdd(number)
    println("$number: $result")
 }

 fun evenOdd(anyNumber : Int) : String {
    if (anyNumber % 2 == 0) {
        return "Numero par!"
    } else {
        return "Numero ímpar!"
    }
 }