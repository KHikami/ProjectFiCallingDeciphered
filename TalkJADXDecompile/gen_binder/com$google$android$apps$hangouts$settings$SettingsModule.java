package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fvs;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$settings$SettingsModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(fvs.a, Integer.valueOf(0));
            this.a.put(fvs.b, Integer.valueOf(1));
            this.a.put(fvs.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    fvs.a(context, jyn);
                case wi.j /*1*/:
                    fvs.b(context, jyn);
                case wi.l /*2*/:
                    fvs.c(context, jyn);
                default:
            }
        }
    }
}
