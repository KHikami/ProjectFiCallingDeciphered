package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: dns */
final class dns implements dmz {
    final /* synthetic */ dnr a;

    dns(dnr dnr) {
        this.a = dnr;
    }

    public void a(lym lym) {
        this.a.c();
        this.a.a(lym);
    }

    public void b(lym lym) {
        String string;
        dnr dnr = this.a;
        Resources resources = dnr.a.getResources();
        if (TextUtils.isEmpty(lym.d)) {
            string = resources.getString(ba.lh);
        } else {
            string = resources.getString(ba.lg, new Object[]{lym.d});
        }
        dnr.b.a(new dog().a(1).a(string).a(false).a());
    }

    public void c(lym lym) {
        String string;
        dnr dnr = this.a;
        Resources resources = dnr.a.getResources();
        if (TextUtils.isEmpty(lym.d)) {
            string = resources.getString(ba.lm);
        } else {
            string = resources.getString(ba.ll, new Object[]{lym.d});
        }
        dnr.b.a(new dog().a(1).a(string).a(false).a());
    }

    public void a() {
    }

    public void b() {
        this.a.c();
        dnr dnr = this.a;
        dnr.e = new dnf();
        dnr.e.a(new dnt(dnr));
        dnr.e.a(dnr.a.J_(), null);
    }
}
