package cn.edu.bjtu.eboswebpage.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
public class ProfilePagesController {

    @GetMapping("/profile")
    public String productList(Model model) throws Exception {
        return "profile/profileManagement";
    }

    @GetMapping("/profileCreate")
    public String productCreate(Model model) throws Exception {
        return "profile/profileCreate";
    }

    @GetMapping("/profileDetails")
    public String productDetails() throws Exception {
        return "profile/profileDetails";
    }

}
