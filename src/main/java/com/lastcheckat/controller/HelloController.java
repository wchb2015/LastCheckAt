package com.lastcheckat.controller;

import com.lastcheckat.mapper.ItemMapper;
import com.lastcheckat.mapper.LastCheckAtMapper;
import com.lastcheckat.model.Item;
import com.lastcheckat.model.LastCheckAt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private LastCheckAtMapper lastCheckAtMapper;

    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public List<Item> index2()
    {
        return itemMapper.listItem();
    }

    @GetMapping("/items")
    public ModelAndView listItem()
    {
        List<Item> itemList = itemMapper.listItem();
        Map<String, Object> params = new HashMap<>();
        params.put("items", itemList);
        return new ModelAndView("item", params);
    }

    @GetMapping("/listLastCheckAt")
    public ModelAndView listLastCheckAt()
    {
        List<LastCheckAt> lcaList = lastCheckAtMapper.listLCA();
        Map<String, Object> params = new HashMap<>();
        params.put("lcaList", lcaList);
        return new ModelAndView("lastCheckAt", params);
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String update(@RequestParam("id") Long id)
    {
        lastCheckAtMapper.updateLastCheckAt(id);
        return "success";
    }
}