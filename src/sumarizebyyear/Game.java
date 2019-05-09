/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarizebyyear;

/**
 *
 * @author elias
 */
public class Game {

    int id;
    String title;
    String platform;
    String scorePharse;
    float score;
    String genre;
    String editorsChoice;
    int releaseYear;

    public Game(int id, String title, String platform, String scorePharse, float score, String genre, String editorsChoice, int releaseYear) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.scorePharse = scorePharse;
        this.score = score;
        this.genre = genre;
        this.editorsChoice = editorsChoice;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return "[" + this.id + "]->\ntitle:" + this.title + "\n" + "platform:" + this.platform + "\nscorePharse:" + this.scorePharse + "\nscore:" + this.score + "\ngenere:" + this.genre + "\neditorsChoice:" + this.editorsChoice + "\nreleaseYear:" + this.releaseYear;
    }

}
