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
public class AgregController {

    /**
     * Главная страница Web интерфейса
     */
    @GetMapping("/agreg")
    public String getSetupParameters(Model model, RedirectAttributes ra) {
        return "simple2";
    }


}
