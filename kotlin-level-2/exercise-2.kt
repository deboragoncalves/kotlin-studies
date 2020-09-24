/*

Exercício 2:
Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa 
é maior ou menor de idade

*/

fun main(args: Array<String>) {
    var age : Int = 17

    var resultClassification = ageClassification(age)
    println("$age: $resultClassification")

}

fun ageClassification(anyAge : Int) : String {
    if (anyAge >= 18) {
        return "Maior de idade!"
    } else {
        return "Menor de idade!"
    }
}