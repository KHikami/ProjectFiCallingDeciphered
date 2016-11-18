package p000;

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

public abstract class gpf extends LinearLayout implements bnq, dye {
    static final boolean f4438e = false;
    public static boolean f4439f;
    public static int f4440g;
    private bko f4441a;
    private final ImageView f4442b;
    private final View f4443c;
    private gkt f4444d;
    public final FixedAspectRatioImageView f4445h;
    final ImageView f4446i;
    final View f4447j;
    public final MaterialProgressBar f4448k;
    public final MaterialProgressBar f4449l;
    public final azx<Drawable> f4450m;
    public boolean f4451n;
    public bnn f4452o;
    private gol f4453p;
    private dex f4454q;
    private dey f4455r;

    static {
        kae kae = glk.f15574u;
    }

    public gpf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (f4440g == 0) {
            f4440g = getResources().getDimensionPixelSize(gwb.eC);
        }
        this.f4454q = (dex) jyn.m25426a(context, dex.class);
        this.f4455r = (dey) jyn.m25426a(context, dey.class);
        setOrientation(1);
        gpf.inflate(context, gwb.hc, this);
        this.f4442b = (ImageView) findViewById(ba.cv);
        this.f4445h = (FixedAspectRatioImageView) findViewById(ba.cA);
        this.f4450m = new gpg(this);
        this.f4443c = findViewById(ba.cz);
        this.f4446i = (ImageView) findViewById(ba.cx);
        this.f4447j = findViewById(ba.cy);
        if (mo719b()) {
            this.f4447j.setVisibility(0);
            this.f4446i.setImageResource(R$drawable.ck);
            this.f4446i.setAlpha(0.87f);
            this.f4446i.setContentDescription(getResources().getString(bc.io));
        }
        this.f4448k = (MaterialProgressBar) findViewById(ba.gd);
        this.f4449l = (MaterialProgressBar) findViewById(ba.ei);
        setLongClickable(true);
    }

    public void m6622a(bko bko, boolean z, String str, int i, int i2, int i3) {
        this.f4441a = bko;
        if (str != null) {
            if (i == 0) {
                i = f4440g;
            }
            if (i2 == 0) {
                i2 = f4440g;
            }
            if (Math.abs(i3 % 180) == 90) {
                this.f4445h.m9393a(i2, i);
                if (gwb.m1906a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                    glk.m17979c("Babel_Scroll", "setting MediaThumbnailAttachmentView.imageView dimensions to " + i2 + "x" + i, new Object[0]);
                }
            } else {
                this.f4445h.m9393a(i, i2);
                if (gwb.m1906a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                    glk.m17979c("Babel_Scroll", "setting MediaThumbnailAttachmentView.imageView dimensions to " + i + "x" + i2, new Object[0]);
                }
            }
            m6628e();
            this.f4451n = z;
            m6626c(str);
            if (gwb.m1906a(getContext(), "babel_extra_log_scrolling", false) || gwb.m1906a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                glk.m17979c("Babel_Scroll", "Image request begin, Height:" + this.f4445h.getHeight(), new Object[0]);
            }
        } else if (mo719b()) {
            this.f4446i.setVisibility(0);
            this.f4447j.setVisibility(0);
        }
    }

    public void m6628e() {
        if (mo767g()) {
            this.f4443c.setVisibility(8);
            this.f4448k.m10442c();
            this.f4449l.m10443d();
        } else if (mo768h()) {
            this.f4443c.setVisibility(8);
            this.f4448k.m10443d();
            this.f4449l.m10442c();
        } else {
            this.f4443c.setVisibility(0);
            this.f4448k.m10443d();
            this.f4449l.m10443d();
        }
    }

    protected void m6626c(String str) {
        if (this.f4454q.mo1511c()) {
            mo766e(str);
            return;
        }
        this.f4452o = new bnn(new gkc(str, this.f4441a.m5629a()).m5547a(f4440g).m5550a(false).m5557c(mo769i()).m5558d(false), this, null, true, null);
        if (((fsi) jyn.m25426a(getContext(), fsi.class)).m16142a(this.f4452o, this.f4451n)) {
            this.f4452o = null;
        } else {
            m6630f();
        }
    }

    public void m6627d(String str) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = (TextView) findViewById(ba.f2710u);
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public void d_() {
        if (this.f4451n) {
            this.f4451n = false;
            boolean a = ((fsi) jyn.m25426a(getContext(), fsi.class)).mo2072a(this.f4452o);
            if (this.f4452o != null && a) {
                this.f4452o = null;
            }
        }
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (f4438e) {
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
        if (this.f4452o == bnn) {
            this.f4452o = null;
            m6624a(!z2);
            if (mo719b()) {
                this.f4446i.setVisibility(0);
            }
            if (z) {
                if (bnn.m5508n().m5542o() != null) {
                    mo716a(bnn.m5508n().m5542o());
                }
                if (gjo != null) {
                    this.f4453p = new gol(gjo);
                    this.f4445h.setImageDrawable(this.f4453p);
                    this.f4453p.m18218a();
                } else {
                    iil.m21872a("Expected null", this.f4444d);
                    this.f4444d = gkt;
                    this.f4445h.setImageBitmap(this.f4444d.m17898e());
                }
                this.f4445h.requestLayout();
            } else {
                Resources resources = getResources();
                m6621a(bc.gy);
                if (mo719b()) {
                    this.f4447j.setVisibility(0);
                } else {
                    this.f4445h.setBackgroundColor(resources.getColor(17170443));
                    this.f4446i.setImageResource(R$drawable.aH);
                    this.f4446i.setVisibility(0);
                    View textView = new TextView(getContext());
                    textView.setLayoutParams(new LayoutParams(-2, -2));
                    textView.setText(bc.gy);
                    textView.setTextColor(resources.getColor(gwb.dE));
                    addView(textView, 0);
                }
            }
            if (gwb.m1906a(getContext(), "babel_extra_log_scrolling", false) || gwb.m1906a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                glk.m17979c("Babel_Scroll", "Image Update done, Height:" + this.f4445h.getHeight(), new Object[0]);
            }
        } else if (gkt != null) {
            gkt.mo2292b();
        }
    }

    public void m6630f() {
        kbu lifecycle;
        if (getContext() instanceof kbt) {
            lifecycle = ((kbt) getContext()).getLifecycle();
        } else {
            lifecycle = (kbu) jyn.m25426a(getContext(), kbu.class);
        }
        this.f4442b.setBackgroundDrawable(gnz.m18195a(getContext(), lifecycle, true));
        this.f4442b.setVisibility(0);
        this.f4445h.setVisibility(4);
    }

    void m6624a(boolean z) {
        if (z) {
            this.f4445h.setAlpha(0.0f);
            this.f4445h.animate().alpha(1.0f).setDuration(250).start();
        } else {
            this.f4445h.setAlpha(1.0f);
        }
        this.f4442b.setVisibility(4);
        this.f4445h.setVisibility(0);
    }

    public void c_() {
        if (this.f4453p != null) {
            this.f4453p.m18223b();
        }
    }

    public void b_() {
        if (this.f4453p != null) {
            this.f4453p.m18218a();
        }
    }

    public void p_() {
        if (this.f4452o != null) {
            this.f4452o.mo607b();
            this.f4452o = null;
        }
        this.f4445h.setImageBitmap(null);
        if (this.f4444d != null) {
            this.f4444d.mo2292b();
            this.f4444d = null;
        }
        this.f4451n = false;
        if (this.f4453p != null) {
            this.f4453p.m18224c();
            this.f4453p = null;
        }
        this.f4454q.mo1504a(this.f4450m);
    }

    public boolean mo719b() {
        return true;
    }

    protected boolean mo767g() {
        return false;
    }

    protected boolean mo768h() {
        return false;
    }

    protected boolean mo769i() {
        return false;
    }

    protected void mo766e(String str) {
        this.f4454q.mo1510b(str, this.f4450m, this.f4455r.mo1514a(getResources().getDimensionPixelSize(gwb.ez), getResources().getDimensionPixelSize(gwb.ey)), null);
    }

    public void m6621a(int i) {
        setContentDescription(getResources().getString(i));
    }

    protected void onDetachedFromWindow() {
        if (this.f4453p != null) {
            this.f4453p.m18223b();
        }
        super.onDetachedFromWindow();
    }

    protected void onAttachedToWindow() {
        if (this.f4453p != null) {
            this.f4453p.m18218a();
        }
        super.onAttachedToWindow();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 > 0 && i2 > i4) {
            f4439f = true;
        }
    }
}
