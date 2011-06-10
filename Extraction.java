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
	 * �e�L�X�g����B��������b�Ŏn�܂�P����v�����g����
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
	 *�e�L�X�g����B��������b�Ŏn�܂�P����v�����g����
	 * Pattern��Matcher���g���܂��B
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
	 * List�̒l���J���}�ŋ�؂��ĕ��ׂ�
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
