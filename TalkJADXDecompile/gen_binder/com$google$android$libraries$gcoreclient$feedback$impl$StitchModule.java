package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import ifv;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$feedback$impl$StitchModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(ifv.a, Integer.valueOf(0));
            this.a.put(ifv.b, Integer.valueOf(1));
            this.a.put(ifv.c, Integer.valueOf(2));
            this.a.put(ifv.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    ifv.a(jyn);
                case wi.j /*1*/:
                    ifv.b(jyn);
                case wi.l /*2*/:
                    ifv.c(jyn);
                case wi.z /*3*/:
                    ifv.d(jyn);
                default:
            }
        }
    }
}
