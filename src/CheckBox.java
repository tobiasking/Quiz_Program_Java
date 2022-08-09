public class CheckBox extends Question {

    private boolean[] correctAnswers;

    public Checkbox(String question, String[] potentialAnswers, boolean[] correctAnswers) {
        super(question, potentialAnswers);
        this.correctAnswers = correctAnswers;
    }


    public boolean[] getCorrectAnswers() {
        return correctAnswers;
    }
    public void setCorrectAnswers(boolean[] correctAnswers) {
        this.correctAnswers = correctAnswers;
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
