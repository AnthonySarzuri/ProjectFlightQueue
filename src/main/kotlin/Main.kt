

fun main() {
    //val v1=EnumVuelos.COCHABAMBA
    //val as1=AsientosVueloBN.ASIENTO1
    val sized: Int=AsientosVueloCBBA.values().size

    println("Estos son los asientos disponibles:")

for (i in AsientosVueloCBBA.values()) {
        println(i.disponibilidad)
    }

}