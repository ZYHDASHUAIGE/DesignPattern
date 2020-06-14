package com.zyh.chapter06_Adapter;

/**
 * @author zyh
 * @date 2020/6/13 15:44
 */
public class Dell implements Computer{
    CardReadAdapter cardReadAdapter;

    public Dell(CardReadAdapter adapter){
        cardReadAdapter = adapter;
    }
    @Override
    public void read() {
        cardReadAdapter.read();
    }

    public static void main(String[] args) {
        Dell dell = new Dell(new CardReadAdapter(new SdCard()));
        dell.read();
    }
}
