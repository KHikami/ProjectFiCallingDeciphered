import java.util.Observable;
import java.util.Observer;

final class bwf implements Observer {
    final /* synthetic */ bwe a;

    bwf(bwe bwe) {
        this.a = bwe;
    }

    public void update(Observable observable, Object obj) {
        gwb.aJ();
        if (this.a.g) {
            this.a.d();
            this.a.b();
        }
    }
}
