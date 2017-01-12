package com.restaurant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.restaurant.service.RestaurantService;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantCodeApplicationTests extends TestCase {

	@Test
	public void test1() {
		//Initialization
		Integer maxTime = 10000;
		Integer items = 100;
		Integer times[] = new Integer[items];
		Integer satisfactions[] = new Integer[items];
		Integer expectedResult = 2493893;
		
		Integer testData[][] = { { 16808, 250 }, { 50074, 659 }, { 8931, 273 }, { 27545, 879 }, { 77924, 710 },
				{ 64441, 166 }, { 84493, 43 }, { 7988, 504 }, { 82328, 730 }, { 78841, 613 }, { 44304, 170 },
				{ 17710, 158 }, { 29561, 934 }, { 93100, 279 }, { 51817, 336 }, { 99098, 827 }, { 13513, 268 },
				{ 23811, 634 }, { 80980, 150 }, { 36580, 822 }, { 11968, 673 }, { 1394, 337 }, { 25486, 746 },
				{ 25229, 92 }, { 40195, 358 }, { 35002, 154 }, { 16709, 945 }, { 15669, 491 }, { 88125, 197 },
				{ 9531, 904 }, { 27723, 667 }, { 28550, 25 }, { 97802, 854 }, { 40978, 409 }, { 8229, 934 },
				{ 60299, 982 }, { 28636, 14 }, { 23866, 815 }, { 39064, 537 }, { 39426, 670 }, { 24116, 95 },
				{ 75630, 502 }, { 46518, 196 }, { 30106, 405 }, { 19452, 299 }, { 82189, 124 }, { 99506, 883 },
				{ 6753, 567 }, { 36717, 338 }, { 54439, 145 }, { 51502, 898 }, { 83872, 829 }, { 11138, 359 },
				{ 53178, 398 }, { 22295, 905 }, { 21610, 232 }, { 59746, 176 }, { 53636, 299 }, { 98143, 400 },
				{ 27969, 413 }, { 261, 558 }, { 41595, 9 }, { 16396, 969 }, { 19114, 531 }, { 71007, 963 },
				{ 97943, 366 }, { 42083, 853 }, { 30768, 822 }, { 85696, 713 }, { 73672, 902 }, { 48591, 832 },
				{ 14739, 58 }, { 31617, 791 }, { 55641, 680 }, { 37336, 7 }, { 97973, 99 }, { 49096, 320 },
				{ 83455, 224 }, { 12290, 761 }, { 48906, 127 }, { 36124, 507 }, { 45814, 771 }, { 35239, 95 },
				{ 96221, 845 }, { 12367, 535 }, { 25227, 395 }, { 41364, 739 }, { 7845, 591 }, { 36551, 160 },
				{ 8624, 948 }, { 97386, 218 }, { 95273, 540 }, { 99248, 386 }, { 13497, 886 }, { 40624, 421 },
				{ 28145, 969 }, { 35736, 916 }, { 61626, 535 }, { 46043, 12 }, { 54680, 153 } };
		//Assigning values
		for (Integer i = 0; i < items; i++) {
			satisfactions[i] = testData[i][1];
			times[i] = testData[i][0];
		}
		assertEquals(restaurantService.maxSatisfaction(maxTime, times, satisfactions, items), expectedResult);
	}

	@Autowired
	RestaurantService restaurantService;

}
