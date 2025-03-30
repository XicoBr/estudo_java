/*Java não tem classe para date, mas podemos usar o pacote java.time para data e API de tempo. Algumas das classes são:
*   - LocalDate - representa uma data em Y-M-D;
*   - LocalTime - representa um horário em HR-MIN-SEG-NS;
*   - LocalDateTime - representa ambas as coisas em DATA-HORÁRIO;
*   - DateTimeFormatter -
* */
package classes.dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(today, time);

        System.out.println("Today is: " + today);
        System.out.println("Time is: " + time);
        System.out.println("-=-=-=-=-=-=-=-=-");

        System.out.println("Antes de formatar:");
        System.out.println("Date and time are: " + dateTime);
        System.out.println("-=-=-=-=-=-=-=-=-");

        System.out.println("Depois de formatar:");
//        formatando as informacoes
        DateTimeFormatter myFormatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dateTime.format(myFormatDateTime);

        System.out.println(formattedDate);
    }
}
