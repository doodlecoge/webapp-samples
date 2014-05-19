package me.hch.dao;

import me.hch.model.Student;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huaiwang on 5/19/14.
 */
@Service
public class TheDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Student> getAllStudents() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Student.class);
        List list = criteria.list();
        session.close();
        return list;
    }
}
