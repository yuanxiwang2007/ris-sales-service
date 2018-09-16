package com.rms.rissales.service;

import com.rms.risproject.rpc.BaseUserRpc;
import com.rms.risproject.vo.BaseUserVO;
import com.rms.rissales.api.BaseHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BaseUserServiceImpl implements BaseHouseService {

    @Autowired
    private BaseUserRpc baseUserRpc;

    @Override
    public int save(BaseUserVO vo) {
        return baseUserRpc.save(vo);
    }

    @Override
    public int update(BaseUserVO vo) {
        return baseUserRpc.update(vo);
    }

    @Override
    public int delete(String keyId) {
        return 0;
    }

}
