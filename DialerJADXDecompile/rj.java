import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class rj extends rt implements sv {
    private final Context c;
    private final su d;
    private ru e;
    private WeakReference f;
    private /* synthetic */ rg g;

    public rj(rg rgVar, Context context, ru ruVar) {
        this.g = rgVar;
        this.c = context;
        this.e = ruVar;
        su suVar = new su(context);
        suVar.e = 1;
        this.d = suVar;
        this.d.a((sv) this);
    }

    public final MenuInflater a() {
        return new sa(this.c);
    }

    public final Menu b() {
        return this.d;
    }

    public final void c() {
        if (this.g.g == this) {
            rg rgVar = this.g;
            if (rg.a(false, this.g.k, false)) {
                this.e.a(this);
            } else {
                this.g.h = this;
                this.g.i = this.e;
            }
            this.e = null;
            this.g.i(false);
            ActionBarContextView actionBarContextView = this.g.e;
            if (actionBarContextView.h == null) {
                actionBarContextView.b();
            }
            this.g.d.a().sendAccessibilityEvent(32);
            this.g.b.a(this.g.m);
            this.g.g = null;
        }
    }

    public final void d() {
        if (this.g.g == this) {
            this.d.d();
            try {
                this.e.b(this, this.d);
            } finally {
                this.d.e();
            }
        }
    }

    public final boolean e() {
        this.d.d();
        try {
            boolean a = this.e.a((rt) this, this.d);
            return a;
        } finally {
            this.d.e();
        }
    }

    public final void a(View view) {
        this.g.e.a(view);
        this.f = new WeakReference(view);
    }

    public final void a(CharSequence charSequence) {
        this.g.e.b(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.g.e.a(charSequence);
    }

    public final void a(int i) {
        b(this.g.a.getResources().getString(i));
    }

    public final void b(int i) {
        a(this.g.a.getResources().getString(i));
    }

    public final CharSequence f() {
        return this.g.e.f;
    }

    public final CharSequence g() {
        return this.g.e.g;
    }

    public final void a(boolean z) {
        super.a(z);
        this.g.e.a(z);
    }

    public final boolean h() {
        return this.g.e.i;
    }

    public final View i() {
        return this.f != null ? (View) this.f.get() : null;
    }

    public final boolean a(su suVar, MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a((rt) this, menuItem);
        }
        return false;
    }

    public final void a(su suVar) {
        if (this.e != null) {
            d();
            this.g.e.a();
        }
    }
}
