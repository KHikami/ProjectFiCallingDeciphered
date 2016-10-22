import android.database.DataSetObserver;

/* compiled from: PG */
final class anm extends DataSetObserver {
    private /* synthetic */ ank a;

    anm(ank ank) {
        this.a = ank;
    }

    public final void onChanged() {
        this.a.a.b();
    }
}
