package metodoRegulaFalsi;

public class Metodo {
	public double raiz (Function f, double x0, double x1, int i, double error){
		double ret = Double.NaN;
		double x = x0;
		int j = 0;
		
		while (Math.abs(f.eval(x)) > error && j < i){
			//Formula
			x = (x0 * f.eval(x1) - x1 * f.eval(x0)) / (f.eval(x1) - f.eval(x0));
<<<<<<< HEAD
			if (f.eval(x0) * f.eval(x1) < 0)
=======
			if (f.eval(x0) * f.eval(x) < 0)
>>>>>>> c80b2453032285253b7b52ddb5aa0008d6b4e953
				x1 = x;
			else
				x0 = x;
			j++;
		}
<<<<<<< HEAD
		System.out.println(j);
=======
>>>>>>> c80b2453032285253b7b52ddb5aa0008d6b4e953
		if(j < i) ret = x;
		return ret;
	}
	
}
