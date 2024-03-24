package w9.ie.atu.sw;

import java.time.LocalDate;
import java.time.Month;

public class SeasonChecker {
    private SeasonChecker(){};

    public static String getSeason(LocalDate date){
        Month month = date.getMonth();
        return switch (month){
            case FEBRUARY, MARCH, APRIL -> "Spring";
            case MAY, JUNE, JULY -> "Summer";
            case AUGUST, SEPTEMBER, OCTOBER -> "Autumn";
            case NOVEMBER, JANUARY -> "Winter";
            default -> {
                if (month == Month.DECEMBER && date.getDayOfMonth() > 20) {
                    yield "Chrimbo Season";
                }else{
                        yield "December";
                    }
                }
            };
    }
}
