package gen_binder;

import android.content.Context;
import bsp;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$conversation$menuitems$offtherecord$impl$OffTheRecordModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(2);
            this.a.put(bsp.a, Integer.valueOf(0));
            this.a.put(bsp.b, Integer.valueOf(1));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    bsp.a(context, jyn);
                case wi.j /*1*/:
                    bsp.b(context, jyn);
                default:
            }
        }
    }
}
