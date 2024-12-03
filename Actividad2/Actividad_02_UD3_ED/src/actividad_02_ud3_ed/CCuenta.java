/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Adrian
 */
public class CCuenta {

    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     * Inicializa una cuenta bancaria sin información específica.
     */
    public CCuenta () {
    }

    /**
     * Constructor de la clase CCuenta con parámetros para inicializar los valores de los atributos de la cuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta (String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Asigna un nombre al titular de la cuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo disponible en la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta. Si la cantidad es negativa, se lanza una excepción.
     * 
     * @param cantidad Monto de dinero a ingresar.
     * @throws Exception Si la cantidad es negativa, se lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta. Si la cantidad es negativa o si el saldo es insuficiente, se lanza una excepción.
     * 
     * @param cantidad Monto de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente, se lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * Obtiene el número de la cuenta bancaria.
     * 
     * @return El número de la cuenta bancaria.
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta bancaria.
     * 
     * @param cuenta El número de la cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo de la cuenta bancaria.
     * 
     * @param saldo El saldo de la cuenta bancaria.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta bancaria.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta bancaria.
     * 
     * @param tipoInterés El tipo de interés a establecer para la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
