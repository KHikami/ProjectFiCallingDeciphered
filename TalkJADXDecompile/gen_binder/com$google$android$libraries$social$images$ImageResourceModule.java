package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jkw;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$social$images$ImageResourceModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(jkw.a, Integer.valueOf(0));
            this.a.put(jkw.b, Integer.valueOf(1));
            this.a.put(jkw.c, Integer.valueOf(2));
            this.a.put(jkw.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    jkw.a(context, jyn);
                case wi.j /*1*/:
                    jkw.a(jyn);
                case wi.l /*2*/:
                    jkw.b(jyn);
                case wi.z /*3*/:
                    jkw.c(jyn);
                default:
            }
        }
    }
}
