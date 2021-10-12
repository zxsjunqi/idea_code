package com.example.springboot.controller;
import com.example.springboot.bean.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.service.springbootService;

@RestController
public class springbootController {
    @Autowired
    springbootService springbootservice;
    @RequestMapping(value = "/me/count", method = RequestMethod.PUT)
     @ResponseBody
     public void initCount(@RequestBody Count count){
        springbootservice.initCount(count);
             }

             @RequestMapping(value = "/me/count", method = RequestMethod.POST)
     @ResponseBody
     public void modifyCount( @RequestBody Count count){
                 springbootservice.addCount(count);
             }

             @RequestMapping(value = "/me/count", method = RequestMethod.GET)
     @ResponseBody
     public  Count getCount()
     {
                 return springbootservice.getCount();
             }
}
