/*
Autor: Fabio Augusto Amaro Jaime

Data de criação: 27/09/2018

Objetivo: fazer o calculo da area de uma casa e o valor de seus materiais.

Baseado em: Baseado no curso  Programação de Computadores da  Univesp
Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman
https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi
*/

class Projeto {
    static double area(double lateral, double cquarto, double raio) {
        return(AreaCasa.area(lateral, cquarto) + AreaPiscina.area(raio));
    }

    public static void main (String[] args) {
        AreaCasa casa1 = new AreaCasa(1500);
        AreaCasa casa2 = new AreaCasa(1270);

        System.out.println(casa1.valor(casa1.area(15,10)));
        System.out.println(casa2.valor(casa1.area(18,8)));
    }
}
