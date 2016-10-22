package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jeq;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$social$activityresult$ActivityResultModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(jeq.a, Integer.valueOf(0));
            this.a.put(jeq.b, Integer.valueOf(1));
            this.a.put(jeq.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    jeq.a(jyn);
                case wi.j /*1*/:
                    jeq.a(context, jyn);
                case wi.l /*2*/:
                    jeq.b(jyn);
                default:
            }
        }
    }
}
