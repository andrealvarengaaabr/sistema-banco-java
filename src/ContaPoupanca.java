/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author André P. Alvarenga
 */
    
     public class ContaPoupanca extends Conta implements FechamentoMensal {
      private double taxaJuros;
     public ContaPoupanca(int numero, String titular, double taxaJuros) {
         super(numero, titular);
        this.taxaJuros = taxaJuros;
    }

      public void aplicarJuros() {
        double juros = getSaldo() * taxaJuros;
         depositar(juros);
    
        System.out.println(String.format("Juros de R$ %.2f aplicados na conta %d.", juros, getNumero()));
    }

    @Override
    public void fecharMes() {

        aplicarJuros();
    }
}

