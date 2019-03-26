package com.ww.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ww.web.model.UrlManage;
import com.ww.web.service.UrlManageService;

@Controller
@RequestMapping("sql")
public class SqlController {
	
	@Autowired
	private UrlManageService urlManageService;
	
	@RequestMapping("")
	public String init(Model model){
		UrlManage urlManage = urlManageService.selectByPrimaryKey(30L);
		model.addAttribute("urlManage", urlManage);
        return "sql/list";
	}
	
	@RequestMapping(value = "list")
    public String index(Model model,Long id) {
		UrlManage urlManage = urlManageService.selectByPrimaryKey(id);
		model.addAttribute("urlManage", urlManage);
        return "sql/list";
    }
	
	@RequestMapping(value = "insert")
    public String insert() {
        return "sql/list";
    }
	
}
