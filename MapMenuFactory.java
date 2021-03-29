/**
 * 
 * @author Jos� Rodrigo Barrera Garc�a y Oscar Fernando Lopez Barrios
 * Carnets: 20807 y 20679
 * Universidad del Valle de Guatemala
 *
 * @param <K> Parametro
 * @param <E> Parametro
 */

public class MapMenuFactory<K,E> {

    /*Por medio del dise�o Factory se escoge la implementaci�n que se 
     * desea utilizar para el Stack
     */
     
    public MapGeneral<K,E> getMap(String entry) {
        
    	//Codigo que se encarga de seleccionar la implementaci�n que deseamos utilizar
    	
        if (entry.equals("1"))
            return new hashMap<K,E>();
        else if(entry.equals("2"))
            return new linkedHashMap<K,E>();
        else if(entry.equals("3"))
            return new treeMap<K,E>();
        else {
            System.out.println("\nLo sentimos, usted ingreso un parametro desconocido. Por defecto le hemos asignado HashMap de manera estandar para continuar con la operacion\n");
            return new hashMap<K,E>();
        }

    }

}
