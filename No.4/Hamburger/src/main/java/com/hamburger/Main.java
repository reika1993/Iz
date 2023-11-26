package com.hamburger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Hamburger> hamburgerList = new ArrayList<>();
        hamburgerList.add(new Hamburger("チーズバーガー", "小麦粉,牛肉,玉ねぎ,きゅうり,チーズ", 307));
        hamburgerList.add(new Hamburger("フィレオフィッシュ", "小麦粉,鱈,チーズ", 336));
        hamburgerList.add(new Hamburger("てりやきバーガー", "小麦粉,豚肉,レタス", 487));
        hamburgerList.add(new Hamburger("えびフィレオ", "小麦粉,えび,玉ねぎ,レタス", 387));
        hamburgerList.add(new Hamburger("チキンクリスプ", "小麦粉,鶏肉,レタス", 357));
        hamburgerList.add(new Hamburger("エッグチーズバーガー", "小麦粉,卵,牛肉,玉ねぎ,きゅうり,チーズ", 387));
        hamburgerList.add(new Hamburger("スパイシービーフバーガー", "小麦粉,牛肉,レタス,ハラペーニョ", 329));

        System.out.println("----ハンバーガーをカロリー順に並べて表示します。----");
        hamburgerList.sort(Comparator.comparingInt(Hamburger::getKcal));
        hamburgerList.forEach(hamburger -> System.out.println("商品名:" + hamburger.getName() + "/カロリー:" + hamburger.getKcal() + "kcal"));
        System.out.println("----以上です。----\n");

        System.out.println("----[肉]が入った商品を調べて、カロリーの低い順に表示します。----");
        hamburgerList.sort(Comparator.comparingInt(Hamburger::getKcal));
        List<Hamburger> result = hamburgerList.stream()
                .filter(hamburger -> hamburger.getMaterial().contains("肉"))
                .toList();
        result.forEach(hamburger -> System.out.println(hamburger.getName()));
        System.out.println("----以上です。----");
    }
}