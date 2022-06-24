package com.maveric.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maveric.model.DisputeCustomerDetails;
import com.maveric.model.DisputeReasons;
import com.maveric.model.DisputeTransactionDetails;
import com.maveric.service.DisputeCustomerDetailsService;
import com.maveric.service.DisputeReasonsService;
import com.maveric.service.DisputeTransactionDetailsService;


@Controller
public class DisputeController {
	
	@Autowired
	DisputeCustomerDetailsService disputeCustomerDetailsService;
	
	@Autowired
	DisputeReasonsService disputeReasonsService;
	
	@Autowired
	DisputeTransactionDetailsService disputeTransactionDetailsService;

	
	@RequestMapping(value = "addDisputeDetails", method = RequestMethod.POST )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public ModelAndView addDisputeCustomerDetails(DisputeCustomerDetails disputeCustomerDetails,DisputeReasons disputeReasons,
			DisputeTransactionDetails disputeTransactionDetails) {
		ModelAndView modelAndView = new ModelAndView("disputeSuccess");
		DisputeCustomerDetails addedDisputeCustomerDetails = disputeCustomerDetailsService.createDisputeCustomerDetails(disputeCustomerDetails);
		
		disputeTransactionDetails.setDisputeId(addedDisputeCustomerDetails.getDisputeId());
		DisputeTransactionDetails addedDisputeTransactionDetails = disputeTransactionDetailsService.createDisputeTransactionDetailsService(disputeTransactionDetails);
		
		disputeReasons.setDisputeId(addedDisputeCustomerDetails.getDisputeId());
		DisputeReasons addedDisputeReasons  = disputeReasonsService.createDisputeReasons(disputeReasons);
		
		modelAndView.addObject("disputeCustomerDetails", addedDisputeCustomerDetails);
		modelAndView.addObject("disputeReasons", addedDisputeReasons);
		modelAndView.addObject("disputeTransactionDetails", addedDisputeTransactionDetails);
		return modelAndView;
	}
}
