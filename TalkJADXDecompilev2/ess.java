package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ess implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final fpg b;
    public final List<fpl> c;
    public final boolean d;
    public final byte[] e;
    public final long f;
    public final long g;
    public final long h;

    private ess(lox lox, boolean z, long j) {
        int i = 0;
        long j2 = 0;
        this.a = lox.a.a;
        if (lox.c != null) {
            this.b = new fpg(lox.c, (byte) 0);
        } else {
            this.b = null;
        }
        if (lox.b != null) {
            this.g = gwb.a(lox.b);
        } else {
            this.g = 0;
        }
        this.c = fpl.a(lox.d, z, j);
        this.d = gwb.b(lox.g);
        if (lox.e != null) {
            lqk lqk = lox.e;
            if (lqk.b == null || lqk.b.length <= 0) {
                this.e = null;
                this.f = 0;
            } else {
                this.e = Arrays.copyOf(lqk.b, lqk.b.length);
                this.f = gwb.a(lqk.a);
            }
        } else {
            this.e = null;
            this.f = 0;
        }
        int length = lox.h.length;
        while (i < length) {
            j2 = Math.max(j2, gwb.a(lox.h[i].c));
            i++;
        }
        this.h = j2;
    }

    public static ess a(byte[] bArr, boolean z, long j) {
        if (bArr != null) {
            try {
                return new ess((lox) nzf.a(new lox(), bArr), z, j);
            } catch (nzd e) {
            }
        }
        return null;
    }

    public static List<ess> a(ArrayList<byte[]> arrayList, boolean z, long j) {
        List<ess> arrayList2 = new ArrayList();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ess a = ess.a((byte[]) obj, z, j);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        return arrayList2;
    }
}
