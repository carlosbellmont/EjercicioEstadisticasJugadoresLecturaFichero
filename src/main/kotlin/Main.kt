fun main() {

    val jugador1 = Jugador()
    jugador1.nombre = "Alfredo"
    jugador1.deaths = 15
    jugador1.kills = 21
    jugador1.tiempoJugado = 24
    jugador1.partidasJugadas = 20

    println(jugador1.getDetalles())
}