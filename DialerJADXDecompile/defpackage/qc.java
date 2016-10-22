package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: qc */
abstract class qc extends qb {
    private static final int[] n;
    final Context b;
    final Window c;
    final Callback d;
    final qa e;
    pl f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    CharSequence l;
    boolean m;
    private Callback o;
    private MenuInflater p;

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    abstract void b(CharSequence charSequence);

    abstract void d(int i);

    abstract boolean e(int i);

    abstract void j();

    static {
        n = new int[]{16842836};
    }

    qc(Context context, Window window, qa qaVar) {
        this.b = context;
        this.c = window;
        this.e = qaVar;
        this.d = this.c.getCallback();
        if (this.d instanceof qd) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.o = a(this.d);
        this.c.setCallback(this.o);
        aah a = aah.a(context, null, n);
        Drawable b = a.b(0);
        if (b != null) {
            this.c.setBackgroundDrawable(b);
        }
        a.a.recycle();
    }

    Callback a(Callback callback) {
        return new qd(this, callback);
    }

    public final pl a() {
        j();
        return this.f;
    }

    public final MenuInflater b() {
        if (this.p == null) {
            j();
            this.p = new sa(this.f != null ? this.f.d() : this.b);
        }
        return this.p;
    }

    final Context k() {
        Context context = null;
        pl a = a();
        if (a != null) {
            context = a.d();
        }
        if (context == null) {
            return this.b;
        }
        return context;
    }

    public void g() {
        this.m = true;
    }

    public boolean i() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        b(charSequence);
    }

    public void b(Bundle bundle) {
    }
}
