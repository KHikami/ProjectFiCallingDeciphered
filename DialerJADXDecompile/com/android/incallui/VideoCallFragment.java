package com.android.incallui;

import ake;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.ImageView;
import ayn;
import az;
import bcj;
import bdf;
import bdj;
import bdq;
import bdr;
import bds;
import bdt;
import bdw;
import buf;

/* compiled from: PG */
public class VideoCallFragment extends ayn implements bdw {
    private static boolean c;
    private static bds d;
    private static bds f;
    private static Point g;
    public View a;
    public boolean b;
    private ViewStub h;
    private View i;
    private View j;
    private ImageView k;
    private boolean l;
    private int m;

    public VideoCallFragment() {
        this.b = false;
    }

    public final /* synthetic */ bdq g() {
        return this;
    }

    static {
        VideoCallFragment.class.getSimpleName();
        c = false;
        d = null;
        f = null;
        g = null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = getResources().getInteger(buf.kM);
    }

    public void onActivityCreated(Bundle bundle) {
        this.l = getResources().getBoolean(buf.jR);
        bdf.a((Object) this, "onActivityCreated: IsLandscape=" + this.l);
        bdt bdt = (bdt) this.e;
        bdt.c = getActivity();
        bdt.b = bdt.c.getResources().getDimension(buf.kg);
        bdt.j = new Handler(Looper.getMainLooper());
        bdt.k = bdt.c.getResources().getBoolean(buf.jS);
        bdt.l = bdt.c.getResources().getInteger(buf.kN);
        super.onActivityCreated(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(buf.la, viewGroup, false);
    }

    public final void a(View view) {
        if (!this.l) {
            float f;
            int i = view.getLayoutParams().height;
            bcj b = bcj.b();
            if (b.m == null || b.m.b == null) {
                f = 0.0f;
            } else {
                f = b.m.b.a();
            }
            if (((double) Math.abs(f)) >= 1.0E-4d) {
                view.setTranslationY(((float) (i / 2)) - (f / 2.0f));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bdf.a((Object) this, "onViewCreated: VideoSurfacesInUse=" + c);
        this.h = (ViewStub) view.findViewById(az.aP);
    }

    public void onStop() {
        super.onStop();
        bdf.a((Object) this, "onStop:");
    }

    public void onPause() {
        super.onPause();
        bdf.a((Object) this, "onPause:");
        ((bdt) this.e).a();
    }

    public void onDestroyView() {
        super.onDestroyView();
        bdf.a((Object) this, "onDestroyView:");
    }

    private final void a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        getView().setVisibility(i);
        if (z) {
            bdf.a((Object) this, "inflateVideoCallViews");
            if (this.a == null) {
                this.a = this.h.inflate();
            }
            if (this.a != null) {
                this.i = this.a.findViewById(az.av);
                this.j = this.a.findViewById(az.as);
                this.k = (ImageView) this.a.findViewById(az.at);
                TextureView textureView = (TextureView) this.a.findViewById(az.Y);
                bdf.a((Object) this, "inflateVideoCallViews: sVideoSurfacesInUse=" + c);
                Point j = g == null ? j() : g;
                a(textureView, j);
                if (c) {
                    f.a((TextureView) this.a.findViewById(az.Y));
                    d.a((TextureView) this.a.findViewById(az.au));
                } else {
                    String valueOf = String.valueOf(j);
                    bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 33).append(" inflateVideoCallViews screenSize").append(valueOf).toString());
                    f = new bds((bdt) this.e, 1, (TextureView) this.a.findViewById(az.Y), j.x, j.y);
                    d = new bds((bdt) this.e, 2, (TextureView) this.a.findViewById(az.au));
                    c = true;
                }
                this.a.getViewTreeObserver().addOnGlobalLayoutListener(new bdr(this));
            }
        }
        if (this.a != null) {
            this.a.setVisibility(i);
        }
    }

    public final void a(boolean z, boolean z2) {
        int i = 0;
        a(true);
        View findViewById = this.a.findViewById(az.Y);
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 0 : 4);
        }
        if (this.j != null) {
            int i2;
            findViewById = this.j;
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
        }
        if (this.k != null) {
            ImageView imageView = this.k;
            if (z) {
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    public final void a() {
        a(false);
    }

    public final void b() {
        bdf.a((Object) this, "cleanupSurfaces");
        if (f != null) {
            f.a();
            f = null;
        }
        if (d != null) {
            d.a();
            d = null;
        }
        c = false;
    }

    public final ImageView c() {
        return this.k;
    }

    public final void a(boolean z, int i) {
        float f = 0.0f;
        if (d != null && this.i != null) {
            this.i.setTranslationY(z ? 0.0f : (float) (-i));
            ViewPropertyAnimator duration = this.i.animate().setInterpolator(ake.c).setDuration((long) this.m);
            if (z) {
                f = (float) (-i);
            }
            duration.translationY(f).start();
        }
    }

    public final boolean d() {
        boolean z = (f == null || f.c == null) ? false : true;
        bdf.a((Object) this, " isDisplayVideoSurfaceCreated returns " + z);
        return z;
    }

    public final boolean e() {
        boolean z = (d == null || d.c == null) ? false : true;
        bdf.a((Object) this, " isPreviewVideoSurfaceCreated returns " + z);
        return z;
    }

    public final Surface f() {
        return f == null ? null : f.c;
    }

    public final Surface i() {
        return d == null ? null : d.c;
    }

    public final void a(int i, int i2) {
        bdf.a((Object) this, "setPreviewSize: width=" + i + " height=" + i2);
        if (d != null) {
            TextureView textureView = d.a;
            if (textureView != null) {
                LayoutParams layoutParams = textureView.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                textureView.setLayoutParams(layoutParams);
                if (this.i != null) {
                    layoutParams = this.i.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    this.i.setLayoutParams(layoutParams);
                }
                Matrix matrix = new Matrix();
                matrix.setScale(-1.0f, 1.0f, (float) (i / 2), 0.0f);
                textureView.setTransform(matrix);
            }
        }
    }

    public final void a(int i) {
        bdf.a((Object) this, "setPreviewRotation: orientation=" + i);
        if (d != null) {
            TextureView textureView = d.a;
            if (textureView != null) {
                textureView.setRotation((float) i);
            }
        }
    }

    public final void b(int i, int i2) {
        boolean z = d != null;
        bdf.a((Object) this, "setPreviewSurfaceSize: width=" + i + " height=" + i2 + " isPreviewSurfaceAvailable=" + z);
        if (z) {
            Object obj = d;
            bdf.a(obj, "setSurfaceDimensions, width=" + i + " height=" + i2);
            obj.d = i;
            obj.e = i2;
            if (i != -1 && i2 != -1 && obj.b != null) {
                bdf.a(obj, "setSurfaceDimensions, mSavedSurfaceTexture is NOT equal to null.");
                obj.b.setDefaultBufferSize(i, i2);
            }
        }
    }

    public final void c(int i, int i2) {
        bdf.b((Object) this, "setDisplayVideoSize: width=" + i + " height=" + i2);
        if (f != null) {
            TextureView textureView = f.a;
            if (textureView == null) {
                bdf.c((Object) this, "Display Video texture view is null. Bail out");
                return;
            }
            g = new Point(i, i2);
            a(textureView, g);
            return;
        }
        bdf.c((Object) this, "Display Video Surface is null. Bail out");
    }

    public final Point j() {
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public final Point k() {
        if (d == null) {
            return null;
        }
        bds bds = d;
        return new Point(bds.d, bds.e);
    }

    private final void a(TextureView textureView, Point point) {
        LayoutParams layoutParams = textureView.getLayoutParams();
        layoutParams.width = point.x;
        layoutParams.height = point.y;
        textureView.setLayoutParams(layoutParams);
        String valueOf = String.valueOf(point);
        boolean z = this.b;
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 74).append("setSurfaceSizeAndTranslation: Size=").append(valueOf).append("IsLayoutComplete=").append(z).append("IsLandscape=").append(this.l).toString());
        if (this.b) {
            a((View) textureView);
        }
    }

    public final /* synthetic */ bdj h() {
        bdf.a((Object) this, "createPresenter");
        bdt bdt = new bdt();
        String valueOf = String.valueOf(bdt);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 30).append("onPresenterChanged: Presenter=").append(valueOf).toString());
        if (f != null) {
            f.a(bdt);
        }
        if (d != null) {
            d.a(bdt);
        }
        return bdt;
    }
}
