package cn.edu.bjtu.eboswebpage.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
public class UserPagesController {

    @RequestMapping("/users")
    public String userList2() throws Exception {
        return "user/userList";
    }
}
