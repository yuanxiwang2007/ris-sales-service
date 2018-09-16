package com.rms.rissales.controller;

import com.rms.common.controller.BaseController;
import com.rms.common.result.HttpResult;
import com.rms.risproject.rpc.BaseUserRpc;
import com.rms.risproject.vo.BaseUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HouseManager")
public class BaseHouseController extends BaseController {


    @Autowired
    private BaseUserRpc baseUserRpc;


    @RequestMapping(value= "/saveRpc")
    public HttpResult saveRpc(@RequestBody BaseUserVO baseUserResp){

        baseUserRpc.save(baseUserResp);
        return success();
    }

    @RequestMapping(value= "/update")
    public HttpResult update(@RequestBody BaseUserVO baseUserResp){
        logger.info(String.format("/update:{0}",baseUserResp.toString()));

        if(StringUtils.isEmpty(baseUserResp.getKeyId())){
            return error("更新用户的ID不能为空！");
        }
        try{
            baseUserRpc.update(baseUserResp);
            return success();
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return error("更新失败");
        }

    }
}
