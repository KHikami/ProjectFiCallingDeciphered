package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ess implements Serializable {
    private static final long serialVersionUID = 1;
    public final String f12191a;
    public final fpg f12192b;
    public final List<fpl> f12193c;
    public final boolean f12194d;
    public final byte[] f12195e;
    public final long f12196f;
    public final long f12197g;
    public final long f12198h;

    private ess(lox lox, boolean z, long j) {
        int i = 0;
        long j2 = 0;
        this.f12191a = lox.f25952a.f25931a;
        if (lox.f25954c != null) {
            this.f12192b = new fpg(lox.f25954c, (byte) 0);
        } else {
            this.f12192b = null;
        }
        if (lox.f25953b != null) {
            this.f12197g = gwb.m1523a(lox.f25953b);
        } else {
            this.f12197g = 0;
        }
        this.f12193c = fpl.m15838a(lox.f25955d, z, j);
        this.f12194d = gwb.m2061b(lox.f25958g);
        if (lox.f25956e != null) {
            lqk lqk = lox.f25956e;
            if (lqk.f26141b == null || lqk.f26141b.length <= 0) {
                this.f12195e = null;
                this.f12196f = 0;
            } else {
                this.f12195e = Arrays.copyOf(lqk.f26141b, lqk.f26141b.length);
                this.f12196f = gwb.m1523a(lqk.f26140a);
            }
        } else {
            this.f12195e = null;
            this.f12196f = 0;
        }
        int length = lox.f25959h.length;
        while (i < length) {
            j2 = Math.max(j2, gwb.m1523a(lox.f25959h[i].f25995c));
            i++;
        }
        this.f12198h = j2;
    }

    public static ess m14386a(byte[] bArr, boolean z, long j) {
        if (bArr != null) {
            try {
                return new ess((lox) nzf.m1027a(new lox(), bArr), z, j);
            } catch (nzd e) {
            }
        }
        return null;
    }

    public static List<ess> m14387a(ArrayList<byte[]> arrayList, boolean z, long j) {
        List<ess> arrayList2 = new ArrayList();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ess a = ess.m14386a((byte[]) obj, z, j);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        return arrayList2;
    }
}
