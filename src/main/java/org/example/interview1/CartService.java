package org.example.interview1;

public class CartService implements CartServiceInter {

    @Override
    public boolean add(ItemDto itemDto) {
        return false;
    }

    @Override
    public boolean remove(ItemDto itemDto) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean increaseCount(ItemDto itemDto) {
        return false;
    }

    @Override
    public boolean decreaseCount(ItemDto itemDto) {
        return false;
    }
}
