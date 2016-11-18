package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class wh extends wx implements xz {
    final /* synthetic */ we a;
    private final Context b;
    private final xy c;
    private wy d;
    private WeakReference<View> e;

    public wh(we weVar, Context context, wy wyVar) {
        this.a = weVar;
        this.b = context;
        this.d = wyVar;
        this.c = new xy(context).a(1);
        this.c.a((xz) this);
    }

    public MenuInflater a() {
        return new xe(this.b);
    }

    public Menu b() {
        return this.c;
    }

    public void c() {
        if (this.a.g == this) {
            if (we.a(this.a.k, this.a.l, false)) {
                this.d.a(this);
            } else {
                this.a.h = this;
                this.a.i = this.d;
            }
            this.d = null;
            this.a.l(false);
            this.a.e.d();
            this.a.d.a().sendAccessibilityEvent(32);
            this.a.b.c(this.a.n);
            this.a.g = null;
        }
    }

    public void d() {
        if (this.a.g == this) {
            this.c.g();
            try {
                this.d.b(this, this.c);
            } finally {
                this.c.h();
            }
        }
    }

    public boolean e() {
        this.c.g();
        try {
            boolean a = this.d.a((wx) this, this.c);
            return a;
        } finally {
            this.c.h();
        }
    }

    public void a(View view) {
        this.a.e.a(view);
        this.e = new WeakReference(view);
    }

    public void a(CharSequence charSequence) {
        this.a.e.b(charSequence);
    }

    public void b(CharSequence charSequence) {
        this.a.e.a(charSequence);
    }

    public void a(int i) {
        b(this.a.a.getResources().getString(i));
    }

    public void b(int i) {
        a(this.a.a.getResources().getString(i));
    }

    public CharSequence f() {
        return this.a.e.b();
    }

    public CharSequence g() {
        return this.a.e.c();
    }

    public void a(boolean z) {
        super.a(z);
        this.a.e.a(z);
    }

    public boolean h() {
        return this.a.e.f();
    }

    public View i() {
        return this.e != null ? (View) this.e.get() : null;
    }

    public boolean a(xy xyVar, MenuItem menuItem) {
        if (this.d != null) {
            return this.d.a((wx) this, menuItem);
        }
        return false;
    }

    public void a(xy xyVar) {
        if (this.d != null) {
            d();
            this.a.e.a();
        }
    }
}
