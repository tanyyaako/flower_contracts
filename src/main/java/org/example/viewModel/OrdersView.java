package org.example.viewModel;

import java.util.List;

public record OrdersView(
        String numberOrder,
        List<String> nameProduct
) {
}
