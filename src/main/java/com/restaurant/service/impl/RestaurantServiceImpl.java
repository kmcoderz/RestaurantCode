package com.restaurant.service.impl;

import org.springframework.stereotype.Service;

import com.restaurant.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Override
	public Integer maxSatisfaction(Integer maxTime, Integer times[], Integer satisfactions[], Integer items) {
		Integer i, w;
		Integer foodDump[][] = new Integer[items + 1][maxTime + 1]; //Matrix to store computation records
		for (i = 0; i <= items; i++) {
			for (w = 0; w <= maxTime; w++) {
				if (i == 0 || w == 0)
					foodDump[i][w] = 0;
				else if (times[i - 1] <= w)
					foodDump[i][w] = Math.max(satisfactions[i - 1] + foodDump[i - 1][w - times[i - 1]], foodDump[i - 1][w]);
				else
					foodDump[i][w] = foodDump[i - 1][w];
			}
		}

		return foodDump[items][maxTime];
	}
	
}
