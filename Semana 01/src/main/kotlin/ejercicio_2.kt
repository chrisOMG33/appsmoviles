//Ejercicio #2
fun main(args: Array<String>) {
    var horaInicial = 2
    var horaFinal = 9
    var gradosGiro = 360 / 12

    var horasGiro = horaFinal - horaInicial
    var gradosGirados = gradosGiro * horasGiro

    println("La aguja giró $gradosGirados grados desde las $horaInicial hasta las $horaFinal.")
}