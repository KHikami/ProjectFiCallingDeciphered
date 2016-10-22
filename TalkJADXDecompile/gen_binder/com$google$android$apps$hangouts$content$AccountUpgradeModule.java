package gen_binder;

import android.content.Context;
import bjq;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$content$AccountUpgradeModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(bjq.a, Integer.valueOf(0));
            this.a.put(bjq.b, Integer.valueOf(1));
            this.a.put(bjq.c, Integer.valueOf(2));
            this.a.put(bjq.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    bjq.a(jyn);
                case wi.j /*1*/:
                    bjq.b(jyn);
                case wi.l /*2*/:
                    bjq.a(context, jyn);
                case wi.z /*3*/:
                    bjq.b(context, jyn);
                default:
            }
        }
    }
}
