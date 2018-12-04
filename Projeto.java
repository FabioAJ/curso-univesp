class Projeto {

    static double area(AreaCasa casa, AreaPiscina piscina) {
        return(casa.area() + piscina.area());
    }

    public static void main (String[] args) {
        AreaCasa casaPrinc1 = new AreaCasa(10.0, 5.0);//error
        AreaCasa casaPrinc2 = new AreaCasa(20.0, 5.0);//error
        AreaPiscina piscina1 = new AreaPiscina(10);

        System.out.println(area(casaPrinc1, piscina1));//error
    }
}
