class areaCasa {
   static void areaCasa(float lateral,float cquarto) {
//Variaveis
  float areaq;
  float areas;
  float areat;
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
  static double areaPiscina(double raio){
   return Math.PI*
      Math.pow(raio,2);
}

 public static void main(String[] args) {

 double areap;
 areaCasa(11,	7);
 areap = areaPiscina(2);
 System.out.println("areaDaPiscina" + areap);
  }
}
