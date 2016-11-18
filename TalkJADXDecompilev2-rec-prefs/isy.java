package p000;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

public final class isy implements SurfaceTextureListener {
    String f18914a;
    ita f18915b;
    boolean f18916c;
    boolean f18917d;
    itp f18918e;
    final Runnable f18919f;
    private final ite f18920g;
    private final itb f18921h;
    private final TextureView f18922i;
    private final Object f18923j;
    private itu f18924k;
    private int f18925l;
    private int f18926m;
    private int f18927n;
    private SurfaceTexture f18928o;
    private float f18929p;

    public isy(ite ite, TextureView textureView, String str) {
        this.f18921h = new itb(this);
        this.f18923j = new Object();
        this.f18925l = 0;
        this.f18929p = 0.5f;
        this.f18919f = new isz(this);
        this.f18920g = ite;
        this.f18922i = textureView;
        this.f18914a = str;
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            onSurfaceTextureAvailable(surfaceTexture, textureView.getWidth(), textureView.getHeight());
        }
        textureView.setSurfaceTextureListener(this);
        ite.mo3217a(this.f18921h);
        m23142b(str);
    }

    @Deprecated
    private isy(ite ite, TextureView textureView, float f) {
        this(ite, textureView, null);
        this.f18929p = f;
    }

    @Deprecated
    public isy(ite ite, TextureView textureView, float f, byte b) {
        this(ite, textureView, 0.0f);
    }

    public void m23144a() {
        this.f18920g.mo3219b(this.f18921h);
        synchronized (this.f18923j) {
            if (this.f18924k != null) {
                this.f18924k.m23272a();
                this.f18924k = null;
            }
            this.f18928o = null;
            this.f18922i.setSurfaceTextureListener(null);
            this.f18915b = null;
        }
    }

    public void m23148a(String str) {
        this.f18914a = str;
        if (this.f18928o != null) {
            this.f18924k = this.f18920g.mo3212a(this.f18928o, str);
            this.f18924k.m23273a(this.f18925l);
        }
        m23142b(str);
    }

    public void m23147a(ita ita) {
        this.f18915b = ita;
        if (ita == null) {
            return;
        }
        if (this.f18916c) {
            ita.mo1441a();
        } else {
            ita.mo1442b();
        }
    }

    public void m23149b() {
        synchronized (this.f18923j) {
            if (!(this.f18928o == null || this.f18928o == this.f18922i.getSurfaceTexture())) {
                this.f18922i.setSurfaceTexture(this.f18928o);
            }
            this.f18922i.requestLayout();
            this.f18926m = 0;
            this.f18927n = 0;
        }
    }

    public void m23145a(float f) {
        this.f18929p = f;
        m23143c();
    }

    public void m23146a(int i) {
        this.f18925l = i;
        if (this.f18924k != null) {
            this.f18924k.m23273a(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23143c() {
        synchronized (this.f18923j) {
            int width = this.f18922i.getWidth();
            int height = this.f18922i.getHeight();
            itp b = this.f18924k == null ? null : this.f18924k.m23274b();
            if (width == 0 || height == 0 || b == null || this.f18928o == null || b.m23263b() == 0 || b.m23265c() == 0) {
            } else {
                Object obj;
                if (width == this.f18926m && height == this.f18927n) {
                    obj = !b.equals(this.f18918e) ? 1 : null;
                } else {
                    this.f18928o.setDefaultBufferSize(b.m23266d(), b.m23267e());
                    obj = 1;
                }
                if (obj != null) {
                    Matrix matrix;
                    this.f18918e = b.m23257a();
                    itp itp = this.f18918e;
                    float f = this.f18929p;
                    if (itp == null || itp.m23263b() == 0 || itp.m23265c() == 0 || width == 0 || height == 0) {
                        matrix = null;
                    } else {
                        int i;
                        Matrix matrix2 = new Matrix();
                        RectF g = itp.m23269g();
                        int b2 = (int) (((1.0f - g.left) - g.right) * ((float) itp.m23263b()));
                        int c = (int) (((1.0f - g.top) - g.bottom) * ((float) itp.m23265c()));
                        RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                        float min = Math.min(((float) width) / ((float) b2), ((float) height) / ((float) c));
                        if (f > 0.0f) {
                            RectF f2 = itp.m23268f();
                            float f3 = ((float) b2) / ((float) c);
                            float f4 = ((float) width) / ((float) height);
                            float max = Math.max(((float) width) / ((float) b2), ((float) height) / ((float) c));
                            if (f4 > f3) {
                                f3 = ((float) c) * max;
                                f3 = (f3 - ((float) height)) / f3;
                                if (f2.bottom > 0.0f) {
                                    f3 = Math.min(f3, Math.min(f2.top, 1.0f - f2.bottom) * 2.0f);
                                }
                            } else {
                                f3 = ((float) b2) * max;
                                f3 = (f3 - ((float) width)) / f3;
                                if (f2.right > 0.0f) {
                                    f3 = Math.min(f3, Math.min(f2.left, 1.0f - f2.right) * 2.0f);
                                }
                            }
                            min /= 1.0f - Math.min(f, f3);
                        }
                        f = rectF.centerX();
                        float centerY = rectF.centerY();
                        int h = itp.m23270h();
                        if (h == 90 || h == 270) {
                            i = b2;
                            b2 = c;
                        } else {
                            i = c;
                        }
                        RectF rectF2 = new RectF(0.0f, 0.0f, (float) b2, (float) i);
                        rectF2.offset(f - rectF2.centerX(), centerY - rectF2.centerY());
                        matrix2.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
                        matrix2.postScale(min, min, f, centerY);
                        if (h != 0) {
                            matrix2.postRotate((float) h, f, centerY);
                        }
                        matrix = matrix2;
                    }
                    if (matrix != null) {
                        itx.m23279a(3, "vclib", "%s: Applying output format %s to view size %dx%d, matrix=%s", this.f18914a, this.f18918e, Integer.valueOf(width), Integer.valueOf(height), matrix);
                        this.f18922i.setTransform(matrix);
                    }
                }
                this.f18926m = width;
                this.f18927n = height;
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        itx.m23279a(3, "vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureAvailable %dx%d", this.f18914a, Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.f18923j) {
            if (this.f18928o == null) {
                if (i == 0 || i2 == 0) {
                    itx.m23277a(3, "vclib", "Ignoring surface because it has an area of zero.");
                } else {
                    this.f18928o = surfaceTexture;
                    this.f18926m = i;
                    this.f18927n = i2;
                    if (this.f18914a != null) {
                        this.f18924k = this.f18920g.mo3212a(this.f18928o, this.f18914a);
                        this.f18924k.m23273a(this.f18925l);
                    }
                }
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = true;
        itx.m23279a(3, "vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureDestroyed", this.f18914a);
        synchronized (this.f18923j) {
            if (this.f18928o != null) {
                z = false;
            }
        }
        return z;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        itx.m23279a(3, "vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureSizeChanged %dx%d", this.f18914a, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f18917d) {
            itx.m23282a("vclib", "%s: TextureViewVideoRenderer.onSurfaceTextureUpdated but muted.", this.f18914a);
            return;
        }
        m23143c();
        if (this.f18915b != null) {
            gwb.m2042b(this.f18919f);
            if (!this.f18916c) {
                iil.m21867a();
                this.f18915b.mo1441a();
                this.f18916c = true;
            }
            if (!(this.f18918e == null || this.f18918e.m23271i())) {
                gwb.m1864a(this.f18919f, 2000);
            }
        }
        if (this.f18924k != null) {
            this.f18924k.m23275c();
        }
    }

    private void m23142b(String str) {
        boolean z = false;
        if (str == null) {
            return;
        }
        if (str.equals("localParticipant")) {
            ito p = this.f18920g.mo3225p();
            boolean z2 = p == null || !p.mo1322g();
            this.f18917d = z2;
            return;
        }
        itl itl = (itl) this.f18920g.mo3228s().get(str);
        if (itl == null || itl.m23240e()) {
            z = true;
        }
        this.f18917d = z;
    }
}
