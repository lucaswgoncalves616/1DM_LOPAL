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

    // Metodo que recebe o salário como parâmetro e retorna o valor do INSS calculado
    public double calcInss(double salarioBruto) {
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

    // Metodo que recebe o salário como parâmetro e retorna o valor do IR calculado
    public double calcIr(double salarioBruto) {
        double ir;

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

        // Calcula quanto de dedução terá se houver dependentes
        if (dependentes < 0) {
            return ir;
        } else {
            ir = ir + (189.59 * dependentes);
        }

        return ir;
    }

    // Metodo que recebe o salario bruto como parametro e retorna o salario liquido
    public double salarioLiquido(double salarioBruto) {
        double salarioLiquido;

        salarioLiquido = salarioBruto - calcInss(salarioBruto) - calcIr(salarioBruto);

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
        return (salarioLiquido * 100) / salarioBruto;
    }

    // Metodo principal com a criação do objeto funcionario01 e entrada de dados
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SalarioFuncionario funcionario01 = new SalarioFuncionario(0, 0, 0, false, false, false);

        System.out.println("Digite o salário bruto:");
        funcionario01.salarioBruto = sc.nextDouble();

        System.out.println("Digite a quantidade de dependentes:");
        funcionario01.dependentes = sc.nextInt();

        System.out.println("Plano de saúde básico digite 1 ou 2 para avançado, se não houver, digite 0:");
        funcionario01.planoSaude = sc.nextInt();
        if (funcionario01.planoSaude == 0) {
            System.out.println("Funcionário sem plano de saúde.");
        } else if (funcionario01.planoSaude != 1 && funcionario01.planoSaude != 2) {
            while (true) {
                System.out.println("Valor inválido, digite novamente:");
                funcionario01.planoSaude = sc.nextInt();
                if (funcionario01.planoSaude == 0 || funcionario01.planoSaude == 1 || funcionario01.planoSaude == 2){
                    break;
                }
            }
        }

        System.out.println("Funcionário possui vale transporte? (s/n)");
        if (sc.next().equals("s") || sc.next().equals("S")) {
            funcionario01.valeTrans = true;
        } else if (sc.next().equals("n") || sc.nextLine().equals("N")) {
            funcionario01.valeTrans = false;
        }

        System.out.println("Funcionário possui vale alimentação? (s/n)");
        if (sc.next().equals("s") || sc.next().equals("S")) {
            funcionario01.valeAli = true;
        } else if (sc.next().equals("n") || sc.nextLine().equals("N")) {
            funcionario01.valeAli = false;
        }

        System.out.println("Funcionário possui vale refeição? (s/n)");
        if (sc.next().equals("s") || sc.next().equals("S")) {
            funcionario01.valeRef = true;
        } else if (sc.next().equals("n") || sc.nextLine().equals("N")) {
            funcionario01.valeRef = false;
        }

        System.out.print("Salário líquido: ");
        System.out.println("R$ " + String.format("%.2f", funcionario01.salarioLiquido(funcionario01.salarioBruto)));
        System.out.print("Percentual de desconto: ");
        System.out.println(funcionario01.percentual(funcionario01.salarioBruto, funcionario01.salarioLiquido(funcionario01.salarioBruto)));
    }
}
