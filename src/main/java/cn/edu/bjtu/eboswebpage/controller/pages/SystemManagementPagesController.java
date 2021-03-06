package cn.edu.bjtu.eboswebpage.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
public class SystemManagementPagesController {
    @GetMapping("/monitor")
    public String systemManagementList() throws Exception {
        return "systemManagement/monitor";
    }

    @GetMapping("/monitor2")
    public String systemManagementList2() throws Exception {
        return "systemManagement/monitor2";
    }

    @GetMapping("/logManagement")
    public String logManagement(Model model) throws Exception {
        return "systemManagement/logManagement";
    }

    @GetMapping("/expiringDetails")
    public String getExpiringPage()throws Exception{
        return "systemManagement/expiringDetails";
    }

    @GetMapping("/regDetails")
    public String getRegPage()throws Exception{
        return "systemManagement/regDetails";
    }

}
