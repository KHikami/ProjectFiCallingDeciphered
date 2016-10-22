import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class chd {
    final Map<String, bpd> a;
    private final gll b;

    public chd(gll gll) {
        this.a = new HashMap();
        this.b = gll;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(bpd r11) {
        /*
        r10 = this;
        r7 = 1;
        r0 = r10.b;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = r10.b;
        r1 = "merge start";
        r0.a(r1);
    L_0x000c:
        r0 = java.util.Locale.US;
        r1 = "%s, TransportId: {%d}";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r11.h;
        r4 = r4.b;
        r4 = r4.toString();
        r2[r3] = r4;
        r3 = r11.b;
        r3 = java.lang.Integer.valueOf(r3);
        r2[r7] = r3;
        r1 = java.lang.String.format(r0, r1, r2);
        r0 = r10.a;
        r0 = r0.get(r1);
        r0 = (bpd) r0;
        if (r0 != 0) goto L_0x0045;
    L_0x0034:
        r0 = r10.a;
        r0.put(r1, r11);
        r0 = r10.b;
        if (r0 == 0) goto L_0x0044;
    L_0x003d:
        r0 = r10.b;
        r1 = "merge done null";
        r0.a(r1);
    L_0x0044:
        return;
    L_0x0045:
        r2 = r10.a;
        if (r0 != 0) goto L_0x0058;
    L_0x0049:
        r2.put(r1, r11);
        r0 = r10.b;
        if (r0 == 0) goto L_0x0044;
    L_0x0050:
        r0 = r10.b;
        r1 = "merge done picked";
        r0.a(r1);
        goto L_0x0044;
    L_0x0058:
        if (r11 == 0) goto L_0x009a;
    L_0x005a:
        r3 = r0.i;
        r4 = r11.i;
        if (r3 == 0) goto L_0x0049;
    L_0x0060:
        if (r4 == 0) goto L_0x009a;
    L_0x0062:
        r5 = r3.r;
        r6 = r4.r;
        if (r5 == r6) goto L_0x0070;
    L_0x0068:
        r5 = r3.r;
        if (r5 == r7) goto L_0x009a;
    L_0x006c:
        r5 = r4.r;
        if (r5 == r7) goto L_0x0049;
    L_0x0070:
        r6 = r3.q;
        r8 = r4.q;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 > 0) goto L_0x009a;
    L_0x0078:
        r6 = r3.q;
        r4 = r4.q;
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 < 0) goto L_0x0049;
    L_0x0080:
        r3 = r0.j;
        r4 = r11.j;
        if (r4 == 0) goto L_0x009a;
    L_0x0086:
        if (r3 == 0) goto L_0x0049;
    L_0x0088:
        r3 = r3.g();
        r3 = r3.size();
        r4 = r4.g();
        r4 = r4.size();
        if (r4 > r3) goto L_0x0049;
    L_0x009a:
        r11 = r0;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: chd.a(bpd):void");
    }

    Collection<bpd> a() {
        return this.a.values();
    }
}
