package net.mwa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.mwa.repository.PaymentRepository;
import net.mwa.vo.PaymentDetailsVO;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	private PaymentRepository paymentRepository ;
	
	public PaymentDetailsVO save(final PaymentDetailsVO paymentDetailsVO) {
		return paymentRepository.save(paymentDetailsVO);
	}

	public Iterable<PaymentDetailsVO> findAll() {
		return paymentRepository.findAll();
	}

}
