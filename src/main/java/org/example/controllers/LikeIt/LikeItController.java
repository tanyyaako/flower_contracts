package org.example.controllers.LikeIt;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/like")
public interface LikeItController {

    @GetMapping
    String showLike(Model model);
}
