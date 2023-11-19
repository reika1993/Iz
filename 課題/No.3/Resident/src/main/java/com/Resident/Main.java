package com.Resident;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Resident resident1 = new Resident("田中", 13, true);
        Resident resident2 = new Resident("三神", 5, false);
        Resident resident3 = new Resident("水野", 36, true);
        Resident resident4 = new Resident("鈴木", 4, true);

        List<Resident> residents = new ArrayList<>();
        residents.add(resident1);
        residents.add(resident2);
        residents.add(resident3);
        residents.add(resident4);

        System.out.println("こちらのマンションには、現在[" + residents.size() + "]世帯が住んでいます。");

        int count = 0;
        for (Resident resident : residents){
            if (resident.getMonth() > 12) {
                count++;
            }
        }
        System.out.println("一年以上住んでいる世帯は[" + count + "]世帯です。");


        for (Resident resident : residents) {
            if (!resident.hasParking()) {
                System.out.println("[" + resident.getName() + "]さんは駐車場を契約していません。");
            } else {
                System.out.println("[" + resident.getName() + "]さんは駐車場を契約しています。");
            }
        }

        System.out.println("家賃は８万円、駐車場代は１万円なので");
        for (Resident resident : residents) {
            if (!resident.hasParking()) {
                System.out.println("[" + resident.getName() + "]さんの月々の支払いは８万円です。");
            } else {
                System.out.println("[" + resident.getName() + "]さんの月々の支払いは９万円です。");
            }
        }
        Map<String, resident> residentMap = new HashMap<>();
        residentMap.put("田中", resident1);
        residentMap.put("三神", resident2);
        residentMap.put("水野", resident3);
        residentMap.put("鈴木", resident4);
        System.out.println("検索したい住人の名前を入力してください。");
        try {
            String nameSearch = new java.util.Scanner(System.in).nextLine();
            System.out.println("検索結果");
            System.out.println("氏名：" + residentMap.get(nameSearch).getName());
            System.out.println("入居月数：" + residentMap.get(nameSearch).getMonth() + "ヶ月");
            if (residentMap.get(nameSearch).hasParking()) {
                System.out.println("駐車場契約：有");
            } else {
                System.out.println("駐車場契約：無し");
            }
        } catch (NullPointerException e) {
            System.out.println("存在しない、もしくは無効です。確認してください。");
        } finally {
            System.out.println("終了しました。");
        }
    }
}





