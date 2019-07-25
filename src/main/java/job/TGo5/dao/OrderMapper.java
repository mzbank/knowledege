package job.TGo5.dao;

import job.TGo5.pojo.TbOrder;

import java.util.List;

public interface OrderMapper {
    TbOrder SelectById(String id);
    TbOrder UpdateById(TbOrder tborder);
    boolean DeleteById(String orderId);
    void insertOrder(List<TbOrder> tborder);
}
