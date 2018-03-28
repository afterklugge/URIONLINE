package Lab04;

import java.util.ArrayList;

public class Lab04Experiment {

	public static void main(String[] args) {
		final int N = 100000;
		ArrayList<Integer> list1 = new ArrayList<>();
		long beg1 = System.currentTimeMillis();

		for (int i = 0; i < N; ++i) {
			list1.add(i);
		}

		long end1 = System.currentTimeMillis();

		System.out.println("Standard list: " + (end1 - beg1));
	}

	ArrayListInt list2 = new ArrayListInt();

	long beg2 = System.currentTimeMillis();

	for(
	int i = 0;i<N;i++)
	{
		list2.add(i);
	}

	long end2 = System.currentTimeMillis();System.out.println("Our list: "+(end2-beg2));

}}