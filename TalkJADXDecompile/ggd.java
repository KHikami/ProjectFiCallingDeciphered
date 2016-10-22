import java.util.Iterator;

final class ggd implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ggc b;

    ggd(ggc ggc, String str) {
        this.b = ggc;
        this.a = str;
    }

    public void run() {
        Iterator it = ggc.a.iterator();
        while (it.hasNext()) {
            ((gge) it.next()).a(this.a);
        }
    }
}
