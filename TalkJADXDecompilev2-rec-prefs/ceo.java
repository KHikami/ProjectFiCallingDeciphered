package p000;

import java.util.Observable;
import java.util.Observer;

final class ceo implements Observer {
    final /* synthetic */ cdr f5132a;

    ceo(cdr cdr) {
        this.f5132a = cdr;
    }

    public void update(Observable observable, Object obj) {
        this.f5132a.aL = ((glm) observable).m17985a();
        if (this.f5132a.getActivity() != null) {
            this.f5132a.m7423v();
        }
    }
}
