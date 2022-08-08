public abstract class Question {
        private String question;
        private String[] correctAnswers;

        //true or false
        public Question(String question) {
            this.question = question;
        }

        public Question(String question, String[] correctAnswers) {
            this();
            this.question = question;
            this.correctAnswers = correctAnswers;
        }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public abstract String toString();
}
