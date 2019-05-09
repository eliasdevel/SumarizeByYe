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
        Map<Integer, Integer> mapTotalYars = new TreeMap<Integer, Integer>();
        Map<Integer, Game> games = new TreeMap<Integer, Game>();

        Map<String, Integer> mapMediocrePercent = new TreeMap<String, Integer>();

        while (s != null) {
//            System.out.println(i + ": " + s);
            String[] words = s.split(";");

            if (!words[6].equals("release_year")) {
                Game g = new Game(i, words[0], words[1], words[2], Float.parseFloat(words[3]), words[4], words[5], Integer.parseInt(words[6]));
                games.put(i, g);

            }

            i++;
            s = f.readLine();

        }
        f.close();

        for (Integer k : games.keySet()) {
            //logic for put per year
            if (!mapTotalYars.containsKey(games.get(k).releaseYear)) {
                mapTotalYars.put(games.get(k).releaseYear, 1);
            } else {
                mapTotalYars.put(games.get(k).releaseYear, mapTotalYars.get(games.get(k).releaseYear) + 1);
            }
        }

        for (Integer k : mapTotalYars.keySet()) {
            System.out.println(k + ":->" + mapTotalYars.get(k));
        }
    }

}
