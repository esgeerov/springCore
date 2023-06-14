package az.orient.ecourse.main;

import az.orient.ecourse.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      Teacher teacher= (Teacher) context.getBean("teacherId");
        System.out.println(teacher);
    }
}
