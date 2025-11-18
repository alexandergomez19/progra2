package model;

public class Cuenta {
    private Cliente cliente;
    private boolean tieneTarjeta;
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    public Cuenta(){

    }
    public Cuenta( Cliente cliente, boolean tieneTarjeta, int numeroCuenta, String tipoCuenta, double saldo){
        this.cliente = cliente;
        this.numeroCuenta= numeroCuenta;
        this.saldo = saldo;
        this.tieneTarjeta = tieneTarjeta;
        this.saldo = saldo;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public boolean getTtarjeta(){
        return this.tieneTarjeta;
    }
    public int getNumCuenta(){
        return this.numeroCuenta;
    }
    public String getTipocuenta(){
        return this.tipoCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setTieneTarjeta(boolean tieneTarjeta) {
        this.tieneTarjeta = tieneTarjeta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
