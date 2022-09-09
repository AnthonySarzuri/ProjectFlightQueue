

fun main() {
    val i: Int=0
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
    if (flight==4){
        println("Estos son los asientos disponibles:")

        for (i in AsientosVueloBN.values()) {
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



}



