package POO.ExercicioBanco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class Hora {
    public static void main(String[] args) throws InterruptedException {

        LocalDateTime horarioatual = LocalDateTime.now();
        Temporal horariopassado = new Temporal();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        System.out.println(dtf.format(horarioatual));

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss+sleep(30000)");
        System.out.println(dt.format(horariopassado));


}}
