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

    static double valorM2 = 1500.0;

    AreaCasa() {
        this(1500.0);
    }

    AreaCasa(double valorM2) {
        this.valorM2 = valorM2;
    }

    static double area(double lateral, double cquarto) {
        double areat =- 1; // area total

        if (lateral >= 0 && cquarto >= 0) {
            areat = lateral * lateral;
            areat += cquarto * lateral;
        }
        return(areat);
    }

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

    public static void main(String[] args) {

    }
}
