package p000;

import android.text.TextUtils;

final class dnl extends ijj {
    final /* synthetic */ dnh f10172a;

    dnl(dnh dnh) {
        this.f10172a = dnh;
    }

    public void mo1425a() {
        this.f10172a.f10164n = true;
        for (lym lym : this.f10172a.f10160j.mo3365b().values()) {
            if (gwb.m1507a(lym.f26921p) == 10) {
                this.f10172a.f10157g.put(lym.f26907b, lym);
            }
        }
        this.f10172a.f10162l = this.f10172a.f10160j.mo3376a();
        iil.m21875b("Expected non-null", this.f10172a.f10162l);
        dnh dnh = this.f10172a;
        boolean z = dnh.f10165o;
        dnh.f10165o = false;
        if (!(!dnh.f10164n || dnh.f10162l == null || dnh.f10162l.f26923r == null)) {
            for (int i : dnh.f10162l.f26923r) {
                if (i == 1) {
                    dnh.f10165o = true;
                }
            }
        }
        if (z != dnh.f10165o) {
            for (dmz a : dnh.f10158h) {
                a.mo1617a();
            }
            dnh.m12289c();
        }
        glk.m17970a("Babel", String.format("Found %d pending knocks on collection synced", new Object[]{Integer.valueOf(this.f10172a.f10157g.size())}), new Object[0]);
        this.f10172a.m12289c();
    }

    private void m12297a(lym lym) {
        if (this.f10172a.f10164n) {
            String str = lym.f26907b;
            switch (gwb.m1507a(lym.f26921p)) {
                case 10:
                    glk.m17970a("Babel", String.format("New knocker (%s)", new Object[]{str}), new Object[0]);
                    this.f10172a.f10157g.put(str, lym);
                    this.f10172a.m12289c();
                    return;
                case 11:
                    glk.m17970a("Babel", String.format("Knock rejected (%s)", new Object[]{str}), new Object[0]);
                    for (dmz c : this.f10172a.f10158h) {
                        c.mo1621c(lym);
                    }
                    return;
                case 12:
                    glk.m17970a("Babel", String.format("Knock accepted (%s)", new Object[]{str}), new Object[0]);
                    for (dmz c2 : this.f10172a.f10158h) {
                        c2.mo1620b(lym);
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private void m12298a(lym lym, lym lym2) {
        int i = 0;
        CharSequence charSequence = lym2.f26907b;
        int a = gwb.m1507a(lym2.f26921p);
        int a2 = gwb.m1507a(lym.f26921p);
        if (this.f10172a.f10162l != null && TextUtils.equals(charSequence, this.f10172a.f10162l.f26907b)) {
            this.f10172a.f10162l = lym2;
            dnh dnh = this.f10172a;
            boolean z = dnh.f10165o;
            dnh.f10165o = false;
            if (!(!dnh.f10164n || dnh.f10162l == null || dnh.f10162l.f26923r == null)) {
                int[] iArr = dnh.f10162l.f26923r;
                int length = iArr.length;
                while (i < length) {
                    if (iArr[i] == 1) {
                        dnh.f10165o = true;
                    }
                    i++;
                }
            }
            if (z != dnh.f10165o) {
                for (dmz a3 : dnh.f10158h) {
                    a3.mo1617a();
                }
                dnh.m12289c();
            }
        }
        switch (a) {
            case 10:
                if (a2 != 10) {
                    this.f10172a.f10157g.put(charSequence, lym2);
                    this.f10172a.m12289c();
                    return;
                }
                return;
            case 11:
                if (a2 == 10) {
                    this.f10172a.f10157g.remove(charSequence);
                    this.f10172a.m12289c();
                    for (dmz a32 : this.f10172a.f10158h) {
                        a32.mo1621c(lym2);
                    }
                    return;
                }
                return;
            case 12:
                if (a2 == 10) {
                    this.f10172a.f10157g.remove(charSequence);
                    this.f10172a.m12289c();
                    for (dmz a322 : this.f10172a.f10158h) {
                        a322.mo1620b(lym2);
                    }
                    return;
                }
                return;
            default:
                if (this.f10172a.f10157g.remove(charSequence) != null) {
                    this.f10172a.m12289c();
                    return;
                }
                return;
        }
    }

    private void m12299b(lym lym) {
        int i = 0;
        CharSequence charSequence = lym.f26907b;
        if (this.f10172a.f10162l != null && TextUtils.equals(charSequence, this.f10172a.f10162l.f26907b)) {
            this.f10172a.f10162l = null;
            dnh dnh = this.f10172a;
            boolean z = dnh.f10165o;
            dnh.f10165o = false;
            if (!(!dnh.f10164n || dnh.f10162l == null || dnh.f10162l.f26923r == null)) {
                int[] iArr = dnh.f10162l.f26923r;
                int length = iArr.length;
                while (i < length) {
                    if (iArr[i] == 1) {
                        dnh.f10165o = true;
                    }
                    i++;
                }
            }
            if (z != dnh.f10165o) {
                for (dmz a : dnh.f10158h) {
                    a.mo1617a();
                }
                dnh.m12289c();
            }
        }
        if (this.f10172a.f10157g.remove(charSequence) != null) {
            this.f10172a.m12289c();
        }
    }
}
