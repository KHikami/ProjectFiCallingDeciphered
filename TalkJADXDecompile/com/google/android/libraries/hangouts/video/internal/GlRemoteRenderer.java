package com.google.android.libraries.hangouts.video.internal;

import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.apps.common.proguard.UsedByNative;
import gwb;
import iil;
import ild;
import ilk;
import inj;
import itp;
import ity;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GlRemoteRenderer extends Renderer implements OnFrameAvailableListener {
    public int a;
    public SurfaceTexture b;
    public Surface c;
    private int d;
    private final MediaCodecDecoder e;
    private final inj f;
    private final ild g;
    private int h;
    private boolean i;
    private final float[] j;
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final itp m;

    @UsedByNative
    public class RendererFrameOutputData {
        @UsedByNative
        public int cropBottom;
        @UsedByNative
        public int cropLeft;
        @UsedByNative
        public int cropRight;
        @UsedByNative
        public int cropTop;
        @UsedByNative
        public int frameHeight;
        @UsedByNative
        public boolean frameSizeChanged;
        @UsedByNative
        public int frameWidth;
        @UsedByNative
        public boolean updatedTexture;
    }

    public GlRemoteRenderer(RendererManager rendererManager, MediaCodecDecoder mediaCodecDecoder, ild ild, inj inj) {
        this.j = new float[16];
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new itp();
        this.mRendererManager = rendererManager;
        this.mRendererID = this.mRendererManager.a(3);
        this.f = inj;
        this.e = mediaCodecDecoder;
        this.g = ild;
        ity.a(this.j);
        RendererManager.a((Renderer) this);
    }

    public void a() {
        this.mRendererManager.initializeGLContext(this.mRendererID);
        this.d = this.mRendererManager.getIntParam(this.mRendererID, "sub_outtex");
        if (this.e != null) {
            iil.a("Created intermediate texture twice", this.b);
            this.a = gwb.av();
            this.b = new SurfaceTexture(this.a);
            this.b.setOnFrameAvailableListener(this);
            this.c = new Surface(this.b);
            this.e.a(this.c, null);
        }
    }

    public Surface b() {
        return this.c;
    }

    public int c() {
        return this.h;
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
        Object[] objArr = new Object[]{this.f.f(), Integer.valueOf(this.mRendererID)};
        int i = this.mRendererID;
        RendererManager.b(this);
        this.mRendererID = -1;
        this.mRendererManager.releaseRenderer(i);
        if (this.e != null) {
            this.e.a(null, null);
        }
        this.g.a(new ilk(this));
    }

    public float[] f() {
        return this.j;
    }

    public void g() {
        if (this.l.get()) {
            this.mRendererManager.notifyFrameRendered(this.mRendererID);
        }
    }

    public boolean a(RendererFrameOutputData rendererFrameOutputData) {
        boolean z = this.i;
        boolean andSet = this.k.getAndSet(false);
        if (andSet && this.b != null) {
            this.b.updateTexImage();
        }
        if (this.l.get()) {
            this.h = this.a;
            this.i = true;
            if (this.b != null) {
                this.b.getTransformMatrix(this.j);
            }
            if (this.e != null) {
                MediaFormat g = this.e.g();
                if (g != null) {
                    inj.a(g, this.m);
                    rendererFrameOutputData.frameWidth = this.m.b();
                    rendererFrameOutputData.frameHeight = this.m.c();
                    RectF g2 = this.m.g();
                    if (g2 == null) {
                        rendererFrameOutputData.cropLeft = 0;
                        rendererFrameOutputData.cropTop = 0;
                        rendererFrameOutputData.cropRight = 0;
                        rendererFrameOutputData.cropBottom = 0;
                    } else {
                        rendererFrameOutputData.cropLeft = (int) (g2.left * ((float) this.m.b()));
                        rendererFrameOutputData.cropTop = (int) (g2.top * ((float) this.m.c()));
                        rendererFrameOutputData.cropRight = (int) (g2.right * ((float) this.m.b()));
                        rendererFrameOutputData.cropBottom = (int) (g2.bottom * ((float) this.m.c()));
                    }
                }
            }
            rendererFrameOutputData.updatedTexture = andSet;
        } else {
            this.h = this.d;
            if (z) {
                ity.a(this.j);
            }
            this.i = false;
            this.mRendererManager.renderFrame(this.mRendererID, null, rendererFrameOutputData);
            rendererFrameOutputData.cropLeft = 0;
            rendererFrameOutputData.cropTop = 0;
            rendererFrameOutputData.cropRight = rendererFrameOutputData.frameWidth - 1;
            rendererFrameOutputData.cropBottom = rendererFrameOutputData.frameHeight - 1;
        }
        if (z != this.i) {
            this.f.l();
        }
        return rendererFrameOutputData.updatedTexture;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.k.set(true);
        this.l.set(true);
        this.g.a(this.f);
    }

    public void h() {
        this.l.set(false);
        this.g.a(this.f);
    }
}
