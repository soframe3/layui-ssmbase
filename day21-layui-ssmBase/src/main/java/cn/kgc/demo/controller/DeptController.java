package cn.kgc.demo.controller;

import cn.kgc.demo.pojo.Dept;
import cn.kgc.demo.service.DeptSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/29 15:33
 * @Version 1.0
 */
@Controller
@RequestMapping("dept")
public class DeptController extends BaseController<Dept>{

    //可以写DeptController特有的控制器方法，不放在BaseController中
}
