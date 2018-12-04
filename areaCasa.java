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

    double valorM2 = 1500;

    double lateral = 10;

    double cquarto = 10;

    AreaCasa() {}

    AreaCasa(double valorM2) {
        this.valorM2 = valorM2;
    }

    AreaCasa (double lateral, double cquarto) {
        this.lateral = lateral;
        this.cquarto = cquarto;
    }

    AreaCasa(double lateral, double cquarto, double valorM2) {
        this(lateral, cquarto);
        this.valorM2 = valorM2;
    }

    double area() {
        double areat = - 1;
        if (this.lateral >= 0 && this.cquarto >= 0) {
            areat = this.lateral * this.lateral;
            areat += this.cquarto * this.lateral;
        }
        return(areat);
    }

    double valor(double area) {
        if (area >= 0) return(this.valorM2 * area);
        return(-1);
    }

    /*static void areaCasaa(double lateral,double cquarto) {

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
    }*/

    public static void main(String[] args) {

    }
}
