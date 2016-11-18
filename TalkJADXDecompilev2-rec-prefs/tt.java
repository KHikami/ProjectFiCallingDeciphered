package p000;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class tt implements sg {
    boolean f35161a;
    private final tu f35162b;
    private final DrawerLayout f35163c;
    private wo f35164d;
    private Drawable f35165e;
    private boolean f35166f;
    private final int f35167g;
    private final int f35168h;
    private boolean f35169i;

    public tt(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    private tt(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, wo woVar, int i, int i2) {
        this.f35161a = true;
        this.f35169i = false;
        if (activity instanceof tv) {
            this.f35162b = ((tv) activity).b();
        } else if (VERSION.SDK_INT >= 18) {
            this.f35162b = new ty(activity);
        } else if (VERSION.SDK_INT >= 11) {
            this.f35162b = new tx(activity);
        } else {
            this.f35162b = new tw(activity);
        }
        this.f35163c = drawerLayout;
        this.f35167g = i;
        this.f35168h = i2;
        this.f35164d = new wo(this.f35162b.mo4390b());
        this.f35165e = m40829d();
    }

    public void m40819a() {
        if (this.f35163c.h(8388611)) {
            m40818a(1.0f);
        } else {
            m40818a(0.0f);
        }
        if (this.f35161a) {
            m40821a(this.f35164d, this.f35163c.h(8388611) ? this.f35168h : this.f35167g);
        }
    }

    public void m40825b() {
        if (!this.f35166f) {
            this.f35165e = m40829d();
        }
        m40819a();
    }

    public boolean m40824a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f35161a) {
            return false;
        }
        m40828c();
        return true;
    }

    void m40828c() {
        int b = this.f35163c.b(8388611);
        if (this.f35163c.i(8388611) && b != 2) {
            this.f35163c.g(8388611);
        } else if (b != 1) {
            this.f35163c.f(8388611);
        }
    }

    public void mo4385a(View view, float f) {
        m40818a(Math.min(1.0f, Math.max(0.0f, f)));
    }

    public void mo4384a(View view) {
        m40818a(1.0f);
        if (this.f35161a) {
            m40826b(this.f35168h);
        }
    }

    public void mo4386b(View view) {
        m40818a(0.0f);
        if (this.f35161a) {
            m40826b(this.f35167g);
        }
    }

    public void mo4383a(int i) {
    }

    void m40821a(Drawable drawable, int i) {
        if (!(this.f35169i || this.f35162b.mo4391c())) {
            this.f35169i = true;
        }
        this.f35162b.mo4389a(drawable, i);
    }

    void m40826b(int i) {
        this.f35162b.mo4388a(i);
    }

    Drawable m40829d() {
        return this.f35162b.mo4387a();
    }

    private void m40818a(float f) {
        if (f == 1.0f) {
            this.f35164d.m41206a(true);
        } else if (f == 0.0f) {
            this.f35164d.m41206a(false);
        }
        this.f35164d.m41205a(f);
    }
}
