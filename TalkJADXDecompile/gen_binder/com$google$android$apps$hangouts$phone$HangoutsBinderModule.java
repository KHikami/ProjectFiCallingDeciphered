package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import eok;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$phone$HangoutsBinderModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(eok.a, Integer.valueOf(0));
            this.a.put(eok.b, Integer.valueOf(1));
            this.a.put(eok.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    eok.a(context, jyn);
                case wi.j /*1*/:
                    eok.a(jyn);
                case wi.l /*2*/:
                    eok.b(jyn);
                default:
            }
        }
    }
}
