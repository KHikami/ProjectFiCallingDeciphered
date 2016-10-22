package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import flr;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$realtimechat$listener$impl$ListenersModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(2);
            this.a.put(flr.a, Integer.valueOf(0));
            this.a.put(flr.b, Integer.valueOf(1));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    flr.a(context, jyn);
                case wi.j /*1*/:
                    flr.b(context, jyn);
                default:
            }
        }
    }
}
