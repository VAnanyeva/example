package conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/address")
public class AddressController {

    //@Autowired
    //private PhoneService phoneService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void getAddress() {
        System.out.println("getAddress");
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void setAddress(@RequestBody String address) {
        System.out.println(address);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delAddress(@RequestBody String address) {

        return "del"+address;

    }
}

