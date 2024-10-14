package P110_CuentaBancaria;

public class cuentaBancaria {
 private double Saldo;

 public cuentaBancaria(double cantidad) {
  Saldo = cantidad;
 }
  
 public void depositar(double cantidad) {
 Saldo += cantidad;
 }

 public double getSaldo() {
 return Saldo;
 }

 public boolean retirar(double cantidad) {
 if( Saldo >= cantidad) {
 Saldo -= cantidad;
 return true;
 }
 else
  return false;
 }

@Override
public String toString() {
    return "cuentaBancaria [Saldo=" + Saldo + "]";
}

 
}