package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class eux extends esw {
    private static final int[] f12330k = new int[]{1};
    private static final long serialVersionUID = 1;
    public List<fbt> f12331c;
    public final String f12332d;
    public final boolean f12333e;
    public final boolean f12334f;

    public eux(List<fbt> list, String str, boolean z, boolean z2) {
        this.f12331c = list;
        this.f12334f = z;
        this.f12332d = str;
        this.f12333e = z2;
    }

    public boolean mo1022a(int i) {
        return true;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return !this.f12334f && super.mo1008a(context, eaf, fdo);
    }

    public long mo1017b() {
        if (this.f12334f) {
            return 0;
        }
        return super.mo1017b();
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        if (!this.f12334f) {
            for (fbt a : this.f12331c) {
                fqu.m16000a(bko).m16008a(a);
            }
        }
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            String valueOf = String.valueOf(this.f12331c);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("GetEntityByIdRequest: lookupSpecs=").append(valueOf);
        }
        nzf lrd = new lrd();
        lrd.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        lrd.f26206b = f12330k;
        int i3 = 0;
        for (fbt fbt : this.f12331c) {
            int i4;
            if (fbt != null) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        if (i3 > 0) {
            lrd.f26205a = new lqd[i3];
        }
        boolean z = i3 < this.f12331c.size();
        i3 = 0;
        boolean z2 = z;
        for (fbt fbt2 : this.f12331c) {
            if (fbt2 == null) {
                glk.m17982e("BabelClient", "GetEntityByIdRequest: null spec!", new Object[0]);
                z2 = true;
            } else {
                int i5 = i3 + 1;
                lrd.f26205a[i3] = fbt2.m14925d();
                i3 = i5;
            }
        }
        if (z2) {
            m14595n();
        }
        return lrd;
    }

    private void m14595n() {
        List arrayList = new ArrayList();
        for (fbt fbt : this.f12331c) {
            if (fbt != null) {
                arrayList.add(fbt);
            }
        }
        this.f12331c = arrayList;
    }

    public String mo1947g() {
        return "contacts/getentitybyid";
    }
}
