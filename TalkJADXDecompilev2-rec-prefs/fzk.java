package p000;

import android.content.Context;
import android.database.Cursor;

final class fzk implements fzg {
    private Cursor f14465a = null;
    private Cursor f14466b = null;
    private fxn f14467c;
    private fxn f14468d;

    public fzk(long j, long j2) {
        try {
            Context H = gwb.m1400H();
            this.f14465a = gwb.m1558a(H.getContentResolver(), fzb.f14424g, fyi.m16634f() ? fxr.f14305a : fxr.f14306b, fzb.m16678b(fzb.f14419b, "date", j, j2), null, "date DESC");
            this.f14466b = gwb.m1558a(H.getContentResolver(), fzb.f14423f, fxp.f14258a, fzb.m16678b(fzb.f14420c, "date", j / 1000, (999 + j2) / 1000), null, "date DESC");
            this.f14467c = m16695c();
            this.f14468d = m16696d();
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 45).append("SmsSyncManager.queryMms: failed to query mms ").append(valueOf).toString(), e);
            throw e;
        }
    }

    public fxn mo2140a() {
        fxn fxn;
        if (this.f14467c == null || this.f14468d == null) {
            if (this.f14467c != null) {
                fxn = this.f14467c;
                this.f14467c = m16695c();
                return fxn;
            }
            fxn = this.f14468d;
            this.f14468d = m16696d();
            return fxn;
        } else if (this.f14467c.mo2114c() >= this.f14468d.mo2114c()) {
            fxn = this.f14467c;
            this.f14467c = m16695c();
            return fxn;
        } else {
            fxn = this.f14468d;
            this.f14468d = m16696d();
            return fxn;
        }
    }

    private fxn m16695c() {
        if (this.f14465a == null || !this.f14465a.moveToNext()) {
            return null;
        }
        Cursor cursor = this.f14465a;
        fxn fxr = new fxr();
        fxr.m16507a(cursor);
        return fxr;
    }

    private fxn m16696d() {
        if (this.f14466b == null || !this.f14466b.moveToNext()) {
            return null;
        }
        return fxp.m16483a(this.f14466b);
    }

    public void mo2141b() {
        if (this.f14465a != null) {
            this.f14465a.close();
            this.f14465a = null;
        }
        if (this.f14466b != null) {
            this.f14466b.close();
            this.f14466b = null;
        }
    }
}
