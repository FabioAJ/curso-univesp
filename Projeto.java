class Projeto {

	Residencia[] condominio;
	int ultimo = - 1; //último alocado

	static int buscaBin(int[] arr, int el) {
		int fim = arr.length - 1;
		int ini = 0;
		while (ini <= fim) {
			int meio = (fim + ini) / 2;
			if (arr[meio] < el) ini = meio + 1;
			else if (arr[meio] > el) fim = meio - 1;
			else return (meio);
		}
		return (-1);
	}


	int buscaPiscSeq(double raio) {
	for (int i = 0; i < this.condominio.length; i++)
		if (this.condominio[i].piscina.raio == raio)
			return (i);
		return (-1);
	}

	static double area(AreaCasa casa, AreaPiscina piscina){
		return(casa.area() + piscina.area());
	}

	boolean adiconaRes(Residencia r) {
		if (this.ultimo < this.condominio.length - 1) {
			ultimo++;
			this.condominio[ultimo] = r;
			return (true);
		}
		return (false);
	}

	Projeto(int tam) {
		condominio = new Residencia[tam];
	}

	public static void main(String[] args) {
		int [] v = {-78,-4,0,32,52,55,63,69,125,200};

		Projeto pr = new Projeto(5);

		for (int i = 0; i < pr.condominio.length; i++) {
			AreaCasa c = new AreaCasa();
			AreaPiscina p = new AreaPiscina(i + 2);
			Residencia r = new Residencia(c, p);
			pr.adiconaRes(r);
		}

		System.out.println(pr.buscaPiscSeq(3));
		System.out.println(pr.buscaPiscSeq(15));

		//Busca Sequencial Ordenada
		System.out.println(buscaBin(v, 63));
		System.out.println(buscaBin(v, 68));
	}
}
