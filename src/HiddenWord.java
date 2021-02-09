class HiddenWord {
    private String hiddenWord;
    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }
    public String getHint(String guessedWord)
    {
        String hint = "";
        for(int x = 0; x < guessedWord.length(); x += 1 ) {
            if (guessedWord.substring(x, x+1 ).equals(hiddenWord.substring(x,x +1) ) ) {
                hint += guessedWord.substring(x ,x +1);
            } else if (hiddenWord.indexOf(guessedWord.substring(x,x+1)) == -1  ) {
                hint += "*";
            } else {
                hint += "+";
            }
        }   return hint;
    }
}

