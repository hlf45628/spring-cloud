package springcloud.impl;

import com.hlf.common.entity.Payment;
import com.hlf.springcloud.dao.PaymentMapper;
import com.hlf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }

    @Override
    public int insertPayment(Payment payment) {
        return paymentMapper.insertPayment(payment);
    }

    @Override
    public String readTimeout() {
        return null;
    }
}
