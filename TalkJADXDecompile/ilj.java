final class ilj {
    final /* synthetic */ ild a;
    private final iok b;
    private final ioo c;
    private ird d;
    private int e;
    private int f;

    ilj(ild ild, iok iok) {
        this.a = ild;
        this.d = null;
        this.b = iok;
        this.c = new ioo(iok);
    }

    void a() {
        this.c.b();
        c();
    }

    private void c() {
        if (this.d != null) {
            itx.a(3, "vclib", "Destroying surface for %s.", this.b);
            this.a.c.b();
            this.d.a();
            this.d = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b() {
        /*
        r6 = this;
        r5 = 5;
        r2 = 0;
        r0 = -1;
        r1 = r6.b;
        r1 = r1.r();
        r3 = r6.b;
        r3 = r3.o();
        if (r3 != r0) goto L_0x0051;
    L_0x0011:
        r3 = r1.d();
        r4 = r6.e;
        if (r3 != r4) goto L_0x0021;
    L_0x0019:
        r3 = r1.e();
        r4 = r6.f;
        if (r3 == r4) goto L_0x0030;
    L_0x0021:
        r3 = r1.d();
        r6.e = r3;
        r1 = r1.e();
        r6.f = r1;
        r6.c();
    L_0x0030:
        r1 = r6.d;
        if (r1 != 0) goto L_0x0045;
    L_0x0034:
        r1 = r6.b;
        r1 = r1.n();
        if (r1 != 0) goto L_0x0079;
    L_0x003c:
        r1 = "vclib";
        r3 = "Null surface object passed for renderer";
        itx.a(r5, r1, r3);
    L_0x0043:
        if (r0 != 0) goto L_0x00d6;
    L_0x0045:
        r0 = r6.d;
        if (r0 != 0) goto L_0x00c0;
    L_0x0049:
        r0 = new java.lang.IllegalStateException;
        r1 = "Attempted to render a released OutputRenderer";
        r0.<init>(r1);
        throw r0;
    L_0x0051:
        r1 = r6.b;
        r1 = r1.o();
        r3 = r6.e;
        if (r1 != r3) goto L_0x0065;
    L_0x005b:
        r1 = r6.b;
        r1 = r1.p();
        r3 = r6.f;
        if (r1 == r3) goto L_0x0030;
    L_0x0065:
        r1 = r6.b;
        r1 = r1.o();
        r6.e = r1;
        r1 = r6.b;
        r1 = r1.p();
        r6.f = r1;
        r6.c();
        goto L_0x0030;
    L_0x0079:
        r3 = r1 instanceof android.graphics.SurfaceTexture;
        if (r3 == 0) goto L_0x00ad;
    L_0x007d:
        r3 = r6.a;
        r3 = r3.b;
        r3 = r3.a(r1);
        if (r3 != 0) goto L_0x008f;
    L_0x0087:
        r1 = "vclib";
        r3 = "Invalid SurfaceTexture passed for renderer";
        itx.a(r5, r1, r3);
        goto L_0x0043;
    L_0x008f:
        r3.a();
        r0 = r1;
        r0 = (android.graphics.SurfaceTexture) r0;
        r3 = r6.e;
        r4 = r6.f;
        r0.setDefaultBufferSize(r3, r4);
    L_0x009c:
        r0 = r6.a;
        r0 = r0.b;
        r0 = r0.a(r1);
        r6.d = r0;
        r0 = "OutputRenderer.initializeGlSurface";
        gwb.V(r0);
        r0 = r2;
        goto L_0x0043;
    L_0x00ad:
        r0 = r1 instanceof android.view.Surface;
        if (r0 == 0) goto L_0x009c;
    L_0x00b1:
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 17;
        if (r0 >= r3) goto L_0x009c;
    L_0x00b7:
        r0 = new itv;
        r1 = (android.view.Surface) r1;
        r0.<init>(r1);
        r1 = r0;
        goto L_0x009c;
    L_0x00c0:
        r0 = r6.d;
        r0 = r0.b();
        if (r0 != 0) goto L_0x00d6;
    L_0x00c8:
        r1 = r6.c;
        r1 = r1.d();
        if (r1 == 0) goto L_0x00d6;
    L_0x00d0:
        r0 = r6.d;
        r0 = r0.c();
    L_0x00d6:
        if (r0 == 0) goto L_0x00ef;
    L_0x00d8:
        r1 = "vclib";
        r3 = "Failed to render; EGL error=%d";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r0 = java.lang.Integer.valueOf(r0);
        r4[r2] = r0;
        itx.b(r1, r3, r4);
        r0 = r6.a;
        r1 = r6.b;
        r0.c(r1);
    L_0x00ef:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ilj.b():void");
    }
}
