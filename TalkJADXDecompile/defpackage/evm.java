package defpackage;

import android.content.Context;

/* renamed from: evm */
public class evm extends esw {
    private static final long serialVersionUID = 1;
    private final int c;
    private final boolean d;

    public evm(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    public nzf a(String str, int i, int i2) {
        nzf lvg = new lvg();
        lvg.requestHeader = euk.a(null, true, str, i, i2, this.i);
        loi loi = new loi();
        loi.a = Integer.valueOf(this.c);
        loi.b = Boolean.valueOf(this.d);
        lvg.a = new loi[1];
        lvg.a[0] = loi;
        return lvg;
    }

    public String g() {
        return "contacts/setconfigurationbit";
    }

    public void a(Context context, bko bko, fdo fdo) {
        fde.a((Exception) fdo);
    }

    public boolean equals(Object obj) {
        evm evm = (evm) obj;
        return this.c == evm.c && this.d == evm.d;
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return equals(ead);
    }
}
