package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jnq;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$social$login$impl$LoginBinderModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(7);
            this.a.put(jnq.a, Integer.valueOf(0));
            this.a.put(jnq.b, Integer.valueOf(1));
            this.a.put(jnq.c, Integer.valueOf(2));
            this.a.put(jnq.d, Integer.valueOf(3));
            this.a.put(jnq.e, Integer.valueOf(4));
            this.a.put(jnq.f, Integer.valueOf(5));
            this.a.put(jnq.g, Integer.valueOf(6));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    jnq.a(context, jyn);
                case wi.j /*1*/:
                    jnq.b(context, jyn);
                case wi.l /*2*/:
                    jnq.c(context, jyn);
                case wi.z /*3*/:
                    jnq.d(context, jyn);
                case wi.h /*4*/:
                    jnq.e(context, jyn);
                case wi.p /*5*/:
                    jnq.f(context, jyn);
                case wi.s /*6*/:
                    jnq.g(context, jyn);
                default:
            }
        }
    }
}
