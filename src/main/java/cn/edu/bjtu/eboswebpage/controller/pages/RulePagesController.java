package cn.edu.bjtu.eboswebpage.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
public class RulePagesController {

    @GetMapping("/rules")
    public String ruleList() throws Exception {
        return "rule/ruleManagement";
    }

    @GetMapping("/ruleCreate")
    public String ruleCreate() throws Exception {
        return "rule/ruleCreate";
    }

    @GetMapping("/ruleAlert")
    public String ruleAlert() throws Exception {
        return "rule/ruleAlert";
    }

    @GetMapping("/ruleDetails")
    public String ruleDetails() throws Exception {
        return "rule/ruleDetails";
    }

}
