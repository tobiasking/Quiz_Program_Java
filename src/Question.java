public abstract class Question {
        private String question;
        private String[] potentialAnswers;

        //true or false
        public Question(String question) {
            this.question = question;
        }
        //  question = string of questions / potentialAnswers = array of strings of answers (can be for checkbox or multichoice)


        public Question(String question, String[] potentialAnswers) {
            this.question = question;
            this.potentialAnswers = potentialAnswers;
        }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getPotentialAnswers() {
        return potentialAnswers;
    }

    public void setPotentialAnswers(String[] correctAnswers) {
        this.potentialAnswers = correctAnswers;
    }

    @Override
    public abstract String toString();
}
