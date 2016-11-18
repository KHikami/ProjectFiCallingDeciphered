package defpackage;

import android.database.DataSetObserver;

final class ry extends DataSetObserver {
    final /* synthetic */ rw a;

    ry(rw rwVar) {
        this.a = rwVar;
    }

    public void onChanged() {
        this.a.a = true;
        this.a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.a.a = false;
        this.a.notifyDataSetInvalidated();
    }
}
