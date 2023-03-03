package Ex5.Memento;

public class MementoPattern {
    
    /** 
     * 
     * @param args
     */
    public static void main(String[] args) {
		   
        InitialScoreBoard initialScoreBoard = new InitialScoreBoard();
        WicketFall wicketFall = new WicketFall();
        
        initialScoreBoard.setScore("26-1");
        wicketFall.addScoreState(initialScoreBoard.saveScoreToMemento());

        initialScoreBoard.setScore("33-2");
        wicketFall.addScoreState(initialScoreBoard.saveScoreToMemento());
        
        initialScoreBoard.setScore("44-3");
        wicketFall.addScoreState(initialScoreBoard.saveScoreToMemento());
        
        
        initialScoreBoard.setScore("126-4");
        wicketFall.addScoreState(initialScoreBoard.saveScoreToMemento());

        initialScoreBoard.setScore("189-5");
        wicketFall.addScoreState(initialScoreBoard.saveScoreToMemento());
        
        initialScoreBoard.setScore("201-6");
        System.out.println("Current score: " + initialScoreBoard.getScore());		
        
        initialScoreBoard.getScoreFromMemento(wicketFall.getWicketFallScore());
        System.out.println("Previous saved score: " + initialScoreBoard.getScore());
        
     }
}
