class Projeto {

	Residencia[] condominio;
	int ultimo = - 1; //último alocado

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

		Projeto proj = new Projeto(3);

		AreaCasa c = new AreaCasa(10, 5);
		AreaPiscina p = new AreaPiscina(5);
		Residencia r = new Residencia(c, p);
		proj.adiconaRes(r);

		c = new AreaCasa(12, 7);
		p = new AreaPiscina(6);
		r = new Residencia(c, p);
		proj.adiconaRes(r);


		c = new AreaCasa(10, 6);
		p = new AreaPiscina(3.5);
		r = new Residencia(c, p);
		proj.adiconaRes(r);

		for (Residencia re : proj.condominio) {
			System.out.println("Endereço do objeto: " + re);
		}

		System.out.println(proj.condominio[1].casa.area());
	}
}
