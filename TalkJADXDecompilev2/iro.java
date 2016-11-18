package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;

public final class iro extends iry {
    SurfaceTexture a;
    private int b;
    private int c;
    private int d;
    private int e;
    private Camera f;
    private iuc g;

    public iro(Context context) {
        int i = 0;
        super(context);
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = 0;
        this.s = new irp(this);
        try {
            CameraInfo cameraInfo = new CameraInfo();
            int numberOfCameras = Camera.getNumberOfCameras();
            while (i < numberOfCameras) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    this.b = i;
                    this.d = cameraInfo.orientation;
                } else {
                    this.c = i;
                    this.e = cameraInfo.orientation;
                }
                i++;
            }
        } catch (Throwable e) {
            itx.a("vclib", "Failed to detect cameras", e);
        }
    }

    public void a(ite ite, itq itq) {
        super.a(ite, itq);
        itq.a(this.s);
    }

    public boolean a() {
        return this.b != -1;
    }

    public boolean b() {
        return this.c != -1;
    }

    protected iuc c() {
        iuc iuc;
        synchronized (this.y) {
            iuc = this.g;
        }
        return iuc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void d() {
        /*
        r15 = this;
        r7 = r15.y;
        monitor-enter(r7);
        r0 = r15.f;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0011;
    L_0x0007:
        r0 = "vclib";
        r1 = "Camera was already opened, ignoring";
        r2 = 3;
        defpackage.itx.a(r2, r0, r1);	 Catch:{ all -> 0x001e }
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
    L_0x0010:
        return;
    L_0x0011:
        r0 = r15.C;	 Catch:{ all -> 0x001e }
        if (r0 != 0) goto L_0x0021;
    L_0x0015:
        r0 = "vclib";
        r1 = "openCamera was called with no camera selected.";
        defpackage.itx.a(r0, r1);	 Catch:{ all -> 0x001e }
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        goto L_0x0010;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        throw r0;
    L_0x0021:
        r0 = r15.f;	 Catch:{ all -> 0x001e }
        if (r0 != 0) goto L_0x0031;
    L_0x0025:
        r0 = r15.w;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0031;
    L_0x0029:
        r0 = r15.z;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0031;
    L_0x002d:
        r0 = r15.a;	 Catch:{ all -> 0x001e }
        if (r0 != 0) goto L_0x0033;
    L_0x0031:
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        goto L_0x0010;
    L_0x0033:
        r1 = "Attempted to open camera without a camera selected";
        r0 = r15.C;	 Catch:{ all -> 0x001e }
        if (r0 != 0) goto L_0x00b5;
    L_0x0039:
        r0 = 1;
    L_0x003a:
        defpackage.iil.b(r1, r0);	 Catch:{ all -> 0x001e }
        r0 = r15.C;	 Catch:{ all -> 0x001e }
        r1 = 1;
        if (r0 != r1) goto L_0x00b7;
    L_0x0042:
        r0 = r15.b;	 Catch:{ all -> 0x001e }
    L_0x0044:
        r0 = android.hardware.Camera.open(r0);	 Catch:{ RuntimeException -> 0x00ba }
        r15.f = r0;	 Catch:{ RuntimeException -> 0x00ba }
        r0 = r15.f;	 Catch:{ all -> 0x001e }
        r8 = r0.getParameters();	 Catch:{ all -> 0x001e }
        r1 = r8.getSupportedPreviewFpsRange();	 Catch:{ all -> 0x001e }
        r0 = r1.size();	 Catch:{ all -> 0x001e }
        r0 = r0 + -1;
        r0 = r1.get(r0);	 Catch:{ all -> 0x001e }
        r0 = (int[]) r0;	 Catch:{ all -> 0x001e }
        r2 = r15.z;	 Catch:{ all -> 0x001e }
        r2 = r2.c;	 Catch:{ all -> 0x001e }
        r2 = r2 * 1000;
        r3 = r1.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0;
    L_0x006b:
        r0 = r3.hasNext();	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x00c8;
    L_0x0071:
        r0 = r3.next();	 Catch:{ all -> 0x001e }
        r0 = (int[]) r0;	 Catch:{ all -> 0x001e }
        r4 = "vclib";
        r5 = "Camera FPS range: %d-%d";
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x001e }
        r9 = 0;
        r10 = 0;
        r10 = r0[r10];	 Catch:{ all -> 0x001e }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x001e }
        r6[r9] = r10;	 Catch:{ all -> 0x001e }
        r9 = 1;
        r10 = 1;
        r10 = r0[r10];	 Catch:{ all -> 0x001e }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x001e }
        r6[r9] = r10;	 Catch:{ all -> 0x001e }
        r9 = 3;
        defpackage.itx.a(r9, r4, r5, r6);	 Catch:{ all -> 0x001e }
        r4 = 1;
        r4 = r0[r4];	 Catch:{ all -> 0x001e }
        r5 = 1;
        r5 = r1[r5];	 Catch:{ all -> 0x001e }
        if (r4 > r5) goto L_0x0292;
    L_0x009e:
        r4 = 1;
        r4 = r0[r4];	 Catch:{ all -> 0x001e }
        if (r4 < r2) goto L_0x0292;
    L_0x00a3:
        r4 = 1;
        r4 = r0[r4];	 Catch:{ all -> 0x001e }
        r5 = 1;
        r5 = r1[r5];	 Catch:{ all -> 0x001e }
        if (r4 < r5) goto L_0x00b3;
    L_0x00ab:
        r4 = 0;
        r4 = r0[r4];	 Catch:{ all -> 0x001e }
        r5 = 0;
        r5 = r1[r5];	 Catch:{ all -> 0x001e }
        if (r4 > r5) goto L_0x0292;
    L_0x00b3:
        r1 = r0;
        goto L_0x006b;
    L_0x00b5:
        r0 = 0;
        goto L_0x003a;
    L_0x00b7:
        r0 = r15.c;	 Catch:{ all -> 0x001e }
        goto L_0x0044;
    L_0x00ba:
        r0 = move-exception;
        r1 = "vclib";
        r2 = "Error opening camera";
        defpackage.itx.a(r1, r2, r0);	 Catch:{ all -> 0x001e }
        r15.l();	 Catch:{ all -> 0x001e }
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        goto L_0x0010;
    L_0x00c8:
        r0 = "vclib";
        r2 = "Using camera FPS range: %d-%d";
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x001e }
        r4 = 0;
        r5 = 0;
        r5 = r1[r5];	 Catch:{ all -> 0x001e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x001e }
        r3[r4] = r5;	 Catch:{ all -> 0x001e }
        r4 = 1;
        r5 = 1;
        r5 = r1[r5];	 Catch:{ all -> 0x001e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x001e }
        r3[r4] = r5;	 Catch:{ all -> 0x001e }
        defpackage.itx.a(r0, r2, r3);	 Catch:{ all -> 0x001e }
        r0 = 0;
        r0 = r1[r0];	 Catch:{ all -> 0x001e }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ all -> 0x001e }
        r8.setPreviewFpsRange(r0, r1);	 Catch:{ all -> 0x001e }
        r0 = r15.B;	 Catch:{ all -> 0x001e }
        r1 = new iuc;	 Catch:{ all -> 0x001e }
        r2 = r15.z;	 Catch:{ all -> 0x001e }
        r2 = r2.d;	 Catch:{ all -> 0x001e }
        r3 = r15.z;	 Catch:{ all -> 0x001e }
        r3 = r3.e;	 Catch:{ all -> 0x001e }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x001e }
        r5 = defpackage.iuc.a(r0, r1);	 Catch:{ all -> 0x001e }
        r0 = r8.getSupportedPreviewSizes();	 Catch:{ all -> 0x001e }
        r3 = 0;
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r6 = r0.iterator();	 Catch:{ all -> 0x001e }
    L_0x010e:
        r0 = r6.hasNext();	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0153;
    L_0x0114:
        r0 = r6.next();	 Catch:{ all -> 0x001e }
        r0 = (android.hardware.Camera.Size) r0;	 Catch:{ all -> 0x001e }
        r1 = "vclib";
        r4 = "Camera preview candidate: %d x %d";
        r9 = 2;
        r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x001e }
        r10 = 0;
        r11 = r0.width;	 Catch:{ all -> 0x001e }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x001e }
        r9[r10] = r11;	 Catch:{ all -> 0x001e }
        r10 = 1;
        r11 = r0.height;	 Catch:{ all -> 0x001e }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x001e }
        r9[r10] = r11;	 Catch:{ all -> 0x001e }
        r10 = 3;
        defpackage.itx.a(r10, r1, r4, r9);	 Catch:{ all -> 0x001e }
        r1 = r0.width;	 Catch:{ all -> 0x001e }
        r4 = r5.a;	 Catch:{ all -> 0x001e }
        r4 = r1 - r4;
        r1 = r0.height;	 Catch:{ all -> 0x001e }
        r9 = r5.b;	 Catch:{ all -> 0x001e }
        r1 = r1 - r9;
        if (r4 >= 0) goto L_0x0146;
    L_0x0144:
        r4 = r4 * -4;
    L_0x0146:
        if (r1 >= 0) goto L_0x014a;
    L_0x0148:
        r1 = r1 * -4;
    L_0x014a:
        r1 = r1 + r4;
        if (r1 >= r2) goto L_0x028e;
    L_0x014d:
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x0150:
        r2 = r0;
        r3 = r1;
        goto L_0x010e;
    L_0x0153:
        r0 = r3.width;	 Catch:{ all -> 0x001e }
        r1 = r3.height;	 Catch:{ all -> 0x001e }
        r8.setPreviewSize(r0, r1);	 Catch:{ all -> 0x001e }
        r0 = r3.width;	 Catch:{ all -> 0x001e }
        r0 = (float) r0;	 Catch:{ all -> 0x001e }
        r1 = r3.height;	 Catch:{ all -> 0x001e }
        r1 = (float) r1;	 Catch:{ all -> 0x001e }
        r9 = r0 / r1;
        r0 = r8.getSupportedPictureSizes();	 Catch:{ all -> 0x001e }
        r6 = 0;
        r4 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r10 = r0.iterator();	 Catch:{ all -> 0x001e }
    L_0x0171:
        r0 = r10.hasNext();	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x028b;
    L_0x0177:
        r0 = r10.next();	 Catch:{ all -> 0x001e }
        r0 = (android.hardware.Camera.Size) r0;	 Catch:{ all -> 0x001e }
        r2 = "vclib";
        r5 = "Camera picture candidate: %d x %d";
        r11 = 2;
        r11 = new java.lang.Object[r11];	 Catch:{ all -> 0x001e }
        r12 = 0;
        r13 = r0.width;	 Catch:{ all -> 0x001e }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x001e }
        r11[r12] = r13;	 Catch:{ all -> 0x001e }
        r12 = 1;
        r13 = r0.height;	 Catch:{ all -> 0x001e }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x001e }
        r11[r12] = r13;	 Catch:{ all -> 0x001e }
        r12 = 3;
        defpackage.itx.a(r12, r2, r5, r11);	 Catch:{ all -> 0x001e }
        r2 = r0.width;	 Catch:{ all -> 0x001e }
        r5 = r3.width;	 Catch:{ all -> 0x001e }
        if (r2 < r5) goto L_0x0171;
    L_0x01a0:
        r2 = r0.height;	 Catch:{ all -> 0x001e }
        r5 = r3.height;	 Catch:{ all -> 0x001e }
        if (r2 < r5) goto L_0x0171;
    L_0x01a6:
        r2 = r0.width;	 Catch:{ all -> 0x001e }
        r5 = r3.width;	 Catch:{ all -> 0x001e }
        if (r2 != r5) goto L_0x0222;
    L_0x01ac:
        r2 = r0.height;	 Catch:{ all -> 0x001e }
        r5 = r3.height;	 Catch:{ all -> 0x001e }
        if (r2 != r5) goto L_0x0222;
    L_0x01b2:
        if (r0 != 0) goto L_0x0246;
    L_0x01b4:
        r0 = "vclib";
        r1 = "No picture size appropriate for current preview size.";
        r2 = 5;
        defpackage.itx.a(r2, r0, r1);	 Catch:{ all -> 0x001e }
    L_0x01bc:
        r0 = r15.f;	 Catch:{ all -> 0x001e }
        r0.setParameters(r8);	 Catch:{ all -> 0x001e }
        r0 = new iuc;	 Catch:{ all -> 0x001e }
        r1 = r8.getPreviewSize();	 Catch:{ all -> 0x001e }
        r1 = r1.width;	 Catch:{ all -> 0x001e }
        r2 = r8.getPreviewSize();	 Catch:{ all -> 0x001e }
        r2 = r2.height;	 Catch:{ all -> 0x001e }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x001e }
        r15.g = r0;	 Catch:{ all -> 0x001e }
        r0 = r15.C;	 Catch:{ all -> 0x001e }
        r1 = 1;
        if (r0 != r1) goto L_0x026b;
    L_0x01d9:
        r0 = r15.d;	 Catch:{ all -> 0x001e }
        r0 = 360 - r0;
        r0 = r0 % 360;
    L_0x01df:
        r1 = r15.f;	 Catch:{ all -> 0x001e }
        r1.setDisplayOrientation(r0);	 Catch:{ all -> 0x001e }
        r0 = "vclib";
        r1 = "Camera preview size: %s ";
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x001e }
        r3 = 0;
        r4 = r15.g;	 Catch:{ all -> 0x001e }
        r2[r3] = r4;	 Catch:{ all -> 0x001e }
        defpackage.itx.a(r0, r1, r2);	 Catch:{ all -> 0x001e }
        r0 = r15.w;	 Catch:{ IOException -> 0x026f }
        r1 = new itp;	 Catch:{ IOException -> 0x026f }
        r1.<init>();	 Catch:{ IOException -> 0x026f }
        r2 = r15.g;	 Catch:{ IOException -> 0x026f }
        r2 = r2.a;	 Catch:{ IOException -> 0x026f }
        r3 = r15.g;	 Catch:{ IOException -> 0x026f }
        r3 = r3.b;	 Catch:{ IOException -> 0x026f }
        r1 = r1.a(r2, r3);	 Catch:{ IOException -> 0x026f }
        r0.a(r1);	 Catch:{ IOException -> 0x026f }
        r0 = r15.f;	 Catch:{ IOException -> 0x026f }
        r1 = r15.a;	 Catch:{ IOException -> 0x026f }
        r0.setPreviewTexture(r1);	 Catch:{ IOException -> 0x026f }
    L_0x0210:
        r0 = r15.f;	 Catch:{ Exception -> 0x027b }
        r0.startPreview();	 Catch:{ Exception -> 0x027b }
        r0 = r15.C;	 Catch:{ Exception -> 0x027b }
        r1 = 1;
        if (r0 != r1) goto L_0x0278;
    L_0x021a:
        r0 = r15.d;	 Catch:{ Exception -> 0x027b }
    L_0x021c:
        r15.b(r0);	 Catch:{ Exception -> 0x027b }
    L_0x021f:
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        goto L_0x0010;
    L_0x0222:
        r2 = r0.width;	 Catch:{ all -> 0x001e }
        r2 = (float) r2;	 Catch:{ all -> 0x001e }
        r5 = r0.height;	 Catch:{ all -> 0x001e }
        r5 = (float) r5;	 Catch:{ all -> 0x001e }
        r2 = r2 / r5;
        r2 = r2 - r9;
        r5 = java.lang.Math.abs(r2);	 Catch:{ all -> 0x001e }
        r2 = r0.width;	 Catch:{ all -> 0x001e }
        r11 = r0.height;	 Catch:{ all -> 0x001e }
        r2 = r2 * r11;
        r11 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r11 < 0) goto L_0x023d;
    L_0x0237:
        r11 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r11 != 0) goto L_0x0287;
    L_0x023b:
        if (r2 >= r1) goto L_0x0287;
    L_0x023d:
        r1 = r5;
        r14 = r2;
        r2 = r0;
        r0 = r14;
    L_0x0241:
        r4 = r1;
        r6 = r2;
        r1 = r0;
        goto L_0x0171;
    L_0x0246:
        r1 = "vclib";
        r2 = "Camera picture size: %d x %d ";
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x001e }
        r4 = 0;
        r5 = r0.width;	 Catch:{ all -> 0x001e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x001e }
        r3[r4] = r5;	 Catch:{ all -> 0x001e }
        r4 = 1;
        r5 = r0.height;	 Catch:{ all -> 0x001e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x001e }
        r3[r4] = r5;	 Catch:{ all -> 0x001e }
        defpackage.itx.a(r1, r2, r3);	 Catch:{ all -> 0x001e }
        r1 = r0.width;	 Catch:{ all -> 0x001e }
        r0 = r0.height;	 Catch:{ all -> 0x001e }
        r8.setPictureSize(r1, r0);	 Catch:{ all -> 0x001e }
        goto L_0x01bc;
    L_0x026b:
        r0 = r15.e;	 Catch:{ all -> 0x001e }
        goto L_0x01df;
    L_0x026f:
        r0 = move-exception;
        r1 = "vclib";
        r2 = "Failure setting preview display";
        defpackage.itx.b(r1, r2, r0);	 Catch:{ all -> 0x001e }
        goto L_0x0210;
    L_0x0278:
        r0 = r15.e;	 Catch:{ Exception -> 0x027b }
        goto L_0x021c;
    L_0x027b:
        r0 = move-exception;
        r1 = "vclib";
        r2 = "startPreview failed; something else is using the camera.";
        defpackage.itx.a(r1, r2, r0);	 Catch:{ all -> 0x001e }
        r15.l();	 Catch:{ all -> 0x001e }
        goto L_0x021f;
    L_0x0287:
        r0 = r1;
        r2 = r6;
        r1 = r4;
        goto L_0x0241;
    L_0x028b:
        r0 = r6;
        goto L_0x01b2;
    L_0x028e:
        r0 = r2;
        r1 = r3;
        goto L_0x0150;
    L_0x0292:
        r0 = r1;
        goto L_0x00b3;
        */
        throw new UnsupportedOperationException("Method not decompiled: iro.d():void");
    }

    protected void e() {
        synchronized (this.y) {
            if (this.f != null) {
                this.f.stopPreview();
                this.f.release();
                this.f = null;
            }
        }
        n();
    }
}
