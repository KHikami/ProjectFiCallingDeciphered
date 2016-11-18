package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class xb extends wx implements xz {
    private Context a;
    private ActionBarContextView b;
    private wy c;
    private WeakReference<View> d;
    private boolean e;
    private boolean f;
    private xy g;

    public xb(Context context, ActionBarContextView actionBarContextView, wy wyVar, boolean z) {
        this.a = context;
        this.b = actionBarContextView;
        this.c = wyVar;
        this.g = new xy(actionBarContextView.getContext()).a(1);
        this.g.a((xz) this);
        this.f = z;
    }

    public void b(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public void a(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void a(int i) {
        b(this.a.getString(i));
    }

    public void b(int i) {
        a(this.a.getString(i));
    }

    public void a(boolean z) {
        super.a(z);
        this.b.a(z);
    }

    public boolean h() {
        return this.b.f();
    }

    public void a(View view) {
        this.b.a(view);
        this.d = view != null ? new WeakReference(view) : null;
    }

    public void d() {
        this.c.b(this, this.g);
    }

    public void c() {
        if (!this.e) {
            this.e = true;
            this.b.sendAccessibilityEvent(32);
            this.c.a(this);
        }
    }

    public Menu b() {
        return this.g;
    }

    public CharSequence f() {
        return this.b.b();
    }

    public CharSequence g() {
        return this.b.c();
    }

    public View i() {
        return this.d != null ? (View) this.d.get() : null;
    }

    public MenuInflater a() {
        return new xe(this.b.getContext());
    }

    public boolean a(xy xyVar, MenuItem menuItem) {
        return this.c.a((wx) this, menuItem);
    }

    public void a(xy xyVar) {
        d();
        this.b.a();
    }
}
