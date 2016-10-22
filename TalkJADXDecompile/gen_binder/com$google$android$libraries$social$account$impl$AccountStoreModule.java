package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jdr;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$social$account$impl$AccountStoreModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(6);
            this.a.put(jdr.a, Integer.valueOf(0));
            this.a.put(jdr.b, Integer.valueOf(1));
            this.a.put(jdr.c, Integer.valueOf(2));
            this.a.put(jdr.d, Integer.valueOf(3));
            this.a.put(jdr.e, Integer.valueOf(4));
            this.a.put(jdr.f, Integer.valueOf(5));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    jdr.a(jyn);
                case wi.j /*1*/:
                    jdr.a(context, jyn);
                case wi.l /*2*/:
                    jdr.b(context, jyn);
                case wi.z /*3*/:
                    jdr.c(context, jyn);
                case wi.h /*4*/:
                    jdr.b(jyn);
                case wi.p /*5*/:
                    jdr.c(jyn);
                default:
            }
        }
    }
}
