import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstscan = new Scanner(System.in);
        System.out.println("Digite a largura do terreno:");
        int largura = Integer.parseInt(firstscan.nextLine());
        Scanner secondscan = new Scanner(System.in);
        System.out.println("Digite o comprimento do terreno");
        int comprimento = Integer.parseInt((firstscan.nextLine()));
        Scanner treescan = new Scanner(System.in);
        System.out.println("Digite o valor do metro quadrado");
        int metroquad = Integer.parseInt(firstscan.nextLine());
        calcarea(largura,comprimento,metroquad);

    }
    public static void calcarea(int largura, int comprimento, int metroquad){
        System.out.println(largura * comprimento);
        int area = largura * comprimento;
        System.out.println(metroquad * area);
    }
}
/**
         Exemplo 1:
         Digite a largura do terreno: 10.0
         Digite o comprimento do terreno: 30.0
         Digite o valor do metro quadrado: 200.00
         Area do terreno = 300.00
         Preco do terreno = 60000.00

 *
 */