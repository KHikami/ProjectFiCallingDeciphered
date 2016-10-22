import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
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

    private void c() {
        synchronized (this.j) {
            int width = this.i.getWidth();
            int height = this.i.getHeight();
            itp b = this.k == null ? null : this.k.b();
            if (width == 0 || height == 0 || b == null || this.o == null || b.b() == 0 || b.c() == 0) {
                return;
            }
            Object obj;
            if (width == this.m && height == this.n) {
                obj = !b.equals(this.e) ? 1 : null;
            } else {
                this.o.setDefaultBufferSize(b.d(), b.e());
                obj = 1;
            }
            if (obj != null) {
                Matrix matrix;
                this.e = b.a();
                itp itp = this.e;
                float f = this.p;
                if (itp == null || itp.b() == 0 || itp.c() == 0 || width == 0 || height == 0) {
                    matrix = null;
                } else {
                    int i;
                    Matrix matrix2 = new Matrix();
                    RectF g = itp.g();
                    int b2 = (int) (((1.0f - g.left) - g.right) * ((float) itp.b()));
                    int c = (int) (((1.0f - g.top) - g.bottom) * ((float) itp.c()));
                    RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                    float min = Math.min(((float) width) / ((float) b2), ((float) height) / ((float) c));
                    if (f > 0.0f) {
                        RectF f2 = itp.f();
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
                    int h = itp.h();
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
                    itx.a(3, "vclib", "%s: Applying output format %s to view size %dx%d, matrix=%s", this.a, this.e, Integer.valueOf(width), Integer.valueOf(height), matrix);
                    this.i.setTransform(matrix);
                }
            }
            this.m = width;
            this.n = height;
        }
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
