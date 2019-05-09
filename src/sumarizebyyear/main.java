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
        Map<Integer, Integer> mapMediocreCount = new TreeMap<Integer, Integer>();
        Map<Integer, Float> bestScore = new TreeMap<Integer, Float>();
        Map<Integer, String> bestGame = new TreeMap<Integer, String>();
        Map<Integer, Float> worstScore = new TreeMap<Integer, Float>();
        Map<Integer, String> worstGame = new TreeMap<Integer, String>();

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

        for (Integer ky : mapTotalYars.keySet()) {
            mapMediocreCount.put(ky, 0);
            bestScore.put(ky, (float) 0);
            bestGame.put(ky, "");
            worstScore.put(ky, (float) 1000);
            worstGame.put(ky, "");
        }

        for (Integer k : games.keySet()) {
            int yaer = games.get(k).releaseYear;
            float score = games.get(k).score;
            if (score > bestScore.get(yaer)) {
                bestScore.put(yaer, score);
                bestGame.put(yaer, games.get(k).title);
            }
            if (score < worstScore.get(yaer)) {
                worstScore.put(yaer, score);
                worstGame.put(yaer, games.get(k).title);
            }

            if (games.get(k).scorePharse.equals("Mediocre")) {
                mapMediocreCount.put(yaer, mapMediocreCount.get(yaer) + 1);
            }

        }

        for (Integer k : mapTotalYars.keySet()) {
            System.out.println(k + " Games Count:->" + mapTotalYars.get(k));
        }
        System.out.println("---");
        for (Integer k : mapMediocreCount.keySet()) {
            System.out.println(k + " MediocresCount :->" + mapMediocreCount.get(k));
        }
        System.out.println("---");
        for (Integer k : bestGame.keySet()) {
            System.out.println(k + " BestGame :->" + bestGame.get(k) + " score: " + bestScore.get(k));
        }
        System.out.println("---");
        for (Integer k : worstGame.keySet()) {
            System.out.println(k + " WorstGame :->" + worstGame.get(k) + " score: " + worstScore.get(k));
        }
    }

}
