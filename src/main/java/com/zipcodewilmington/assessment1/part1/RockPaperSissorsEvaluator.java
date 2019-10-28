package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";
    protected static final String[] handSigns = {ROCK, PAPER, SCISSOR};

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        for (int i = 0; i < handSigns.length; i++) {
            if (handSign.equals(handSigns[i])) {
                if(i+1 >= handSigns.length) {
                    i = -1;
                }
                winningMove = handSigns[i+1];
                break;
            }
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        for (int i = 0; i < handSigns.length; i++) {
            if (handSign.equals(handSigns[i])) {
                if(i-1 < 0) {
                    i = handSigns.length;
                }
                losingMove = handSigns[i-1];
                break;
            }
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winnerSign = "";
        if (handSignOfPlayer1.equals(getWinningMove(handSignOfPlayer2))) {
            winnerSign = handSignOfPlayer1;
        } else if (handSignOfPlayer1.equals(getLosingMove(handSignOfPlayer2))) {
            winnerSign = handSignOfPlayer2;
        } else {
            // tie
            winnerSign = "";
        }
        return winnerSign;
    }
}
