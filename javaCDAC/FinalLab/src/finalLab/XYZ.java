package finalLab;

import java.util.Arrays;
import java.util.Scanner;

public class XYZ {
	
	private static final CollegeStudent[] CollegeStudent = null;
	private static final SchoolStudent[] SchoolStudent = null;

	public static void main(String[] args) {
		CollegeStudent[] stt = new CollegeStudent[3];
		
		stt[0] = new CollegeStudent(1, 70, 8);
		stt[1] = new CollegeStudent(3, 60, 7);
		stt[2] = new CollegeStudent(2,90,5);
		
		Arrays.sort(stt);
		System.out.println("sorting: " + Arrays.toString(stt));
		
		SchoolStudent[] spp = new SchoolStudent[2];
		spp[0] = new SchoolStudent(1, 70,"12th");
		spp[1] = new SchoolStudent(1, 70,"10th");
		
		Arrays.sort(spp);
		System.out.println("sorting: " + Arrays.toString(spp));
}

}

