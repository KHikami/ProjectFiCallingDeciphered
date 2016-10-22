package defpackage;

import android.text.TextUtils;

/* renamed from: dnl */
final class dnl extends ijj {
    final /* synthetic */ dnh a;

    dnl(dnh dnh) {
        this.a = dnh;
    }

    public void a() {
        this.a.n = true;
        for (lym lym : this.a.j.b().values()) {
            if (gwb.a(lym.p) == 10) {
                this.a.g.put(lym.b, lym);
            }
        }
        this.a.l = this.a.j.a();
        iil.b("Expected non-null", this.a.l);
        dnh dnh = this.a;
        boolean z = dnh.o;
        dnh.o = false;
        if (!(!dnh.n || dnh.l == null || dnh.l.r == null)) {
            for (int i : dnh.l.r) {
                if (i == 1) {
                    dnh.o = true;
                }
            }
        }
        if (z != dnh.o) {
            for (dmz a : dnh.h) {
                a.a();
            }
            dnh.c();
        }
        glk.a("Babel", String.format("Found %d pending knocks on collection synced", new Object[]{Integer.valueOf(this.a.g.size())}), new Object[0]);
        this.a.c();
    }

    private void a(lym lym) {
        if (this.a.n) {
            String str = lym.b;
            switch (gwb.a(lym.p)) {
                case wi.dr /*10*/:
                    glk.a("Babel", String.format("New knocker (%s)", new Object[]{str}), new Object[0]);
                    this.a.g.put(str, lym);
                    this.a.c();
                case wi.dB /*11*/:
                    glk.a("Babel", String.format("Knock rejected (%s)", new Object[]{str}), new Object[0]);
                    for (dmz c : this.a.h) {
                        c.c(lym);
                    }
                case wi.dM /*12*/:
                    glk.a("Babel", String.format("Knock accepted (%s)", new Object[]{str}), new Object[0]);
                    for (dmz c2 : this.a.h) {
                        c2.b(lym);
                    }
                default:
            }
        }
    }

    private void a(lym lym, lym lym2) {
        int i = 0;
        CharSequence charSequence = lym2.b;
        int a = gwb.a(lym2.p);
        int a2 = gwb.a(lym.p);
        if (this.a.l != null && TextUtils.equals(charSequence, this.a.l.b)) {
            this.a.l = lym2;
            dnh dnh = this.a;
            boolean z = dnh.o;
            dnh.o = false;
            if (!(!dnh.n || dnh.l == null || dnh.l.r == null)) {
                int[] iArr = dnh.l.r;
                int length = iArr.length;
                while (i < length) {
                    if (iArr[i] == 1) {
                        dnh.o = true;
                    }
                    i++;
                }
            }
            if (z != dnh.o) {
                for (dmz a3 : dnh.h) {
                    a3.a();
                }
                dnh.c();
            }
        }
        switch (a) {
            case wi.dr /*10*/:
                if (a2 != 10) {
                    this.a.g.put(charSequence, lym2);
                    this.a.c();
                }
            case wi.dB /*11*/:
                if (a2 == 10) {
                    this.a.g.remove(charSequence);
                    this.a.c();
                    for (dmz a32 : this.a.h) {
                        a32.c(lym2);
                    }
                }
            case wi.dM /*12*/:
                if (a2 == 10) {
                    this.a.g.remove(charSequence);
                    this.a.c();
                    for (dmz a322 : this.a.h) {
                        a322.b(lym2);
                    }
                }
            default:
                if (this.a.g.remove(charSequence) != null) {
                    this.a.c();
                }
        }
    }

    private void b(lym lym) {
        int i = 0;
        CharSequence charSequence = lym.b;
        if (this.a.l != null && TextUtils.equals(charSequence, this.a.l.b)) {
            this.a.l = null;
            dnh dnh = this.a;
            boolean z = dnh.o;
            dnh.o = false;
            if (!(!dnh.n || dnh.l == null || dnh.l.r == null)) {
                int[] iArr = dnh.l.r;
                int length = iArr.length;
                while (i < length) {
                    if (iArr[i] == 1) {
                        dnh.o = true;
                    }
                    i++;
                }
            }
            if (z != dnh.o) {
                for (dmz a : dnh.h) {
                    a.a();
                }
                dnh.c();
            }
        }
        if (this.a.g.remove(charSequence) != null) {
            this.a.c();
        }
    }
}
