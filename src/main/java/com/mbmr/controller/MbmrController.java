package com.mbmr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mbmr.dto.RequestPayLoad;
import com.mbmr.dto.ResponsePayLoad;
import com.mbmr.entity.PayloadData;
import com.mbmr.dto.*;

import com.mbmr.service.MbmrService;

//16 october 3.30pm=============================================================

//16 october 4.30pm=============================================================


@RestController
public class MbmrController {

	@Autowired
	private MbmrService mbmrService;

	@PostMapping("templates")
	public ResponsePayLoad loadAllTemplates(@RequestBody RequestPayLoad requestPayLoad) {

		System.out.println(requestPayLoad + "request data==============================");

		String clintid = requestPayLoad.getRequestPayloadData().getClientId();
		List<Templates> tempListDb = mbmrService.findTemplateList(clintid);

		ResponseMetaData responseMetaData = new ResponseMetaData("200", "desc", "id");
		ResponsePayLoadData responsePayLoadData = new ResponsePayLoadData();
		responsePayLoadData.setTemplates(tempListDb);

		// Hard coded
		/*
		 * ResponsePayLoadData responsePayLoadData =new ResponsePayLoadData();
		 * List<Templates> listoFTemplates= new ArrayList<>(); Templates tmpl1=new
		 * Templates("100","content1","subject1"); Templates tmpl2=new
		 * Templates("700","content2","subject2"); listoFTemplates.add(tmpl1);
		 * listoFTemplates.add(tmpl2);
		 * responsePayLoadData.setTemplates(listoFTemplates);
		 */

		ResponsePayLoad appResponse = new ResponsePayLoad();
		appResponse.setResponseMetaData(responseMetaData);
		appResponse.setResponsePayLoadData(responsePayLoadData);

		return appResponse;

	}

}
