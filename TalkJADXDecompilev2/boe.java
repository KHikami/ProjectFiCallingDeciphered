package defpackage;

import android.content.Context;
import android.text.TextUtils;

public final class boe {
    private final bko a;
    private final ky<String, bof> b = new ky();
    private final gkq<String> c = new gkq();

    boe(bko bko) {
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
        edk edk2;
        synchronized (this.b) {
            edk edk3;
            Context H;
            String str2;
            String str3;
            edk edk4;
            bof bof = (bof) this.b.get(str);
            if (bof != null) {
                if (bof.a.b != null) {
                    if (bof.a.b.a(edk.b)) {
                        edk3 = bof.a;
                        if (edk3 == null) {
                            H = gwb.H();
                            str2 = edk.b == null ? null : edk.b.a;
                            if (edk.b == null) {
                                str3 = null;
                            } else {
                                str3 = edk.b.b;
                            }
                            edk3 = gwb.a(H, str2, str3, edk.d, edk.c, edk.e, edk.f, edk.g, edk.h, edk.r, edk.i);
                            edk3.b(edk.j());
                            this.b.put(str, new bof(edk3));
                            this.c.put(edk3.b, str);
                            edk4 = edk3;
                            z2 = true;
                            edk2 = edk4;
                        } else {
                            edk4 = edk3;
                            z2 = false;
                            edk2 = edk4;
                        }
                        if (z && edk2.j() != null) {
                            edk2.b(null);
                        }
                    }
                } else if (bof.a.d != null && bof.a.d.equals(edk.d)) {
                    edk3 = bof.a;
                    if (edk3 == null) {
                        edk4 = edk3;
                        z2 = false;
                        edk2 = edk4;
                    } else {
                        H = gwb.H();
                        if (edk.b == null) {
                        }
                        if (edk.b == null) {
                            str3 = edk.b.b;
                        } else {
                            str3 = null;
                        }
                        edk3 = gwb.a(H, str2, str3, edk.d, edk.c, edk.e, edk.f, edk.g, edk.h, edk.r, edk.i);
                        edk3.b(edk.j());
                        this.b.put(str, new bof(edk3));
                        this.c.put(edk3.b, str);
                        edk4 = edk3;
                        z2 = true;
                        edk2 = edk4;
                    }
                    edk2.b(null);
                }
            }
            edk3 = null;
            if (edk3 == null) {
                H = gwb.H();
                if (edk.b == null) {
                }
                if (edk.b == null) {
                    str3 = null;
                } else {
                    str3 = edk.b.b;
                }
                edk3 = gwb.a(H, str2, str3, edk.d, edk.c, edk.e, edk.f, edk.g, edk.h, edk.r, edk.i);
                edk3.b(edk.j());
                this.b.put(str, new bof(edk3));
                this.c.put(edk3.b, str);
                edk4 = edk3;
                z2 = true;
                edk2 = edk4;
            } else {
                edk4 = edk3;
                z2 = false;
                edk2 = edk4;
            }
            edk2.b(null);
        }
        if (z2) {
            return z2;
        }
        if (!(TextUtils.isEmpty(edk.f) || TextUtils.equals(edk.f, edk2.f))) {
            z2 = true;
            edk2.f = edk.f;
        }
        if (!(TextUtils.isEmpty(edk.e) || TextUtils.equals(edk.e, edk2.e))) {
            z2 = true;
            edk2.e = edk.e;
        }
        if (!(TextUtils.isEmpty(edk.g) || TextUtils.equals(edk.g, edk2.g))) {
            z2 = true;
            edk2.c(edk.g);
        }
        if (!(TextUtils.isEmpty(edk.r) || TextUtils.equals(edk.r, edk2.r))) {
            z2 = true;
            edk2.r = edk.r;
        }
        if (!(TextUtils.isEmpty(edk.h) || TextUtils.equals(edk.h, edk2.h))) {
            z2 = true;
            edk2.h = edk.h;
        }
        if (edk.i == null || edk.i == edk2.i) {
            return z2;
        }
        edk2.i = edk.i;
        return true;
    }
}
