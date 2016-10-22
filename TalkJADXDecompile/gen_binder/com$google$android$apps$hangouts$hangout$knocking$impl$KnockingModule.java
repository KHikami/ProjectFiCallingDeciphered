package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dnq;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$hangout$knocking$impl$KnockingModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(dnq.a, Integer.valueOf(0));
            this.a.put(dnq.b, Integer.valueOf(1));
            this.a.put(dnq.c, Integer.valueOf(2));
            this.a.put(dnq.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    dnq.a(context, jyn);
                case wi.j /*1*/:
                    dnq.b(context, jyn);
                case wi.l /*2*/:
                    dnq.a(jyn);
                case wi.z /*3*/:
                    dnq.c(context, jyn);
                default:
            }
        }
    }
}
