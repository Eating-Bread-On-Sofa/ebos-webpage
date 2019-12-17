package cn.edu.bjtu.eboswebpage.controller.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
public class DevicePagesController {

    @GetMapping("/devices")
    public String deviceList() throws Exception {
        return "device/deviceManagement";
    }

    @GetMapping("/addDevice")
    public String deviceCreate() throws Exception {
        return "device/addDevice";
    }

    @GetMapping("/deviceDetails")
    public String deviceDetails() throws Exception {
        return "device/deviceDetails";
    }
}
