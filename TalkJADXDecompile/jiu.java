import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class jiu implements kbm, kcd, kcj, kcm, kcq {
    private View a;
    private TextView b;
    private View c;
    private TextView d;
    private boolean e;
    private boolean f;
    private int g;
    private CharSequence h;
    private OnClickListener i;
    private int j;
    private CharSequence k;
    private boolean l;
    private boolean m;
    private jix n;
    private final jiw o;

    public jiu(kbu kbu) {
        this.e = true;
        this.f = true;
        this.n = jix.LOADING;
        this.o = new jiw(this);
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
                a(this.b, this.g, this.h);
                a(this.d, this.j, this.k);
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
                case wi.j /*1*/:
                    if (this.l) {
                        this.o.a();
                    } else {
                        c();
                    }
                case wi.l /*2*/:
                case wi.z /*3*/:
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
                case wi.h /*4*/:
                    this.o.b();
                    this.a.setVisibility(8);
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
