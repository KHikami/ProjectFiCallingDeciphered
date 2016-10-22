package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ghx */
final class ghx implements OnItemClickListener {
    final /* synthetic */ ghw a;

    ghx(ghw ghw) {
        this.a = ghw;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            ((ghy) ((ghp) this.a.getActivity()).g()).f();
        } else {
            ((ghy) ((ghp) this.a.getActivity()).g()).g();
        }
    }
}
