package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import edj;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$oob$impl$OobModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(2);
            this.a.put(edj.a, Integer.valueOf(0));
            this.a.put(edj.b, Integer.valueOf(1));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    edj.a(context, jyn);
                case wi.j /*1*/:
                    edj.a(jyn);
                default:
            }
        }
    }
}
