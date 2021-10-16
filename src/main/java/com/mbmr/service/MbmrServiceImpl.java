
package com.mbmr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbmr.entity.PayloadData;
import com.mbmr.dto.PayLoadDataDTO;
import com.mbmr.dto.RequestPayloadData;
import com.mbmr.dto.Templates;
import com.mbmr.repository.MbmrRepository;

@Service
public class MbmrServiceImpl implements MbmrService {

	@Autowired
	private MbmrRepository mbmrRepository;

	/*
	 * @Override public PayloadData insert(PayloadData mbmr) {
	 * 
	 * return mbmrRepository.save(mbmr); }
	 */
	@Override
	public List<PayloadData> getAllData() { 
		return mbmrRepository.findAll();
	}

	@Override
	public RequestPayloadData insert(RequestPayloadData mbmr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Templates> getAllTemplatesUsingClientId() {
		// mbmrRepository.findBy
		return null;
	}

	@Override
	public List<Templates> findTemplateList(String clintid) {
		List<PayloadData> payLoadDataList=mbmrRepository.findByClientId(clintid);
		List<Templates> templatesList=new ArrayList<>();
		
		for( PayloadData payloadData    : payLoadDataList) {
			Templates template=new Templates(payloadData.getTemplateId(),payloadData.getContent(),payloadData.getSubjectLine());
			templatesList.add(template);
		}				
			
		return templatesList;
	}

}
