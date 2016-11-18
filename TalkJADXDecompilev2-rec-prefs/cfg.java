package p000;

import android.view.View;
import android.widget.AbsListView;

final class cfg implements bpg {
    final /* synthetic */ bko f5166a;
    final /* synthetic */ boolean f5167b;
    final /* synthetic */ int f5168c;
    final /* synthetic */ int f5169d;
    final /* synthetic */ int f5170e;
    final /* synthetic */ boolean f5171f;
    final /* synthetic */ int f5172g;
    final /* synthetic */ View f5173h;
    final /* synthetic */ AbsListView f5174i;
    final /* synthetic */ cdr f5175j;

    cfg(cdr cdr, bko bko, boolean z, int i, int i2, int i3, boolean z2, int i4, View view, AbsListView absListView) {
        this.f5175j = cdr;
        this.f5166a = bko;
        this.f5167b = z;
        this.f5168c = i;
        this.f5169d = i2;
        this.f5170e = i3;
        this.f5171f = z2;
        this.f5172g = i4;
        this.f5173h = view;
        this.f5174i = absListView;
    }

    public void mo720a(bpd bpd) {
        boolean z = true;
        if (this.f5175j.aR) {
            gwb.m1823a(this.f5166a, 2978);
        }
        if (gpf.f4439f) {
            gwb.m1823a(this.f5166a, 2979);
        }
        String str;
        int i;
        int i2;
        int i3;
        if (this.f5167b) {
            gwb.m1824a(this.f5166a, 2758, (this.f5168c - this.f5169d) - this.f5170e);
            if (this.f5169d == 0) {
                gwb.m1823a(this.f5166a, 2977);
            }
            if (gwb.m2267j(bpd.f4147b)) {
                gwb.m1823a(this.f5166a, 2942);
            } else if (gwb.m2237h(bpd.f4147b)) {
                gwb.m1823a(this.f5166a, 2943);
            } else if (gwb.m2291l(bpd.f4147b)) {
                gwb.m1823a(this.f5166a, 2944);
            } else {
                gwb.m1823a(this.f5166a, 2945);
            }
            if (this.f5175j.aP.size() > 1) {
                gwb.m1823a(this.f5166a, 2946);
            }
            str = "Babel_Scroll";
            i = this.f5169d;
            i2 = (this.f5169d + this.f5170e) - 1;
            i3 = this.f5168c;
            int i4 = bpd.f4147b;
            if (this.f5175j.aP.size() <= 1) {
                z = false;
            }
            glk.m17979c(str, "message list loaded without bottom message showing, first message showing: " + i + ", last message showing: " + i2 + ", total: " + i3 + ", transport: " + i4 + ", merged conversation? " + z, new Object[0]);
        } else if (this.f5171f) {
            gwb.m1824a(this.f5166a, 2759, this.f5172g);
            if (gwb.m2267j(bpd.f4147b)) {
                gwb.m1823a(this.f5166a, 2948);
            } else if (gwb.m2237h(bpd.f4147b)) {
                gwb.m1823a(this.f5166a, 2949);
            } else if (gwb.m2291l(bpd.f4147b)) {
                gwb.m1823a(this.f5166a, 2950);
            } else {
                gwb.m1823a(this.f5166a, 2951);
            }
            if (this.f5175j.aP.size() > 1) {
                gwb.m1823a(this.f5166a, 2952);
            }
            str = "Babel_Scroll";
            i = this.f5173h.getBottom();
            i2 = this.f5174i.getBottom();
            i3 = bpd.f4147b;
            if (this.f5175j.aP.size() <= 1) {
                z = false;
            }
            glk.m17979c(str, "message list loaded with bottom message not aligned, last bottom: " + i + ", listBottom: " + i2 + ", transport: " + i3 + ", merged conversation?" + z, new Object[0]);
        }
        if (gwb.m1906a(this.f5175j.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            iil.m21870a("message list not aligned");
        }
    }
}
