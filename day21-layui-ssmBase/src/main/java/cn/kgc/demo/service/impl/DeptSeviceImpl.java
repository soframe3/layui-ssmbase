package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.DeptMapper;
import cn.kgc.demo.pojo.Dept;
import cn.kgc.demo.service.DeptSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName DeptSeviceImpl
 * @Description TODO
 * @Author zhaojing
 * @Date 2021/4/29 15:37
 * @Version 1.0
 */
@Service
@Transactional(readOnly = false)
public class DeptSeviceImpl extends BaseServiceImpl<Dept> implements DeptSevice {

}
