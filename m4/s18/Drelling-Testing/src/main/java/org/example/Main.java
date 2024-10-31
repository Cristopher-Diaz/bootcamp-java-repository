package org.example;

import org.modelo.Mercado;
import org.modelo.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Mercado m = new Mercado();
        System.out.println(m.verTodoAviso());
        System.out.println("Nombre del producto");
//        read.nextLine();
        String nombre = read.nextLine();

        System.out.println("ID del producto");
        int id = read.nextInt();

        System.out.println("Condicion del producto?");
        String condicion = read.next();

        System.out.println("Precio del producto?");
        String precio = read.next();

        Producto p = new Producto(nombre, id, condicion, precio);

        System.out.println(m.publicarAviso(p));
        System.out.println(m.verTodoAviso());
    }
}