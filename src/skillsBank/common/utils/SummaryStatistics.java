package skillsBank.common.utils;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatistics {
	private static List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
	private static List<Integer> intList2 = Arrays.asList(110, 120, 130, 140, 150, 160);
	private static List<Double> doubleList = Arrays.asList(10.10, 20.5, 30.10, 40.20, 55.25, 60.20);

	public static void main(String args[]) {

		getIntSummary(intList).combine(getIntSummary(intList2));

		getDoubleSummary(doubleList);
	}

	public static IntSummaryStatistics getIntSummary(List<Integer> list) {
		IntSummaryStatistics summary = new IntSummaryStatistics();
		list.forEach(p -> summary.accept(p));

		System.out.println("\nIntSummaryStatistics:");
		System.out.println("Count:  " + summary.getCount());
		System.out.println("Average: " + summary.getAverage());
		System.out.println("Sum: " + summary.getSum());
		System.out.println("Maximum: " + summary.getMax());
		System.out.println("Minimum: " + summary.getMin());
		System.out.println("String representation: " + summary.toString());

		return summary;
	}

	public static DoubleSummaryStatistics getDoubleSummary(List<Double> doubleList) {
		DoubleSummaryStatistics summary = new DoubleSummaryStatistics();
		doubleList.forEach(p -> summary.accept(p));

		System.out.println("\nDoubleSummaryStatistics:");
		System.out.println("Count:  " + summary.getCount());
		System.out.println("Average: " + summary.getAverage());
		System.out.println("Sum: " + summary.getSum());
		System.out.println("Maximum: " + summary.getMax());
		System.out.println("Minimum: " + summary.getMin());
		System.out.println("String representation: " + summary.toString());

		return summary;
	}
}
