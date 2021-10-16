package com.mbmr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mbmr.dto.*;
import com.mbmr.entity.PayloadData;


 

@Service
public interface MbmrService {
	
	public RequestPayloadData insert(RequestPayloadData mbmr);
	public List<PayloadData> getAllData();
	public List<Templates> getAllTemplatesUsingClientId();
	public List<Templates> findTemplateList(String clintid);

}
