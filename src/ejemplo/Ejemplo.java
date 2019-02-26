/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import modelo.Persona;



/**
 *
 * @author andrea.saavedra
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Persona> listap=new LinkedList<>();
        LinkedList<Persona> listap2=new LinkedList<>();
        
        HashMap<Integer, LinkedList<Persona>> map1= new HashMap<>();
        LinkedHashMap<Integer, LinkedList<Persona>> map2=new LinkedHashMap<>();
        TreeMap<Integer,LinkedList<Persona>> map3=new TreeMap<>();
        
        listap.add(new Persona("David", "1130", 31));
        listap.add(new Persona("Pepe", "1131", 30));
        listap.add(new Persona("Ximena", "1132", 25));
        listap.add(new Persona("Camila", "1133", 37));
        map1.put(3, listap);
        
        listap2.add(new Persona("Manueñ", "1134", 21));
        listap2.add(new Persona("Xamara", "1135", 32));
        listap2.add(new Persona("Kimi", "1136", 26));
        listap2.add(new Persona("Mendez", "1137", 31));
        map1.put(2, listap);
        
    }
        
//        MAPS NORMALES:
//        HashMap<Integer, Persona> map1= new HashMap<>();
//        LinkedHashMap<Integer, Persona> map2=new LinkedHashMap<>();
//        TreeMap<Integer,Persona> map3=new TreeMap<>();
//        
//        map1.put(3, new Persona("David", "1130", 31));
//        map1.put(2, new Persona("Pepe", "1131", 30));
//        map1.put(36, new Persona("Ximena", "1132", 25));
//        map1.put(6, new Persona("Camila", "1133", 37));
//        
//        map2.put(3, new Persona("David", "1130", 31));
//        map2.put(2, new Persona("Pepe", "1131", 30));
//        map2.put(36, new Persona("Ximena", "1132", 25));
//        map2.put(6, new Persona("Camila", "1133", 37));
//        
//        map3.put(3, new Persona("David", "1130", 31));
//        map3.put(2, new Persona("Pepe", "1131", 30));
//        map3.put(36, new Persona("Ximena", "1132", 25));
//        map3.put(6, new Persona("Camila", "1133", 37));
//        
//        String m1 = mostrar(map1);
//        String m2 = mostrar(map2);
//        String m3 = mostrar(map3);
//        
//        
//        
//        System.out.println(map1);
//        System.out.println("____________");
//        System.out.println(map2);
//        System.out.println("____________");
//        System.out.println(map3);
//        
//    }
    public static String mostrar(Map<Integer, Persona>m){
        String mostrar = "";
        Iterator<Map.Entry<Integer, LinkedList<Persona>>> it = m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,LinkedList<Persona>> pair = it.next();
            for(int i=0; i<pair.getValue().size(); i++){
                mostrar += "  "+pair.getValue().get(i)+"\n";
            }
            
            mostrar += pair.getKey() +" "+ pair.getValue()+"\n";
        }
        return mostrar;
    }
    

