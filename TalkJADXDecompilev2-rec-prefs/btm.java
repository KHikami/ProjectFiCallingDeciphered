package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

public abstract class btm {
    public final dr f4426a;
    public final View f4427b;
    public final cgr f4428c;

    public abstract void mo754a(btf btf);

    public abstract CharSequence mo755e();

    public btm(dr drVar, View view) {
        this.f4426a = drVar;
        this.f4427b = view;
        this.f4428c = (cgr) jyn.m25426a(drVar.getContext(), cgr.class);
    }

    public void mo760b(btf btf) {
        mo754a(btf);
    }

    public void mo759a() {
    }

    public bko m6593b() {
        return this.f4428c.mo954k().m5601h();
    }

    public Context m6595c() {
        return this.f4426a.getContext();
    }

    public Resources m6596d() {
        return this.f4426a.getResources();
    }
}
