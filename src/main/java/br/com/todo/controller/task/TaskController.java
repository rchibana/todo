package br.com.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rchibana on 1/29/17.
 */

@Controller
@RequestMapping("/task")
public class TaskController {

    @GetMapping()
    public String get(final Model model) {

        model.addAttribute("name", "rodrigo");

        return "task/task";

    }

}
