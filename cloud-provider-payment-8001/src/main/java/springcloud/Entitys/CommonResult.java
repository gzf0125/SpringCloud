package springcloud.Entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用结果返回类
 * @param <T>
 */
@Data
@AllArgsConstructor//全参构造方法
@NoArgsConstructor//空参构造方法
public class CommonResult <T>{


    private Integer code;
    private String message;
    private T data;

    //重载构造方法
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}


