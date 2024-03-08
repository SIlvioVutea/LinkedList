import java.util.LinkedList;
import java.util.List;

public class Main {
    //    Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//    In questa classe avere i metodi pubblici per ottenere le informazioni.
//    Creare un LinkedList con elementi e stamparlo in console.
//    Aggiungere un elemento al primo posto della lista e uno all'ultimo
//    Stampare la collezione aggiornata
    public static void main(String[] args) {

        List<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Pera"));
        fruitList.add(new Fruit("Mela"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Susina"));
        fruitList.add(new Fruit("Arancia"));
        fruitList.add(new Fruit("Pesca"));
        System.out.println(fruitList);
        fruitList.addFirst(new Fruit("limone"));
        fruitList.addLast(new Fruit("Mandarino"));
        System.out.println(fruitList);

    }
}