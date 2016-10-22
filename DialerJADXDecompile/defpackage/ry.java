package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

@TargetApi(11)
/* compiled from: PG */
/* renamed from: ry */
public final class ry extends ActionMode {
    final rt a;
    private Context b;

    public ry(Context context, rt rtVar) {
        this.b = context;
        this.a = rtVar;
    }

    public final Object getTag() {
        return this.a.a;
    }

    public final void setTag(Object obj) {
        this.a.a = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void invalidate() {
        this.a.d();
    }

    public final void finish() {
        this.a.c();
    }

    public final Menu getMenu() {
        return buf.a(this.b, (hp) this.a.b());
    }

    public final CharSequence getTitle() {
        return this.a.f();
    }

    public final void setTitle(int i) {
        this.a.a(i);
    }

    public final CharSequence getSubtitle() {
        return this.a.g();
    }

    public final void setSubtitle(int i) {
        this.a.b(i);
    }

    public final View getCustomView() {
        return this.a.i();
    }

    public final void setCustomView(View view) {
        this.a.a(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.a.a();
    }

    public final boolean getTitleOptionalHint() {
        return this.a.b;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.a.a(z);
    }

    public final boolean isTitleOptional() {
        return this.a.h();
    }
}
