package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class jiu implements kbm, kcd, kcj, kcm, kcq {
    private View f20145a;
    private TextView f20146b;
    private View f20147c;
    private TextView f20148d;
    private boolean f20149e = true;
    private boolean f20150f = true;
    private int f20151g;
    private CharSequence f20152h;
    private OnClickListener f20153i;
    private int f20154j;
    private CharSequence f20155k;
    private boolean f20156l;
    private boolean f20157m;
    private jix f20158n = jix.LOADING;
    private final jiw f20159o = new jiw(this);

    public jiu(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void m24333a(jix jix) {
        this.f20158n = (jix) ba.m4536a((Object) jix);
        m24330d();
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f20156l = true;
        }
    }

    public void mo917a(View view, Bundle bundle) {
        this.f20145a = view.findViewById(16908292);
        if (this.f20145a != null) {
            this.f20146b = (TextView) this.f20145a.findViewById(gwb.yP);
            this.f20146b.setOnClickListener(this.f20153i);
            this.f20147c = this.f20145a.findViewById(gwb.yN);
            this.f20148d = (TextView) this.f20145a.findViewById(gwb.yO);
            if (this.f20145a != null) {
                jiu.m24329a(this.f20146b, this.f20151g, this.f20152h);
                jiu.m24329a(this.f20148d, this.f20154j, this.f20155k);
            }
        }
    }

    public void R_() {
        this.f20157m = true;
        m24330d();
    }

    public void T_() {
        this.f20157m = false;
    }

    private void m24330d() {
        if (this.f20157m && this.f20145a != null) {
            switch (jiv.f20160a[this.f20158n.ordinal()]) {
                case 1:
                    if (this.f20156l) {
                        this.f20159o.m24335a();
                        return;
                    } else {
                        m24334c();
                        return;
                    }
                case 2:
                case 3:
                    this.f20159o.m24336b();
                    if (this.f20149e) {
                        this.f20145a.setVisibility(0);
                        this.f20146b.setVisibility(0);
                        if (this.f20147c != null) {
                            this.f20147c.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    this.f20145a.setVisibility(8);
                    return;
                case 4:
                    this.f20159o.m24336b();
                    this.f20145a.setVisibility(8);
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    void m24334c() {
        if (!this.f20157m || this.f20145a == null || this.f20158n != jix.LOADING) {
            return;
        }
        if (this.f20150f) {
            this.f20145a.setVisibility(0);
            this.f20146b.setVisibility(8);
            if (this.f20147c != null) {
                this.f20147c.setVisibility(0);
                return;
            }
            return;
        }
        this.f20145a.setVisibility(8);
    }

    private static void m24329a(TextView textView, int i, CharSequence charSequence) {
        if (textView != null) {
            if (i != 0) {
                charSequence = textView.getContext().getString(i);
            }
            textView.setText(charSequence);
        }
    }
}
