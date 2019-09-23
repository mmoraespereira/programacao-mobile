package br.edu.utp.trabalho1;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Ativadde 5 Lista
 *
 * @author Magdiel
 * @version 1.0
 */

public class Atividade5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ovo");
        lista.add("leite");
        lista.add("açúcar");
        lista.add("chocolate");
        lista.add("farinha");

        System.out.println("----------Imprimindo a lista----------");
        for (String pedidos : lista) {
            System.out.println(pedidos);
        }

        //Removendo o ultimo elemento da lista
        lista.remove("farinha");

        //Adicionando o elemento no inicio da lista
        lista.add(0, "Café");

        //Editar o elemento acuçar para café
        lista.remove("açúcar");
        lista.add(3, "mel");

        //Imprimindo a posição do elemento leite
        System.out.println("----------Imprimindo a posição do elemento leite----------");
        int cont = 0;
        for (String pedidos : lista) {
            if (pedidos.contains("leite")) {
                System.out.println("O elemento" + " " + pedidos + " " + "esta na posição = " + " " +  cont);
            }
            cont++;
        }

        //Ordenando a lista
        Collections.sort(lista);
        System.out.println("----------Imprimindo a lista ordenada---------");
        for (String pedidos : lista) {
            System.out.println(pedidos);
        }
    }
}


