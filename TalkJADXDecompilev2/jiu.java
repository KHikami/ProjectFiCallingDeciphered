package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class jiu implements kbm, kcd, kcj, kcm, kcq {
    private View a;
    private TextView b;
    private View c;
    private TextView d;
    private boolean e = true;
    private boolean f = true;
    private int g;
    private CharSequence h;
    private OnClickListener i;
    private int j;
    private CharSequence k;
    private boolean l;
    private boolean m;
    private jix n = jix.LOADING;
    private final jiw o = new jiw(this);

    public jiu(kbu kbu) {
        kbu.a((kcq) this);
    }

    public void a(jix jix) {
        this.n = (jix) ba.a((Object) jix);
        d();
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.l = true;
        }
    }

    public void a(View view, Bundle bundle) {
        this.a = view.findViewById(16908292);
        if (this.a != null) {
            this.b = (TextView) this.a.findViewById(gwb.yP);
            this.b.setOnClickListener(this.i);
            this.c = this.a.findViewById(gwb.yN);
            this.d = (TextView) this.a.findViewById(gwb.yO);
            if (this.a != null) {
                jiu.a(this.b, this.g, this.h);
                jiu.a(this.d, this.j, this.k);
            }
        }
    }

    public void R_() {
        this.m = true;
        d();
    }

    public void T_() {
        this.m = false;
    }

    private void d() {
        if (this.m && this.a != null) {
            switch (jiv.a[this.n.ordinal()]) {
                case 1:
                    if (this.l) {
                        this.o.a();
                        return;
                    } else {
                        c();
                        return;
                    }
                case 2:
                case 3:
                    this.o.b();
                    if (this.e) {
                        this.a.setVisibility(0);
                        this.b.setVisibility(0);
                        if (this.c != null) {
                            this.c.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    this.a.setVisibility(8);
                    return;
                case 4:
                    this.o.b();
                    this.a.setVisibility(8);
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    void c() {
        if (!this.m || this.a == null || this.n != jix.LOADING) {
            return;
        }
        if (this.f) {
            this.a.setVisibility(0);
            this.b.setVisibility(8);
            if (this.c != null) {
                this.c.setVisibility(0);
                return;
            }
            return;
        }
        this.a.setVisibility(8);
    }

    private static void a(TextView textView, int i, CharSequence charSequence) {
        if (textView != null) {
            if (i != 0) {
                charSequence = textView.getContext().getString(i);
            }
            textView.setText(charSequence);
        }
    }
}
