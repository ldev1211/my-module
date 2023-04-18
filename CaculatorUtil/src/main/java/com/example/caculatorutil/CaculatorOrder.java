package com.example.caculatorutil;

import java.util.List;

public class CaculatorOrder {
    public CaculatorOrder(){
    }
    public static int getCostFromOrderList(List<Order> orderList){
        int sum= 0;
        for(int i=0;i<orderList.size();++i) sum+=orderList.get(i).getCost();
        return sum;
    }
}
