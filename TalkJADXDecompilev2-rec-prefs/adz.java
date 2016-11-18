package p000;

import android.database.Observable;

public final class adz extends Observable<aea> {
    adz() {
    }

    public boolean m755a() {
        return !this.mObservers.isEmpty();
    }

    public void m753a(int i, int i2) {
        m754a(i, i2, null);
    }

    public void m754a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).mo104a(i, i2, obj);
        }
    }

    public void m756b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).mo102a(i, i2);
        }
    }

    public void m757c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).mo105b(i, i2);
        }
    }

    public void m758d(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aea) this.mObservers.get(size)).mo103a(i, i2, 1);
        }
    }
}
