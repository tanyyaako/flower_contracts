package org.example.viewModel.BasketAndLikeItModel;

public class DeleteCartItemView {
    String userId;
    String productId;

    public DeleteCartItemView(String productId, String userId) {
        this.productId = productId;
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
