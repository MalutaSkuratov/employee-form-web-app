package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    @GetMapping
    public String askData(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-data";
    }

    @GetMapping("/showData")
    public String showData(@Valid @ModelAttribute Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) return "ask-data";
        else {
            model.addAttribute("employee", employee);
            return "show-data";
        }
    }
}
