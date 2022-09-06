
package com.omar.login;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */

@RestController
public class MainController {
    
    @PostMapping(value = "/hello")
    public @ResponseBody String getInfo(@PathVariable String name ) {
        
        return "Hola "+name;
    }
    
}
