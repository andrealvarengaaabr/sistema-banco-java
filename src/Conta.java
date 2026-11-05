/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author André P. Alvarenga
 */
      public class Conta {
            private int numero;
     private String titular;
         private double saldo;
     public Conta(int numero, String titular) {
            this.numero = numero;
             this.titular = titular;
        this.saldo = 0.0; 
      }
       public int getNumero() {
        return numero;
     }
           public String getTitular() {
        return titular;
      }
        public double getSaldo() {
         return saldo;
    }
        public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
          } else {
            System.out.println("Valor e invalido");
        }
          }
        public boolean sacar(double valor) {
            if (valor > 0 && valor <= this.saldo) {
              this.saldo -= valor;
              return true;
        } else {
               System.out.println("Saldo e insuficiente");
            return false;
           }
            }
          public void exibirSaldo() {
        System.out.println("Conta " + this.numero + " - " + this.titular + " | Saldo: R$ " + this.saldo);
    }
             }