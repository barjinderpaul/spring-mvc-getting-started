package com.hellospring.controllers;

import com.hellospring.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("firstNumber") int firstNumber, @RequestParam("secondNumber") int secondNumber) {

        int result = AddService.add(firstNumber,secondNumber);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("result",result);
        return mv;
    }
}
