package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jgb;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$social$async$AsyncModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(5);
            this.a.put(jgb.a, Integer.valueOf(0));
            this.a.put(jgb.b, Integer.valueOf(1));
            this.a.put(jgb.c, Integer.valueOf(2));
            this.a.put(jgb.d, Integer.valueOf(3));
            this.a.put(jgb.e, Integer.valueOf(4));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    jgb.a(jyn);
                case wi.j /*1*/:
                    jgb.a(context, jyn);
                case wi.l /*2*/:
                    jgb.b(context, jyn);
                case wi.z /*3*/:
                    jgb.b(jyn);
                case wi.h /*4*/:
                    jgb.c(context, jyn);
                default:
            }
        }
    }
}
