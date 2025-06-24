package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetLocalDate {
    //pr constructor
    private GetLocalDate(){

    }

    public static String getDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDateTime.format(formatter);
        return formattedDate;
    }
}
