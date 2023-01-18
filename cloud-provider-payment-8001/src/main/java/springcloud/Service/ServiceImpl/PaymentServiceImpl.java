package springcloud.Service.ServiceImpl;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.Dao.PaymentDao;
import springcloud.Entitys.Payment;
import springcloud.Service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource//依赖注入
    private PaymentDao paymentDao;

    //写操作
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    //读操作
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
