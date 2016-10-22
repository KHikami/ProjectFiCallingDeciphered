package defpackage;

import android.widget.ListView;

/* renamed from: cfr */
final class cfr implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ bpd b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ bxn d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ cdr g;

    cfr(cdr cdr, bko bko, bpd bpd, CharSequence charSequence, bxn bxn, boolean z, String str) {
        this.g = cdr;
        this.a = bko;
        this.b = bpd;
        this.c = charSequence;
        this.d = bxn;
        this.e = z;
        this.f = str;
    }

    public void run() {
        if (gwb.a(this.g.context, "babel_extra_log_scrolling", false)) {
            glk.c("Babel_Scroll", "sendMessage postDelay autoScrolling:" + this.g.aM, new Object[0]);
        }
        if (this.g.aM && gwb.a(this.g.context, "babel_disable_events_on_auto_scroll", true)) {
            glk.d("Babel_Scroll", "force selection was required.", new Object[0]);
            this.g.aM = false;
            ((ListView) this.g.bI).setSelection(((ListView) this.g.bI).getAdapter().getCount() - 1);
        }
        this.g.aM = false;
        this.g.bC.a(this.a.g(), this.b.a, this.c, this.d, this.e, this.f);
        this.g.g.a(this.b.a, this.f);
    }
}
