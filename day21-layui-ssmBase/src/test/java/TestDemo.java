import cn.kgc.demo.dao.BaseMapper;
import cn.kgc.demo.dao.DeptMapper;
import cn.kgc.demo.pojo.Dept;
import cn.kgc.demo.pojo.Emp;
import cn.kgc.demo.service.EmpSevice;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/26 15:33
 * @Version 1.0
 */
//指定在单元测试启动的时候创建spring的工厂类对象
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
//RunWith的value属性指定以spring test的SpringJUnit4ClassRunner作为启动类
//如果不指定启动类，默认启用的junit中的默认启动类
@RunWith(value = SpringJUnit4ClassRunner.class)
public class TestDemo {

    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private BaseMapper<Dept> baseMapper;

    //测试查询所有的部门信息
    @Test
    public void test01(){
        List<Dept> list = deptMapper.selTAll();
        list.forEach(temp -> System.out.println(temp));
    }

    //测试查询所有的部门信息
    @Test
    public void test02(){
        List<Dept> list = baseMapper.selTAll();
        list.forEach(temp -> System.out.println(temp));
    }
}
