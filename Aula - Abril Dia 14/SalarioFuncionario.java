import java.util.Scanner;

public class SalarioFuncionario {
    double salarioBruto;
    int dependentes;
    int planoSaude;
    boolean valeTrans;
    boolean valeAli;
    boolean valeRef;

    // Construtor para criar o objeto que representa o funcionário e seus dados
    public SalarioFuncionario(double salarioBruto,
                              int dependentes,
                              int planoSaude,
                              boolean valeTrans,
                              boolean valeAli,
                              boolean valeRef) {
        this.salarioBruto = salarioBruto;
        this.dependentes = dependentes;
        this.planoSaude = planoSaude;
        this.valeTrans = valeTrans;
        this.valeAli = valeAli;
        this.valeRef = valeRef;
    }

    // Metodo que retorna o valor calculado do INSS
    public double calcInss() {
        double inss;

        if (salarioBruto < 1302.01) {
            inss = (salarioBruto * 8) / 100;
        } else if (salarioBruto < 2571.01) {
            inss = (salarioBruto * 9) / 100;
        } else if (salarioBruto < 3856.01) {
            inss = (salarioBruto * 11) / 100;
        } else {
            inss = (salarioBruto * 14) / 100;
        }
        return inss;
    }

    // Metodo que retorna o valor calculado do IR
    public double calcIr() {
        double ir;

        // Calcula quanto de dedução terá se houver dependentes
        salarioBruto = salarioBruto - (189.59 * dependentes);

        if (salarioBruto < 1903.99) {
            return 0;
        } else if (salarioBruto < 2826.66) {
            ir = (salarioBruto * 7.5) / 100;
        } else if (salarioBruto < 3751.06) {
            ir = (salarioBruto * 15) / 100;
        } else if (salarioBruto < 4664.68) {
            ir = (salarioBruto * 22.5) / 100;
        } else {
            ir = (salarioBruto * 27.5) / 100;
        }

        return ir;
    }

    // Metodo que retorna o salario liquido usando os métodos CalcIr e CalcInss
    public double salarioLiquido() {
        double salarioLiquido;

        salarioLiquido = salarioBruto - calcInss() - calcIr();

        if (valeTrans) {
            salarioLiquido = salarioLiquido - (salarioBruto * 6) / 100;
        }
        if (valeAli) {
            salarioLiquido = salarioLiquido - 200;
        }
        if (valeRef) {
            salarioLiquido = salarioLiquido - 250;
        }
        if (planoSaude == 1) {
            salarioLiquido = salarioLiquido - 150;
        } else if (planoSaude == 2) {
            salarioLiquido = salarioLiquido - 300;
        }

        return salarioLiquido;
    }

    // Metodo que retorna o percentual de desconto
    public double percentual(double salarioBruto, double salarioLiquido) {
        double desconto = salarioBruto - salarioLiquido;
        desconto = (desconto * 100) / salarioBruto;
        return desconto;
    }

    // Metodo para validação das perguntas de sim e não
    public boolean validacao(String resposta) {
        return resposta.equals("s") || resposta.equals("S");
    }

    // Metodo principal com a criação do objeto funcionario01 e entrada de dados
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SalarioFuncionario funcionario01 = new SalarioFuncionario(0, 0, 0, false, false, false);

        System.out.println("Digite o salário bruto:");
        funcionario01.salarioBruto = sc.nextDouble();

        System.out.println("Digite a quantidade de dependentes:");
        funcionario01.dependentes = sc.nextInt();

        // Validação caso o usuário digite algum número que não seja 0, 1 ou 2
        System.out.println("Plano de saúde básico digite 1 ou 2 para avançado, se não houver, digite 0:");
        funcionario01.planoSaude = sc.nextInt();
        if (funcionario01.planoSaude == 0) {
            System.out.println("Funcionário sem plano de saúde.");
        } else if (funcionario01.planoSaude != 1 && funcionario01.planoSaude != 2) {
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

        // Mostrando os resultados
        System.out.print("Total descontado: ");
        System.out.println("R$ " + String.format("%.2f", funcionario01.salarioBruto - funcionario01.salarioLiquido()));

        System.out.print("Salário líquido: ");
        System.out.println("R$ " + String.format("%.2f", funcionario01.salarioLiquido()));

        System.out.print("Percentual de desconto: ");
        System.out.println(String.format("%.2f" , funcionario01.percentual(funcionario01.salarioBruto, funcionario01.salarioLiquido())) + "%");

        sc.close();
    }
}