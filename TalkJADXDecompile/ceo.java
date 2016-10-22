import java.util.Observable;
import java.util.Observer;

final class ceo implements Observer {
    final /* synthetic */ cdr a;

    ceo(cdr cdr) {
        this.a = cdr;
    }

    public void update(Observable observable, Object obj) {
        this.a.aL = ((glm) observable).a();
        if (this.a.getActivity() != null) {
            this.a.v();
        }
    }
}
