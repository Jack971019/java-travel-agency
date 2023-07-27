package Org.Java.Lessons.Travel.Agency;

import javax.sql.rowset.spi.SyncResolver;
import java.time.LocalDate;
import java.time.Period;

public class Vacancy {

    // ATTRIBUTI

    private String destination;

    private LocalDate dayOfStart;

    private LocalDate dayOfEnd;


    // COSTRUTTORI

    public Vacancy(String destination, LocalDate dayOfStart, LocalDate dayOfEnd) {
        // CONTROLI
        // se String destination è vuota
        if (destination == null || destination.isEmpty()){
            throw new RuntimeException("destination must not be null or empty");
        }

        // se day of start è null o è passata
        if (dayOfStart == null || dayOfStart.isBefore(LocalDate.now())){
            throw new RuntimeException("day of start must not be null or before the current day ");
        }

        // se day of end è null o è prima del day of start
        if (dayOfEnd == null || dayOfEnd.isBefore(dayOfStart)){
            throw new RuntimeException("day of end must not be null or before the day of start");
        }
    }


    // GETTER AND SETTER

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        // VALIDAZIONE COME NEI COSTRUTORI
        if (destination == null || destination.isEmpty()){
            throw new RuntimeException("destination must not be null or empty");
        }
        this.destination = destination;
    }

    public LocalDate getDayOfStart() {
        return dayOfStart;
    }

    public void setDayOfStart(LocalDate dayOfStart) {
        if (dayOfStart == null || dayOfStart.isBefore(LocalDate.now())){
            throw new RuntimeException("day of start must not be null or before current day");
        }
        this.dayOfStart = dayOfStart;
    }

    public LocalDate getDayOfEnd() {
        return dayOfEnd;
    }

    public void setDayOfEnd(LocalDate dayOfEnd) {
        if(dayOfEnd == null || dayOfEnd.isBefore(dayOfStart)){
            throw new RuntimeException("day of end must not be null or before day of start");
        }
        this.dayOfEnd = dayOfEnd;
    }


    // METODI
    public int getDays(){
        Period dayPeriod = Period.between(dayOfStart, dayOfEnd);
        return dayPeriod.getDays();
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "destination='" + destination + '\'' +
                ", dayOfStart=" + dayOfStart +
                ", dayOfEnd=" + dayOfEnd +
                '}';
    }
}
