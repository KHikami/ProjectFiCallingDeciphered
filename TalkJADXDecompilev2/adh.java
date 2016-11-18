package defpackage;

import android.database.DataSetObserver;

final class adh extends DataSetObserver {
    final /* synthetic */ add a;

    adh(add add) {
        this.a = add;
    }

    public void onChanged() {
        if (this.a.d()) {
            this.a.a();
        }
    }

    public void onInvalidated() {
        this.a.c();
    }
}
