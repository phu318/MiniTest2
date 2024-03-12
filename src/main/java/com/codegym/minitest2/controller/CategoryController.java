package com.codegym.minitest2.controller;

import com.codegym.minitest2.model.entity.Category;
import com.codegym.minitest2.service.ICategoryService;
import com.codegym.minitest2.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private ITaskService taskService;

    @GetMapping
    public ModelAndView listCategory(){
        ModelAndView modelAndView = new ModelAndView("/category/index");
        Iterable<Category> category = categoryService.findAll();
        modelAndView.addObject("category", category);
        return modelAndView;
    }

}
