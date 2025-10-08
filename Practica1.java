package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        List<Integer> lista = new ArrayList<>();
        while (it.hasNext()) {
            int num = it.next();
            if (num != 0) {
                lista.add(num);
            }
        }

        Set<Integer> resultado = new HashSet<>();

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (i != j && lista.get(i) % lista.get(j) == 0) {
                    resultado.add(lista.get(i));
                }
            }
        }

        return resultado;
    }


    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        int elemento, dato;
        Set<Integer> datos = new HashSet<>();
        Set<Integer> sicuadrados = new HashSet<>();
        datos.addAll(cuadrados);
        datos.addAll(noCuadrados);
        Iterator<Integer> itcuadrados = cuadrados.iterator();
        Iterator<Integer> itnocuadrados = noCuadrados.iterator();
        while (itcuadrados.hasNext()){
            elemento=itcuadrados.next();
            if(datos.contains(elemento*elemento))
                sicuadrados.add(elemento*elemento);
        }
        while (itnocuadrados.hasNext()){
            elemento=itnocuadrados.next();
            if(datos.contains(elemento*elemento))
                sicuadrados.add(elemento*elemento);
        }
        if(cuadrados.contains(1) && noCuadrados.contains(1))
            sicuadrados.add(1);
        else sicuadrados.remove(1);
        cuadrados.removeAll(cuadrados);
        cuadrados.addAll(sicuadrados);
        noCuadrados.removeAll(noCuadrados);
        datos.removeAll(sicuadrados);
        noCuadrados.addAll(datos);

        //arreglado

    }

    //EJERCICIO 3
    public static <T> Collection<Set<T>> divideInSets(Iterator<T> it) {
        List<Set<T>> result = new ArrayList<>();

        // Procesar cada elemento del iterador
        while (it.hasNext()) {
            T element = it.next();
            boolean added = false;

            // Intentar agregar el elemento al primer conjunto donde no cause duplicación
            for (Set<T> set : result) {
                if (!set.contains(element)) {
                    set.add(element);
                    added = true;
                    break;
                }
            }

            // Si no se pudo agregar a ningún conjunto existente, crear uno nuevo
            if (!added) {
                Set<T> newSet = new HashSet<>();
                newSet.add(element);
                result.add(newSet);
            }
        }

        return result;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
