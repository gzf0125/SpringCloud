package springcloud.Dao;

import org.apache.ibatis.annotations.Mapper;
import springcloud.Entitys.Payment;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    //写操作
    public int create(Payment payment);
    //读操作
    public Payment getPaymentById(@Param("id") Long id);
}
