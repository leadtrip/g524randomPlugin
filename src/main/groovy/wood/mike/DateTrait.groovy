package wood.mike

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

trait DateTrait {

    def dateInXDays(Integer days) {
        LocalDate.now().plusDays(days).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
    }

    def dateNow() {
        LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
    }
}
