package calculator.controllers;

import calculator.service.CalculateSimple;
import calculator.model.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {

    OperationModel operationModel = new OperationModel();

    @Autowired
    private CalculateSimple calculateSimple;

    @GetMapping("/calculator")

    public String getCalculatorPage(Model model) {
        model.addAttribute("operationModel", operationModel);
        return "calculator";
    }

    @PostMapping(value = "/calculator", params = "add")

    public String add(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "calculator";
    }

    @PostMapping(value = "/calculator", params = "subtract")

    public String subtract(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.subtract(operationModel));
        return "calculator";
    }

    @PostMapping(value = "/calculator", params = "multiply")

    public String multiply(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculator";
    }

    @PostMapping(value = "/calculator", params = "divide")

    public String divide(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "calculator";
    }


    @PostMapping(value = "/calculator", params = "clearSimple")
    //@RequestMapping(value="/calculator", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("operationModel", calculateSimple.clearSimple(operationModel));
        model.addAttribute("result", 0);
        return "calculator";
    }


}
