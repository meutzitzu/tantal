import java.io.FileWriter;
import java.io.IOException;
 
public class ChebyshevInline {
	
	static public double distance(double ax, double ay, double bx, double by)
	{
		return Math.sqrt((bx-ax)(bx-ax) + (by-ay)(by-ay));
	}
	
	public static void main(String[] args) throws IOException {
		FileWriter scriptTxt = new FileWriter("ok.scr");
		FileWriter scriptSvg = new FileWriter("path.svg");
		String E[] = new String[1000]; //storage for E points
		int i = 0; //point counter
		double 
		double al, xo, yo, xa, ya, xc, yc, a, b, c, d, e, ab;
		double Ox, Oy, Ax, Ay, Bx, By, Cx, Cy, Dx, Dy, Ex, Ey;
		double A, B, C, K, K1, delta;
		double xb1, yb1, xb2, yb2;
		double angAB, xe, ye, l, beta, u, uab, ubc;
		boolean sol2 = false;
		//
		a = distance(Ax,Ay,Bx,By);
		b = distance(Bx, By, Cx, Cy);
		c = distance(Cx, Cy, Dx, Dy);
		d = Cx-Ox;
		e = Cy-Oy;
		l = distance(Ax, Ay, Ex, Ey);
		beta = Math.atan2(Ey-Ay,Ex-Ax) - Math.atan2(By-Ay,Bx-Ax);
		 
		for (al = Math.Atan2(Ay-Oy, Ax-Ox) ; al <= 2. * Math.PI; al += 0.1) {
			//A point
			xa = a * Math.cos(al);
			ya = a * Math.sin(al);
			K = (b * b - c * c + d * d + e * e - a * a) / 2. / (d - xa);
			K1 = (e - ya) / (d - xa);
			A = 1. + K1 * K1;
			B = -2. * (K - d) * K1 - 2. * e;
			C = e * e - c * c + (K - d) * (K - d);
			delta = B * B - 4. * A * C;
			if (delta < 0.)
				continue;
			 
			//B points > xb1,yb1 is selected
			yb1 = (-B + Math.sqrt(delta)) / 2. / A;
			xb1 = K - K1 * yb1;
			yb2 = (-B - Math.sqrt(delta)) / 2. / A;
			xb2 = K - K1 * yb2;
			//E point
			angAB = Math.atan2(yb1 - ya, xb1 - xa);
			
			//if (Math.abs(angAB) > 0.01) {
			if (sol2) {
				xb1=xb2;
				yb1=yb2;
				angAB=Math.atan2(yb2-ya,xb2-xa);
			}
			xe = xa + l * Math.cos(beta + angAB);
			ye = ya + l * Math.sin(beta + angAB);
			 
			ab = Math.sqrt((xa - xb1) * (xa - xb1) + (ya - yb1) * (ya - yb1));
			//translate to the origin O(xo,yo)
			xa += xo;
			ya += yo;
			xb1 += xo;
			yb1 += yo;
			xc = d + xo;
			yc = e + yo;
			xe += xo;
			ye += yo;
			//xa+=xo;ya+=yo;xb2+=xo;yb2+=yo;xc=d+xo;yc=e+yo;xe+=xo;ye+=yo;
			 
			//store the E point trajectory
			E[i++] = String.format("L %-7.7g %-7.7g", xe, ye);
			 
			//draw position - create pline for AutoCAD
			System.out.printf("%-9.7g,%-9.7g %-9.7f,%-9.7f  %-9.7g,%-9.7g  %-9.7f,%-9.7f  >> (%-9.7f < %-9.7f) \n", xo, yo, xa, ya,
							  xb1, yb1, xc, yc, ab, Math.toDegrees(angAB));
			String out =
				String.format("pline\n%-7.7g,%-7.7g\n%-7.7f,%-7.7f\n%-7.7g,%-7.7g\n%-7.7f,%-7.7f\n%-7.7f,%-7.7f\n%-7.7f,%-7.7f\n\n",
							  xo, yo, xa, ya, xe, ye, xa, ya, xb1, yb1, xc, yc);
			//String out = String.format("pline\n%-7.7g,%-7.7g\n%-7.7g,%-7.7g\n%-7.7f,%-7.7f\n%-7.7f,%-7.7f\n\n",xo,yo,xa,ya,xb1,yb1,xc,yc);
			
			String outSVG =
				String.format("M 0 0 %-7.7g %-7.7gL %-7.7f %-7.7fL %-7.7g %-7.7gL %-7.7f %-7.7fL %-7.7f %-7.7fL %-7.7f %-7.7f;\n",
							  xo, yo, xa, ya, xe, ye, xa, ya, xb1, yb1, xc, yc);
			scriptSvg.write(outSVG);
		}
		 
		//draw the E trajectory
		scriptSvg.write("M 0 0 ");
		for (String s : E) {
			if (s == null)
				break;
			scriptSvg.write(s + " ");
		}
		//close the curve
		scriptSvg.close();
	}
}
