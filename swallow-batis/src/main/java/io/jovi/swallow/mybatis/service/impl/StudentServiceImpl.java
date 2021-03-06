package io.jovi.swallow.mybatis.service.impl;/**
 * Created by jovi on 16/03/2018.
 */

import io.jovi.swallow.mybatis.dao.StudentMapper;
import io.jovi.swallow.mybatis.domain.Student;
import io.jovi.swallow.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-03-16 16:31
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;
    /**
     * 新增记录
     *
     * @param student
     * @return
     */
    @Override
    public int insert(Student student) {
        return mapper.insert(student);
    }

    /**
     * 根据班级名称查询
     *
     * @param className
     * @return
     */
    @Override
    public List<Student> findStudentByClassName(String className) {
        return mapper.findStudentByClassName(className);
    }

    /**
     * 查询所有的学生
     *
     * @return
     */
    @Override
    public List<Student> queryList() {
        return mapper.queryList();
    }
}
