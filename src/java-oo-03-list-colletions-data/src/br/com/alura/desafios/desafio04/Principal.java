import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //Exercicio 4
        Titulo titulo1 = new Titulo("caio");
        Titulo titulo2 = new Titulo("rafael");
        Titulo titulo3 = new Titulo("brunna");
        Titulo titulo4 = new Titulo("ana");
        Titulo titulo5 = new Titulo("debora");

        List<Titulo> listaTitulosLinkedList = new LinkedList<>();

        listaTitulosLinkedList.add(titulo1);
        listaTitulosLinkedList.add(titulo2);
        listaTitulosLinkedList.add(titulo3);
        listaTitulosLinkedList.add(titulo4);
        listaTitulosLinkedList.add(titulo5);

        System.out.println("Lista Original: " + listaTitulosLinkedList);
        Collections.sort(listaTitulosLinkedList);
        System.out.println("Lista Ordenada: "+listaTitulosLinkedList);


        //Exercicio 2 e 3
        List<Titulo> listaTitulosArrayList = new ArrayList<>();

        listaTitulosArrayList.add(titulo1);
        listaTitulosArrayList.add(titulo2);
        listaTitulosArrayList.add(titulo3);
        listaTitulosArrayList.add(titulo4);
        listaTitulosArrayList.add(titulo5);

        System.out.println("Lista Original: " + listaTitulosArrayList);
        Collections.sort(listaTitulosArrayList);
        System.out.println("Lista Ordenada: "+listaTitulosArrayList);

        //Exercicio 1
//        List<Integer> lista = new ArrayList<>();
//
//        lista.add(6);
//        lista.add(3);
//        lista.add(2);
//        lista.add(7);
//        lista.add(1);
//        System.out.println("Lista Original: "+ lista);
//
//        Collections.sort(lista);
//        System.out.println("Lista Ordenada: "+lista);

    }
}
