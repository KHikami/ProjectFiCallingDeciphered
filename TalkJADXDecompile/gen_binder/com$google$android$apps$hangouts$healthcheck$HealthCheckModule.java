package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dpl;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$healthcheck$HealthCheckModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(dpl.a, Integer.valueOf(0));
            this.a.put(dpl.b, Integer.valueOf(1));
            this.a.put(dpl.c, Integer.valueOf(2));
            this.a.put(dpl.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    dpl.a(context, jyn);
                case wi.j /*1*/:
                    dpl.b(context, jyn);
                case wi.l /*2*/:
                    dpl.c(context, jyn);
                case wi.z /*3*/:
                    dpl.d(context, jyn);
                default:
            }
        }
    }
}
