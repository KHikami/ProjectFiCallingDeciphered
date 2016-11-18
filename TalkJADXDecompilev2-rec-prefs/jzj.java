package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class jzj<T extends jzh> implements jyw, jza, kcn, kcq {
    public final kbu f21314a;
    private Set<String> f21315b = new HashSet();
    private final Class f21316c;
    private jzi<T> f21317d;

    public abstract jzi<T> mo3630a(Context context);

    public abstract void mo3631a(T t, kbu kbu, jyn jyn);

    public jzj(kbu kbu, Class cls) {
        this.f21314a = kbu;
        this.f21316c = cls;
        kbu.m25514a((kcq) this);
    }

    public synchronized void mo2230a(Context context, Class<?> cls, jyn jyn) {
        if (cls != this.f21316c) {
            if (this.f21317d == null) {
                this.f21317d = mo3630a(context);
            }
            String name = cls.getName();
            List<jzh> a = this.f21317d.m25468a(cls);
            if (a != null) {
                this.f21315b.add(name);
                for (jzh a2 : a) {
                    mo3631a(a2, this.f21314a, jyn);
                }
            }
        }
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        if (bundle != null) {
            for (String cls : bundle.getStringArray("extra_auto_bound_objects")) {
                try {
                    jyn.m25443a(Class.forName(cls));
                } catch (Throwable e) {
                    Log.e("BaseAutoBinderModule", "Autobound class not found upon reconstruction", e);
                }
            }
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putStringArray("extra_auto_bound_objects", (String[]) this.f21315b.toArray(new String[this.f21315b.size()]));
    }
}
