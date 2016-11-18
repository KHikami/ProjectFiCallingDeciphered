package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class wh extends wx implements xz {
    final /* synthetic */ we f35475a;
    private final Context f35476b;
    private final xy f35477c;
    private wy f35478d;
    private WeakReference<View> f35479e;

    public wh(we weVar, Context context, wy wyVar) {
        this.f35475a = weVar;
        this.f35476b = context;
        this.f35478d = wyVar;
        this.f35477c = new xy(context).m41406a(1);
        this.f35477c.mo4535a((xz) this);
    }

    public MenuInflater mo4487a() {
        return new xe(this.f35476b);
    }

    public Menu mo4492b() {
        return this.f35477c;
    }

    public void mo4495c() {
        if (this.f35475a.f35454g == this) {
            if (we.m41112a(this.f35475a.f35458k, this.f35475a.f35459l, false)) {
                this.f35478d.mo4443a(this);
            } else {
                this.f35475a.f35455h = this;
                this.f35475a.f35456i = this.f35478d;
            }
            this.f35478d = null;
            this.f35475a.m41153l(false);
            this.f35475a.f35452e.d();
            this.f35475a.f35451d.a().sendAccessibilityEvent(32);
            this.f35475a.f35449b.c(this.f35475a.f35461n);
            this.f35475a.f35454g = null;
        }
    }

    public void mo4496d() {
        if (this.f35475a.f35454g == this) {
            this.f35477c.m41436g();
            try {
                this.f35478d.mo4446b(this, this.f35477c);
            } finally {
                this.f35477c.m41437h();
            }
        }
    }

    public boolean m41190e() {
        this.f35477c.m41436g();
        try {
            boolean a = this.f35478d.mo4444a((wx) this, this.f35477c);
            return a;
        } finally {
            this.f35477c.m41437h();
        }
    }

    public void mo4489a(View view) {
        this.f35475a.f35452e.a(view);
        this.f35479e = new WeakReference(view);
    }

    public void mo4490a(CharSequence charSequence) {
        this.f35475a.f35452e.b(charSequence);
    }

    public void mo4494b(CharSequence charSequence) {
        this.f35475a.f35452e.a(charSequence);
    }

    public void mo4488a(int i) {
        mo4494b(this.f35475a.f35448a.getResources().getString(i));
    }

    public void mo4493b(int i) {
        mo4490a(this.f35475a.f35448a.getResources().getString(i));
    }

    public CharSequence mo4497f() {
        return this.f35475a.f35452e.b();
    }

    public CharSequence mo4498g() {
        return this.f35475a.f35452e.c();
    }

    public void mo4491a(boolean z) {
        super.mo4491a(z);
        this.f35475a.f35452e.a(z);
    }

    public boolean mo4499h() {
        return this.f35475a.f35452e.f();
    }

    public View mo4500i() {
        return this.f35479e != null ? (View) this.f35479e.get() : null;
    }

    public boolean mo4420a(xy xyVar, MenuItem menuItem) {
        if (this.f35478d != null) {
            return this.f35478d.mo4445a((wx) this, menuItem);
        }
        return false;
    }

    public void mo4417a(xy xyVar) {
        if (this.f35478d != null) {
            mo4496d();
            this.f35475a.f35452e.a();
        }
    }
}
