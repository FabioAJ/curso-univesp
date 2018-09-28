public class CasaRet {

    public static void main(String[] args) {
      //Variaveis
      //área do quarto
      int areaq;
      //area da sala
      int areas;
      //area total
      int areat;

      System.out.println("programa para calculo da area da casa");
      areas = 10*10;
      System.out.println("A area da sala é "+areas);
      areaq = 7*5;
      System.out.println("A area do quarto é "+areaq);
      System.out.println("A area do banheiro é "+areaq);
      areat = areas +2*areaq;
      System.out.println("A area total é " + areat);
    }

}
