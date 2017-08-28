package com.tiy;



public class Main {

    public static void main(String[] args) {

        Player bill = new GenericPlayer("bill", 100);
        Player ted = new NerdPlayer("ted", 100);

        Game game = new Game(bill, ted);

        game.play();

    }
}
