package p000;

import android.database.DataSetObserver;

final class dai extends DataSetObserver {
    final /* synthetic */ dah f9424a;

    dai(dah dah) {
        this.f9424a = dah;
    }

    public void onChanged() {
        this.f9424a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.f9424a.notifyDataSetInvalidated();
    }
}
