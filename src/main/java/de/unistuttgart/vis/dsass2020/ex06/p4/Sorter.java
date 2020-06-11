package de.unistuttgart.vis.dsass2020.ex06.p4;


public class Sorter {

	public static <T extends Comparable<T>> void heapSort(ISimpleList<T> list) {
		int count = list.size();
		// Heap aufbauen
		for(int i = count/2; i >= 0 ; i--) {
			percolate(list, i, count - 1);
		}
		// sort
		for(int i = count - 1; i > 0; i--){
			list.swap(i, 0);
			percolate(list, 0, i - 1);
		}	
	}

	static <T extends Comparable<T>> void percolate(ISimpleList<T> list, int index, int last) {
		while (index * 2 + 1 <= last) {
			int i = index * 2 + 1;
			if (i + 1 <= last && list.get(i).compareTo(list.get(i + 1)) < 0) {
				i++;
			}
			if (list.get(index).compareTo(list.get(i)) < 0) {
				list.swap(index, i);
				index = i;
			} else
				break;
			
		}

	}
}
