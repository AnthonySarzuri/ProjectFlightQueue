import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

enum class EnumVuelos (
    val fecha:LocalDate,
    val duracionVuelo:Int
        ){
    COCHABAMBA(LocalDate.of(2022, Month.OCTOBER,1,),30),
    SUCRE(LocalDate.of(2022, Month.OCTOBER,2),35),
    SANTA_CRUZ(LocalDate.of(2022, Month.OCTOBER,3),55),
    BENI(LocalDate.of(2022, Month.OCTOBER,4),55)
}