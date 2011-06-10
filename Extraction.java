import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Extraction {

	/**
	 * @author Jeongwoo Lee
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "Recombinable business logic in a Boolean fashion";

		outputWordStartB(input);
		//printList( getWordsStartB(input) );

	}
	
	/**
	 * テキストからBもしくはbで始まる単語をプリントする
	 * @param input
	 */
	public static void outputWordStartB ( String input ) {
		String[] words = input.split("\\s");
		boolean isFirst = true;
		for ( String word : words ) {
		    if ( word.startsWith("b")||word.startsWith("B") ) {
				if(isFirst){
					System.out.print( word );
					isFirst = false;
				}else{
					System.out.print( "," + word );
				}		    	
		    }
		}
	} 
	
	/**
	 *テキストからBもしくはbで始まる単語をプリントする
	 * PatternとMatcherを使います。
	 * @param input
	 * @return 
	 */
	public static List<String> getWordsStartB ( String input ) {
		String[] words = input.split("\\s");
		Pattern firstB = Pattern.compile( "\\A[Bb]" );

		List<String> results = new ArrayList<String>();

		for ( String word : words ) {
			Matcher matcher = firstB.matcher(word);
		    boolean blnMatch= matcher.find();
		    if ( blnMatch ) results.add(word);
		}
		return results;
	} 
	
	/**
	 * Listの値をカンマで区切って並べる
	 * @param list
	 */
	public static void printList ( List<String> list ) {
		boolean isFirst = true;
		for ( String value : list ) {
			if(isFirst){
				System.out.print( value );
				isFirst = false;
			}else{
				System.out.print( "," + value );
			}
		}
	} 
	
}
