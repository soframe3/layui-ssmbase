package cn.kgc.demo.controller;

import cn.kgc.demo.pojo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/5/6 12:11
 * @Version 1.0
 */
@Controller
@RequestMapping("test")
public class TestController extends BaseController<Emp>{
}
