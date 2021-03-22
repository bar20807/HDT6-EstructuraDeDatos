import java.util.HashMap;

/**
 * 
 * @author José Rodrigo Barrera García y Oscar Fernando Lopez Barrios
 * Carnets: 20807 y 20679
 * Universidad del Valle de Guatemala
 *
 * @param <K> Parametro
 * @param <E> Parametro
 */

public class MapMenuFactory<K,E> {

    /*Por medio del diseño Factory se escoge la implementación que se 
     * desea utilizar para el Stack
     */
     
    public MapGeneral<K,E> getMap(String entry) {
        
    	//Codigo que se encarga de seleccionar la implementación que deseamos utilizar
    	
        if (entry.equals("HM"))
            return new hashMap<K,E>();
        else if(entry.equals("LM"))
            return new linkedHashMap<K,E>();
        else if(entry.equals("TM"))
            return new treeMap<K,E>();
        else {
            System.out.println("\nLo sentimos, usted ingreso un parametro desconocido. Por defecto le hemos asignado HashMap de manera estandar para continuar con la operacion\n");
            return new hashMap<K,E>();
        }

    }

}
