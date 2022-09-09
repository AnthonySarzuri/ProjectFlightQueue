import java.time.LocalDateTime

class Vuelo (
    val origen:String="La Paz",
    val destino:String="",
    val horaLlegada:LocalDateTime,
    val codigoVuelo:String="",
        ){
    //val aerolinea:List<String>("")
    val aeronave= mutableListOf<String>("Boeing 737-300","Boeing 737-700","Boeing 737-800")
    val aerolinea= mutableListOf<String>("BOA","AMAZONAS","TAM")
}