public class MultiChoice extends Question {

    private int correctAnswer;

    public MultiChoice(String question, int correctAnswer, String[] possibleAnswers) {
        super(question, possibleAnswers);
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        String returnString = this.getQuestion() + '\n';
        for(String potentialAnswer : this.getPotentialAnswers()) {
            returnString += potentialAnswer + '\n';
        }
        return returnString;
    }
}
