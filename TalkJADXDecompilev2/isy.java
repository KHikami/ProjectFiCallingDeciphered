package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

public final class isy implements SurfaceTextureListener {
    String a;
    ita b;
    boolean c;
    boolean d;
    itp e;
    final Runnable f;
    private final ite g;
    private final itb h;
    private final TextureView i;
    private final Object j;
    private itu k;
    private int l;
    private int m;
    private int n;
    private SurfaceTexture o;
    private float p;

    public isy(ite ite, TextureView textureView, String str) {
        this.h = new itb(this);
        this.j = new Object();
        this.l = 0;
        this.p = 0.5f;
        this.f = new isz(this);
        this.g = ite;
        this.i = textureView;
        this.a = str;
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            onSurfaceTextureAvailable(surfaceTexture, textureView.getWidth(), textureView.getHeight());
        }
        textureView.setSurfaceTextureListener(this);
        ite.a(this.h);
        b(str);
    }

    @Deprecated
    private isy(ite ite, TextureView textureView, float f) {
        this(ite, textureView, null);
        this.p = f;
    }

    @Deprecated
    public isy(ite ite, TextureView textureView, float f, byte b) {
        this(ite, textureView, 0.0f);
    }

    public void a() {
        this.g.b(this.h);
        synchronized (this.j) {
            if (this.k != null) {
                this.k.a();
                this.k = null;
            }
            this.o = null;
            this.i.setSurfaceTextureListener(null);
            this.b = null;
        }
    }

    public void a(String str) {
        this.a = str;
        if (this.o != null) {
            this.k = this.g.a(this.o, str);
            this.k.a(this.l);
        }
        b(str);
    }

    public void a(ita ita) {
        this.b = ita;
        if (ita == null) {
            return;
        }
        if (this.c) {
            ita.a();
        } else {
            ita.b();
        }
    }

    public void b() {
        synchronized (this.j) {
            if (!(this.o == null || this.o == this.i.getSurfaceTexture())) {
                this.i.setSurfaceTexture(this.o);
            }
            this.i.requestLayout();
            this.m = 0;
            this.n = 0;
        }
    }

    public void a(float f) {
        this.p = f;
        c();
    }

    public void a(int i) {
        this.l = i;
        if (this.k != null) {
            this.k.a(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r17 = this;
        r0 = r17;
        r6 = r0.j;
        monitor-enter(r6);
        r0 = r17;
        r1 = r0.i;	 Catch:{ all -> 0x00c0 }
        r7 = r1.getWidth();	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r1 = r0.i;	 Catch:{ all -> 0x00c0 }
        r8 = r1.getHeight();	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r1 = r0.k;	 Catch:{ all -> 0x00c0 }
        if (r1 != 0) goto L_0x0037;
    L_0x001b:
        r1 = 0;
        r2 = r1;
    L_0x001d:
        if (r7 == 0) goto L_0x0035;
    L_0x001f:
        if (r8 == 0) goto L_0x0035;
    L_0x0021:
        if (r2 == 0) goto L_0x0035;
    L_0x0023:
        r0 = r17;
        r1 = r0.o;	 Catch:{ all -> 0x00c0 }
        if (r1 == 0) goto L_0x0035;
    L_0x0029:
        r1 = r2.b();	 Catch:{ all -> 0x00c0 }
        if (r1 == 0) goto L_0x0035;
    L_0x002f:
        r1 = r2.c();	 Catch:{ all -> 0x00c0 }
        if (r1 != 0) goto L_0x0041;
    L_0x0035:
        monitor-exit(r6);	 Catch:{ all -> 0x00c0 }
    L_0x0036:
        return;
    L_0x0037:
        r0 = r17;
        r1 = r0.k;	 Catch:{ all -> 0x00c0 }
        r1 = r1.b();	 Catch:{ all -> 0x00c0 }
        r2 = r1;
        goto L_0x001d;
    L_0x0041:
        r0 = r17;
        r1 = r0.m;	 Catch:{ all -> 0x00c0 }
        if (r7 != r1) goto L_0x004d;
    L_0x0047:
        r0 = r17;
        r1 = r0.n;	 Catch:{ all -> 0x00c0 }
        if (r8 == r1) goto L_0x00c3;
    L_0x004d:
        r0 = r17;
        r1 = r0.o;	 Catch:{ all -> 0x00c0 }
        r3 = r2.d();	 Catch:{ all -> 0x00c0 }
        r4 = r2.e();	 Catch:{ all -> 0x00c0 }
        r1.setDefaultBufferSize(r3, r4);	 Catch:{ all -> 0x00c0 }
        r1 = 1;
    L_0x005d:
        if (r1 == 0) goto L_0x00b5;
    L_0x005f:
        r1 = r2.a();	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r0.e = r1;	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r9 = r0.e;	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r10 = r0.p;	 Catch:{ all -> 0x00c0 }
        if (r9 == 0) goto L_0x0081;
    L_0x0071:
        r1 = r9.b();	 Catch:{ all -> 0x00c0 }
        if (r1 == 0) goto L_0x0081;
    L_0x0077:
        r1 = r9.c();	 Catch:{ all -> 0x00c0 }
        if (r1 == 0) goto L_0x0081;
    L_0x007d:
        if (r7 == 0) goto L_0x0081;
    L_0x007f:
        if (r8 != 0) goto L_0x00d1;
    L_0x0081:
        r1 = 0;
    L_0x0082:
        if (r1 == 0) goto L_0x00b5;
    L_0x0084:
        r2 = "vclib";
        r3 = "%s: Applying output format %s to view size %dx%d, matrix=%s";
        r4 = 5;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00c0 }
        r5 = 0;
        r0 = r17;
        r9 = r0.a;	 Catch:{ all -> 0x00c0 }
        r4[r5] = r9;	 Catch:{ all -> 0x00c0 }
        r5 = 1;
        r0 = r17;
        r9 = r0.e;	 Catch:{ all -> 0x00c0 }
        r4[r5] = r9;	 Catch:{ all -> 0x00c0 }
        r5 = 2;
        r9 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x00c0 }
        r4[r5] = r9;	 Catch:{ all -> 0x00c0 }
        r5 = 3;
        r9 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x00c0 }
        r4[r5] = r9;	 Catch:{ all -> 0x00c0 }
        r5 = 4;
        r4[r5] = r1;	 Catch:{ all -> 0x00c0 }
        r5 = 3;
        defpackage.itx.a(r5, r2, r3, r4);	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r2 = r0.i;	 Catch:{ all -> 0x00c0 }
        r2.setTransform(r1);	 Catch:{ all -> 0x00c0 }
    L_0x00b5:
        r0 = r17;
        r0.m = r7;	 Catch:{ all -> 0x00c0 }
        r0 = r17;
        r0.n = r8;	 Catch:{ all -> 0x00c0 }
        monitor-exit(r6);	 Catch:{ all -> 0x00c0 }
        goto L_0x0036;
    L_0x00c0:
        r1 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00c0 }
        throw r1;
    L_0x00c3:
        r0 = r17;
        r1 = r0.e;	 Catch:{ all -> 0x00c0 }
        r1 = r2.equals(r1);	 Catch:{ all -> 0x00c0 }
        if (r1 != 0) goto L_0x00cf;
    L_0x00cd:
        r1 = 1;
        goto L_0x005d;
    L_0x00cf:
        r1 = 0;
        goto L_0x005d;
    L_0x00d1:
        r2 = new android.graphics.Matrix;	 Catch:{ all -> 0x00c0 }
        r2.<init>();	 Catch:{ all -> 0x00c0 }
        r1 = r9.g();	 Catch:{ all -> 0x00c0 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = r1.left;	 Catch:{ all -> 0x00c0 }
        r3 = r3 - r4;
        r4 = r1.right;	 Catch:{ all -> 0x00c0 }
        r3 = r3 - r4;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r1.top;	 Catch:{ all -> 0x00c0 }
        r4 = r4 - r5;
        r1 = r1.bottom;	 Catch:{ all -> 0x00c0 }
        r1 = r4 - r1;
        r4 = r9.b();	 Catch:{ all -> 0x00c0 }
        r4 = (float) r4;	 Catch:{ all -> 0x00c0 }
        r3 = r3 * r4;
        r4 = (int) r3;	 Catch:{ all -> 0x00c0 }
        r3 = r9.c();	 Catch:{ all -> 0x00c0 }
        r3 = (float) r3;	 Catch:{ all -> 0x00c0 }
        r1 = r1 * r3;
        r3 = (int) r1;	 Catch:{ all -> 0x00c0 }
        r11 = new android.graphics.RectF;	 Catch:{ all -> 0x00c0 }
        r1 = 0;
        r5 = 0;
        r12 = (float) r7;	 Catch:{ all -> 0x00c0 }
        r13 = (float) r8;	 Catch:{ all -> 0x00c0 }
        r11.<init>(r1, r5, r12, r13);	 Catch:{ all -> 0x00c0 }
        r1 = (float) r7;	 Catch:{ all -> 0x00c0 }
        r5 = (float) r4;	 Catch:{ all -> 0x00c0 }
        r1 = r1 / r5;
        r5 = (float) r8;	 Catch:{ all -> 0x00c0 }
        r12 = (float) r3;	 Catch:{ all -> 0x00c0 }
        r5 = r5 / r12;
        r5 = java.lang.Math.min(r1, r5);	 Catch:{ all -> 0x00c0 }
        r1 = 0;
        r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0158;
    L_0x0111:
        r12 = r9.f();	 Catch:{ all -> 0x00c0 }
        r1 = (float) r4;	 Catch:{ all -> 0x00c0 }
        r13 = (float) r3;	 Catch:{ all -> 0x00c0 }
        r1 = r1 / r13;
        r13 = (float) r7;	 Catch:{ all -> 0x00c0 }
        r14 = (float) r8;	 Catch:{ all -> 0x00c0 }
        r13 = r13 / r14;
        r14 = (float) r7;	 Catch:{ all -> 0x00c0 }
        r15 = (float) r4;	 Catch:{ all -> 0x00c0 }
        r14 = r14 / r15;
        r15 = (float) r8;	 Catch:{ all -> 0x00c0 }
        r0 = (float) r3;	 Catch:{ all -> 0x00c0 }
        r16 = r0;
        r15 = r15 / r16;
        r14 = java.lang.Math.max(r14, r15);	 Catch:{ all -> 0x00c0 }
        r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0197;
    L_0x012c:
        r1 = (float) r3;	 Catch:{ all -> 0x00c0 }
        r1 = r1 * r14;
        r13 = (float) r8;	 Catch:{ all -> 0x00c0 }
        r13 = r1 - r13;
        r1 = r13 / r1;
        r13 = r12.bottom;	 Catch:{ all -> 0x00c0 }
        r14 = 0;
        r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1));
        if (r13 <= 0) goto L_0x014d;
    L_0x013a:
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = r12.top;	 Catch:{ all -> 0x00c0 }
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = r12.bottom;	 Catch:{ all -> 0x00c0 }
        r12 = r15 - r12;
        r12 = java.lang.Math.min(r14, r12);	 Catch:{ all -> 0x00c0 }
        r12 = r12 * r13;
        r1 = java.lang.Math.min(r1, r12);	 Catch:{ all -> 0x00c0 }
    L_0x014d:
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = java.lang.Math.min(r10, r1);	 Catch:{ all -> 0x00c0 }
        r1 = r12 - r1;
        r1 = r5 / r1;
        r5 = r1;
    L_0x0158:
        r10 = r11.centerX();	 Catch:{ all -> 0x00c0 }
        r12 = r11.centerY();	 Catch:{ all -> 0x00c0 }
        r9 = r9.h();	 Catch:{ all -> 0x00c0 }
        r1 = 90;
        if (r9 == r1) goto L_0x016c;
    L_0x0168:
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r9 != r1) goto L_0x01b9;
    L_0x016c:
        r1 = r4;
        r4 = r3;
    L_0x016e:
        r3 = new android.graphics.RectF;	 Catch:{ all -> 0x00c0 }
        r13 = 0;
        r14 = 0;
        r4 = (float) r4;	 Catch:{ all -> 0x00c0 }
        r1 = (float) r1;	 Catch:{ all -> 0x00c0 }
        r3.<init>(r13, r14, r4, r1);	 Catch:{ all -> 0x00c0 }
        r1 = r3.centerX();	 Catch:{ all -> 0x00c0 }
        r1 = r10 - r1;
        r4 = r3.centerY();	 Catch:{ all -> 0x00c0 }
        r4 = r12 - r4;
        r3.offset(r1, r4);	 Catch:{ all -> 0x00c0 }
        r1 = android.graphics.Matrix.ScaleToFit.FILL;	 Catch:{ all -> 0x00c0 }
        r2.setRectToRect(r11, r3, r1);	 Catch:{ all -> 0x00c0 }
        r2.postScale(r5, r5, r10, r12);	 Catch:{ all -> 0x00c0 }
        if (r9 == 0) goto L_0x0194;
    L_0x0190:
        r1 = (float) r9;	 Catch:{ all -> 0x00c0 }
        r2.postRotate(r1, r10, r12);	 Catch:{ all -> 0x00c0 }
    L_0x0194:
        r1 = r2;
        goto L_0x0082;
    L_0x0197:
        r1 = (float) r4;	 Catch:{ all -> 0x00c0 }
        r1 = r1 * r14;
        r13 = (float) r7;	 Catch:{ all -> 0x00c0 }
        r13 = r1 - r13;
        r1 = r13 / r1;
        r13 = r12.right;	 Catch:{ all -> 0x00c0 }
        r14 = 0;
        r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1));
        if (r13 <= 0) goto L_0x014d;
    L_0x01a5:
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = r12.left;	 Catch:{ all -> 0x00c0 }
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = r12.right;	 Catch:{ all -> 0x00c0 }
        r12 = r15 - r12;
        r12 = java.lang.Math.min(r14, r12);	 Catch:{ all -> 0x00c0 }
        r12 = r12 * r13;
        r1 = java.lang.Math.min(r1, r12);	 Catch:{ all -> 0x00c0 }
        goto L_0x014d;
    L_0x01b9:
        r1 = r3;
        goto L_0x016e;
        */
        throw new UnsupportedOperationException("Method not decompiled: isy.c():void");
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        itx.a(3, "vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureAvailable %dx%d", this.a, Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.j) {
            if (this.o == null) {
                if (i == 0 || i2 == 0) {
                    itx.a(3, "vclib", "Ignoring surface because it has an area of zero.");
                } else {
                    this.o = surfaceTexture;
                    this.m = i;
                    this.n = i2;
                    if (this.a != null) {
                        this.k = this.g.a(this.o, this.a);
                        this.k.a(this.l);
                    }
                }
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = true;
        itx.a(3, "vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureDestroyed", this.a);
        synchronized (this.j) {
            if (this.o != null) {
                z = false;
            }
        }
        return z;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        itx.a(3, "vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureSizeChanged %dx%d", this.a, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.d) {
            itx.a("vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureUpdated but muted.", this.a);
            return;
        }
        c();
        if (this.b != null) {
            gwb.b(this.f);
            if (!this.c) {
                iil.a();
                this.b.a();
                this.c = true;
            }
            if (!(this.e == null || this.e.i())) {
                gwb.a(this.f, 2000);
            }
        }
        if (this.k != null) {
            this.k.c();
        }
    }

    private void b(String str) {
        boolean z = false;
        if (str == null) {
            return;
        }
        if (str.equals("localParticipant")) {
            ito p = this.g.p();
            boolean z2 = p == null || !p.g();
            this.d = z2;
            return;
        }
        itl itl = (itl) this.g.s().get(str);
        if (itl == null || itl.e()) {
            z = true;
        }
        this.d = z;
    }
}
