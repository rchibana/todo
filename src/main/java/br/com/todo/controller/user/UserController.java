package br.com.todo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author s2it_rchibana
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 2/6/17 11:17 AM
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public String createUser() {

        return null;
    }

}
