package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import jzy;
import wi;

@UsedByReflection
public final class com$google$android$libraries$stitch$binder$lifecycle$visibility$VisibilityModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(2);
            this.a.put(jzy.a, Integer.valueOf(0));
            this.a.put(jzy.b, Integer.valueOf(1));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    jzy.a(jyn);
                case wi.j /*1*/:
                    jzy.b(jyn);
                default:
            }
        }
    }
}
