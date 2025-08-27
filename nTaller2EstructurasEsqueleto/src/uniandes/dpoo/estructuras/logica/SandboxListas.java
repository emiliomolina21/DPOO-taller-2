package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    public List<Integer> getCopiaEnteros( )
    {
        return new ArrayList<>(listaEnteros);
    }

    public List<String> getCopiaCadenas( )
    {
        return new LinkedList<>(listaCadenas);
    }

    public int[] getEnterosComoArreglo( )
    {
        int[] copia = new int[listaEnteros.size()];
        for (int i = 0; i < listaEnteros.size(); i++) {
            copia[i] = listaEnteros.get(i);
        }
        return copia;
    }

    public int getCantidadEnteros( )
    {
        return listaEnteros.size();
    }

    public int getCantidadCadenas( )
    {
        return listaCadenas.size();
    }

    public void agregarEntero( int entero )
    {
        listaEnteros.add(entero);
    }

    public void agregarCadena( String cadena )
    {
        listaCadenas.add(cadena);
    }

    public void eliminarEntero(int valor) {
        listaEnteros.removeIf(e -> e == valor);
    }

    public void eliminarCadena( String cadena )
    {
        listaCadenas.removeIf(s -> s.equals(cadena));
    }

    public void insertarEntero( int entero, int posicion )
    {
        if (posicion < 0)
        {
            listaEnteros.add(0, entero);
        }
        else if (posicion >= listaEnteros.size())
        {
            listaEnteros.add(entero);
        }
        else
        {
            listaEnteros.add(posicion, entero);
        }
    }

    public void eliminarEnteroPorPosicion( int posicion )
    {
        if (posicion >= 0 && posicion < listaEnteros.size())
        {
            listaEnteros.remove(posicion);
        }
    }

    public void reiniciarArregloEnteros( double[] valores )
    {
        listaEnteros.clear();
        for (double d : valores)
        {
            listaEnteros.add((int) d); 
        }
    }

    public void reiniciarArregloCadenas( List<Object> objetos )
    {
        listaCadenas.clear();
        for (Object o : objetos)
        {
            listaCadenas.add(o.toString());
        }
    }

    public void volverPositivos( )
    {
        for (int i = 0; i < listaEnteros.size(); i++)
        {
            int valor = listaEnteros.get(i);
            if (valor < 0)
            {
                listaEnteros.set(i, valor * -1);
            }
        }
    }

    public void organizarEnteros( )
    {
        listaEnteros.sort(Collections.reverseOrder());
    }

    public void organizarCadenas( )
    {
        Collections.sort(listaCadenas);
    }

    public int contarApariciones( int valor )
    {
        int contador = 0;
        for (int v : listaEnteros)
        {
            if (v == valor)
                contador++;
        }
        return contador;
    }

    public int contarApariciones( String cadena )
    {
        int contador = 0;
        for (String s : listaCadenas)
        {
            if (s.equalsIgnoreCase(cadena))
                contador++;
        }
        return contador;
    }

    public int contarRepetidos( )
    {
        HashSet<Integer> vistos = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();
        for (int v : listaEnteros)
        {
            if (!vistos.add(v))
            {
                repetidos.add(v);
            }
        }
        return repetidos.size();
    }
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        if (listaEnteros.size() != otroArreglo.length)
        {
            return false;
        }
        for (int i = 0; i < listaEnteros.size(); i++)
        {
            if (!listaEnteros.get(i).equals(otroArreglo[i]))
            {
                return false;
            }
        }
        return true;
    }

   
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        listaEnteros.clear();
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++)
        {
            int num = rand.nextInt(maximo - minimo + 1) + minimo; 
            listaEnteros.add(num);
        }
    }
}
