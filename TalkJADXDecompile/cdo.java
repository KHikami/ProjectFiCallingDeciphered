final class cdo implements Runnable {
    final /* synthetic */ cdh a;
    private CharSequence b;
    private int c;
    private int d;

    cdo(cdh cdh) {
        this.a = cdh;
    }

    public void a(CharSequence charSequence, int i, int i2) {
        this.b = charSequence;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r12 = this;
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r9 = 3;
        r8 = 2;
        r0 = 0;
        r1 = 1;
        r3 = r12.a;
        r4 = r12.b;
        r2 = r12.c;
        r5 = r12.d;
        r6 = r3.h;
        if (r6 == 0) goto L_0x0016;
    L_0x0012:
        r6 = r3.i;
        if (r6 != 0) goto L_0x0049;
    L_0x0016:
        r0 = r12.a;
        r0.a();
        r0 = r12.a;
        r2 = glj.b();
        r4 = r0.b;
        r4 = r4.getText();
        r4 = r4.toString();
        r4 = r4.trim();
        r4 = r4.length();
        r5 = r0.d;
        switch(r5) {
            case 1: goto L_0x00d4;
            case 2: goto L_0x00c5;
            case 3: goto L_0x00ba;
            default: goto L_0x0038;
        };
    L_0x0038:
        r4 = r0.d;
        if (r4 != r1) goto L_0x0048;
    L_0x003c:
        r1 = r0.j;
        gwb.b(r1);
        r1 = r0.j;
        gwb.a(r1, r10);
        r0.e = r2;
    L_0x0048:
        return;
    L_0x0049:
        r6 = r3.c;
        if (r6 == 0) goto L_0x0016;
    L_0x004d:
        r6 = r3.i;
        r6 = r6.b;
        r6 = gwb.i(r6);
        if (r6 == 0) goto L_0x0016;
    L_0x0057:
        r6 = r3.g;
        r6 = r6.b();
        if (r6 == 0) goto L_0x0064;
    L_0x005f:
        if (r2 <= r5) goto L_0x00a5;
    L_0x0061:
        r2 = r1;
    L_0x0062:
        if (r2 == 0) goto L_0x0016;
    L_0x0064:
        r2 = android.telephony.SmsMessage.calculateLength(r4, r0);
        r4 = r2[r0];
        r5 = r2[r8];
        r6 = ajf.a();
        r6 = r6.p();
        if (r6 != 0) goto L_0x00a7;
    L_0x0076:
        r6 = ajf.a();
        r6 = r6.q();
        if (r6 != 0) goto L_0x00a7;
    L_0x0080:
        r6 = r3.g;
        if (r4 <= r1) goto L_0x0085;
    L_0x0084:
        r0 = r1;
    L_0x0085:
        r6.c(r0, r1);
    L_0x0088:
        r0 = ajf.a();
        r0 = r0.c();
        if (r0 <= 0) goto L_0x0016;
    L_0x0092:
        r2 = r2[r1];
        r4 = r2 + r5;
        r5 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        if (r4 >= r5) goto L_0x009c;
    L_0x009a:
        r0 = r0 / 2;
    L_0x009c:
        if (r2 <= r0) goto L_0x0016;
    L_0x009e:
        r0 = r3.g;
        r0.c(r1, r1);
        goto L_0x0016;
    L_0x00a5:
        r2 = r0;
        goto L_0x0062;
    L_0x00a7:
        r6 = ajf.a();
        r6 = r6.b();
        r7 = r3.g;
        if (r6 <= 0) goto L_0x00b6;
    L_0x00b3:
        if (r4 <= r6) goto L_0x00b6;
    L_0x00b5:
        r0 = r1;
    L_0x00b6:
        r7.c(r0, r1);
        goto L_0x0088;
    L_0x00ba:
        if (r4 <= 0) goto L_0x0038;
    L_0x00bc:
        r0.d = r1;
        r4 = r0.d;
        r0.a(r4);
        goto L_0x0038;
    L_0x00c5:
        if (r4 != 0) goto L_0x00cb;
    L_0x00c7:
        r0.d = r9;
        goto L_0x0038;
    L_0x00cb:
        r0.d = r1;
        r4 = r0.d;
        r0.a(r4);
        goto L_0x0038;
    L_0x00d4:
        if (r4 != 0) goto L_0x00df;
    L_0x00d6:
        r0.d = r9;
        r4 = r0.d;
        r0.a(r4);
        goto L_0x0038;
    L_0x00df:
        r4 = r0.e;
        r4 = r2 - r4;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 <= 0) goto L_0x0038;
    L_0x00e7:
        r0.d = r8;
        r4 = r0.d;
        r0.a(r4);
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: cdo.run():void");
    }
}
