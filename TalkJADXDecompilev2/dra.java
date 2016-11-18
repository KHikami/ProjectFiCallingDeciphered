package defpackage;

import android.database.DataSetObserver;

final class dra extends DataSetObserver {
    final /* synthetic */ dqz a;

    dra(dqz dqz) {
        this.a = dqz;
    }

    public void onChanged() {
        this.a.notifyDataSetChanged();
        this.a.a(this.a.a.a());
    }

    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
        this.a.a(this.a.a.a());
    }
}
