package metodoRegulaFalsi;

public class test {
	public static void main(String[] args){
		Function f = new Function() {
			
			@Override
			public double eval(double x) {
				//return (2 * x * x - 1) * x - 2;
				return (2 * x * x * x) + x - 1;
				//return Math.sin(x) * x;
				//Otra
				//return ( Math.cos(x) ) - (4/5);
			}
		};
		Metodo m = new Metodo();
		double raiz = m.raiz(f, 0, 1, 30, 1e-5);
		
		System.out.println("La raiz es: " + raiz);
	}
}
