package p000;

import android.content.Context;
import java.util.Arrays;

public class evb extends esw {
    private static final long serialVersionUID = 1;
    public int f12342c;
    public int f12343d;
    public int f12344e;
    public int f12345f;
    public int f12346k;
    public byte[] f12347l;
    public byte[] f12348m;
    public byte[] f12349n;
    public byte[] f12350o;
    public byte[] f12351p;

    public evb(int i, int i2, int i3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f12342c = i;
        this.f12343d = i2;
        this.f12344e = i3;
        this.f12345f = i4;
        this.f12346k = i5;
        this.f12347l = bArr;
        this.f12348m = bArr2;
        this.f12349n = bArr3;
        this.f12350o = bArr4;
        this.f12351p = bArr5;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lro = new lro();
        lro.f26246c = Boolean.valueOf(false);
        lro.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        lrp lrp = new lrp();
        lrp.f26258a = Integer.valueOf(this.f12342c);
        if (this.f12347l != null) {
            lrp.f26259b = Arrays.copyOf(this.f12347l, this.f12347l.length);
        }
        lro.f26249f = lrp;
        lrp = new lrp();
        lrp.f26258a = Integer.valueOf(this.f12343d);
        if (this.f12348m != null) {
            lrp.f26259b = Arrays.copyOf(this.f12348m, this.f12348m.length);
        }
        lro.f26250g = lrp;
        lrp = new lrp();
        lrp.f26258a = Integer.valueOf(this.f12344e);
        if (this.f12349n != null) {
            lrp.f26259b = Arrays.copyOf(this.f12349n, this.f12349n.length);
        }
        lro.f26251h = lrp;
        lrp = new lrp();
        lrp.f26258a = Integer.valueOf(this.f12345f);
        if (this.f12350o != null) {
            lrp.f26259b = Arrays.copyOf(this.f12350o, this.f12350o.length);
        }
        lro.f26252i = lrp;
        lrp = new lrp();
        lrp.f26258a = Integer.valueOf(this.f12346k);
        if (this.f12351p != null) {
            lrp.f26259b = Arrays.copyOf(this.f12351p, this.f12351p.length);
        }
        lro.f26254k = lrp;
        return lro;
    }

    public boolean mo1022a(int i) {
        return true;
    }

    public String mo1947g() {
        return "contacts/getsuggestedentities";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        String str = "BabelClient";
        String str2 = "SyncBaselineSuggestedContactsOperation failed: ";
        String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
        glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        ((gid) jyn.m25426a(context, gid.class)).mo2277a(new dcw(this, null), fdo, dcw.m11462a(bko.m5638g()));
    }

    public String K_() {
        return "ui_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return true;
    }
}
