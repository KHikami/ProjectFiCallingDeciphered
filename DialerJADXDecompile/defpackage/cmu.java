package defpackage;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: cmu */
final class cmu implements cjy {
    private /* synthetic */ LinkedBlockingQueue a;

    cmu(cmo cmo, LinkedBlockingQueue linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    public final void a(String str) {
        try {
            this.a.put(str);
        } catch (InterruptedException e) {
        }
    }
}
