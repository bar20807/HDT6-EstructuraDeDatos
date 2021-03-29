import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * 
 * @author Jos� Rodrigo Barrera Garc�a y Oscar Fernando Lopez Barrios
 * Carnets: 20807 y 20679
 * Universidad del Valle de Guatemalas
 *
 */

public class Main {

    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
        MapMenuFactory<String, Card> mapFactory = new MapMenuFactory<>();
        MapGeneral<String, Card> cartas;
        MapGeneral<String, Card> userCards;
        String resp;

        System.out.println("Ingrese el tipo de Map que desee utilizar: ");
        System.out.println("1) HashMap\n2) LinkedHashMap\n3) TreeMap");

        resp = entrada.nextLine();
        userCards = mapFactory.getMap(resp);
        cartas= userCards;

        try {
            File myObj = new File("Cartas.txt");
            Scanner Lector = new Scanner(myObj);
            while (Lector.hasNextLine()) {
                String dato = Lector.nextLine();
                String nombre = dato.split("\\|")[0];
                String tipo = dato.split("\\|")[1];
                Card card = new Card(nombre, tipo);
                cartas.Put(nombre, card);
            }
            Lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha Ocurrido un error!");
            e.printStackTrace();
        }

        boolean Menu = true;
        while (Menu) {

            System.out.println("\nNuevamente ingrese la opci�n que desee realizar:" +
                    "\n1) Agregar una carta a la coleccion." +
                    "\n2) Ver clase de la carta perteneciente en la coleccion." +
                    "\n3) Mostrar la informacion de cada carta en la coleccion." +
                    "\n4) Mostrar la informacion de cada carta en la coleccion ordenada por clase." +
                    "\n5) Mostrar la informacion de cada carta existente en la colecci�n." +
                    "\n6) Mostrar la informacion de cada carta existente en la colecci�n ordenada por clase."+
                    "\n7) Salir.");

            int opcion = 0;

            boolean respuesta = true;
            while (respuesta) {
                try {
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                    if (opcion > 7 || opcion < 1) {
                        System.out.println("\nPor favor ingrese un valor correcto.");
                    } else {
                        respuesta = false;
                    }
                } catch (Exception e) {
                    System.out.println("\nPor favor ingrese un valor correcto.");
                }
            }

            String name;

            switch (opcion) {


                case 1:
                    System.out.println("\nIngrese el nombre de la carta que desea ingresar.");
                    name = entrada.nextLine();
                    if (cartas.ContainsKey(name)) {
                        if (!userCards.ContainsKey(name)) {
                            userCards.Put(name, cartas.Get(name));
                        } else {
                            userCards.Get(name).setCount(1);
                        }
                        System.out.println("Nombre de la carta ingresado con exito");
                    } else {
                        System.out.println("\nEl nombre de la carta que ha ingresado no se encuentra en la base de datos.");
                    }
                    break;


                case 2:
                    System.out.println("\nPor favor ingrese el nombre de la carta en su coleccion que desea ver.");
                    name = entrada.nextLine();
                    if (userCards.ContainsKey(name)) {
                        System.out.println("\nTipo: " + userCards.Get(name).getType());
                    } else {
                        System.out.println("\nLa carta que busca no se ha encontrado en su coleccion.");
                    }
                    break;


                case 3:
                    for(String s: userCards.KeySet()){
                        System.out.println("\nNombre: " + s + "\nTipo: " + userCards.Get(s).getType() + "\nCantidad: " + userCards.Get(s).getCount());
                    }
                   

                case 4:

                    if(userCards.IsEmpty()){
                        System.out.println("\nNo hay cartas en su coleccion.");
                    } else {
                        ArrayList<Card> c = new ArrayList<>(userCards.Values());
                        c.sort(new CompareCards());
                        for (Card ca : c) {
                            System.out.println(ca.toString());
                        }
                    }
                    break;

                case 5:
                    for (Card carta : cartas.Values()) {
                        System.out.println(carta);
                    }
                    
                    break;

                case 6:

                    //lista por tipo
                    ArrayList<Card> c = new ArrayList<>(cartas.Values());
                    c.sort(new CompareCards());
                    for (Card ca : c) {
                        System.out.println(ca.toString());
                    }

                    break;

                case 7:
                    Menu = false;
                    break;

            }

        }

    }

}
