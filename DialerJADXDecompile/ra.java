import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* compiled from: PG */
final class ra extends pl {
    private boolean a;
    private boolean b;

    public final void a(int i) {
        wv wvVar = null;
        View inflate = LayoutInflater.from(wvVar.b()).inflate(i, wvVar.a(), false);
        LayoutParams pmVar = new pm(-2, -2);
        if (inflate != null) {
            inflate.setLayoutParams(pmVar);
        }
        wvVar.a(inflate);
    }

    public final void a(float f) {
        wv wvVar = null;
        kn.d(wvVar.a(), f);
    }

    public final Context d() {
        wv wvVar = null;
        return wvVar.b();
    }

    public final void e(boolean z) {
    }

    public final void f(boolean z) {
    }

    public final void a(Configuration configuration) {
        super.a(configuration);
    }

    public final void b(int i) {
        CharSequence text;
        wv wvVar = null;
        if (i != 0) {
            text = wvVar.b().getText(i);
        } else {
            Object obj = wvVar;
        }
        wvVar.b(text);
    }

    public final void a(CharSequence charSequence) {
        wv wvVar = null;
        wvVar.a(charSequence);
    }

    public final boolean g() {
        wv wvVar = null;
        ViewGroup a = wvVar.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    private void a(int i, int i2) {
        wv wvVar = null;
        wvVar.a((wvVar.l() & (i2 ^ -1)) | (i & i2));
    }

    public final void a(boolean z) {
        a(z ? 2 : 0, 2);
    }

    public final void b(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public final void c(boolean z) {
        a(8, 8);
    }

    public final void d(boolean z) {
        a(z ? 16 : 0, 16);
    }

    public final void a(Drawable drawable) {
        wv wvVar = null;
        wvVar.a(drawable);
    }

    public final View a() {
        wv wvVar = null;
        return wvVar.n();
    }

    public final int b() {
        wv wvVar = null;
        return wvVar.l();
    }

    public final boolean c() {
        wv wvVar = null;
        return wvVar.o() == 0;
    }

    public final boolean e() {
        Runnable runnable = null;
        runnable.a().removeCallbacks(runnable);
        kn.a(runnable.a(), runnable);
        return true;
    }

    public final boolean f() {
        wv wvVar = null;
        if (!wvVar.c()) {
            return false;
        }
        wvVar.d();
        return true;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        Menu i2 = i();
        if (i2 != null) {
            boolean z;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                z = true;
            } else {
                z = false;
            }
            i2.setQwertyMode(z);
            i2.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    final void h() {
        Object obj = null;
        obj.a().removeCallbacks(obj);
    }

    public final void g(boolean z) {
        ArrayList arrayList = null;
        if (z != this.b) {
            this.b = z;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i);
            }
        }
    }

    final Menu i() {
        wv wvVar = null;
        if (!this.a) {
            wvVar.a(new rb(this), new rc(this));
            this.a = true;
        }
        return wvVar.p();
    }
}
