package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class cys implements OnItemClickListener {
    final /* synthetic */ cyt f9346a;
    final /* synthetic */ cyp f9347b;

    cys(cyp cyp, cyt cyt) {
        this.f9347b = cyp;
        this.f9346a = cyt;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f9346a != null) {
            this.f9346a.mo1096a((gnj) view);
        }
    }
}
