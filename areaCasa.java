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

    static double valorM2 = 1500.0;

    static void areaCasa(double lateral,double cquarto) {

        double areaq;
        double areas;
        double areat;

    if (!(lateral >= 0 && cquarto >= 0))
      System.out.println("Erro: Parametro >= 0");
    else {
      System.out.println("Programa para calculo da area da casa");
      areas = lateral*lateral;
      System.out.println("A area da sala e "+areas);
      areaq= cquarto*(lateral/2);
      System.out.println("A area do quarto e "+areaq);
      System.out.println("A area do banheiro e "+areaq);
      areat = areas+2*areaq;
      System.out.println("A area total e "+areat);
    }
  }

  static double valor(double area) {
    if (area >= 0)
    return(valorM2*area);
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

    public static void main(String[] args) {

        System.out.println("Area\tMaterial\tValor");
        for (double area = 50; area <= 200; area = area + 50) {
            for (int tipo = alvenaria; tipo <= plastico; tipo = tipo + 1) {
                System.out.println(area + "\t" + tipo + "\t\t" + valorPiscina(area,tipo));
            }
        }
        System.out.println(media(preco));
    }

}
