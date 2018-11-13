/*
Autor: Fabio Augusto Amaro Jaime

Data de criação: 27/09/2018

Objetivo: fazer o calculo da area de uma casa e o valor de seus materiais.

Baseado em: Baseado no curso  Programação de Computadores da  Univesp
Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman
https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi
*/


class AreaCasa {
    static double[] preco = {1500, 1100, 750, 500}; // precos dos materiais

    static final int alvenaria = 0;// Material alvenaria
    static final int vinil = 1; //Material vinil
    static final int fibra = 2; //Material fibra
    static final int plastico = 3; //Material plastico

    static char[][] nomes = {{'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'},
    {'V', 'i', 'n', 'i', 'l'},
    {'F', 'i', 'b', 'r', 'a'},
    {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}};

    static double valorM2 = 1500.0;

    static void areaCasa(double lateral,double cquarto) {

        double areaq;
        double areas;
        double areat;

        if (!(lateral >= 0 && cquarto >= 0))
        System.out.println("Erro: Parametro >= 0");
        else {
            System.out.println("Programa para calculo da area da casa");
            areas = lateral * lateral;
            System.out.println("A area da sala e "+areas);
            areaq= cquarto * (lateral/2);
            System.out.println("A area do quarto e "+areaq);
            System.out.println("A area do banheiro e "+areaq);
            areat = areas + 2 * areaq;
            System.out.println("A area total e "+areat);
        }
    }

    static double valor(double area) {
        if (area >= 0)
        return(valorM2 * area);
        return(-1);
    }

    static double valorPiscina(double area, int material) {
        if (material < alvenaria || material > plastico || area < 0) return (-1);
        return(area * preco[material]);
    }
    static double media (double[] arranjo) {
        double resp = 0;
        for (double valor : arranjo) {
            resp += valor;
        }
        return (resp/arranjo.length);
    }

    //verifica se é minuscula
    static boolean minuscula(char c) {
        return(c >= 'a' && c <= 'z');
    }

    public static void carregaVal(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 50; j <= 200; j += 50) {
                m[i][j / 50 - 1] = valorPiscina(j, i);
            }
        }
    }

    public static void main(String[] args) {

        double[][] valores = new double [4][4];

        carregaVal(valores);

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++)
                System.out.println(valores[i][j] + " ");
            System.out.println();
        }

        for (double[] linha : valores) {
            for (double valor : linha)
                System.out.println(valor+" ");
            System.out.println();
        }
        System.out.println("Piscina de ");
        System.out.println(nomes[2]);
        System.out.println(": "+ valorPiscina(100,fibra));
        //Usando a media dos precos
        System.out.println(media(preco));
    }
}
// System.out.println("Area\tMaterial\tValor");
// for (double area = 50; area <= 200; area = area + 50) {
//     for (int tipo = alvenaria; tipo <= plastico; tipo = tipo + 1) {
//         System.out.println(area + "\t" + tipo + "\t\t" + valorPiscina(area,tipo));
//     }
// } Usado no Main

//Aumentando e usando tabela ASCII
// char c = 'o';
// char x = '\u00F6';
// int y = 246;

// System.out.println(c);
// System.out.println(x);
// System.out.println((char)y);

//Percorre a tabela Ascii
// for (int i = 32; i <= 126; i++) {
//     System.out.println(i+" : "+(char)i);
// }
