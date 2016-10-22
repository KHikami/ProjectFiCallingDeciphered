import java.util.Iterator;

final class isf implements Runnable {
    final /* synthetic */ iry a;

    isf(iry iry) {
        this.a = iry;
    }

    public void run() {
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
