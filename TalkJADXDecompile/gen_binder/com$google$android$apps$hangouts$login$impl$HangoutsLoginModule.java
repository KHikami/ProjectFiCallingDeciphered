package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dwh;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$login$impl$HangoutsLoginModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(7);
            this.a.put(dwh.a, Integer.valueOf(0));
            this.a.put(dwh.b, Integer.valueOf(1));
            this.a.put(dwh.c, Integer.valueOf(2));
            this.a.put(dwh.d, Integer.valueOf(3));
            this.a.put(dwh.e, Integer.valueOf(4));
            this.a.put(dwh.f, Integer.valueOf(5));
            this.a.put(dwh.g, Integer.valueOf(6));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    dwh.a(context, jyn);
                case wi.j /*1*/:
                    dwh.b(context, jyn);
                case wi.l /*2*/:
                    dwh.c(context, jyn);
                case wi.z /*3*/:
                    dwh.a(jyn);
                case wi.h /*4*/:
                    dwh.d(context, jyn);
                case wi.p /*5*/:
                    dwh.b(jyn);
                case wi.s /*6*/:
                    dwh.c(jyn);
                default:
            }
        }
    }
}
