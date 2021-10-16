package com.mbmr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbmr.entity.PayLoadId;
import com.mbmr.entity.PayloadData;
public interface MbmrRepository  extends JpaRepository<PayloadData, PayLoadId>{

    List<PayloadData> findByClientId(String clintid);

}
