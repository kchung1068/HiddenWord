public class HiddenWordTester {
    public static void main(String[] args) {

        //Test with multiple words of differing length
        HiddenWord puzzle = new HiddenWord("HARPS");

        System.out.println(puzzle.getHint("AAAAA"));	//returns “+A+++”

        System.out.println(puzzle.getHint("HELLO"));	//returns “H****”

        System.out.println(puzzle.getHint("HEART"));	//returns “H*++*”

        System.out.println(puzzle.getHint("HARMS"));	//returns “HAR*S”

        System.out.println(puzzle.getHint("HARPS"));	//returns “HARPS”

        HiddenWord wordH1 = new HiddenWord("SPIDERS");
        System.out.println(wordH1.getHint("SPINDLE"));

    }
}
