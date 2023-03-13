package Ex5.Memento;


import java.util.Stack;
//class
public class WicketFall {
    Stack<Memento> FallOfWickets = new Stack<Memento>();//fall of wickets created

	    
		/** jnck
		 * @param score
		 */
		void addScoreState(Memento score){
	      FallOfWickets.push(score);
	   }

	    
		/** 
		 * @param wicketFall
		 * @return Memento
		 */
		Memento getWicketFallScore(){
			
	      return FallOfWickets.peek();
	   }
}
