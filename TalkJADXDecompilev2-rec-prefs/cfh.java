package p000;

import android.widget.AbsListView;
import android.widget.ListView;

final class cfh implements Runnable {
    final /* synthetic */ AbsListView f5176a;
    final /* synthetic */ bko f5177b;
    final /* synthetic */ cdr f5178c;

    cfh(cdr cdr, AbsListView absListView, bko bko) {
        this.f5178c = cdr;
        this.f5176a = absListView;
        this.f5177b = bko;
    }

    public void run() {
        if (!this.f5178c.at && this.f5178c.getActivity() != null && !this.f5178c.getActivity().isFinishing()) {
            ((ListView) this.f5178c.bI).setSelection(((bns) this.f5178c.bH).getCount() - 1);
            gwb.m1864a(new cfi(this), 200);
        }
    }
}
