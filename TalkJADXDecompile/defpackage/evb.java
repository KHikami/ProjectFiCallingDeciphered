package defpackage;

import android.content.Context;
import java.util.Arrays;

/* renamed from: evb */
public class evb extends esw {
    private static final long serialVersionUID = 1;
    public int c;
    public int d;
    public int e;
    public int f;
    public int k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;

    public evb(int i, int i2, int i3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.k = i5;
        this.l = bArr;
        this.m = bArr2;
        this.n = bArr3;
        this.o = bArr4;
        this.p = bArr5;
    }

    public nzf a(String str, int i, int i2) {
        nzf lro = new lro();
        lro.c = Boolean.valueOf(false);
        lro.requestHeader = euk.a(null, true, str, i, i2, this.i);
        lrp lrp = new lrp();
        lrp.a = Integer.valueOf(this.c);
        if (this.l != null) {
            lrp.b = Arrays.copyOf(this.l, this.l.length);
        }
        lro.f = lrp;
        lrp = new lrp();
        lrp.a = Integer.valueOf(this.d);
        if (this.m != null) {
            lrp.b = Arrays.copyOf(this.m, this.m.length);
        }
        lro.g = lrp;
        lrp = new lrp();
        lrp.a = Integer.valueOf(this.e);
        if (this.n != null) {
            lrp.b = Arrays.copyOf(this.n, this.n.length);
        }
        lro.h = lrp;
        lrp = new lrp();
        lrp.a = Integer.valueOf(this.f);
        if (this.o != null) {
            lrp.b = Arrays.copyOf(this.o, this.o.length);
        }
        lro.i = lrp;
        lrp = new lrp();
        lrp.a = Integer.valueOf(this.k);
        if (this.p != null) {
            lrp.b = Arrays.copyOf(this.p, this.p.length);
        }
        lro.k = lrp;
        return lro;
    }

    public boolean a(int i) {
        return true;
    }

    public String g() {
        return "contacts/getsuggestedentities";
    }

    public void a(Context context, bko bko, fdo fdo) {
        String str = "BabelClient";
        String str2 = "SyncBaselineSuggestedContactsOperation failed: ";
        String valueOf = String.valueOf(glk.b(bko.a()));
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        ((gid) jyn.a(context, gid.class)).a(new dcw(this, null), fdo, dcw.a(bko.g()));
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return true;
    }
}
