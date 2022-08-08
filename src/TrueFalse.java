public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String question, boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public String toString() {
        return "True or False: " + this.getQuestion();
    }
}
