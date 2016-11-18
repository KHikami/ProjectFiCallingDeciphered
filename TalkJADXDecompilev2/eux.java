package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class eux extends esw {
    private static final int[] k = new int[]{1};
    private static final long serialVersionUID = 1;
    public List<fbt> c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public eux(List<fbt> list, String str, boolean z, boolean z2) {
        this.c = list;
        this.f = z;
        this.d = str;
        this.e = z2;
    }

    public boolean a(int i) {
        return true;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return !this.f && super.a(context, eaf, fdo);
    }

    public long b() {
        if (this.f) {
            return 0;
        }
        return super.b();
    }

    public void a(Context context, bko bko, fdo fdo) {
        if (!this.f) {
            for (fbt a : this.c) {
                fqu.a(bko).a(a);
            }
        }
    }

    public nzf a(String str, int i, int i2) {
        if (a) {
            String valueOf = String.valueOf(this.c);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("GetEntityByIdRequest: lookupSpecs=").append(valueOf);
        }
        nzf lrd = new lrd();
        lrd.requestHeader = euk.a(null, true, str, i, i2, this.i);
        lrd.b = k;
        int i3 = 0;
        for (fbt fbt : this.c) {
            int i4;
            if (fbt != null) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        if (i3 > 0) {
            lrd.a = new lqd[i3];
        }
        boolean z = i3 < this.c.size();
        i3 = 0;
        boolean z2 = z;
        for (fbt fbt2 : this.c) {
            if (fbt2 == null) {
                glk.e("BabelClient", "GetEntityByIdRequest: null spec!", new Object[0]);
                z2 = true;
            } else {
                int i5 = i3 + 1;
                lrd.a[i3] = fbt2.d();
                i3 = i5;
            }
        }
        if (z2) {
            n();
        }
        return lrd;
    }

    private void n() {
        List arrayList = new ArrayList();
        for (fbt fbt : this.c) {
            if (fbt != null) {
                arrayList.add(fbt);
            }
        }
        this.c = arrayList;
    }

    public String g() {
        return "contacts/getentitybyid";
    }
}
