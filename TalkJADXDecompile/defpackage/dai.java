package defpackage;

import android.database.DataSetObserver;

/* renamed from: dai */
final class dai extends DataSetObserver {
    final /* synthetic */ dah a;

    dai(dah dah) {
        this.a = dah;
    }

    public void onChanged() {
        this.a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
