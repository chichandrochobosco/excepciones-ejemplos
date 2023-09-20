/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesloboscoejemplo;

/**
 *
 * @author Licha
 */
public class ValorNoValido extends Exception{
public ValorNoValido(){ }
public ValorNoValido(String cadena){
super(cadena); //Llama al constructor de Exception y le pasa el contenido de cadena
}
}
