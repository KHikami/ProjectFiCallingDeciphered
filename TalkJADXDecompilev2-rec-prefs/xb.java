package p000;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class xb extends wx implements xz {
    private Context f35624a;
    private ActionBarContextView f35625b;
    private wy f35626c;
    private WeakReference<View> f35627d;
    private boolean f35628e;
    private boolean f35629f;
    private xy f35630g;

    public xb(Context context, ActionBarContextView actionBarContextView, wy wyVar, boolean z) {
        this.f35624a = context;
        this.f35625b = actionBarContextView;
        this.f35626c = wyVar;
        this.f35630g = new xy(actionBarContextView.getContext()).m41406a(1);
        this.f35630g.mo4535a((xz) this);
        this.f35629f = z;
    }

    public void mo4494b(CharSequence charSequence) {
        this.f35625b.a(charSequence);
    }

    public void mo4490a(CharSequence charSequence) {
        this.f35625b.b(charSequence);
    }

    public void mo4488a(int i) {
        mo4494b(this.f35624a.getString(i));
    }

    public void mo4493b(int i) {
        mo4490a(this.f35624a.getString(i));
    }

    public void mo4491a(boolean z) {
        super.mo4491a(z);
        this.f35625b.a(z);
    }

    public boolean mo4499h() {
        return this.f35625b.f();
    }

    public void mo4489a(View view) {
        this.f35625b.a(view);
        this.f35627d = view != null ? new WeakReference(view) : null;
    }

    public void mo4496d() {
        this.f35626c.mo4446b(this, this.f35630g);
    }

    public void mo4495c() {
        if (!this.f35628e) {
            this.f35628e = true;
            this.f35625b.sendAccessibilityEvent(32);
            this.f35626c.mo4443a(this);
        }
    }

    public Menu mo4492b() {
        return this.f35630g;
    }

    public CharSequence mo4497f() {
        return this.f35625b.b();
    }

    public CharSequence mo4498g() {
        return this.f35625b.c();
    }

    public View mo4500i() {
        return this.f35627d != null ? (View) this.f35627d.get() : null;
    }

    public MenuInflater mo4487a() {
        return new xe(this.f35625b.getContext());
    }

    public boolean mo4420a(xy xyVar, MenuItem menuItem) {
        return this.f35626c.mo4445a((wx) this, menuItem);
    }

    public void mo4417a(xy xyVar) {
        mo4496d();
        this.f35625b.a();
    }
}
