package springcloud.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springcloud.Entitys.Payment;
import springcloud.Service.PaymentService;
import springcloud.Entitys.CommonResult;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        log.info("******插入结果:{}",result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,serverPort"+serverPort,null);
        }else {
            return new CommonResult(444,"插入数据库失败,serverPort"+serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        log.info("******查询结果:{}",payment);
        if (payment!=null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应数据，查询ID:"+id+" serverPort"+serverPort,null);
        }
    }
}
