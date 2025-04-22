package cowsnbulls;

public class CowsAndBulls {

    protected boolean finished;
    protected boolean playing;
    protected int guessesCounter;
    protected int intNumber;
    int guessDigits;
    protected String stringNumber;


    public boolean getFinished(){
        return finished;
    }
    public boolean getPlaying(){
        return playing;
    }
    public int getGuessesCounter(){
        return guessesCounter;
    }

    public String getStringNumber(){
        return stringNumber;
    }

    public CowsAndBulls(int guessDigits){
        this.guessDigits = guessDigits;
        int digit = 0;
        for (int i = 0; i < guessDigits; i++) {
            digit = (int) (Math.random()*10);
            intNumber += Math.pow(10,i)*digit;
        }
        stringNumber = String.valueOf(intNumber);
        for (int i = guessDigits-1; i > 0; i--) {
            if((int)(intNumber / Math.pow(10,i)) == 0){
                stringNumber = "0" + stringNumber;
            }
        }
    }

    public String guessResult(int guessNumber) {
        String result = "";
        int cowCounter = 0;
        int bullCounter = 0;
        if (guessNumber / 10000 > 0 || guessNumber <= 0) {
            result = "Invalid input. Guess again.";
            finished = true;
            guessesCounter = 0;
        } else {
            guessesCounter++;
            result = String.valueOf(guessNumber);
            char[] guessNumberArray = result.toCharArray();
//            char[] secretNumberArray = {1, 2, 3, 4};
            char[] secretNumberArray = stringNumber.toCharArray();
            for (int i = 0; i < guessNumberArray.length; i++) {
                if (guessNumberArray[i] == secretNumberArray[i]) {
                    cowCounter++;
                }
            }
            for (int i = 0; i < guessNumberArray.length; i++) {
                for (int j = 0; j < guessNumberArray.length; j++) {
                    if (i == j) {

                    } else if (guessNumberArray[i] == secretNumberArray[j]) {
                            bullCounter++;
                    }
                }
            }
            result = "" + cowCounter + " cow, " + bullCounter + " bull";
            if (cowCounter == guessDigits) {
                finished = true;
            } else {
                playing = true;
            }
        }
        return result;
    }

}
