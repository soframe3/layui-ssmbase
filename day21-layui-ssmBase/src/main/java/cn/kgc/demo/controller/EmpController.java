package cn.kgc.demo.controller;

import cn.kgc.demo.pojo.Dept;
import cn.kgc.demo.pojo.Emp;
import cn.kgc.demo.service.EmpSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/28 16:30
 * @Version 1.0
 */
//@RestController  // 只返回数据，不返回视图 @controller + @responseBody
@Controller
@RequestMapping("emp")
public class EmpController extends BaseController<Emp>{

    //可以写EmpController特有的控制器方法，不放在BaseController中
}
