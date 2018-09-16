package com.rms.rissales.api;


import com.rms.risproject.vo.BaseUserVO;

public interface BaseHouseService {

    int save(BaseUserVO vo);

    int update(BaseUserVO vo);

    int delete(String keyId);

}
