package defpackage;

/* renamed from: edw */
final class edw implements bpu {
    final /* synthetic */ edv a;

    edw(edv edv) {
        this.a = edv;
    }

    public void a(bjg bjg, boolean z, int i) {
        iil.a("Unexpected model count", Integer.valueOf(this.a.ap.b()), Integer.valueOf(z ? 1 : 0));
        if (z) {
            this.a.ao.a(boy.LOCAL_AND_SERVER, false, null, null, 2567);
        } else {
            this.a.a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r12) {
        /*
        r11 = this;
        r4 = 1;
        r8 = 0;
        r0 = defpackage.eed.a;
        r1 = r11.a;
        r1 = r1.at;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x0053;
            case 4: goto L_0x0055;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r11.a;
        r1 = r1.at;
        r1 = java.lang.String.valueOf(r1);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 27;
        r2.<init>(r3);
        r3 = "Unknown conversation type: ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x003c:
        r0 = r11.a;
        r0 = r0.an;
        r0 = r0.g();
        r0 = defpackage.gwb.a(r0, r12, r4);
        r1 = r11.a;
        r1.startActivity(r0);
    L_0x004d:
        r0 = r11.a;
        r0.a();
        return;
    L_0x0053:
        if (r12 == 0) goto L_0x004d;
    L_0x0055:
        r0 = new epi;
        r1 = r11.a;
        r1 = r1.getActivity();
        r2 = r11.a;
        r2 = r2.an;
        r3 = r11.a;
        r3 = r3.at;
        r5 = defpackage.bxt.AUDIO_CALL;
        if (r3 != r5) goto L_0x0079;
    L_0x0069:
        r5 = r4;
    L_0x006a:
        r7 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r3 = r12;
        r6 = r4;
        r9 = r8;
        r10 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r1 = new java.lang.Void[r8];
        r0.b(r1);
        goto L_0x004d;
    L_0x0079:
        r5 = 2;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: edw.a(java.lang.String):void");
    }

    public void a() {
        this.a.a();
    }
}
