package defpackage;

import android.database.Observable;

/* renamed from: adz */
public final class adz extends Observable<aea> {
    adz() {
    }

    public boolean a() {
        return !this.mObservers.isEmpty();
    }

    public void a(int i, int i2) {
        a(i, i2, null);
    }

    public void a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).a(i, i2, obj);
        }
    }

    public void b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).a(i, i2);
        }
    }

    public void c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).b(i, i2);
        }
    }

    public void d(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).a(i, i2, 1);
        }
    }
}
