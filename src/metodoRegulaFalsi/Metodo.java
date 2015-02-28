package metodoRegulaFalsi;

public class Metodo {
	public double raiz (Function f, double x0, double x1, int i, double error){
		double ret = Double.NaN;
		double x = x0;
		int j = 0;
		
		while (Math.abs(f.eval(x)) > error && j < i){
			//Formula
			x = (x0 * f.eval(x1) - x1 * f.eval(x0)) / (f.eval(x1) - f.eval(x0));
			if (f.eval(x0) * f.eval(x1) < 0)
				x1 = x;
			else
				x0 = x;
			j++;
		}
		System.out.println(j);
		if(j < i) ret = x;
		return ret;
	}
	
}
