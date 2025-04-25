import java.util.Scanner;

public class SalarioFuncionario {
    double salarioBruto;
    double salarioLiquido;
    double Ir;
    double Inss;
    int dependentes;
    int planoSaude;
    boolean valeTrans;
    boolean valeAli;
    boolean valeRef;

    // Construtor para criar o objeto que representa o funcionário e seus dados
    public SalarioFuncionario() {

    }

    // Metodo que retorna o valor calculado do INSS
    public void calcInss() {
        if (salarioBruto < 1302.01) {
            Inss = (salarioBruto * 0.08);
        } else if (salarioBruto < 2571.01) {
            Inss = (salarioBruto * 0.09);
        } else if (salarioBruto < 3856.01) {
            Inss = (salarioBruto * 0.11);
        } else {
            Inss = (salarioBruto * 0.14);
        }
    }

    // Metodo que retorna o valor calculado do IR
    public void calcIr() {
        // Calcula quanto de dedução terá se houver dependentes
        salarioBruto = salarioBruto - (189.59 * dependentes);

        if (salarioBruto < 1903.99) {
            Ir = 0;
        } else if (salarioBruto < 2826.66) {
            Ir = (salarioBruto * 0.075) - 169.44;
        } else if (salarioBruto < 3751.06) {
            Ir = (salarioBruto * 0.15) - 381.44;
        } else if (salarioBruto < 4664.68) {
            Ir = (salarioBruto * 0.225) - 662.77;
        } else {
            Ir = (salarioBruto * 0.275) - 896;
        }
    }

    // Metodo que retorna o salario liquido usando os métodos CalcIr e CalcInss
    public void salarioLiquido() {
        salarioLiquido = salarioBruto - Inss - Ir;

        if (valeTrans) {
            salarioLiquido = salarioLiquido - (salarioBruto * 6) / 100;
        }
        if (valeAli) {
            salarioLiquido -= 200;
        }
        if (valeRef) {
            salarioLiquido -= 250;
        }
        if (planoSaude == 1) {
            salarioLiquido -= 150;
        } else if (planoSaude == 2) {
            salarioLiquido -= 300;
        }
    }

    // Metodo que retorna o percentual de desconto
    public double percentual(double salarioBruto, double salarioLiquido) {
        double desconto = salarioBruto - salarioLiquido;
        desconto = (desconto * 100) / salarioBruto;
        return desconto;
    }

    // Metodo para validação das perguntas de sim e não
    public boolean validacao(String resposta) {
        return resposta.equals("s") || resposta.equals("S") || resposta.equals("sim") || resposta.equals("Sim");
    }

    // Metodo principal com a criação do objeto funcionario01 e entrada de dados
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SalarioFuncionario funcionario01 = new SalarioFuncionario();

        System.out.println("Digite o salário bruto:");
        funcionario01.salarioBruto = sc.nextDouble();

        System.out.println("Digite a quantidade de dependentes:");
        funcionario01.dependentes = sc.nextInt();

        // Validação caso o usuário digite algum número que não seja 0, 1 ou 2
        System.out.println("Plano de saúde básico digite 1 ou 2 para avançado, se não houver, digite 0:");
        funcionario01.planoSaude = sc.nextInt();
        if (funcionario01.planoSaude != 1 && funcionario01.planoSaude != 2 && funcionario01.planoSaude != 0) {
            do {
                System.out.println("Valor inválido, digite novamente:");
                funcionario01.planoSaude = sc.nextInt();
            } while (funcionario01.planoSaude != 0 && funcionario01.planoSaude != 1 && funcionario01.planoSaude != 2);
        }

        System.out.println("Funcionário possui vale transporte? (s/n)");
        String valeTrans = sc.next();
        funcionario01.valeTrans = funcionario01.validacao(valeTrans);

        System.out.println("Funcionário possui vale alimentação? (s/n)");
        String valeAli = sc.next();
        funcionario01.valeAli = funcionario01.validacao(valeAli);

        System.out.println("Funcionário possui vale refeição? (s/n)");
        String valeRef = sc.next();
        funcionario01.valeRef = funcionario01.validacao(valeRef);

        System.out.println("\n-----------------------------------------");

        funcionario01.calcInss();
        funcionario01.calcIr();
        funcionario01.salarioLiquido();

        // Mostrando os resultados

        System.out.println("\nIR: " + funcionario01.Ir);

        System.out.println("INSS: " + funcionario01.Inss);

        System.out.print("Percentual de desconto: ");
        System.out.println(String.format("%.2f" , funcionario01.percentual(funcionario01.salarioBruto, funcionario01.salarioLiquido)) + "%");

        System.out.print("\nTotal descontado: ");
        System.out.println("R$ " + String.format("%.2f", funcionario01.salarioBruto - funcionario01.salarioLiquido));

        System.out.print("Salário líquido: ");
        System.out.println("R$ " + String.format("%.2f", funcionario01.salarioLiquido));


        sc.close();
    }
}