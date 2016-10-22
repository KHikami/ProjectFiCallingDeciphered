import android.database.Observable;

/* compiled from: PG */
public final class yt extends Observable {
    yt() {
    }

    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((yu) this.mObservers.get(size)).a();
        }
    }

    public final void a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((yu) this.mObservers.get(size)).a(i, i2, null);
        }
    }

    public final void a(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((yu) this.mObservers.get(size)).a(i, 1);
        }
    }
}
