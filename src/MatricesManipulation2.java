import java.util.Scanner;


public class MatricesManipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = getInput.nextInt();
		System.out.print("Enter number of columns: ");
		int column = getInput.nextInt();
		
		int[][] m1 = new int[row][column];
		int[][] m2 = new int[row][column];
		
		System.out.println("Enter values of Matrix 1 =>");
		for (int i = 0; i < m1.length; i++) {
			System.out.println("** Row " + (i+1) + ":");
			System.out.println("---------------------");
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print("Element of Column " + (j+1) + ": ");
				m1[i][j] = getInput.nextInt();
			}
		}
		
		System.out.println("******************");
		System.out.println("Enter values of Matrix 2 =>");
		for (int i = 0; i < m2.length; i++) {
			System.out.println("** Row " + (i+1) + ":");
			System.out.println("---------------------");
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print("Element of Column " + (j+1) + ": ");
				m2[i][j] = getInput.nextInt();
			}
		}
		getInput.close();
		
		System.out.println("******************");
		System.out.println("====Matrix 1====");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		System.out.println("====Matrix 2====");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		System.out.println("==== M1 + M2 ====");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + m2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		System.out.println("==== M1 - M2 ====");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] - m2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		System.out.println("==== M1 * M2 ====");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] * m2[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		System.out.println("==== M1 transpose ====");
		for (int i = 0; i < m1[i].length; i++) {
			for (int j = 0; j < m1.length; j++) {
				System.out.print(m1[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		System.out.println("==== M2 transpose ====");
		for (int i = 0; i < m2[i].length; i++) {
			for (int j = 0; j < m2.length; j++) {
				System.out.print(m2[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("******************");
		

	}

}
