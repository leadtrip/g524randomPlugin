package wood.mike

import grails.artefact.Enhances

import java.time.LocalDate
import java.time.Month
import java.time.MonthDay
import java.time.Year

@Enhances('Controller')
trait BirthdayTrait {

    String howLongUntilNextBirthday() {
        def aprilTen = MonthDay.of( Month.APRIL, 10 )
        def before = aprilTen.isBefore(MonthDay.now())
        def until = LocalDate.now().until(LocalDate.of(Year.now().plusYears(before ? 1 : 0).value, aprilTen.month, aprilTen.dayOfMonth ))
        String.format("Next birthday is in %d months %d days", until.months, until.days)
    }
}
