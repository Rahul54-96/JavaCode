package module2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the size of Array:-> ");

			String[] name = new String[s1.nextInt()];

			for (int i = 0; i < name.length; i++) {
				System.out.println("Please enter the value at index:-> " + i);
				name[i] = s1.next();
			}
			System.out.println(Arrays.toString(name));
			s1.close();
		} catch (NegativeArraySizeException a1) {
			System.out.println("Handled the exception 1");

		}

		catch (ArrayIndexOutOfBoundsException a2) {
			System.out.println("Handled the exception 2");

		} catch (InputMismatchException a3) {
			System.out.println("Handled the exception 3");

		} finally {
			System.out.println("I will execute alwsys");
		}
	}
}
