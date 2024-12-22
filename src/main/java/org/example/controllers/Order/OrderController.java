package org.example.controllers.Order;

import org.example.controllers.Base.BaseController;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@RequestMapping("/order")
public interface OrderController  extends BaseController {

    @GetMapping("/list")
    String showOrders(Principal principal, Model model);

    @GetMapping("/cart")
    String showCart(@AuthenticationPrincipal User user, Model model);

    @PostMapping("/cart/add")
    String addCart(@AuthenticationPrincipal User user, @RequestParam  Long productId,@RequestParam Integer quantity,Model model,
                   @RequestParam String categoryType,@RequestParam(required = false) String returnUrl);

    @PostMapping("/clear")
    String clearCart(@AuthenticationPrincipal User user);
    @PostMapping("/checkout")
    String checkout(@AuthenticationPrincipal User user);

    @PostMapping("/cart/decrease")
    String decreaseQuantity(@AuthenticationPrincipal User user, @RequestParam Long productId,Model model);
}
