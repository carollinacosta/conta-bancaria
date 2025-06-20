public class ContaBancaria {
    private double saldo = 0;
    private double limiteChequeEspecial;
    private double valorUtilizadoChequeEspecial;


    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500){
            limiteChequeEspecial = 50.0;
        }else if (depositoInicial > 500){
            limiteChequeEspecial = depositoInicial*0.5;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void depositarDinheiro(double valor) {
        System.out.println("Valor depositado: R$" + valor);

        if (valorUtilizadoChequeEspecial > 0) {
            double taxa = valorUtilizadoChequeEspecial * 0.2;
            double totalDivida = valorUtilizadoChequeEspecial + taxa;

            if (valor >= totalDivida) {
                valor -= totalDivida;
                valorUtilizadoChequeEspecial = 0;
                System.out.println("Dívida do cheque especial quitada com taxa de R$" + taxa);
            } else {
                double valorAbatido = valor;
                valorUtilizadoChequeEspecial -= valor;
                valor = 0;
                System.out.println("Parte da dívida do cheque especial foi paga: R$" + valorAbatido);
            }
        }

        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor restante depositado na conta: R$" + valor);
        }
    }

    public void sacarDinheiro(double valor) {
        if (valor <= saldo){
            saldo -= valor;
        }else{
            double totalDisponivel = saldo + (limiteChequeEspecial - valorUtilizadoChequeEspecial);
            if (valor <= totalDisponivel){
                double restante = valor - saldo;
                saldo = 0;
                valorUtilizadoChequeEspecial += restante;
                System.out.println("Saque usando o cheque especial: R$" + restante);
            }
        else {
                System.out.println("Saldo Conta + Cheque Especial insuficiente para saque.");
            }
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("Pagando o boleto de: R$" + valor);
        sacarDinheiro(valor);
    }

    public void verificarUsoChequeEspecial() {
       if (valorUtilizadoChequeEspecial > 0){
           System.out.println("Cheque Especial foi utilizado. O valor utilizado do limite foi: R$"
                   + valorUtilizadoChequeEspecial);
       }else {
           System.out.println("A conta NÃO está utilizando o cheque especial.");
       }

    }

    public void consultarChequeEspecial(){
        System.out.println("Limite de Cheque Especial: R$" + limiteChequeEspecial);
        System.out.println("Valor utilizado no Cheque Especial: R$" + valorUtilizadoChequeEspecial);
    }


}

