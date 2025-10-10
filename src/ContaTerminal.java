public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número da conta não pode ser nulo ou vazio.");
        }
        if(agencia == null || agencia.trim().isEmpty()) {
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio.");
        }
        if(nomeCliente == null || nomeCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio.");
        }

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public  String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "ContaTerminal [Numero="+ numero + ", Agencia="+ agencia +", Nome do Cliente="+ nomeCliente +", Saldo="+ saldo + "]";
    }
}