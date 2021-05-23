package cn.kgc.demo.service;

import cn.kgc.demo.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @ClassName EmpSevice
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/28 16:41
 * @Version 1.0
 */
public interface EmpSevice extends BaseService<Emp>{

    //定义EmpSevice独有的特殊的方法，不放在BaseService里面
}
