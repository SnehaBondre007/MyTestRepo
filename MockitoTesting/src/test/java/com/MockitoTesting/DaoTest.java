package com.MockitoTesting;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.trade.LondonDao;
import com.trade.NewyorkDao;
import com.trade.Region;
import com.trade.RegionalDao;
import com.trade.RegionalDaoManager;
import com.trade.TokyoDao;

public class DaoTest {

	LondonDao londonDao = new LondonDao();
    NewyorkDao newyorkDao = new NewyorkDao();
    TokyoDao tokyoDao = new TokyoDao();
    
    RegionalDaoManager regionalDaoManager = new RegionalDaoManager();

	@Test
    public void regionalDaoManger() {
        DataSource dataSource = regionalDaoManager.getRegionalDao(Region.TOKYO).getDataSource();
        assertNotNull(dataSource);

         dataSource = regionalDaoManager.getRegionalDao(Region.LONDON).getDataSource();
        assertNotNull(dataSource);

        dataSource = regionalDaoManager.getRegionalDao(Region.NEWYORK).getDataSource();
        assertNotNull(dataSource);


    }


    
    
}
