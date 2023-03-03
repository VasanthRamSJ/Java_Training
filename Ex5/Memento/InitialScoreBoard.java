package Ex5.Memento;

public class InitialScoreBoard {
     String score;

     
     /** 
      * @param score
      */
     void setScore(String score){
       this.score = score;
    }

     String getScore(){
       return score;
    }

     Memento saveScoreToMemento(){
       return new Memento(score);
    }

     void getScoreFromMemento(Memento memento){
       score = memento.getScore();
    }
}
