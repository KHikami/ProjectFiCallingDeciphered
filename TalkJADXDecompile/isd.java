import java.util.Iterator;

final class isd implements Runnable {
    final /* synthetic */ iry a;

    isd(iry iry) {
        this.a = iry;
    }

    public void run() {
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
