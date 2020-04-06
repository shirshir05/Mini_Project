package Business_Layer.Trace;
import java.util.Observable;

public abstract class PersonalPage extends Observable {
    protected String name;
    public PersonalPage(String page_name){
        name=page_name;
    }
    /*
    כאשר רוצים לשנות משהו בתוך הפונקציה נקרא לשיטות:
public change(){
        setChanged();
        notifyObservers();
}

כדי להוסיף נושא מסוים עושים:
subject.addObserver(צופה);
     */

}
