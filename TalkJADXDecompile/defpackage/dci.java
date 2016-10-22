package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: dci */
public class dci<ListViewType extends AbsListView, AdapterType extends enk> extends dcp<ListViewType> implements OnScrollListener {
    public AdapterType bH;

    public void onDetach() {
        if (this.bH != null) {
            this.bH.b(null);
        }
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
        if (this.bH != null && this.bH.a() != null) {
            this.bH.c();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.bH != null && this.bH.a() != null) {
            this.bH.d();
        }
    }

    public boolean isEmpty() {
        return this.bH == null || this.bH.a() == null || this.bH.getCount() == 0;
    }
}
