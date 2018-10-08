package com.ljy.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baidu.ueditor.ActionEnter;


@Controller
@RequestMapping("ued")
public class UEditorController {
	
	
	private static final Logger logger = LogManager.getLogger(UEditorController.class);
	
	@RequestMapping(value="/config")
	public void config(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json");
        String rootPath = request.getSession()
                .getServletContext().getRealPath("/");
        logger.info(rootPath);
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
