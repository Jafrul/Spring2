/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.EmpService;

@Controller
@RequestMapping("/")
public class EmpController {
    
    @Autowired
    EmpService empservice;
    
    @RequestMapping(value= "/add_employee", method = RequestMethod.GET)
    public String addUser(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        
//        Employee emp = new Employee();
//       empservice.addEmployee(emp);
        return "add-emp-success";
    }
    @RequestMapping(value= "/edit_employee", method = RequestMethod.GET)
    public String editUser(HttpServletRequest request, HttpServletResponse response) throws Exception{      
        
        return "edit-emp-success";
    }
    @RequestMapping(value= "/delete_employee", method = RequestMethod.GET)
    public String deleteUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
       
        return "delete-emp-success";
    }
}
