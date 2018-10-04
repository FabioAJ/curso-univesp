class AreaCasa {
  static double valorM2 = 1500.0;

  static void areaCasa(double lateral,double cquarto) {
            //Atencao Parametros = lateral e cquarto sem definicao
            //Variaveis
              double areaq;
              double areas;
              double areat;
            //Programacao
              System.out.println("Programa para calculo da area da casa");

              areas = lateral*lateral;
              System.out.println("A area da sala e "+areas);

              areaq= cquarto*(lateral/2);

              System.out.println("A area do quarto e "+areaq);

              System.out.println("A area do banheiro e "+areaq);

              areat = areas+2*areaq;

              System.out.println("A area total e "+areat);
            }
//Metodos de MATH, PI
//raio sem parametro!
  static double areaPiscina(double raio){
   return Math.PI*Math.pow(raio,2);
 }

  static double valor(double area){
    valorM2 = 5;
    return(valorM2*area);
  }


public static void main(String[] args) {

double areap;
//Parametros de Area casa definidos!
areaCasa(11.4,7.2);
//Parametro de raio!
areap = areaPiscina(2.0);
System.out.println("A area da piscina e " + areap);

 }
}
