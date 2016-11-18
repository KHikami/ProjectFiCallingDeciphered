package p000;

import java.util.Iterator;

final class isf implements Runnable {
    final /* synthetic */ iry f18850a;

    isf(iry iry) {
        this.f18850a = iry;
    }

    public void run() {
        Iterator it = this.f18850a.f18801t.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
