package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int colorR = in.nextInt();
		int colorG = in.nextInt();
		int colorB = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		if (shapeType.equals("rectangle")) {
			StdDraw.setPenColor(colorR, colorG, colorB);
			if (filled == true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else  {
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}
		}
	}
}
