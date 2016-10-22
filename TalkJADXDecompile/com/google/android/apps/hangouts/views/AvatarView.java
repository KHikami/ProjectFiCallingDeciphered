package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import awe;
import azl;
import azx;
import bbl;
import bke;
import bko;
import blc;
import bnn;
import bnq;
import bol;
import boz;
import dex;
import dey;
import edo;
import fqu;
import fqx;
import fqy;
import fsi;
import fwu;
import fww;
import gix;
import gjo;
import gkc;
import gkd;
import gkt;
import glk;
import gnc;
import gwb;
import iic;
import iil;
import jyn;
import kae;
import wi;

public class AvatarView extends View implements bnq, fqx, fqy {
    public static final boolean a;
    public Bitmap b;
    public boolean c;
    private int d;
    private String e;
    private bke f;
    private bnn g;
    private Bitmap h;
    private Bitmap i;
    private final Rect j;
    private final Rect k;
    private final fwu l;
    private boolean m;
    private int n;
    private int o;
    private final Paint p;
    private dex q;
    private dey r;
    private final azx<Bitmap> s;

    static {
        kae kae = glk.u;
        a = false;
    }

    public AvatarView(Context context) {
        this(context, null);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        int i2 = 0;
        super(context, attributeSet, i);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new fwu();
        this.m = true;
        this.c = false;
        this.n = 1;
        this.o = 0;
        this.s = new gnc(this);
        if (attributeSet != null) {
            int i3;
            String str;
            String valueOf;
            AvatarView avatarView;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbl.p);
            Object string = obtainStyledAttributes.getString(bbl.r);
            if (string == null) {
                string = "small";
            }
            if ("tiny".equals(string)) {
                i3 = 0;
            } else if ("small".equals(string)) {
                i3 = 1;
            } else if ("medium".equals(string)) {
                i3 = 2;
            } else if ("large".equals(string)) {
                i3 = 3;
            } else if ("xlarge".equals(string)) {
                i3 = 4;
            } else {
                str = "Invalid avatar size: ";
                valueOf = String.valueOf(string);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            this.d = i3;
            valueOf = obtainStyledAttributes.getString(bbl.q);
            if (valueOf == null) {
                avatarView = this;
            } else if ("square".equals(valueOf)) {
                i2 = 1;
                avatarView = this;
            } else if ("round".equals(valueOf)) {
                avatarView = this;
            } else {
                str = "Invalid avatar shape: ";
                valueOf = String.valueOf(valueOf);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            avatarView.n = i2;
            obtainStyledAttributes.recycle();
        } else {
            this.d = 2;
            this.n = 0;
        }
        this.p = new Paint(2);
        c();
    }

    private void c() {
        Bitmap bitmap = null;
        Context context = getContext();
        if (this.o == 0) {
            switch (this.d) {
                case wi.w /*0*/:
                case wi.j /*1*/:
                case wi.l /*2*/:
                    if (this.n != 1) {
                        bitmap = ((boz) jyn.a(context, boz.class)).b();
                        break;
                    } else {
                        bitmap = ((boz) jyn.a(context, boz.class)).c();
                        break;
                    }
                case wi.z /*3*/:
                case wi.h /*4*/:
                    if (this.n != 1) {
                        bitmap = blc.b();
                        break;
                    } else {
                        bitmap = blc.c();
                        break;
                    }
            }
        } else if (this.o == 1) {
            bitmap = blc.h();
        } else if (this.o == 3) {
            switch (this.d) {
                case wi.w /*0*/:
                case wi.j /*1*/:
                case wi.l /*2*/:
                    if (this.n != 1) {
                        bitmap = blc.d();
                        break;
                    } else {
                        bitmap = blc.e();
                        break;
                    }
                case wi.z /*3*/:
                case wi.h /*4*/:
                    if (this.n != 1) {
                        bitmap = blc.f();
                        break;
                    } else {
                        bitmap = blc.g();
                        break;
                    }
                default:
                    break;
            }
        } else {
            boolean z;
            if (this.o == 2) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            bitmap = this.n == 1 ? blc.c() : blc.b();
        }
        if (this.b != bitmap) {
            this.b = bitmap;
            if (!this.c) {
                a(this.b);
            }
        }
    }

    public void a(int i) {
        this.o = i;
        c();
    }

    public void b(int i) {
        this.d = i;
        c();
    }

    public void c(int i) {
        this.n = 0;
        c();
    }

    private int d() {
        switch (this.d) {
            case wi.w /*0*/:
            case wi.j /*1*/:
            case wi.l /*2*/:
                return ((boz) jyn.a(getContext(), boz.class)).a();
            case wi.z /*3*/:
                return blc.a();
            case wi.h /*4*/:
                if (blc.b == 0) {
                    blc.b = gwb.H().getResources().getDimensionPixelSize(gwb.eP);
                }
                return blc.b;
            default:
                iil.a("Invalid avatar size");
                return 0;
        }
    }

    public void a(boolean z) {
        if (z) {
            this.p.setAlpha(100);
        } else {
            this.p.setAlpha(255);
        }
        invalidate();
    }

    public void a(String str, String str2, bko bko) {
        if (TextUtils.isEmpty(str)) {
            b();
            if (!TextUtils.isEmpty(str2)) {
                a(str2);
            }
        } else if (!TextUtils.equals(str, this.e)) {
            b();
            this.e = str;
            this.r = (dey) jyn.a(getContext(), dey.class);
            this.q = (dex) jyn.a(getContext(), dex.class);
            if (this.q.c()) {
                azl azl;
                if (this.n == 0) {
                    Context context = getContext();
                    azl = (azl) this.r.d(d()).a(context, new awe(context));
                } else {
                    azl = this.r.d(d());
                }
                this.q.a(str, this.s, azl, (iic) this.r.b().a());
                return;
            }
            this.g = new bnn(new gkc(str, bko.a()).a(d()).d(true).b(this.n == 0), this, true, null);
            if (((fsi) jyn.a(getContext(), fsi.class)).a(this.g, false)) {
                this.g = null;
            } else if (!TextUtils.isEmpty(str2)) {
                a(str2);
            }
        }
    }

    private void a(String str) {
        int d = d();
        int i = this.n == 0 ? fww.a : fww.b;
        this.h = gkd.a().b(d, d);
        if (this.l.a(getContext(), this.h, str, 0.0f, 0.0f, (float) d, i, gwb.dV)) {
            a(this.h);
            return;
        }
        gkd.a().a(this.h);
        this.h = null;
    }

    public String a() {
        return this.e;
    }

    public void a(edo edo, bko bko) {
        b();
        this.f = fqu.a(edo, bko, this);
    }

    public void a(String str, boolean z, bko bko) {
        b();
        this.f = fqu.a(str, z, bko, this);
    }

    public void a(Bitmap bitmap) {
        if (this.i != bitmap) {
            this.i = bitmap;
            e();
            invalidate();
        }
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        e();
    }

    private void e() {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight != 0 && measuredWidth != 0 && this.i != null) {
            int width = this.i.getWidth();
            int height = this.i.getHeight();
            int i;
            if (measuredWidth > measuredHeight) {
                i = (int) ((((float) width) * (1.0f - (((float) measuredHeight) / ((float) measuredWidth)))) / 2.0f);
                this.k.set(0, i, height, width - i);
            } else {
                i = (int) ((((float) height) * (1.0f - (((float) measuredWidth) / ((float) measuredHeight)))) / 2.0f);
                this.k.set(i, 0, height - i, width);
            }
            this.j.set(0, 0, measuredWidth, measuredHeight);
        }
    }

    protected void onDraw(Canvas canvas) {
        if (a && this.i.isRecycled()) {
            gix a = gkd.a();
            glk.d("Babel", "Attempting to draw with a recycled bitmap", new Exception((Exception) a.b.d.a(this.i)));
        }
        canvas.drawBitmap(this.i, this.k, this.j, this.p);
    }

    public void a(String str, String str2, bke bke, String str3, bko bko) {
        this.f = null;
        a(str2, str, bko);
    }

    public void a(String str, String str2, int i, bol bol, bko bko) {
        a(str, str2, (bke) bol, null, bko);
        if (i == 1) {
            a(3);
        }
    }

    public void a(bke bke) {
        this.f = null;
    }

    public void b() {
        if (this.g != null) {
            this.g.b();
            this.g = null;
        }
        if (this.f != null) {
            this.f.b();
            this.f = null;
        }
        a(this.b);
        if (this.c) {
            this.c = false;
        }
        if (this.h != null) {
            gkd.a().a(this.h);
            this.h = null;
        }
        this.e = null;
    }

    public void b(boolean z) {
        this.m = z;
    }

    protected void onDetachedFromWindow() {
        if (this.m) {
            b();
        }
        super.onDetachedFromWindow();
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        if (a) {
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
            new StringBuilder((String.valueOf(str).length() + 72) + String.valueOf(valueOf).length()).append("AvatarView: setImageBitmap ").append(str).append("gifImage=").append(valueOf).append(" success=").append(z).append(" loadedFromCache=").append(z2);
        }
        if (this.g == bnn) {
            this.g = null;
            if (z && gkt != null) {
                iil.b("Expected condition to be false", this.c);
                this.c = true;
                a(gkt.e());
            }
        } else if (gkt != null) {
            gkt.b();
        }
    }
}
