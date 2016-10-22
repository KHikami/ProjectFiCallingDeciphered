package defpackage;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: cfg */
final class cfg implements bpg {
    final /* synthetic */ bko a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int g;
    final /* synthetic */ View h;
    final /* synthetic */ AbsListView i;
    final /* synthetic */ cdr j;

    cfg(cdr cdr, bko bko, boolean z, int i, int i2, int i3, boolean z2, int i4, View view, AbsListView absListView) {
        this.j = cdr;
        this.a = bko;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = i4;
        this.h = view;
        this.i = absListView;
    }

    public void a(bpd bpd) {
        boolean z = true;
        if (this.j.aR) {
            gwb.a(this.a, 2978);
        }
        if (gpf.f) {
            gwb.a(this.a, 2979);
        }
        String str;
        int i;
        int i2;
        int i3;
        if (this.b) {
            gwb.a(this.a, 2758, (this.c - this.d) - this.e);
            if (this.d == 0) {
                gwb.a(this.a, 2977);
            }
            if (gwb.j(bpd.b)) {
                gwb.a(this.a, 2942);
            } else if (gwb.h(bpd.b)) {
                gwb.a(this.a, 2943);
            } else if (gwb.l(bpd.b)) {
                gwb.a(this.a, 2944);
            } else {
                gwb.a(this.a, 2945);
            }
            if (this.j.aP.size() > 1) {
                gwb.a(this.a, 2946);
            }
            str = "Babel_Scroll";
            i = this.d;
            i2 = (this.d + this.e) - 1;
            i3 = this.c;
            int i4 = bpd.b;
            if (this.j.aP.size() <= 1) {
                z = false;
            }
            glk.c(str, "message list loaded without bottom message showing, first message showing: " + i + ", last message showing: " + i2 + ", total: " + i3 + ", transport: " + i4 + ", merged conversation? " + z, new Object[0]);
        } else if (this.f) {
            gwb.a(this.a, 2759, this.g);
            if (gwb.j(bpd.b)) {
                gwb.a(this.a, 2948);
            } else if (gwb.h(bpd.b)) {
                gwb.a(this.a, 2949);
            } else if (gwb.l(bpd.b)) {
                gwb.a(this.a, 2950);
            } else {
                gwb.a(this.a, 2951);
            }
            if (this.j.aP.size() > 1) {
                gwb.a(this.a, 2952);
            }
            str = "Babel_Scroll";
            i = this.h.getBottom();
            i2 = this.i.getBottom();
            i3 = bpd.b;
            if (this.j.aP.size() <= 1) {
                z = false;
            }
            glk.c(str, "message list loaded with bottom message not aligned, last bottom: " + i + ", listBottom: " + i2 + ", transport: " + i3 + ", merged conversation?" + z, new Object[0]);
        }
        if (gwb.a(this.j.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            iil.a("message list not aligned");
        }
    }
}
