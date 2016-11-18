package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class xc extends ActionMode {
    final Context a;
    final wx b;

    public xc(Context context, wx wxVar) {
        this.a = context;
        this.b = wxVar;
    }

    public Object getTag() {
        return this.b.j();
    }

    public void setTag(Object obj) {
        this.b.a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public void invalidate() {
        this.b.d();
    }

    public void finish() {
        this.b.c();
    }

    public Menu getMenu() {
        return gwb.a(this.a, (jt) this.b.b());
    }

    public CharSequence getTitle() {
        return this.b.f();
    }

    public void setTitle(int i) {
        this.b.a(i);
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public void setSubtitle(int i) {
        this.b.b(i);
    }

    public View getCustomView() {
        return this.b.i();
    }

    public void setCustomView(View view) {
        this.b.a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.b.a();
    }

    public boolean getTitleOptionalHint() {
        return this.b.k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    public boolean isTitleOptional() {
        return this.b.h();
    }
}
