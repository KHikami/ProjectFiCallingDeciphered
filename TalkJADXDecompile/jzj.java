import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class jzj<T extends jzh> implements jyw, jza, kcn, kcq {
    public final kbu a;
    private Set<String> b;
    private final Class c;
    private jzi<T> d;

    public abstract jzi<T> a(Context context);

    public abstract void a(T t, kbu kbu, jyn jyn);

    public jzj(kbu kbu, Class cls) {
        this.b = new HashSet();
        this.a = kbu;
        this.c = cls;
        kbu.a((kcq) this);
    }

    public synchronized void a(Context context, Class<?> cls, jyn jyn) {
        if (cls != this.c) {
            if (this.d == null) {
                this.d = a(context);
            }
            String name = cls.getName();
            List<jzh> a = this.d.a(cls);
            if (a != null) {
                this.b.add(name);
                for (jzh a2 : a) {
                    a(a2, this.a, jyn);
                }
            }
        }
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        if (bundle != null) {
            for (String cls : bundle.getStringArray("extra_auto_bound_objects")) {
                try {
                    jyn.a(Class.forName(cls));
                } catch (Throwable e) {
                    Log.e("BaseAutoBinderModule", "Autobound class not found upon reconstruction", e);
                }
            }
        }
    }

    public void b(Bundle bundle) {
        bundle.putStringArray("extra_auto_bound_objects", (String[]) this.b.toArray(new String[this.b.size()]));
    }
}
