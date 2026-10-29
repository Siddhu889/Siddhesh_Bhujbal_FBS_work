package p1.My_2026_08_05SpringBoot_ThymeLeaf;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ThymeController {

	@GetMapping("/thyme")
	public String checkThyme(Model model)
	{
		String value="Show this on HTML";
		model.addAttribute("key",value);
		return "next";
	}
}
