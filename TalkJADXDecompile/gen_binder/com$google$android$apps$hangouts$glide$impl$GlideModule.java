package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dfi;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$glide$impl$GlideModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(dfi.a, Integer.valueOf(0));
            this.a.put(dfi.b, Integer.valueOf(1));
            this.a.put(dfi.c, Integer.valueOf(2));
            this.a.put(dfi.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    dfi.a(jyn);
                case wi.j /*1*/:
                    dfi.a(context, jyn);
                case wi.l /*2*/:
                    dfi.b(context, jyn);
                case wi.z /*3*/:
                    dfi.c(context, jyn);
                default:
            }
        }
    }
}
