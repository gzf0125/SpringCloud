package springcloud.Service;

import org.apache.ibatis.annotations.Param;
import springcloud.Entitys.Payment;

public interface PaymentService {
    //写操作
    public int create(Payment payment);
    //读操作
    public Payment getPaymentById(@Param("id") Long id);

}
