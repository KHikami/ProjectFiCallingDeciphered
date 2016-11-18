package p000;

import android.database.DataSetObserver;

final class dra extends DataSetObserver {
    final /* synthetic */ dqz f10382a;

    dra(dqz dqz) {
        this.f10382a = dqz;
    }

    public void onChanged() {
        this.f10382a.notifyDataSetChanged();
        this.f10382a.m12525a(this.f10382a.f10378a.a());
    }

    public void onInvalidated() {
        this.f10382a.notifyDataSetInvalidated();
        this.f10382a.m12525a(this.f10382a.f10378a.a());
    }
}
