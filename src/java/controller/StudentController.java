/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAll(Model m){
        StudentModel model = new StudentModel();
        m.addAttribute("lst", model.getAll());
                
        return "index";
    }
}

//    public static void main(String[] args) {
//        StudentModel sm = new StudentModel();
//        sm.getS();
//        
//    }
//
//    private void getS() {
//        List<Student> ls = new ArrayList<>();
//        ls = getAll();
//        for(Student st:ls){
//            System.out.println(st.getId());
//        }
//    }