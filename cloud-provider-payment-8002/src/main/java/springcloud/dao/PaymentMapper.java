package springcloud.dao;

import com.hlf.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    public Payment getPaymentById(@Param("id") Long id);

    public int  insertPayment(Payment payment);
}
