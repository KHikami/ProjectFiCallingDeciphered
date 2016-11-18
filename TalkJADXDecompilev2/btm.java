package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

public abstract class btm {
    public final dr a;
    public final View b;
    public final cgr c;

    public abstract void a(btf btf);

    public abstract CharSequence e();

    public btm(dr drVar, View view) {
        this.a = drVar;
        this.b = view;
        this.c = (cgr) jyn.a(drVar.getContext(), cgr.class);
    }

    public void b(btf btf) {
        a(btf);
    }

    public void a() {
    }

    public bko b() {
        return this.c.k().h();
    }

    public Context c() {
        return this.a.getContext();
    }

    public Resources d() {
        return this.a.getResources();
    }
}
