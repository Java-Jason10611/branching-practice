package day8demo;

public class averageOfASet {



	public static void main(String[] args) {
		double[] nums = { 12, 14.89, 16.5, 20, 13.7 };
		double total = 0;

		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];

		}
		double average = total / nums.length;
		System.out.format("The average is: %.3f", average);
	}

}