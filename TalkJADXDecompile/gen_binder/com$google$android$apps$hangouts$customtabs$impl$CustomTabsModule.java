package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import cpk;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$customtabs$impl$CustomTabsModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(5);
            this.a.put(cpk.a, Integer.valueOf(0));
            this.a.put(cpk.b, Integer.valueOf(1));
            this.a.put(cpk.c, Integer.valueOf(2));
            this.a.put(cpk.d, Integer.valueOf(3));
            this.a.put(cpk.e, Integer.valueOf(4));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    cpk.a(context, jyn);
                case wi.j /*1*/:
                    cpk.b(context, jyn);
                case wi.l /*2*/:
                    cpk.a(jyn);
                case wi.z /*3*/:
                    cpk.c(context, jyn);
                case wi.h /*4*/:
                    cpk.d(context, jyn);
                default:
            }
        }
    }
}
