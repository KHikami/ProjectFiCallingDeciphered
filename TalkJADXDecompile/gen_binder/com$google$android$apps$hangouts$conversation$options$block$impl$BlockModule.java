package gen_binder;

import android.content.Context;
import byy;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$conversation$options$block$impl$BlockModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(2);
            this.a.put(byy.a, Integer.valueOf(0));
            this.a.put(byy.b, Integer.valueOf(1));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    byy.a(jyn);
                case wi.j /*1*/:
                    byy.b(jyn);
                default:
            }
        }
    }
}
