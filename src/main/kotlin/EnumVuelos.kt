import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

enum class EnumVuelos (
    val fechaHoraSalida:LocalDateTime,
    val fechaHoraLlegada:LocalDateTime,
    val precio:Int
        ){
    COCHABAMBA(LocalDateTime.of(2022, Month.OCTOBER,1,12,10),LocalDateTime.of(2022,Month.OCTOBER,1,13,25),199),
    SUCRE(LocalDateTime.of(2022, Month.OCTOBER,2,12,10),LocalDateTime.of(2022,Month.OCTOBER,1,13,35),249),
    SANTA_CRUZ(LocalDateTime.of(2022, Month.OCTOBER,3,12,10),LocalDateTime.of(2022,Month.OCTOBER,1,13,45),299),
    BENI(LocalDateTime.of(2022, Month.OCTOBER,4,12,10),LocalDateTime.of(2022,Month.OCTOBER,1,13,50),299)
}
enum class EnumAeronaveBoa(
        val aerolinea:String
) {
    Boeing_737_300("BOA"),
    Boeing_737_700("BOA"),
    Boeing_737_800("BOA"),
}

enum class EnumAeronaveAMAZONAS(
        val aerolinea:String
) {
    Boeing_737_300("AMAZONAS"),
    Boeing_737_700("AMAZONAS"),
    Boeing_737_800("AMAZONAS"),
}

enum class EnumAeronaveTAM(
        val aerolinea:String
) {
    Boeing_737_300("TAM"),
    Boeing_737_700("TAM"),
    Boeing_737_800("TAM"),
}