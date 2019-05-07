/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarizebyyear;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author emuller2
 */
public class main {

    public static void main(String[] args) {
        SimpleReader f = new SimpleReader("game-reviews.csv");
        String s = f.readLine();
        int i = 1;
        Map<String, Integer> map = new TreeMap<String, Integer>();

        while (s != null) {
//            System.out.println(i + ": " + s);
            String[] words = s.split(";");
            if (!map.containsKey(words[6])) {
                map.put(words[6], 1);
            } else {
                map.put(words[6], map.get(words[6]) + 1);
            }
            for (String c : words) {
                if (!c.equals("")) {
//                    if (!map.containsKey(c)) {
//                        map.put(c, 1);
//                    } else {
//                        map.put(c, map.get(c) + 1);
//                    }
                }
            }

            i++;
            s = f.readLine();
        }
        f.close();
        for (String k : map.keySet()) {
            System.out.println(k + ": " + map.get(k));
        }
    }

}
