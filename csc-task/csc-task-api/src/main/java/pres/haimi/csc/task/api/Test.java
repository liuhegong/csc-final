package pres.haimi.csc.task.api;

import org.springframework.beans.factory.annotation.Autowired;
import pres.haimi.csc.task.dao.task.CollegeTaskDao;

/**
 * Created by HaimiZhou on 2017/5/22.
 */
public class Test {
   /* @Autowired
    private DemoDao demoDao;*/
    @Autowired
    private CollegeTaskDao collegeTaskDao;
    public void init(){
        System.out.println("Spring 初始化！");
        System.out.println(collegeTaskDao.select(1));
        /*demoDao.add(new Demo(2,"hello"));*/
        System.out.println("Mybatis success!");
    }
}
