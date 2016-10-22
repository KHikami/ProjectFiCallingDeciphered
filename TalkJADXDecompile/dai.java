import android.database.DataSetObserver;

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
