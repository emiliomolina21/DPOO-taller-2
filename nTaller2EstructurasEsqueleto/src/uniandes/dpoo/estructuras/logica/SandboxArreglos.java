package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

import java.util.Arrays;

import java.util.Map;

import java.util.List;

import java.util.ArrayList;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public void arregloEntero(int numero) { 
        int[] nuevo = new int[arregloEnteros.length + 1];
        for (int i = 0; i < arregloEnteros.length; i++) {
            nuevo[i] = arregloEnteros[i];
        }
        nuevo[nuevo.length - 1] = numero;
        arregloEnteros = nuevo;
    }

    public void arregloCadena(String texto) { 
        String[] nuevo = new String[arregloCadenas.length + 1];
        for (int i = 0; i < arregloCadenas.length; i++) {
            nuevo[i] = arregloCadenas[i];
        }
        nuevo[nuevo.length - 1] = texto;
        arregloCadenas = nuevo;
    }

    public void imprimirArreglos() {  
        System.out.print("Enteros: ");
        for (int i = 0; i < arregloEnteros.length; i++) {
            System.out.print(arregloEnteros[i] + " ");
        }
        System.out.println();

        System.out.print("Cadenas: ");
        for (int i = 0; i < arregloCadenas.length; i++) {
            System.out.print(arregloCadenas[i] + " ");
        }
        System.out.println();
    }
    public int[] getCopiaEnteros() {
        int[] copia = new int[arregloEnteros.length];
        for (int i = 0; i < arregloEnteros.length; i++) {
            copia[i] = arregloEnteros[i];
        }
        return copia;
    }

    public String[] getCopiaCadenas() {
        String[] copia = new String[arregloCadenas.length];
        for (int i = 0; i < arregloCadenas.length; i++) {
            copia[i] = arregloCadenas[i];
        }
        return copia;
    }

    public int getCantidadEnteros() {
        return arregloEnteros.length;
    }

    public int getCantidadCadenas() {
        return arregloCadenas.length;
    }

    public void agregarEntero(int entero) {
        int[] nuevo = new int[arregloEnteros.length + 1];
        for (int i = 0; i < arregloEnteros.length; i++) {
            nuevo[i] = arregloEnteros[i];
        }
        nuevo[arregloEnteros.length] = entero;
        arregloEnteros = nuevo;
    }

    public void agregarCadena(String cadena) {
        String[] nuevo = new String[arregloCadenas.length + 1];
        for (int i = 0; i < arregloCadenas.length; i++) {
            nuevo[i] = arregloCadenas[i];
        }
        nuevo[arregloCadenas.length] = cadena;
        arregloCadenas = nuevo;
    }

    public void eliminarEntero(int valor) {
        int contador = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != valor) {
                contador++;
            }
        }

        int[] nuevo = new int[contador];
        int index = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != valor) {
                nuevo[index] = arregloEnteros[i];
                index++;
            }
        }
        arregloEnteros = nuevo;
    }
    public void eliminarCadena(String cadena) {
        int contador = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (!arregloCadenas[i].equals(cadena)) {
                contador++;
            }
        }

        String[] nuevo = new String[contador];
        int index = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (!arregloCadenas[i].equals(cadena)) {
                nuevo[index] = arregloCadenas[i];
                index++;
            }
        }
        arregloCadenas = nuevo;
    }

    public void insertarEntero(int entero, int posicion) {
        if (posicion < 0) {
            posicion = 0;
        }
        if (posicion > arregloEnteros.length) {
            posicion = arregloEnteros.length;
        }

        int[] nuevo = new int[arregloEnteros.length + 1];
        for (int i = 0, j = 0; i < nuevo.length; i++) {
            if (i == posicion) {
                nuevo[i] = entero;
            } else {
                nuevo[i] = arregloEnteros[j];
                j++;
            }
        }
        arregloEnteros = nuevo;
    }

    public void eliminarEnteroPorPosicion(int posicion) {
        if (posicion < 0 || posicion >= arregloEnteros.length) {
            return; 
        }

        int[] nuevo = new int[arregloEnteros.length - 1];
        for (int i = 0, j = 0; i < arregloEnteros.length; i++) {
            if (i != posicion) {
                nuevo[j] = arregloEnteros[i];
                j++;
            }
        }
        arregloEnteros = nuevo;
    }

    public void reiniciarArregloEnteros(double[] valores) {
        int[] nuevo = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            nuevo[i] = (int) valores[i];
        }
        arregloEnteros = nuevo;
    }

    public void reiniciarArregloCadenas(Object[] objetos) {
        String[] nuevo = new String[objetos.length];
        for (int i = 0; i < objetos.length; i++) {
            nuevo[i] = objetos[i].toString();
        }
        arregloCadenas = nuevo;
    }

    public void volverPositivos( )
    {
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < 0) {
            	arregloEnteros[i] = -arregloEnteros[i];
            }
        }
    }
    public void organizarEnteros( )
    {
        Arrays.sort(arregloEnteros); 
    }

    public void organizarCadenas( )
    {
        Arrays.sort(arregloCadenas, String.CASE_INSENSITIVE_ORDER);
    }

    public int contarApariciones( int valor )
    {
        int contador = 0;
        for (int num : arregloEnteros) {
            if (num == valor) {
                contador++;
            }
        }
        return contador; 
    }

    public int contarApariciones( String cadena )
    {
        int contador = 0; 
        for (String str : arregloCadenas) {
            if (str != null && str.equalsIgnoreCase(cadena)) {
                contador++;
            }
        }
        return contador; 
    }

    public int[] buscarEntero( int valor )
    {
        List<Integer> posiciones = new ArrayList<>(); 
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                posiciones.add(i);
            }
        }
        int[] resultado = new int[posiciones.size()];
        for (int i = 0; i < posiciones.size(); i++) {
            resultado[i] = posiciones.get(i);
        }
        return resultado; 
    }

    public int[] calcularRangoEnteros( )
    {
        if (arregloEnteros.length == 0) {
            return new int[0];
        }
        int min = arregloEnteros[0];
        int max = arregloEnteros[0];
        for (int num : arregloEnteros) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max}; 
    }

    public Map<Integer, Integer> calcularHistogramaEnteros( )
    {
        Map<Integer, Integer> histograma = new HashMap<>(); 
        for (int num : arregloEnteros) {
            histograma.put(num, histograma.getOrDefault(num, 0) + 1);
        }
        return histograma; 
    }

    public int contarEnterosRepetidos()
    {
        int repetidos = 0;
        Map<Integer, Integer> frecuencias = new HashMap<>();
        for (int i = 0; i < arregloEnteros.length; i++) {
            int valor = arregloEnteros[i];
            frecuencias.put(valor, frecuencias.getOrDefault(valor, 0) + 1);
        }

        for (int frecuencia : frecuencias.values()) {
            if (frecuencia > 1) {
                repetidos += (frecuencia - 1); 
            }
        }
        return repetidos;
    }

    public boolean compararArregloEnteros(int[] otroArreglo)
    {
        if (otroArreglo == null || arregloEnteros.length != otroArreglo.length) {
            return false;
        }

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != otroArreglo[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean mismosEnteros(int[] otroArreglo)
    {
        if (otroArreglo == null || arregloEnteros.length != otroArreglo.length) {
            return false;
        }

        int[] copia1 = Arrays.copyOf(arregloEnteros, arregloEnteros.length);
        int[] copia2 = Arrays.copyOf(otroArreglo, otroArreglo.length);

        Arrays.sort(copia1);
        Arrays.sort(copia2);

        return Arrays.equals(copia1, copia2);
    }

    public void generarEnteros(int cantidad, int minimo, int maximo)
    {
        arregloEnteros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
  
            arregloEnteros[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        }
        
           }}

