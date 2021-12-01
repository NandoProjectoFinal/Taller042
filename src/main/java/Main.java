
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class Main {

    public static void main(String[] args) {
        hablar();
    }

    public static void hablar() {
        System.out.println("Hola mundo");
    }

    String respuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

}
