package com.ww.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("sql")
public class SqlController {
	
	@RequestMapping(value = "list")
    public String index() {
        return "sql/list";
    }
	
	@RequestMapping(value = "insert")
    public String insert() {
        return "sql/list";
    }
	
}
