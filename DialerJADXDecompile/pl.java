import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
public abstract class pl {
    public abstract View a();

    public abstract void a(int i);

    public abstract void a(Drawable drawable);

    public abstract void a(boolean z);

    public abstract int b();

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public abstract boolean c();

    public abstract void d(boolean z);

    public Context d() {
        return null;
    }

    public void c(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void e(boolean z) {
    }

    public void f(boolean z) {
    }

    public void a(Configuration configuration) {
    }

    public void g(boolean z) {
    }

    public rt a(ru ruVar) {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void a(CharSequence charSequence) {
    }

    boolean g() {
        return false;
    }

    void h() {
    }
}
