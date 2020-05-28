package com.enjoy.mq;

import java.io.Serializable;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/5/18
 */
public class CartItemEvent implements Serializable {

    private String itemId;
    private int quantity;

    public CartItemEvent() {
    }

    public CartItemEvent(String itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
