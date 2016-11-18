package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class xc extends ActionMode {
    final Context f35631a;
    final wx f35632b;

    public xc(Context context, wx wxVar) {
        this.f35631a = context;
        this.f35632b = wxVar;
    }

    public Object getTag() {
        return this.f35632b.m41176j();
    }

    public void setTag(Object obj) {
        this.f35632b.m41165a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f35632b.mo4494b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f35632b.mo4490a(charSequence);
    }

    public void invalidate() {
        this.f35632b.mo4496d();
    }

    public void finish() {
        this.f35632b.mo4495c();
    }

    public Menu getMenu() {
        return gwb.a(this.f35631a, (jt) this.f35632b.mo4492b());
    }

    public CharSequence getTitle() {
        return this.f35632b.mo4497f();
    }

    public void setTitle(int i) {
        this.f35632b.mo4488a(i);
    }

    public CharSequence getSubtitle() {
        return this.f35632b.mo4498g();
    }

    public void setSubtitle(int i) {
        this.f35632b.mo4493b(i);
    }

    public View getCustomView() {
        return this.f35632b.mo4500i();
    }

    public void setCustomView(View view) {
        this.f35632b.mo4489a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f35632b.mo4487a();
    }

    public boolean getTitleOptionalHint() {
        return this.f35632b.m41177k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.f35632b.mo4491a(z);
    }

    public boolean isTitleOptional() {
        return this.f35632b.mo4499h();
    }
}
