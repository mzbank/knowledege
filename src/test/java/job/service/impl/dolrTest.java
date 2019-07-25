package job.service.impl;

import job.JobApplication;
import job.TGo5.dao.OrderMapper;
import job.TGo5.pojo.TbOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JobApplication.class)
public class dolrTest {

    @Autowired
    private OrderMapper mapper;

//    private String orderId;
//    private String ownerId;
//    private int orderPrice;
//    private String createTime;
//    private String updateTime;
    @Test
    public void BatchInsert(){

        List<TbOrder> orders = new ArrayList<TbOrder>();
        orders.add(new TbOrder("334","234",324,new Date()+"",new Date()+""));
        orders.add(new TbOrder("44","254",565,new Date()+"",new Date()+""));
        orders.add(new TbOrder("4ew","2rw4",565,new Date()+"",new Date()+""));
        orders.add(new TbOrder("4sdw","sdf",565,new Date()+"",new Date()+""));

        mapper.insertOrder(orders);
    }
}
