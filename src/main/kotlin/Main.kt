import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.util.*

fun main() {
    println("--------------------------------------------")
    println("---- Bienvenido a el Aeropuerto El Alto ----")
    println("--------------------------------------------\n")

    val i: Int=0
    var fsit: Int = 0
    println("Estos son los vuelos disponibles del mes de Octubre:")

    for (i in EnumVuelos.values()) {
        println(i)
    }

    println("Escoja su vuelo: ")
    var flight:Int=0
    flight= readLine()?.toInt() as Int
    when (flight) {
        1 -> print("Vuelo Cochabamba elegido\n")
        2 -> print("Vuelo Sucre elegido\n")
        3 -> print("Vuelo Santa Cruz elegido\n")
        4 -> print("Vuelo Beni elegido\n")
        else -> {
            print("Introduzca un valor valido")
        }
    }
    if (flight==1){
        println("Estos son los asientos disponibles:")

        for (i in AsientosVueloCBBA.values()) {
            if (i.disponibilidad==0){
                println("Estan disponibles los asientos: $i")
                println(i.tipoClase)
            }

        }
        println("Escoja su asiento: ")
        var sit:Int=i
        sit= readLine()?.toInt() as Int
        when (sit) {
            sit-> println("Asiento $sit elegido")
            else -> {
                print("Elija un asiento valido")
            }

        }
        fsit=sit
    }
    if (flight==2){
        println("Estos son los asientos disponibles:")

        for (i in AsientosVueloSCR.values()) {
            if (i.disponibilidad==0){
                println("Estan disponibles los asientos: $i")
                println(i.tipoClase)
            }

        }
        println("Escoja su asiento: ")
        var sit:Int=i
        sit= readLine()?.toInt() as Int
        when (sit) {
            sit-> println("Asiento $sit elegido")
            else -> {
                print("Elija un asiento valido")
            }
        }
    }
    if (flight==3){
        println("Estos son los asientos disponibles:")

        for (i in AsientosVueloSCS.values()) {
            if (i.disponibilidad==0){
                println("Estan disponibles los asientos: $i")
                println(i.tipoClase)
            }

        }
        println("Escoja su asiento: ")
        var sit:Int=i
        sit= readLine()?.toInt() as Int
        when (sit) {
            sit-> println("Asiento $sit elegido")
            else -> {
                print("Elija un asiento valido")
            }
        }
    }
    if (flight==4) {
        println("Estos son los asientos disponibles:")

        for (i in AsientosVueloBN.values()) {
            if (i.disponibilidad == 0) {
                println("Estan disponibles los asientos: $i")
                println(i.tipoClase)
            }

        }
        println("Escoja su asiento: ")
        var sit: Int = i
        sit = readLine()?.toInt() as Int
        when (sit) {
            sit -> println("Asiento $sit elegido")
            else -> {
                print("Elija un asiento valido")
            }
        }
    }
    println("Formulario de registro pasajero")
    println("Ingrese su nombre")
    var nombre = readLine()
    println("Ingrese su apellido")
    var apellido = readLine()
    println("Ingrese cédula de identidadt")
    var cl = readLine()
    println("Ingrese su correo electronico")
    var correo = readLine()
    println("Ingrese su numero de telefono")
    var telefono = readLine()

    var usuario = Pasajero("$nombre", "$apellido", "$cl", "$correo", "$telefono", EnumVuelos.COCHABAMBA.toString(),"CDGR001")
    //bro falta guardar tu variables en un objeto de la clase Vuelo(llene estos datos de prueba y todo cumple debe ser)
    var usuarioVuelo = Vuelo("La paz", EnumVuelos.COCHABAMBA.toString(), EnumVuelos.COCHABAMBA.fechaHoraSalida,EnumVuelos.COCHABAMBA.fechaHoraLlegada, "CBA001", EnumAeronaveAMAZONAS.Boeing_737_300.aerolinea,EnumVuelos.COCHABAMBA.precio)

    println("------------------------------")
    println("----- Ticket de Reserva ------")
    println("------------------------------\n")
    println(usuario.mostrarDatosPasajero())
    println(usuarioVuelo.mostrarDatosVuelo())
    println("Asiento: $fsit")
}



