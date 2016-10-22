package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fns;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$registration$impl$RegistrationModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(fns.a, Integer.valueOf(0));
            this.a.put(fns.b, Integer.valueOf(1));
            this.a.put(fns.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    fns.a(context, jyn);
                case wi.j /*1*/:
                    fns.b(context, jyn);
                case wi.l /*2*/:
                    fns.a(jyn);
                default:
            }
        }
    }
}
