/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ana
 */
public class Actividad_01_UD3_ED 
{
    private static byte[] intermedio = new byte[1000];
    private static String nombreDelArchivo = "fichero.dat";
    private static FileInputStream flujoDeEntrada = null;
    private static BufferedInputStream buferDeEntrada = null;

    public static void inicializateFiles() throws FileNotFoundException
    {
        flujoDeEntrada = new FileInputStream(nombreDelArchivo);
        buferDeEntrada = new BufferedInputStream(flujoDeEntrada);
    }
    
    public static int mostrarTextoDeArchivo() throws IOException
    {
        int total = 0;
        int nRead = 0;
        while((nRead = flujoDeEntrada.read(intermedio)) != -1) 
        {
            System.out.println(new String(intermedio));
            total += nRead;
        }
        
        return total;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        try 
        {
            inicializateFiles();
            
            int total = mostrarTextoDeArchivo();           

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( buferDeEntrada != null && flujoDeEntrada != null )
                {
                    flujoDeEntrada.close();
                    buferDeEntrada.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }
    
}
