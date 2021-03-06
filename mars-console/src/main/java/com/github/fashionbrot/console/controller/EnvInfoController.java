package com.github.fashionbrot.console.controller;

import com.github.fashionbrot.common.annotation.IsMenu;
import com.github.fashionbrot.common.vo.RespVo;
import com.github.fashionbrot.core.service.EnvInfoService;
import com.github.fashionbrot.dao.entity.EnvInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author fashionbrot
 * @version 0.1.0
 * @date 2019/12/8 22:45
 */

@Controller
@RequestMapping("/env")
public class EnvInfoController {

    @Autowired
    private EnvInfoService envInfoFacade;

    @GetMapping("/index")
    @IsMenu
    public String index(){
        return "/env/index";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public RespVo add(@RequestBody EnvInfo envInfo) {
        envInfoFacade.add(envInfo);
        return RespVo.success();
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public RespVo update(@RequestBody EnvInfo envInfo) {
        envInfoFacade.update(envInfo);
        return RespVo.success();
    }

    @RequestMapping(value = "deleteById")
    @ResponseBody
    public RespVo deleteById(Long id) {
        envInfoFacade.deleteById(id);
        return RespVo.success();
    }

    @RequestMapping(value = "queryById")
    @ResponseBody
    public EnvInfo queryById(Long id) {
        return envInfoFacade.queryById(id);
    }

    @RequestMapping(value = "queryAll")
    @ResponseBody
    public List<EnvInfo> queryAll() {
        return envInfoFacade.queryAll();
    }
}
