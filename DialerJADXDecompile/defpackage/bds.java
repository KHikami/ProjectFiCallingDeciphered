package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bds */
public final class bds implements SurfaceTextureListener, OnAttachStateChangeListener, OnClickListener {
    public TextureView a;
    public SurfaceTexture b;
    public Surface c;
    public int d;
    public int e;
    private int f;
    private bdt g;
    private boolean h;

    public bds(bdt bdt, int i, TextureView textureView) {
        this(bdt, 2, textureView, -1, -1);
    }

    public bds(bdt bdt, int i, TextureView textureView, int i2, int i3) {
        this.d = -1;
        this.e = -1;
        bdf.a((Object) this, "VideoCallSurface: surfaceId=" + i + " width=" + i2 + " height=" + i3);
        this.g = bdt;
        this.d = i2;
        this.e = i3;
        this.f = i;
        a(textureView);
    }

    public final void a(TextureView textureView) {
        if (this.a != textureView) {
            this.a = textureView;
            this.a.setSurfaceTextureListener(this);
            this.a.setOnClickListener(this);
            boolean equals = Objects.equals(this.b, this.a.getSurfaceTexture());
            String valueOf = String.valueOf(this.b);
            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 56).append("recreateView: SavedSurfaceTexture=").append(valueOf).append(" areSameSurfaces=").append(equals).toString());
            if (!(this.b == null || equals)) {
                this.a.setSurfaceTexture(this.b);
                if (a(this.d, this.e)) {
                    b();
                }
            }
            this.h = false;
        }
    }

    public final void a(bdt bdt) {
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(bdt);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()).append("resetPresenter: CurrentPresenter=").append(valueOf).append(" NewPresenter=").append(valueOf2).toString());
        this.g = bdt;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean a;
        int i3 = this.f;
        String valueOf = String.valueOf(surfaceTexture);
        String valueOf2 = String.valueOf(this.b);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 124) + String.valueOf(valueOf2).length()).append(" onSurfaceTextureAvailable mSurfaceId=").append(i3).append(" surfaceTexture=").append(valueOf).append(" width=").append(i).append(" height=").append(i2).append(" mSavedSurfaceTexture=").append(valueOf2).toString());
        String valueOf3 = String.valueOf(this.g);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf3).length() + 46).append(" onSurfaceTextureAvailable VideoCallPresenter=").append(valueOf3).toString());
        if (this.b == null) {
            this.b = surfaceTexture;
            a = a(i, i2);
        } else {
            bdf.a((Object) this, " onSurfaceTextureAvailable: Replacing with cached surface...");
            this.a.setSurfaceTexture(this.b);
            a = true;
        }
        if (a) {
            b();
        }
    }

    private final void b() {
        if (this.g != null) {
            Object obj = this.g;
            int i = this.f;
            String valueOf = String.valueOf(obj.e);
            bdf.a(obj, new StringBuilder(String.valueOf(valueOf).length() + 48).append("onSurfaceCreated surface=").append(i).append(" mVideoCall=").append(valueOf).toString());
            bdf.a(obj, "onSurfaceCreated PreviewSurfaceState=" + obj.f);
            valueOf = String.valueOf(obj);
            bdf.a(obj, new StringBuilder(String.valueOf(valueOf).length() + 27).append("onSurfaceCreated presenter=").append(valueOf).toString());
            bdw bdw = (bdw) obj.i;
            if (bdw == null || obj.e == null) {
                valueOf = String.valueOf(bdw);
                String valueOf2 = String.valueOf(obj.e);
                bdf.e(obj, new StringBuilder((String.valueOf(valueOf).length() + 58) + String.valueOf(valueOf2).length()).append("onSurfaceCreated: Error bad state VideoCallUi=").append(valueOf).append(" mVideoCall=").append(valueOf2).toString());
                return;
            } else if (i == 2) {
                if (obj.f == 2) {
                    obj.f = 3;
                    obj.e.setPreviewSurface(bdw.i());
                    return;
                } else if (obj.f == 0) {
                    boolean z;
                    if (obj.d == null || !bdt.c(obj.d.k())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        obj.a(obj.e, true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (i == 1) {
                obj.e.setDisplaySurface(bdw.f());
                return;
            } else {
                return;
            }
        }
        bdf.c((Object) this, "onSurfaceTextureAvailable: Presenter is null");
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i = this.f;
        String valueOf = String.valueOf(surfaceTexture);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        bdf.a((Object) this, new StringBuilder(((String.valueOf(valueOf).length() + 100) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(" onSurfaceTextureDestroyed mSurfaceId=").append(i).append(" surfaceTexture=").append(valueOf).append(" SavedSurfaceTexture=").append(valueOf2).append(" SavedSurface=").append(valueOf3).toString());
        String valueOf4 = String.valueOf(this.g);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf4).length() + 46).append(" onSurfaceTextureDestroyed VideoCallPresenter=").append(valueOf4).toString());
        if (this.g != null) {
            Object obj = this.g;
            int i2 = this.f;
            bdf.a(obj, "onSurfaceDestroyed: mSurfaceId=" + i2);
            if (obj.e != null) {
                boolean z = bcj.b().x;
                bdf.a(obj, "onSurfaceDestroyed: isChangingConfigurations=" + z);
                if (i2 == 2) {
                    if (z) {
                        bdf.e(obj, "onSurfaceDestroyed: Activity is being destroyed due to configuration changes. Not closing the camera.");
                    } else {
                        obj.a(obj.e, false);
                    }
                }
            }
        } else {
            bdf.c((Object) this, "onSurfaceTextureDestroyed: Presenter is null.");
        }
        if (this.h) {
            c();
            if (this.c != null) {
                this.c.release();
                this.c = null;
            }
        }
        return this.h;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.b != null) {
            this.a.setSurfaceTexture(this.b);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void a() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf2).length()).append("setDoneWithSurface: SavedSurface=").append(valueOf).append(" SavedSurfaceTexture=").append(valueOf2).toString());
        this.h = true;
        if (this.a == null || !this.a.isAvailable()) {
            if (this.c != null) {
                c();
                this.c.release();
                this.c = null;
            }
            if (this.b != null) {
                this.b.release();
                this.b = null;
            }
        }
    }

    private final void c() {
        if (this.g != null) {
            Object obj = this.g;
            int i = this.f;
            bdf.a(obj, "onSurfaceReleased: mSurfaceId=" + i);
            if (obj.e == null) {
                bdf.e(obj, "onSurfaceReleased: VideoCall is null. mSurfaceId=" + i);
                return;
            } else if (i == 1) {
                obj.e.setDisplaySurface(null);
                return;
            } else if (i == 2) {
                obj.e.setPreviewSurface(null);
                obj.a(obj.e, false);
                return;
            } else {
                return;
            }
        }
        bdf.a((Object) this, "setDoneWithSurface: Presenter is null.");
    }

    private final boolean a(int i, int i2) {
        String valueOf = String.valueOf(this.b);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 98).append("createSurface mSavedSurfaceTexture=").append(valueOf).append(" mSurfaceId =").append(this.f).append(" mWidth ").append(i).append(" mHeight=").append(i2).toString());
        if (i == -1 || i2 == -1 || this.b == null) {
            return false;
        }
        this.b.setDefaultBufferSize(i, i2);
        this.c = new Surface(this.b);
        return true;
    }

    public final void onClick(View view) {
        if (this.g != null) {
            bdf.b(this.g, "toggleFullScreen = " + bcj.b().h());
            return;
        }
        bdf.c((Object) this, "onClick: Presenter is null.");
    }
}
