package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dpv;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$help$impl$HelpModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(dpv.a, Integer.valueOf(0));
            this.a.put(dpv.b, Integer.valueOf(1));
            this.a.put(dpv.c, Integer.valueOf(2));
            this.a.put(dpv.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    dpv.a(jyn);
                case wi.j /*1*/:
                    dpv.b(jyn);
                case wi.l /*2*/:
                    dpv.a(context, jyn);
                case wi.z /*3*/:
                    dpv.b(context, jyn);
                default:
            }
        }
    }
}
