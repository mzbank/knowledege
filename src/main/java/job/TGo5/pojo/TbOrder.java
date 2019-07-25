package job.TGo5.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbOrder {

    private String orderId;
    private String ownerId;
    private int orderPrice;
    private String createTime;
    private String updateTime;

}
