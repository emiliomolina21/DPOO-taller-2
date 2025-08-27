package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    private Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    public List<String> getValoresComoLista( )
    {
        List<String> lista = new ArrayList<>(mapaCadenas.values());
        Collections.sort(lista);
        return lista;
    }

    public List<String> getLlavesComoListaInvertida( )
    {
        List<String> lista = new ArrayList<>(mapaCadenas.keySet());
        lista.sort(Collections.reverseOrder()); 
        return lista;
    }

    public String getPrimera( )
    {
        if(mapaCadenas.isEmpty())
            return null;
        return Collections.min(mapaCadenas.keySet());
    }

    public String getUltima( )
    {
        if(mapaCadenas.isEmpty())
            return null;
        return Collections.max(mapaCadenas.values());
    }

    public Collection<String> getLlaves( )
    {
        List<String> mayus = new ArrayList<>();
        for(String llave : mapaCadenas.keySet())
        {
            mayus.add(llave.toUpperCase());
        }
        return mayus;
    }

    public int getCantidadCadenasDiferentes( )
    {
        Set<String> diferentes = new HashSet<>(mapaCadenas.values());
        return diferentes.size();
    }

    public void agregarCadena( String cadena )
    {
        String llaveInvertida = new StringBuilder(cadena).reverse().toString();
        mapaCadenas.put(llaveInvertida, cadena);
    }

    public void eliminarCadenaConLLave( String llave )
    {
        mapaCadenas.remove(llave);
    }

    public void eliminarCadenaConValor( String valor )
    {
        String llaveAEliminar = null;
        for(Map.Entry<String, String> entry : mapaCadenas.entrySet())
        {
            if(entry.getValue().equals(valor))
            {
                llaveAEliminar = entry.getKey();
                break;
            }
        }
        if(llaveAEliminar != null)
            mapaCadenas.remove(llaveAEliminar);
    }

    public void reiniciarMapaCadenas( List<Object> objetos )
    {
        mapaCadenas.clear();
        for(Object obj : objetos)
        {
            String valor = obj.toString();
            String llave = new StringBuilder(valor).reverse().toString();
            mapaCadenas.put(llave, valor);
        }
    }

    public void volverMayusculas( )
    {
        Map<String, String> nuevoMapa = new HashMap<>();
        for(Map.Entry<String, String> entry : mapaCadenas.entrySet())
        {
            nuevoMapa.put(entry.getKey().toUpperCase(), entry.getValue());
        }
        mapaCadenas = nuevoMapa;
    }

    public boolean compararValores( String[] otroArreglo )
    {
        for(String string : otroArreglo)
        {
            if(!mapaCadenas.containsValue(string))
                return false;
        }
        return true;
    }
}
