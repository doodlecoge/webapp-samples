package me.hch.action;

import me.hch.dao.TheDao;
import me.hch.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by huaiwang on 5/19/14.
 */
@Controller
@RequestMapping("/")
public class Home {
    @Autowired
    private TheDao theDao;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        List<Student> allStudents = theDao.getAllStudents();
        return "index";
    }
}
