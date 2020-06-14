package com.zyh.chapter06_Adapter;

/**
 * @author zyh
 * @date 2020/6/13 15:46
 */
public class CardReadAdapter implements Computer {
    Card card;

    public CardReadAdapter(Card card){
        this.card = card;
    }

    @Override
    public void read() {
        card.transfer();
    }
}
