package p000;

import android.content.Context;

public class evm extends esw {
    private static final long serialVersionUID = 1;
    private final int f12372c;
    private final boolean f12373d;

    public evm(int i, boolean z) {
        this.f12372c = i;
        this.f12373d = z;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lvg = new lvg();
        lvg.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        loi loi = new loi();
        loi.f25873a = Integer.valueOf(this.f12372c);
        loi.f25874b = Boolean.valueOf(this.f12373d);
        lvg.f26583a = new loi[1];
        lvg.f26583a[0] = loi;
        return lvg;
    }

    public String mo1947g() {
        return "contacts/setconfigurationbit";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        fde.m15001a((Exception) fdo);
    }

    public boolean equals(Object obj) {
        evm evm = (evm) obj;
        return this.f12372c == evm.f12372c && this.f12373d == evm.f12373d;
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return equals(ead);
    }
}
