package model.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageBank {

	public static final int WIDTH = 500;
	public static final int HEIGHT = 333;
	
	public static BufferedImage A;
	public static BufferedImage B;
	public static BufferedImage C;
	public static BufferedImage D;
	public static BufferedImage E;
	public static BufferedImage F;
	public static BufferedImage G;
	public static BufferedImage H;
	public static BufferedImage I;
	public static BufferedImage J;
	public static BufferedImage K;
	public static BufferedImage L;
	public static BufferedImage M;
	public static BufferedImage N;
	public static BufferedImage O;
	public static BufferedImage P;
	public static BufferedImage Q;
	public static BufferedImage R;
	public static BufferedImage S;
	public static BufferedImage T;
	public static BufferedImage U;
	public static BufferedImage V;
	public static BufferedImage W;
	public static BufferedImage X;
	public static BufferedImage Y;
	public static BufferedImage Z;

	static{
		A = readImage("model/image/A.JPG", WIDTH, HEIGHT);
		B = readImage("model/image/B.JPG", WIDTH, HEIGHT);
		C = readImage("model/image/C.JPG", WIDTH, HEIGHT);
		D = readImage("model/image/D.JPG", WIDTH, HEIGHT);
		E = readImage("model/image/E.JPG", WIDTH, HEIGHT);
		F = readImage("model/image/F.JPG", WIDTH, HEIGHT);
		G = readImage("model/image/G.JPG", WIDTH, HEIGHT);
		H = readImage("model/image/H.JPG", WIDTH, HEIGHT);
		I = readImage("model/image/I.JPG", WIDTH, HEIGHT);
		J = readImage("model/image/J.JPG", WIDTH, HEIGHT);
		K = readImage("model/image/K.JPG", WIDTH, HEIGHT);
		L = readImage("model/image/L.JPG", WIDTH, HEIGHT);
		M = readImage("model/image/M.JPG", WIDTH, HEIGHT);
		N = readImage("model/image/N.JPG", WIDTH, HEIGHT);
		O = readImage("model/image/O.JPG", WIDTH, HEIGHT);
		P = readImage("model/image/P.JPG", WIDTH, HEIGHT);
		Q = readImage("model/image/Q.JPG", WIDTH, HEIGHT);
		R = readImage("model/image/R.JPG", WIDTH, HEIGHT);
		S = readImage("model/image/S.JPG", WIDTH, HEIGHT);
		T = readImage("model/image/T.JPG", WIDTH, HEIGHT);
		U = readImage("model/image/U.JPG", WIDTH, HEIGHT);
		V = readImage("model/image/V.JPG", WIDTH, HEIGHT);
		W = readImage("model/image/W.JPG", WIDTH, HEIGHT);
		X = readImage("model/image/X.JPG", WIDTH, HEIGHT);
		Y = readImage("model/image/Y.JPG", WIDTH, HEIGHT);
		Z = readImage("model/image/Z.jpeg", WIDTH, HEIGHT);
	}

	public static BufferedImage readImage(String path, int width, int height){
		try{
			BufferedImage originalImage = ImageIO.read(new File(path));
			Image tmp = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2 = resizedImage.createGraphics();
			g2.drawImage(tmp, 0, 0, null);
			g2.dispose();
			return resizedImage;
		} catch(Exception e){
			System.out.println("Image file load error");
		}
		return null;
	}
}
