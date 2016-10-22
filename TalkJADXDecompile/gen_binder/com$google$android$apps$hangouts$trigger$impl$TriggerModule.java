package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import gim;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$trigger$impl$TriggerModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(5);
            this.a.put(gim.a, Integer.valueOf(0));
            this.a.put(gim.b, Integer.valueOf(1));
            this.a.put(gim.c, Integer.valueOf(2));
            this.a.put(gim.d, Integer.valueOf(3));
            this.a.put(gim.e, Integer.valueOf(4));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    gim.a(jyn);
                case wi.j /*1*/:
                    gim.a(context, jyn);
                case wi.l /*2*/:
                    gim.b(context, jyn);
                case wi.z /*3*/:
                    gim.c(context, jyn);
                case wi.h /*4*/:
                    gim.b(jyn);
                default:
            }
        }
    }
}
