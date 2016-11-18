package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;

public abstract class tp {
    public abstract View a();

    public abstract void a(int i);

    public abstract void a(Drawable drawable);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public abstract void a(tr trVar);

    public abstract void a(boolean z);

    public abstract int b();

    public abstract void b(CharSequence charSequence);

    public abstract void b(tr trVar);

    public abstract void b(boolean z);

    public abstract void c();

    public abstract void c(boolean z);

    public abstract void d();

    public abstract void d(boolean z);

    public abstract boolean e();

    public Context f() {
        return null;
    }

    public void b(Drawable drawable) {
    }

    public void b(int i) {
    }

    public void c(int i) {
    }

    public void e(boolean z) {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public int g() {
        return 0;
    }

    public void a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void f(boolean z) {
    }

    public void g(boolean z) {
    }

    public void a(Configuration configuration) {
    }

    public void h(boolean z) {
    }

    public wx a(wy wyVar) {
        return null;
    }

    public boolean h() {
        return false;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean i() {
        return false;
    }

    public void c(CharSequence charSequence) {
    }

    boolean j() {
        return false;
    }

    void k() {
    }
}
