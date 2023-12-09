package com.menu.menu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;


@RestController
public class MenuController {

    @GetMapping("/menu")
    public String menu() {


        ArrayList<String> category = new ArrayList<>();
        category.add("和食");
        category.add("洋食");
        category.add("中華");
        Collections.shuffle(category);
        String cat1 = category.get(1);

        switch (cat1) {
            case ("和食"):
                ArrayList<String> staple1 = new ArrayList<>();
                staple1.add("ご飯");
                staple1.add("うどん");
                staple1.add("そば");
                Collections.shuffle(staple1);
                String sta1 = staple1.get(1);

                if (sta1 == ("ご飯")) {
                    ArrayList<String> main1 = new ArrayList<>();
                    ArrayList<String> side1 = new ArrayList<>();
                    ArrayList<String> side2 = new ArrayList<>();

                    main1.add("大根おろしハンバーグ");
                    main1.add("豚の生姜焼き");
                    main1.add("鶏肉の唐揚げ");
                    main1.add("焼き魚");
                    main1.add("天ぷら");
                    main1.add("刺身");

                    side1.add("野菜サラダ");
                    side1.add("きゅうりとわかめの酢の物");
                    side1.add("具沢山味噌汁");
                    side1.add("ほうれん草のお浸し");
                    side1.add("ひじきの煮物");
                    side1.add("煮豆");
                    side1.add("きのこソテー");

                    side2.add("野菜の煮物");
                    side2.add("野菜炒め");
                    side2.add("芋の煮っ転がし");

                    Collections.shuffle(main1);
                    Collections.shuffle(side1);
                    Collections.shuffle(side2);
                    return "主食は" + sta1 + "、主菜は" + main1.get(1) + "、副菜は" + side1.get(1) + "と" + side2.get(1) + "はいかがですか。";
                } else {
                    ArrayList<String> side3 = new ArrayList<>();
                    ArrayList<String> side4 = new ArrayList<>();

                    side3.add("きゅうりとわかめの酢の物");
                    side3.add("ほうれん草のお浸し");
                    side3.add("ひじきの煮物");
                    side3.add("煮豆");

                    side4.add("野菜の煮物");
                    side4.add("野菜炒め");
                    side4.add("芋の煮っ転がし");

                    Collections.shuffle(side3);
                    Collections.shuffle(side4);
                    return "主食は" + sta1 + "、副菜は" + side3.get(1) + "と" + side4.get(1) + "はいかがですか。";
                }


            case ("洋食"):
                ArrayList<String> staple2 = new ArrayList<>();
                ArrayList<String> side5 = new ArrayList<>();
                ArrayList<String> dairy = new ArrayList<>();
                staple2.add("カレー");
                staple2.add("オムライス");
                staple2.add("スパゲッティ");

                side5.add("野菜サラダ");
                side5.add("きのこソテー");

                dairy.add("牛乳");
                dairy.add("チーズ");
                dairy.add("ヨーグルト");

                Collections.shuffle(staple2);
                Collections.shuffle(side5);
                Collections.shuffle(dairy);
                return "主食は" + staple2.get(1) + "、副菜は" + side5.get(1) + "、乳製品は" + dairy.get(1) + "はいかがですか。";


            case ("中華"):
                ArrayList<String> staple3 = new ArrayList<>();
                ArrayList<String> side6 = new ArrayList<>();
                ArrayList<String> side7 = new ArrayList<>();

                staple3.add("ラーメン");
                staple3.add("炒飯");

                side6.add("バンバンジー");
                side6.add("ナムル");
                side6.add("やみつききゅうり");

                side7.add("餃子");
                side7.add("小籠包");
                side7.add("肉まん");

                Collections.shuffle(staple3);
                Collections.shuffle(side6);
                Collections.shuffle(side7);


                return "主食は" + staple3.get(1) + "、副菜は" + side6.get(1) + "と" + side7.get(1) + "はいかがですか。";
        }

        return menu();
    }
}

