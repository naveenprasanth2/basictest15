package org.example.interview1;

public interface CartServiceInter {
    boolean add(ItemDto itemDto);
    boolean remove(ItemDto itemDto);
    boolean clear();
    boolean increaseCount(ItemDto itemDto);
    boolean decreaseCount(ItemDto itemDto);
}
