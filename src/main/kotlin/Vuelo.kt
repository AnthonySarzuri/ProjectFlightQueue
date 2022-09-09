import java.time.LocalDateTime

class Vuelo (
    val origen:String="La Paz",
    val destino:String,
    val horaSalida:LocalDateTime,
    val horaLlegada:LocalDateTime,
    val codigoVuelo:String,
    val aeronave: String,
    val precio: Int
        ){
    fun mostrarDatosVuelo(){
        println("""
            Origen: $origen
            Destino: $destino
            Fecha y hora de salida: $horaSalida
            Fecha y hora de llegada: $horaLlegada
            Codigo de vuelo: $codigoVuelo
            Aeronave: $aeronave
            Precio: $precio
        """.trimIndent())
    }
}