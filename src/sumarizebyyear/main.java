/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarizebyyear;

import java.text.DecimalFormat;
import java.util.ArrayList;
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
        Map<Integer, Float> scores = new TreeMap<Integer, Float>();
        Map<Integer, Float> scoresPop = new TreeMap<Integer, Float>();

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

        float score1996 = 0;
        float score1997 = 0;
        float score1998 = 0;
        float score1999 = 0;
        float score2000 = 0;
        float score2001 = 0;
        float score2002 = 0;
        float score2003 = 0;
        float score2004 = 0;
        float score2005 = 0;
        float score2006 = 0;
        float score2007 = 0;
        float score2008 = 0;
        float score2009 = 0;
        float score2010 = 0;
        float score2011 = 0;
        float score2012 = 0;
        float score2013 = 0;
        float score2014 = 0;
        float score2015 = 0;
        float score2016 = 0;
        float score2017 = 0;
        float score2018 = 0;
        float score2019 = 0;
        for (Integer k : games.keySet()) {
            if (games.get(k).releaseYear == 1996) {
                int yaer = games.get(k).releaseYear;
                score1996 += games.get(k).score;
                scores.put(yaer, score1996);
            } else if (games.get(k).releaseYear == 1997) {
                int yaer = games.get(k).releaseYear;
                score1997 += games.get(k).score;
                scores.put(yaer, score1997);
            } else if (games.get(k).releaseYear == 1998) {
                int yaer = games.get(k).releaseYear;
                score1998 += games.get(k).score;
                scores.put(yaer, score1998);
            } else if (games.get(k).releaseYear == 1999) {
                int yaer = games.get(k).releaseYear;
                score1999 += games.get(k).score;
                scores.put(yaer, score1999);
            } else if (games.get(k).releaseYear == 2000) {
                int yaer = games.get(k).releaseYear;
                score2000 += games.get(k).score;
                scores.put(yaer, score2000);
            } else if (games.get(k).releaseYear == 2001) {
                int yaer = games.get(k).releaseYear;
                score2001 += games.get(k).score;
                scores.put(yaer, score2001);
            } else if (games.get(k).releaseYear == 2002) {
                int yaer = games.get(k).releaseYear;
                score2002 += games.get(k).score;
                scores.put(yaer, score2002);
            } else if (games.get(k).releaseYear == 2003) {
                int yaer = games.get(k).releaseYear;
                score2003 += games.get(k).score;
                scores.put(yaer, score2003);
            } else if (games.get(k).releaseYear == 2004) {
                int yaer = games.get(k).releaseYear;
                score2004 += games.get(k).score;
                scores.put(yaer, score2004);
            } else if (games.get(k).releaseYear == 2005) {
                int yaer = games.get(k).releaseYear;
                score2005 += games.get(k).score;
                scores.put(yaer, score2005);
            } else if (games.get(k).releaseYear == 2006) {
                int yaer = games.get(k).releaseYear;
                score2006 += games.get(k).score;
                scores.put(yaer, score2006);
            } else if (games.get(k).releaseYear == 2007) {
                int yaer = games.get(k).releaseYear;
                score2007 += games.get(k).score;
                scores.put(yaer, score2007);
            } else if (games.get(k).releaseYear == 2008) {
                int yaer = games.get(k).releaseYear;
                score2008 += games.get(k).score;
                scores.put(yaer, score2008);
            } else if (games.get(k).releaseYear == 2009) {
                int yaer = games.get(k).releaseYear;
                score2009 += games.get(k).score;
                scores.put(yaer, score2009);
            } else if (games.get(k).releaseYear == 2010) {
                int yaer = games.get(k).releaseYear;
                score2010 += games.get(k).score;
                scores.put(yaer, score2010);
            } else if (games.get(k).releaseYear == 2011) {
                int yaer = games.get(k).releaseYear;
                score2011 += games.get(k).score;
                scores.put(yaer, score2011);
            } else if (games.get(k).releaseYear == 2012) {
                int yaer = games.get(k).releaseYear;
                score2012 += games.get(k).score;
                scores.put(yaer, score2012);
            } else if (games.get(k).releaseYear == 2013) {
                int yaer = games.get(k).releaseYear;
                score2013 += games.get(k).score;
                scores.put(yaer, score2013);
            } else if (games.get(k).releaseYear == 2014) {
                int yaer = games.get(k).releaseYear;
                score2014 += games.get(k).score;
                scores.put(yaer, score2014);
            } else if (games.get(k).releaseYear == 2015) {
                int yaer = games.get(k).releaseYear;
                score2015 += games.get(k).score;
                scores.put(yaer, score2015);
            } else if (games.get(k).releaseYear == 2016) {
                int yaer = games.get(k).releaseYear;
                score2016 += games.get(k).score;
                scores.put(yaer, score2016);
            } else if (games.get(k).releaseYear == 2017) {
                int yaer = games.get(k).releaseYear;
                score2017 += games.get(k).score;
                scores.put(yaer, score2017);
            } else if (games.get(k).releaseYear == 2018) {
                int yaer = games.get(k).releaseYear;
                score2018 += games.get(k).score;
                scores.put(yaer, score2018);
            } else if (games.get(k).releaseYear == 2019) {
                int yaer = games.get(k).releaseYear;
                score2019 += games.get(k).score;
                scores.put(yaer, score2019);
            }
        }
        
        DecimalFormat df = new DecimalFormat("#.##");      

        ArrayList<Integer> reviews = new ArrayList();
        int contagemMediocres = 0;

        for (Integer k : mapTotalYars.keySet()) {
            System.out.println(k + " ReviewsCount:->" + mapTotalYars.get(k));
            reviews.add(mapTotalYars.get(k));
        }
        System.out.println("---");
        for (Integer k : mapMediocreCount.keySet()) {
            //System.out.println(k + " MediocresCount :->" + mapMediocreCount.get(k));
            System.out.println(k + " Mediocres over total:->" + df.format(Double.parseDouble(reviews.get(contagemMediocres) + "") / Double.parseDouble(mapMediocreCount.get(k) + "")) + "%");
            contagemMediocres++;
        }

        System.out.println("---");
        contagemMediocres = 0;
        ArrayList<Float> mediaScore = new ArrayList();
        for (Integer k : scores.keySet()) {
            //System.out.println(k + " MediocresCount :->" + mapMediocreCount.get(k));
            System.out.println(k + " ScoresMedium :->" + df.format((scores.get(k)) / reviews.get(contagemMediocres)));
            mediaScore.add((scores.get(k)) / reviews.get(contagemMediocres));
            contagemMediocres++;
        }

        score1996 = 0;
        float sscore1996 = 0;
        score1997 = 0;
        float sscore1997 = 0;
        score1998 = 0;
        float sscore1998 = 0;
        score1999 = 0;
        float sscore1999 = 0;
        score2000 = 0;
        float sscore2000 = 0;
        score2001 = 0;
        float sscore2001 = 0;
        score2002 = 0;
        float sscore2002 = 0;
        score2003 = 0;
        float sscore2003 = 0;
        score2004 = 0;
        float sscore2004 = 0;
        score2005 = 0;
        float sscore2005 = 0;
        score2006 = 0;
        float sscore2006 = 0;
        score2007 = 0;
        float sscore2007 = 0;
        score2008 = 0;
        float sscore2008 = 0;
        score2009 = 0;
        float sscore2009 = 0;
        score2010 = 0;
        float sscore2010 = 0;
        score2011 = 0;
        float sscore2011 = 0;
        score2012 = 0;
        float sscore2012 = 0;
        score2013 = 0;
        float sscore2013 = 0;
        score2014 = 0;
        float sscore2014 = 0;
        score2019 = 0;
        float sscore2019 = 0;
        score2015 = 0;
        float sscore2015 = 0;
        score2016 = 0;
        float sscore2016 = 0;
        score2017 = 0;
        float sscore2017 = 0;
        score2018 = 0;
        float sscore2018 = 0;
        for (Integer k : games.keySet()) {
            if (games.get(k).releaseYear == 1996) {
                int yaer = games.get(k).releaseYear;
                sscore1996 = games.get(k).score;
                sscore1996 -= mediaScore.get(0);
                sscore1996 = sscore1996 * sscore1996;
                score1996 += sscore1996;
                scoresPop.put(yaer, score1996);
            } else if (games.get(k).releaseYear == 1997) {
                int yaer = games.get(k).releaseYear;
                sscore1997 = games.get(k).score;
                sscore1997 -= mediaScore.get(0);
                sscore1997 = sscore1997 * sscore1997;
                score1997 += sscore1997;
                scoresPop.put(yaer, score1997);
            } else if (games.get(k).releaseYear == 1998) {
                int yaer = games.get(k).releaseYear;
                sscore1998 = games.get(k).score;
                sscore1998 -= mediaScore.get(0);
                sscore1998 = sscore1998 * sscore1998;
                score1998 += sscore1998;
                scoresPop.put(yaer, score1998);
            } else if (games.get(k).releaseYear == 1999) {
                int yaer = games.get(k).releaseYear;
                sscore1999 = games.get(k).score;
                sscore1999 -= mediaScore.get(0);
                sscore1999 = sscore1999 * sscore1999;
                score1999 += sscore1999;
                scoresPop.put(yaer, score1999);
            } else if (games.get(k).releaseYear == 2000) {
                int yaer = games.get(k).releaseYear;
                sscore2000 = games.get(k).score;
                sscore2000 -= mediaScore.get(0);
                sscore2000 = sscore2000 * sscore2000;
                score2000 += sscore2000;
                scoresPop.put(yaer, score2000);
            } else if (games.get(k).releaseYear == 2001) {
                int yaer = games.get(k).releaseYear;
                sscore2001 = games.get(k).score;
                sscore2001 -= mediaScore.get(0);
                sscore2001 = sscore2001 * sscore2001;
                score2001 += sscore2001;
                scoresPop.put(yaer, score2001);
            } else if (games.get(k).releaseYear == 2002) {
                int yaer = games.get(k).releaseYear;
                sscore2002 = games.get(k).score;
                sscore2002 -= mediaScore.get(0);
                sscore2002 = sscore2002 * sscore2002;
                score2002 += sscore2002;
                scoresPop.put(yaer, score2002);
            } else if (games.get(k).releaseYear == 2003) {
                int yaer = games.get(k).releaseYear;
                sscore2003 = games.get(k).score;
                sscore2003 -= mediaScore.get(0);
                sscore2003 = sscore2003 * sscore2003;
                score2003 += sscore2003;
                scoresPop.put(yaer, score2003);
            } else if (games.get(k).releaseYear == 2004) {
                int yaer = games.get(k).releaseYear;
                sscore2004 = games.get(k).score;
                sscore2004 -= mediaScore.get(0);
                sscore2004 = sscore2004 * sscore2004;
                score2004 += sscore2004;
                scoresPop.put(yaer, score2004);
            } else if (games.get(k).releaseYear == 2005) {
                int yaer = games.get(k).releaseYear;
                sscore2005 = games.get(k).score;
                sscore2005 -= mediaScore.get(0);
                sscore2005 = sscore2005 * sscore2005;
                score2005 += sscore2005;
                scoresPop.put(yaer, score2005);
            } else if (games.get(k).releaseYear == 2006) {
                int yaer = games.get(k).releaseYear;
                sscore2006 = games.get(k).score;
                sscore2006 -= mediaScore.get(0);
                sscore2006 = sscore2006 * sscore2006;
                score2006 += sscore2006;
                scoresPop.put(yaer, score2006);
            } else if (games.get(k).releaseYear == 2007) {
                int yaer = games.get(k).releaseYear;
                sscore2007 = games.get(k).score;
                sscore2007 -= mediaScore.get(0);
                sscore2007 = sscore2007 * sscore2007;
                score2007 += sscore2007;
                scoresPop.put(yaer, score2007);
            } else if (games.get(k).releaseYear == 2008) {
                int yaer = games.get(k).releaseYear;
                sscore2008 = games.get(k).score;
                sscore2008 -= mediaScore.get(0);
                sscore2008 = sscore2008 * sscore2008;
                score2008 += sscore2008;
                scoresPop.put(yaer, score2008);
            } else if (games.get(k).releaseYear == 2009) {
                int yaer = games.get(k).releaseYear;
                sscore2009 = games.get(k).score;
                sscore2009 -= mediaScore.get(0);
                sscore2009 = sscore2009 * sscore2009;
                score2009 += sscore2009;
                scoresPop.put(yaer, score2009);
            } else if (games.get(k).releaseYear == 2010) {
                int yaer = games.get(k).releaseYear;
                sscore2010 = games.get(k).score;
                sscore2010 -= mediaScore.get(0);
                sscore2010 = sscore2010 * sscore2010;
                score2010 += sscore2010;
                scoresPop.put(yaer, score2010);
            } else if (games.get(k).releaseYear == 2011) {
                int yaer = games.get(k).releaseYear;
                sscore2011 = games.get(k).score;
                sscore2011 -= mediaScore.get(0);
                sscore2011 = sscore2011 * sscore2011;
                score2011 += sscore2011;
                scoresPop.put(yaer, score2011);
            } else if (games.get(k).releaseYear == 2012) {
                int yaer = games.get(k).releaseYear;
                sscore2012 = games.get(k).score;
                sscore2012 -= mediaScore.get(0);
                sscore2012 = sscore2012 * sscore2012;
                score2012 += sscore2012;
                scoresPop.put(yaer, score2012);
            } else if (games.get(k).releaseYear == 2013) {
                int yaer = games.get(k).releaseYear;
                sscore2013 = games.get(k).score;
                sscore2013 -= mediaScore.get(0);
                sscore2013 = sscore2013 * sscore2013;
                score2013 += sscore2013;
                scoresPop.put(yaer, score2013);
            } else if (games.get(k).releaseYear == 2014) {
                int yaer = games.get(k).releaseYear;
                sscore2014 = games.get(k).score;
                sscore2014 -= mediaScore.get(0);
                sscore2014 = sscore2014 * sscore2014;
                score2014 += sscore2014;
                scoresPop.put(yaer, score2014);
            } else if (games.get(k).releaseYear == 2015) {
                int yaer = games.get(k).releaseYear;
                sscore2015 = games.get(k).score;
                sscore2015 -= mediaScore.get(0);
                sscore2015 = sscore2015 * sscore2015;
                score2015 += sscore2015;
                scoresPop.put(yaer, score2015);
            } else if (games.get(k).releaseYear == 2016) {
                int yaer = games.get(k).releaseYear;
                sscore2016 = games.get(k).score;
                sscore2016 -= mediaScore.get(0);
                sscore2016 = sscore2016 * sscore2016;
                score2016 += sscore2016;
                scoresPop.put(yaer, score2016);
            } else if (games.get(k).releaseYear == 2017) {
                int yaer = games.get(k).releaseYear;
                sscore2017 = games.get(k).score;
                sscore2017 -= mediaScore.get(0);
                sscore2017 = sscore2017 * sscore2017;
                score2017 += sscore2017;
                scoresPop.put(yaer, score2017);
            } else if (games.get(k).releaseYear == 2018) {
                int yaer = games.get(k).releaseYear;
                sscore2018 = games.get(k).score;
                sscore2018 -= mediaScore.get(0);
                sscore2018 = sscore2018 * sscore2018;
                score2018 += sscore2018;
                scoresPop.put(yaer, score2018);
            } else if (games.get(k).releaseYear == 2019) {
                int yaer = games.get(k).releaseYear;
                sscore2019 = games.get(k).score;
                sscore2019 -= mediaScore.get(0);
                sscore2019 = sscore2019 * sscore2019;
                score2019 += sscore2019;
                scoresPop.put(yaer, score2019);
            }
        }

        System.out.println("---");
        contagemMediocres = 0;
        for (Integer k : scoresPop.keySet()) {
            //System.out.println(k + " MediocresCount :->" + mapMediocreCount.get(k));
            System.out.println(k + " ScoresDesPadPop :->" + df.format((scoresPop.get(k)) / reviews.get(contagemMediocres)));
            contagemMediocres++;
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
