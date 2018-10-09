class AreaCasa {

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

    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;

  static double valor(double area){
    if (area >= 0)
    return(valorM2*area);
    return(-1);
  }
//ESTRUTURA DE SWITCH
  static double valorPiscina(double area, int material) {
     switch (material) {
       case ALVENARIA: return(area * 1500);
       case VINIL: return(area * 1100);
       case FIBRA: return(area * 750);
       case PLASTICO: return(area * 500);
       default: return(-1);
     }
   }
//LAÇO e WHILE 
public static void main(String[] args) {
  double area = 50;
  int tipo = 0;

  System.out.println("Area\tMaterial\tValor");
    do {
      tipo = ALVENARIA;
      do {
        System.out.println(area+"\t"+tipo+"\t\t"+valorPiscina(area,tipo));
        tipo = tipo+1;
      } while (tipo <= PLASTICO);
      area = area+50;
      } while (area <= 200);
    }
  }

  /*public static void main(String[] args) {

  double areap;
  areaCasa(11 , 7);
  areap = areaPiscina(2);
  System.out.println("A area da piscina e " + areap);

  //Usando BOOL
  double preco;
  boolean valorOK = false;

  preco = valor(20);
  valorOK = (preco >= 0);

  if (valorOK) System.out.println("O valor da construcao e "+ preco);
  else System.out.println("Valor de area negativo");*/
