package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class tt implements sg {
    boolean a;
    private final tu b;
    private final DrawerLayout c;
    private wo d;
    private Drawable e;
    private boolean f;
    private final int g;
    private final int h;
    private boolean i;

    public tt(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    private tt(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, wo woVar, int i, int i2) {
        this.a = true;
        this.i = false;
        if (activity instanceof tv) {
            this.b = ((tv) activity).b();
        } else if (VERSION.SDK_INT >= 18) {
            this.b = new ty(activity);
        } else if (VERSION.SDK_INT >= 11) {
            this.b = new tx(activity);
        } else {
            this.b = new tw(activity);
        }
        this.c = drawerLayout;
        this.g = i;
        this.h = i2;
        this.d = new wo(this.b.b());
        this.e = d();
    }

    public void a() {
        if (this.c.h(8388611)) {
            a(1.0f);
        } else {
            a(0.0f);
        }
        if (this.a) {
            a(this.d, this.c.h(8388611) ? this.h : this.g);
        }
    }

    public void b() {
        if (!this.f) {
            this.e = d();
        }
        a();
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.a) {
            return false;
        }
        c();
        return true;
    }

    void c() {
        int b = this.c.b(8388611);
        if (this.c.i(8388611) && b != 2) {
            this.c.g(8388611);
        } else if (b != 1) {
            this.c.f(8388611);
        }
    }

    public void a(View view, float f) {
        a(Math.min(1.0f, Math.max(0.0f, f)));
    }

    public void a(View view) {
        a(1.0f);
        if (this.a) {
            b(this.h);
        }
    }

    public void b(View view) {
        a(0.0f);
        if (this.a) {
            b(this.g);
        }
    }

    public void a(int i) {
    }

    void a(Drawable drawable, int i) {
        if (!(this.i || this.b.c())) {
            this.i = true;
        }
        this.b.a(drawable, i);
    }

    void b(int i) {
        this.b.a(i);
    }

    Drawable d() {
        return this.b.a();
    }

    private void a(float f) {
        if (f == 1.0f) {
            this.d.a(true);
        } else if (f == 0.0f) {
            this.d.a(false);
        }
        this.d.a(f);
    }
}
