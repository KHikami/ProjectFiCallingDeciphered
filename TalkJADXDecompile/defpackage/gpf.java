package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.views.FixedAspectRatioImageView;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: gpf */
public abstract class gpf extends LinearLayout implements bnq, dye {
    static final boolean e;
    public static boolean f;
    public static int g;
    private bko a;
    private final ImageView b;
    private final View c;
    private gkt d;
    public final FixedAspectRatioImageView h;
    final ImageView i;
    final View j;
    public final MaterialProgressBar k;
    public final MaterialProgressBar l;
    public final azx<Drawable> m;
    public boolean n;
    public bnn o;
    private gol p;
    private dex q;
    private dey r;

    static {
        kae kae = glk.u;
        e = false;
    }

    public gpf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (g == 0) {
            g = getResources().getDimensionPixelSize(gwb.eC);
        }
        this.q = (dex) jyn.a(context, dex.class);
        this.r = (dey) jyn.a(context, dey.class);
        setOrientation(1);
        gpf.inflate(context, gwb.hc, this);
        this.b = (ImageView) findViewById(ba.cv);
        this.h = (FixedAspectRatioImageView) findViewById(ba.cA);
        this.m = new gpg(this);
        this.c = findViewById(ba.cz);
        this.i = (ImageView) findViewById(ba.cx);
        this.j = findViewById(ba.cy);
        if (b()) {
            this.j.setVisibility(0);
            this.i.setImageResource(R$drawable.ck);
            this.i.setAlpha(0.87f);
            this.i.setContentDescription(getResources().getString(bc.io));
        }
        this.k = (MaterialProgressBar) findViewById(ba.gd);
        this.l = (MaterialProgressBar) findViewById(ba.ei);
        setLongClickable(true);
    }

    public void a(bko bko, boolean z, String str, int i, int i2, int i3) {
        this.a = bko;
        if (str != null) {
            if (i == 0) {
                i = g;
            }
            if (i2 == 0) {
                i2 = g;
            }
            if (Math.abs(i3 % 180) == 90) {
                this.h.a(i2, i);
                if (gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                    glk.c("Babel_Scroll", "setting MediaThumbnailAttachmentView.imageView dimensions to " + i2 + "x" + i, new Object[0]);
                }
            } else {
                this.h.a(i, i2);
                if (gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                    glk.c("Babel_Scroll", "setting MediaThumbnailAttachmentView.imageView dimensions to " + i + "x" + i2, new Object[0]);
                }
            }
            e();
            this.n = z;
            c(str);
            if (gwb.a(getContext(), "babel_extra_log_scrolling", false) || gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                glk.c("Babel_Scroll", "Image request begin, Height:" + this.h.getHeight(), new Object[0]);
            }
        } else if (b()) {
            this.i.setVisibility(0);
            this.j.setVisibility(0);
        }
    }

    public void e() {
        if (g()) {
            this.c.setVisibility(8);
            this.k.c();
            this.l.d();
        } else if (h()) {
            this.c.setVisibility(8);
            this.k.d();
            this.l.c();
        } else {
            this.c.setVisibility(0);
            this.k.d();
            this.l.d();
        }
    }

    protected void c(String str) {
        if (this.q.c()) {
            e(str);
            return;
        }
        this.o = new bnn(new gkc(str, this.a.a()).a(g).a(false).c(i()).d(false), this, null, true, null);
        if (((fsi) jyn.a(getContext(), fsi.class)).a(this.o, this.n)) {
            this.o = null;
        } else {
            f();
        }
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = (TextView) findViewById(ba.u);
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public void d_() {
        if (this.n) {
            this.n = false;
            boolean a = ((fsi) jyn.a(getContext(), fsi.class)).a(this.o);
            if (this.o != null && a) {
                this.o = null;
            }
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (e) {
            String str;
            Object obj;
            if (gkt == null) {
                str = null;
            } else {
                str = gkt.toString();
            }
            if (gjo == null) {
                obj = null;
            } else {
                obj = gjo.toString();
            }
            String valueOf = String.valueOf(obj);
            new StringBuilder((String.valueOf(str).length() + 80) + String.valueOf(valueOf).length()).append("MediaThumbnailView: setImageBitmap ").append(str).append("gifImage=").append(valueOf).append(" success=").append(z).append(" loadedFromCache=").append(z2);
        }
        if (this.o == bnn) {
            this.o = null;
            a(!z2);
            if (b()) {
                this.i.setVisibility(0);
            }
            if (z) {
                if (bnn.n().o() != null) {
                    a(bnn.n().o());
                }
                if (gjo != null) {
                    this.p = new gol(gjo);
                    this.h.setImageDrawable(this.p);
                    this.p.a();
                } else {
                    iil.a("Expected null", this.d);
                    this.d = gkt;
                    this.h.setImageBitmap(this.d.e());
                }
                this.h.requestLayout();
            } else {
                Resources resources = getResources();
                a(bc.gy);
                if (b()) {
                    this.j.setVisibility(0);
                } else {
                    this.h.setBackgroundColor(resources.getColor(17170443));
                    this.i.setImageResource(R$drawable.aH);
                    this.i.setVisibility(0);
                    View textView = new TextView(getContext());
                    textView.setLayoutParams(new LayoutParams(-2, -2));
                    textView.setText(bc.gy);
                    textView.setTextColor(resources.getColor(gwb.dE));
                    addView(textView, 0);
                }
            }
            if (gwb.a(getContext(), "babel_extra_log_scrolling", false) || gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                glk.c("Babel_Scroll", "Image Update done, Height:" + this.h.getHeight(), new Object[0]);
            }
        } else if (gkt != null) {
            gkt.b();
        }
    }

    public void f() {
        kbu lifecycle;
        if (getContext() instanceof kbt) {
            lifecycle = ((kbt) getContext()).getLifecycle();
        } else {
            lifecycle = (kbu) jyn.a(getContext(), kbu.class);
        }
        this.b.setBackgroundDrawable(gnz.a(getContext(), lifecycle, true));
        this.b.setVisibility(0);
        this.h.setVisibility(4);
    }

    void a(boolean z) {
        if (z) {
            this.h.setAlpha(0.0f);
            this.h.animate().alpha(1.0f).setDuration(250).start();
        } else {
            this.h.setAlpha(1.0f);
        }
        this.b.setVisibility(4);
        this.h.setVisibility(0);
    }

    public void c_() {
        if (this.p != null) {
            this.p.b();
        }
    }

    public void b_() {
        if (this.p != null) {
            this.p.a();
        }
    }

    public void p_() {
        if (this.o != null) {
            this.o.b();
            this.o = null;
        }
        this.h.setImageBitmap(null);
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
        this.n = false;
        if (this.p != null) {
            this.p.c();
            this.p = null;
        }
        this.q.a(this.m);
    }

    public boolean b() {
        return true;
    }

    protected boolean g() {
        return false;
    }

    protected boolean h() {
        return false;
    }

    protected boolean i() {
        return false;
    }

    protected void e(String str) {
        this.q.b(str, this.m, this.r.a(getResources().getDimensionPixelSize(gwb.ez), getResources().getDimensionPixelSize(gwb.ey)), null);
    }

    public void a(int i) {
        setContentDescription(getResources().getString(i));
    }

    protected void onDetachedFromWindow() {
        if (this.p != null) {
            this.p.b();
        }
        super.onDetachedFromWindow();
    }

    protected void onAttachedToWindow() {
        if (this.p != null) {
            this.p.a();
        }
        super.onAttachedToWindow();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 > 0 && i2 > i4) {
            f = true;
        }
    }
}
