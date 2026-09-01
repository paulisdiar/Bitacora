import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio9 {

    public static void main(String[] args) {

        List<Integer> puntajes = Arrays.asList(
                980, 950, 920, 890, 860,
                830, 810, 790, 770, 750,
                730, 710, 690, 670, 650,
                630, 610, 590, 570, 550
        );

        List<Integer> top5 = puntajes.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5 puntajes: " + top5);
    }
}