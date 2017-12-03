package net.mwa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.mwa.repository.PaymentRepository;
import net.mwa.vo.PaymentDetailsVO;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	private PaymentRepository paymentRepository ;

	@Override
	public PaymentDetailsVO save(final PaymentDetailsVO paymentDetailsVO) {
		return paymentRepository.save(paymentDetailsVO);
	}

	@Override
	public Iterable<PaymentDetailsVO> findAll() {
		return paymentRepository.findAll();
	}

	@Override
	public List<PaymentDetailsVO> findByMemberId(Long memberId) {
		return paymentRepository.findByMemberId(memberId);
	}

	@Override
	public List<PaymentDetailsVO> findByFeeId(Long feeId) {
		return paymentRepository.findByFeeId(feeId);
	}

}
