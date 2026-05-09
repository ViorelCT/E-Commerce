CREATE TABLE carts (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT UNIQUE,
    CONSTRAINT fk_cart_user
        FOREIGN KEY(user_id)
        REFERENCES users(id)
);

CREATE TABLE cart_items (
    id BIGSERIAL PRIMARY KEY,
    quantity INT NOT NULL,

    cart_id BIGINT,
    product_id BIGINT,

    CONSTRAINT fk_cartitem_cart
        FOREIGN KEY(cart_id)
        REFERENCES carts(id),

    CONSTRAINT fk_cartitem_product
        FOREIGN KEY(product_id)
        REFERENCES products(id)
);