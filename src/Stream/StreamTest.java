package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        //tworzenie strumienia
        List<String> names = Arrays.asList("Tom", "John", "Mat", "Perez");
        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);


        // *przetwarzanie danych*
        // filter - filtrowanie
        // map - zmiana elementu na coś innego
        // limit - zwraca nam określoną liczbę elementów
        // peek - pozwala przeprowadzić oparcję na każdym elemencie

        // *kończenie strumienia*
        // forEach - wykonanie akcji dla każdego z elementów strumienia
        // count - zwróci ilość elementów w strumieniu
        // allMatch - sprawdzą czy elementy spelniają jakis warunek
        // collect - zwraca nowy typ na podstawie strumienia

        streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .forEach(el -> System.out.println(el));

        intStream.filter(el -> el>20)
                .map(el -> el*2)
                .limit(10)
                .forEach((el -> System.out.println(el)));
    }
}
