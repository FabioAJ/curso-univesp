public class CasaRet {
    public static void main(String[] args) {

      //Variaveis
      //área do quarto
      float areaq;
      //area da sala
      float areas;
      //area total
      float areat;
      //lateral e quarto
      float lateral = 10;
      float cquarto = 7;
      //float = numeros nao inteiros
      // raio da piscina
      double raio = 2;
      //area da piscina
      double areap;
      //valor do pi
      //
      //Programacao
      //
      System.out.println("programa para calculo da area da casa");
      areas = lateral*lateral;
      System.out.println("A area da sala é "+areas);
      areaq = cquarto*(lateral/2);
      System.out.println("A area do quarto é "+areaq);
      System.out.println("A area do banheiro é "+areaq);
      areat = areas +2*areaq;
      System.out.println("A area taotal é " + areat);
      areap = Math.PI * Math.pow(raio,2);
      System.out.println("Area: "+areap);
    }
}
