public class CasaRet {

    public static void main(String[] args) {
      //NAN
      double x = 0;
      double y = 0;
      System.Out.println(x/y);
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
      System.out.println("programa para calculo da area da casa");
      areas = lateral*lateral;
      System.out.println("A area da sala e "+areas);
      areaq = cquarto*(lateral/2);
      System.out.println("A area do quarto e "+areaq);
      System.out.println("A area do banheiro e "+areaq);
      areat = areas +2*areaq;
      System.out.println("A area taotal e " + areat);
    }

}
