package p000;

import android.database.DataSetObserver;

final class adh extends DataSetObserver {
    final /* synthetic */ add f337a;

    adh(add add) {
        this.f337a = add;
    }

    public void onChanged() {
        if (this.f337a.m157d()) {
            this.f337a.mo14a();
        }
    }

    public void onInvalidated() {
        this.f337a.m154c();
    }
}
