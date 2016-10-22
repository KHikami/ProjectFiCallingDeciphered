package gen_binder;

import android.content.Context;
import bgv;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$callpromos$impl$CallPromoModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(bgv.a, Integer.valueOf(0));
            this.a.put(bgv.b, Integer.valueOf(1));
            this.a.put(bgv.c, Integer.valueOf(2));
            this.a.put(bgv.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    bgv.a(context, jyn);
                case wi.j /*1*/:
                    bgv.b(context, jyn);
                case wi.l /*2*/:
                    bgv.c(context, jyn);
                case wi.z /*3*/:
                    bgv.a(jyn);
                default:
            }
        }
    }
}
