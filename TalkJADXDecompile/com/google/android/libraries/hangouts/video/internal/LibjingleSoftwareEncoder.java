package com.google.android.libraries.hangouts.video.internal;

import com.google.android.apps.common.proguard.UsedByNative;
import iil;
import ila;
import iuc;

public final class LibjingleSoftwareEncoder implements ila {
    private final RendererManager a;
    private int b;
    private iuc c;
    private boolean d;
    private int e;
    private boolean f;
    private final EncoderInputData g;

    @UsedByNative
    class EncoderInputData {
        @UsedByNative
        public boolean isFake;
        @UsedByNative
        public long timestampNanos;
        @UsedByNative
        public float[] transformMatrixUpdate;

        EncoderInputData() {
        }
    }

    public LibjingleSoftwareEncoder(RendererManager rendererManager) {
        this.g = new EncoderInputData();
        this.a = rendererManager;
        this.b = -1;
    }

    public void a() {
        this.b = this.a.a(0);
        this.a.initializeGLContext(this.b);
    }

    public void a(boolean z) {
    }

    public void a(int i, int i2, boolean z) {
        if (this.b == -1) {
            iil.a("Asked to setResolution without first calling initializeGLContext.");
            return;
        }
        iuc iuc;
        iuc iuc2 = new iuc(i, i2);
        if (z) {
            iuc = new iuc(i & -8, i2 & -2);
        } else if (i * i2 >= 518400) {
            iuc = new iuc(i & -64, i2 & -8);
        } else if (i * i2 >= 129600) {
            iuc = new iuc(i & -32, i2 & -4);
        } else {
            iuc = new iuc(i & -8, i2 & -2);
        }
        if (this.c == null || !this.c.equals(iuc2)) {
            this.c = iuc2;
            this.a.setIntParam(this.b, "sub_indims", iuc2.a());
            this.a.setIntParam(this.b, "sub_outdims", iuc.a());
            this.a.setIntParam(this.b, "sub_inclip", (iuc2.b - iuc.b) | ((iuc2.a - iuc.a) << 16));
        }
        if (this.d != z) {
            this.d = z;
            this.a.setIntParam(this.b, "sub_screencast", z ? 1 : 0);
        }
    }

    public boolean a(int i, long j, boolean z, float[] fArr) {
        if (this.b == -1) {
            iil.a("Asked to encode a frame without first calling initializeGLContext.");
            return false;
        }
        if (this.f != z) {
            this.f = z;
            this.a.setIntParam(this.b, "sub_intextype", z ? 36197 : 3553);
        }
        if (this.e != i) {
            this.e = i;
            this.a.setIntParam(this.b, "sub_intex", i);
        }
        this.g.transformMatrixUpdate = fArr;
        this.g.timestampNanos = j;
        this.g.isFake = false;
        this.a.renderFrame(this.b, this.g, null);
        return true;
    }

    public void a(long j) {
        this.g.timestampNanos = j;
        this.g.isFake = true;
        this.a.renderFrame(this.b, this.g, null);
    }

    public int b() {
        return 0;
    }

    public void c() {
        if (this.b != -1) {
            this.a.releaseRenderer(this.b);
            this.b = -1;
        }
    }
}
