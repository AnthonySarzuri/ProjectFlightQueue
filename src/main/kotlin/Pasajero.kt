class Pasajero (
    val nombre:String,
    val apellido:String,
    val cl:String,
    val email:String,
    val telefono:String,
    val vuelo:String,
    val codReserva:String
        ){
    fun mostrarDatosPasajero(){
            println("""
                    Nombre completo del Pasajero: $nombre $apellido
                    N° de CL: $cl
                    Correo electronico: $email
                    Telefono: $telefono
                    Con el Vuelo a: $vuelo
                    Codigo de reserva: $codReserva                    
            """.trimIndent())
    }
}