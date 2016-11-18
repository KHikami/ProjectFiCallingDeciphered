package p000;

import android.widget.ListView;

final class cfr implements Runnable {
    final /* synthetic */ bko f5199a;
    final /* synthetic */ bpd f5200b;
    final /* synthetic */ CharSequence f5201c;
    final /* synthetic */ bxn f5202d;
    final /* synthetic */ boolean f5203e;
    final /* synthetic */ String f5204f;
    final /* synthetic */ cdr f5205g;

    cfr(cdr cdr, bko bko, bpd bpd, CharSequence charSequence, bxn bxn, boolean z, String str) {
        this.f5205g = cdr;
        this.f5199a = bko;
        this.f5200b = bpd;
        this.f5201c = charSequence;
        this.f5202d = bxn;
        this.f5203e = z;
        this.f5204f = str;
    }

    public void run() {
        if (gwb.m1906a(this.f5205g.context, "babel_extra_log_scrolling", false)) {
            glk.m17979c("Babel_Scroll", "sendMessage postDelay autoScrolling:" + this.f5205g.aM, new Object[0]);
        }
        if (this.f5205g.aM && gwb.m1906a(this.f5205g.context, "babel_disable_events_on_auto_scroll", true)) {
            glk.m17981d("Babel_Scroll", "force selection was required.", new Object[0]);
            this.f5205g.aM = false;
            ((ListView) this.f5205g.bI).setSelection(((ListView) this.f5205g.bI).getAdapter().getCount() - 1);
        }
        this.f5205g.aM = false;
        this.f5205g.bC.mo1028a(this.f5199a.m5638g(), this.f5200b.f4146a, this.f5201c, this.f5202d, this.f5203e, this.f5204f);
        this.f5205g.f5104g.m7750a(this.f5200b.f4146a, this.f5204f);
    }
}
