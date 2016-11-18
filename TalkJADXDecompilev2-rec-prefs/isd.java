package p000;

import java.util.Iterator;

final class isd implements Runnable {
    final /* synthetic */ iry f18848a;

    isd(iry iry) {
        this.f18848a = iry;
    }

    public void run() {
        Iterator it = this.f18848a.f18801t.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
