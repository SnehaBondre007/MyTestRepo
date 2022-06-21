package com.MockitoTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.trade.Region;
import com.trade.TradeService;

public class TradeServiceTest {

	//London : 121456903
	//Newyork : 12232140
	//Tokyo : 12345678
	TradeService tradeService;
	@Test
    public void getTradeRegionShouldBeTrue() {
		Region actual = tradeService.getTradeRegion(12345678);
	    Region expected= Region.TOKYO;
	    assertEquals(expected,actual);
	        
	    Region actual2 = tradeService.getTradeRegion(12232140);
	    Region expected2 = Region.NEWYORK;
	    assertEquals(expected2,actual2);
	    
	    Region actual3 = tradeService.getTradeRegion(121456903);
	    Region expected3 = Region.LONDON;
	    assertEquals(expected3,actual3);
	    
	    
     
	}
}
