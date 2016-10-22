package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: boe */
public final class boe {
    private final bko a;
    private final ky<String, bof> b;
    private final gkq<String> c;

    boe(bko bko) {
        this.b = new ky();
        this.c = new gkq();
        this.a = bko;
    }

    public edk a(edo edo, boolean z) {
        bof bof;
        synchronized (this.b) {
            String str = (String) this.c.get(edo);
            if (str != null) {
                bof = (bof) this.b.get(str);
            } else {
                bof = null;
            }
        }
        if (bof != null) {
            return bof.a;
        }
        if (z) {
            iil.b();
            return new blo(gwb.H(), this.a.g()).a(gwb.b(edo));
        }
        fqu.a(edo, this.a);
        return null;
    }

    public edk a(String str, boolean z) {
        synchronized (this.b) {
            bof bof = (bof) this.b.get(str);
        }
        if (bof != null) {
            return bof.a;
        }
        if (z) {
            iil.b();
            return new blo(gwb.H(), this.a.g()).F(str);
        }
        fqu.a(str, this.a);
        return null;
    }

    public void a(edk edk, String str) {
        if (str != null) {
            a(str, edk, edk.j() == null);
        }
    }

    public boolean a(String str, edk edk, boolean z) {
        if (edk == null || str == null) {
            return false;
        }
        boolean z2;
        synchronized (this.b) {
            edk edk2;
            Context H;
            String str2;
            String str3;
            edk edk3;
            edk edk4;
            bof bof = (bof) this.b.get(str);
            if (bof != null) {
                if (bof.a.b != null) {
                    if (bof.a.b.a(edk.b)) {
                        edk2 = bof.a;
                        if (edk2 == null) {
                            H = gwb.H();
                            str2 = edk.b == null ? null : edk.b.a;
                            if (edk.b == null) {
                                str3 = null;
                            } else {
                                str3 = edk.b.b;
                            }
                            edk2 = gwb.a(H, str2, str3, edk.d, edk.c, edk.e, edk.f, edk.g, edk.h, edk.r, edk.i);
                            edk2.b(edk.j());
                            this.b.put(str, new bof(edk2));
                            this.c.put(edk2.b, str);
                            edk3 = edk2;
                            z2 = true;
                            edk4 = edk3;
                        } else {
                            edk3 = edk2;
                            z2 = false;
                            edk4 = edk3;
                        }
                        if (z && edk4.j() != null) {
                            edk4.b(null);
                        }
                    }
                } else if (bof.a.d != null && bof.a.d.equals(edk.d)) {
                    edk2 = bof.a;
                    if (edk2 == null) {
                        edk3 = edk2;
                        z2 = false;
                        edk4 = edk3;
                    } else {
                        H = gwb.H();
                        if (edk.b == null) {
                        }
                        if (edk.b == null) {
                            str3 = edk.b.b;
                        } else {
                            str3 = null;
                        }
                        edk2 = gwb.a(H, str2, str3, edk.d, edk.c, edk.e, edk.f, edk.g, edk.h, edk.r, edk.i);
                        edk2.b(edk.j());
                        this.b.put(str, new bof(edk2));
                        this.c.put(edk2.b, str);
                        edk3 = edk2;
                        z2 = true;
                        edk4 = edk3;
                    }
                    edk4.b(null);
                }
            }
            edk2 = null;
            if (edk2 == null) {
                H = gwb.H();
                if (edk.b == null) {
                }
                if (edk.b == null) {
                    str3 = null;
                } else {
                    str3 = edk.b.b;
                }
                edk2 = gwb.a(H, str2, str3, edk.d, edk.c, edk.e, edk.f, edk.g, edk.h, edk.r, edk.i);
                edk2.b(edk.j());
                this.b.put(str, new bof(edk2));
                this.c.put(edk2.b, str);
                edk3 = edk2;
                z2 = true;
                edk4 = edk3;
            } else {
                edk3 = edk2;
                z2 = false;
                edk4 = edk3;
            }
            edk4.b(null);
        }
        if (z2) {
            return z2;
        }
        if (!(TextUtils.isEmpty(edk.f) || TextUtils.equals(edk.f, edk4.f))) {
            z2 = true;
            edk4.f = edk.f;
        }
        if (!(TextUtils.isEmpty(edk.e) || TextUtils.equals(edk.e, edk4.e))) {
            z2 = true;
            edk4.e = edk.e;
        }
        if (!(TextUtils.isEmpty(edk.g) || TextUtils.equals(edk.g, edk4.g))) {
            z2 = true;
            edk4.c(edk.g);
        }
        if (!(TextUtils.isEmpty(edk.r) || TextUtils.equals(edk.r, edk4.r))) {
            z2 = true;
            edk4.r = edk.r;
        }
        if (!(TextUtils.isEmpty(edk.h) || TextUtils.equals(edk.h, edk4.h))) {
            z2 = true;
            edk4.h = edk.h;
        }
        if (edk.i == null || edk.i == edk4.i) {
            return z2;
        }
        edk4.i = edk.i;
        return true;
    }
}
