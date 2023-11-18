package com.Vegetable;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Vegetable vesitable=new Vegetable("根菜類", "大根、にんじん、ばれいしょ");
                Vegetable vegetable=new Vegetable("葉茎菜類", "はくさい、キャベツ、ほうれんそう");
                Vegetable vegetable1=new Vegetable("果菜類", "きゅうり、なす、トマト");
            }
        for (String Kinds : vegetableName.keySet()) {
            System.out.println(Kinds + ":" + vegetableName.get(Kind));
        }
        if (!vegetableName.isEmpty()) {
            System.out.println("要素数は" + vegetableName.size() + "個です。");
            // 結果：要素数は3個です。
        }
    }
}
