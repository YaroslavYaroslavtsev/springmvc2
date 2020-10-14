package ftc.test.mvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author jjaroslavtsev
 * @since 23/09/2020
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MainController {

    /**
     * Главная страница Web интерфейса
     */
    @GetMapping({"/", "/index"})
    public String getSetupParameters(Model model, RedirectAttributes ra) {
        return "simple2";
    }

    @PostMapping({"/", "/index"})
    public String getParameters(Model model, RedirectAttributes ra) {
        model.addAttribute("attr", "attrValue");
        //  ra.addAttribute("rAttr","redirectAttrValue");
        ra.addFlashAttribute("error", "Ошибка");
         return "redirect:/redir";
    }

    @GetMapping({"/redir"})
    public String getRedirParameters(Model model) {
        return "simple";
    }
}
