import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {
        Exchanger<Action> exchanger=new Exchanger<>();
        List<Action> actionList=new ArrayList<>();
        actionList.add(Action.NOZHNICI);
        actionList.add(Action.BYMAGA);
        actionList.add(Action.KAMEN);
        new Person2("Iskander", exchanger,actionList );
        List<Action> actionList2=new ArrayList<>();
        actionList2.add(Action.KAMEN);
        actionList2.add(Action.KAMEN);
        actionList2.add(Action.NOZHNICI);
        new Person2("Roma", exchanger,actionList2 );

    }
}

enum Action{
    KAMEN, NOZHNICI, BYMAGA
}

class Person2 extends Thread{
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> actions;

    public Person2(String name, Exchanger exchanger, List<Action> actions) {
        this.name = name;
        this.exchanger = exchanger;
        this.actions = actions;
        this.start();
    }

    private void whoWins(Action action, Action actionFrind){
        if ( (action==Action.BYMAGA && actionFrind==Action.KAMEN) ||
                (action==Action.KAMEN && actionFrind==Action.NOZHNICI) ||
                (action==Action.NOZHNICI && actionFrind==Action.BYMAGA)){
            System.out.println(name + " wins! Congratulation");
        }
    }

    @Override
    public void run() {
        for (Action action: actions){
            try {
                Action friendAction=exchanger.exchange(action);
                whoWins(action, friendAction);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
