import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class rx extends rt implements sv {
    private Context c;
    private ActionBarContextView d;
    private ru e;
    private WeakReference f;
    private boolean g;
    private su h;

    public rx(Context context, ActionBarContextView actionBarContextView, ru ruVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = ruVar;
        su suVar = new su(actionBarContextView.getContext());
        suVar.e = 1;
        this.h = suVar;
        this.h.a((sv) this);
    }

    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void a(int i) {
        b(this.c.getString(i));
    }

    public final void b(int i) {
        a(this.c.getString(i));
    }

    public final void a(boolean z) {
        super.a(z);
        this.d.a(z);
    }

    public final boolean h() {
        return this.d.i;
    }

    public final void a(View view) {
        this.d.a(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    public final void d() {
        this.e.b(this, this.h);
    }

    public final void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    public final Menu b() {
        return this.h;
    }

    public final CharSequence f() {
        return this.d.f;
    }

    public final CharSequence g() {
        return this.d.g;
    }

    public final View i() {
        return this.f != null ? (View) this.f.get() : null;
    }

    public final MenuInflater a() {
        return new sa(this.d.getContext());
    }

    public final boolean a(su suVar, MenuItem menuItem) {
        return this.e.a((rt) this, menuItem);
    }

    public final void a(su suVar) {
        d();
        this.d.a();
    }
}
