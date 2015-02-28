package metodoRegulaFalsi;

public class test {
	public static void main(String[] args){
		Function f = new Function() {
			
			@Override
			public double eval(double x) {
				//return (2 * x * x - 1) * x - 2;
<<<<<<< HEAD
				return (2 * x * x * x) + x - 1;
				//return Math.sin(x) * x;
				//Otra
				//return ( Math.cos(x) ) - (4/5);
			}
		};
		Metodo m = new Metodo();
		double raiz = m.raiz(f, 0, 1, 30, 1e-5);
=======
				//return Math.sin(x) * x;
				//Otra
				return ( Math.cos(x) ) - (4/5);
			}
		};
		Metodo m = new Metodo();
		double raiz = m.raiz(f, 1, 4, 100, 1e-6);
>>>>>>> c80b2453032285253b7b52ddb5aa0008d6b4e953
		
		System.out.println("La raiz es: " + raiz);
	}
}
