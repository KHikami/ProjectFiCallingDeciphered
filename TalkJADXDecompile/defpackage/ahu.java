package defpackage;

import com.android.ex.photo.views.PhotoView;

/* renamed from: ahu */
public final class ahu implements Runnable {
    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private long i;
    private boolean j;

    public ahu(PhotoView photoView) {
        this.b = photoView;
    }

    public boolean a(float f, float f2, float f3, float f4) {
        if (this.a) {
            return false;
        }
        this.c = f3;
        this.d = f4;
        this.f = f2;
        this.i = System.currentTimeMillis();
        this.g = f;
        this.e = this.f > this.g;
        this.h = (this.f - this.g) / 200.0f;
        this.a = true;
        this.j = false;
        this.b.post(this);
        return true;
    }

    public void a() {
        this.a = false;
        this.j = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r0 = r4.j;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r4.i;
        r0 = r0 - r2;
        r2 = r4.g;
        r3 = r4.h;
        r0 = (float) r0;
        r0 = r0 * r3;
        r0 = r0 + r2;
        r1 = r4.b;
        r2 = r4.c;
        r3 = r4.d;
        r1.a(r0, r2, r3);
        r1 = r4.f;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x002d;
    L_0x0022:
        r1 = r4.e;
        r2 = r4.f;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0045;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        if (r1 != r0) goto L_0x003b;
    L_0x002d:
        r0 = r4.b;
        r1 = r4.f;
        r2 = r4.c;
        r3 = r4.d;
        r0.a(r1, r2, r3);
        r4.a();
    L_0x003b:
        r0 = r4.j;
        if (r0 != 0) goto L_0x0004;
    L_0x003f:
        r0 = r4.b;
        r0.post(r4);
        goto L_0x0004;
    L_0x0045:
        r0 = 0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: ahu.run():void");
    }
}
