package p000;

import android.content.Context;
import android.text.TextUtils;

public final class boe {
    private final bko f4087a;
    private final ky<String, bof> f4088b = new ky();
    private final gkq<String> f4089c = new gkq();

    boe(bko bko) {
        this.f4087a = bko;
    }

    public edk m6285a(edo edo, boolean z) {
        bof bof;
        synchronized (this.f4088b) {
            String str = (String) this.f4089c.get(edo);
            if (str != null) {
                bof = (bof) this.f4088b.get(str);
            } else {
                bof = null;
            }
        }
        if (bof != null) {
            return bof.f4090a;
        }
        if (z) {
            iil.m21876b();
            return new blo(gwb.m1400H(), this.f4087a.m5638g()).m5947a(gwb.m1987b(edo));
        }
        fqu.m16003a(edo, this.f4087a);
        return null;
    }

    public edk m6286a(String str, boolean z) {
        synchronized (this.f4088b) {
            bof bof = (bof) this.f4088b.get(str);
        }
        if (bof != null) {
            return bof.f4090a;
        }
        if (z) {
            iil.m21876b();
            return new blo(gwb.m1400H(), this.f4087a.m5638g()).m5914F(str);
        }
        fqu.m16005a(str, this.f4087a);
        return null;
    }

    public void m6287a(edk edk, String str) {
        if (str != null) {
            m6288a(str, edk, edk.m13600j() == null);
        }
    }

    public boolean m6288a(String str, edk edk, boolean z) {
        if (edk == null || str == null) {
            return false;
        }
        boolean z2;
        edk edk2;
        synchronized (this.f4088b) {
            edk edk3;
            Context H;
            String str2;
            String str3;
            edk edk4;
            bof bof = (bof) this.f4088b.get(str);
            if (bof != null) {
                if (bof.f4090a.f11213b != null) {
                    if (bof.f4090a.f11213b.m13608a(edk.f11213b)) {
                        edk3 = bof.f4090a;
                        if (edk3 == null) {
                            H = gwb.m1400H();
                            str2 = edk.f11213b == null ? null : edk.f11213b.f11244a;
                            if (edk.f11213b == null) {
                                str3 = null;
                            } else {
                                str3 = edk.f11213b.f11245b;
                            }
                            edk3 = gwb.m1598a(H, str2, str3, edk.f11215d, edk.f11214c, edk.f11216e, edk.f11217f, edk.f11218g, edk.f11219h, edk.f11229r, edk.f11220i);
                            edk3.m13591b(edk.m13600j());
                            this.f4088b.put(str, new bof(edk3));
                            this.f4089c.put(edk3.f11213b, str);
                            edk4 = edk3;
                            z2 = true;
                            edk2 = edk4;
                        } else {
                            edk4 = edk3;
                            z2 = false;
                            edk2 = edk4;
                        }
                        if (z && edk2.m13600j() != null) {
                            edk2.m13591b(null);
                        }
                    }
                } else if (bof.f4090a.f11215d != null && bof.f4090a.f11215d.equals(edk.f11215d)) {
                    edk3 = bof.f4090a;
                    if (edk3 == null) {
                        edk4 = edk3;
                        z2 = false;
                        edk2 = edk4;
                    } else {
                        H = gwb.m1400H();
                        if (edk.f11213b == null) {
                        }
                        if (edk.f11213b == null) {
                            str3 = edk.f11213b.f11245b;
                        } else {
                            str3 = null;
                        }
                        edk3 = gwb.m1598a(H, str2, str3, edk.f11215d, edk.f11214c, edk.f11216e, edk.f11217f, edk.f11218g, edk.f11219h, edk.f11229r, edk.f11220i);
                        edk3.m13591b(edk.m13600j());
                        this.f4088b.put(str, new bof(edk3));
                        this.f4089c.put(edk3.f11213b, str);
                        edk4 = edk3;
                        z2 = true;
                        edk2 = edk4;
                    }
                    edk2.m13591b(null);
                }
            }
            edk3 = null;
            if (edk3 == null) {
                H = gwb.m1400H();
                if (edk.f11213b == null) {
                }
                if (edk.f11213b == null) {
                    str3 = null;
                } else {
                    str3 = edk.f11213b.f11245b;
                }
                edk3 = gwb.m1598a(H, str2, str3, edk.f11215d, edk.f11214c, edk.f11216e, edk.f11217f, edk.f11218g, edk.f11219h, edk.f11229r, edk.f11220i);
                edk3.m13591b(edk.m13600j());
                this.f4088b.put(str, new bof(edk3));
                this.f4089c.put(edk3.f11213b, str);
                edk4 = edk3;
                z2 = true;
                edk2 = edk4;
            } else {
                edk4 = edk3;
                z2 = false;
                edk2 = edk4;
            }
            edk2.m13591b(null);
        }
        if (z2) {
            return z2;
        }
        if (!(TextUtils.isEmpty(edk.f11217f) || TextUtils.equals(edk.f11217f, edk2.f11217f))) {
            z2 = true;
            edk2.f11217f = edk.f11217f;
        }
        if (!(TextUtils.isEmpty(edk.f11216e) || TextUtils.equals(edk.f11216e, edk2.f11216e))) {
            z2 = true;
            edk2.f11216e = edk.f11216e;
        }
        if (!(TextUtils.isEmpty(edk.f11218g) || TextUtils.equals(edk.f11218g, edk2.f11218g))) {
            z2 = true;
            edk2.m13593c(edk.f11218g);
        }
        if (!(TextUtils.isEmpty(edk.f11229r) || TextUtils.equals(edk.f11229r, edk2.f11229r))) {
            z2 = true;
            edk2.f11229r = edk.f11229r;
        }
        if (!(TextUtils.isEmpty(edk.f11219h) || TextUtils.equals(edk.f11219h, edk2.f11219h))) {
            z2 = true;
            edk2.f11219h = edk.f11219h;
        }
        if (edk.f11220i == null || edk.f11220i == edk2.f11220i) {
            return z2;
        }
        edk2.f11220i = edk.f11220i;
        return true;
    }
}
