package p000;

import android.database.DataSetObserver;

final class ry extends DataSetObserver {
    final /* synthetic */ rw f35093a;

    ry(rw rwVar) {
        this.f35093a = rwVar;
    }

    public void onChanged() {
        this.f35093a.f35083a = true;
        this.f35093a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.f35093a.f35083a = false;
        this.f35093a.notifyDataSetInvalidated();
    }
}
