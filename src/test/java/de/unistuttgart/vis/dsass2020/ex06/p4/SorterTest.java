package de.unistuttgart.vis.dsass2020.ex06.p4;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

import de.unistuttgart.vis.dsass2020.ex06.p4.ISimpleList;
import de.unistuttgart.vis.dsass2020.ex06.p4.Sorter;

public class SorterTest {

	@Test
	public void test() {
		int size = 15;
		final ISimpleList<Integer> list = new SimpleList<>();
		for (int i = size - 1; i >= 0; i--)
			list.append(i);
		for (int i = 0; i < size; i++) {
			int randomIndex1 = new Random().nextInt(size);
			int randomIndex2 = new Random().nextInt(size);
			list.swap(randomIndex1, randomIndex2);
		}
		Sorter.heapSort(list);
		final ISimpleList<Integer> expectedList = new SimpleList<>();
		for (int i = 0; i < size; i++)
			expectedList.append(i);

		for (int i = 0; i < size; i++) {
			Logger.getGlobal().info(String.valueOf(list.get(i)));
			assertEquals(expectedList.get(i), list.get(i));
		}

	}

}





