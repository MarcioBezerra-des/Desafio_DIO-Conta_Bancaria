import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        if (numero == null || numero.trim().isEmpty()) {
            thorw new IllegalAccessException("O número da conta não pode ser nulo ou vazio.");
        }

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    

    }
}