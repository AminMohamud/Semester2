package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		List<Integer> a;
		List<Integer> b;

		a = new ArrayList<>(list.subList(low, middle + 1));
		b = new ArrayList<>(list.subList(middle + 1, high + 1));

		int aIdx=0, bIdx=0;
		int cIdx = 0;

		while (aIdx < a.size() && bIdx < b.size()) {
			if (a.get(aIdx) < b.get(bIdx)) {
				result.add(cIdx, a.get(aIdx));
				cIdx++;
				aIdx++;
			} else {
				result.add(cIdx, b.get(bIdx));
				cIdx++;
				bIdx++;
			}
		}

		while (aIdx < a.size()) {
			result.add(cIdx, a.get(aIdx));
			cIdx++;
			aIdx++;
		}

		while (bIdx < b.size()) {
			result.add(cIdx, b.get(bIdx));
			cIdx++;
			bIdx++;
		}

		for (int i = 0; i < result.size(); i++) {
			list.set(low + i, result.get(i));
		}

		System.out.println(result);

	}


}
