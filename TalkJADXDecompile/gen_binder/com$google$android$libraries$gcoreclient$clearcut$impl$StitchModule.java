package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import idq;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$clearcut$impl$StitchModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(idq.a, Integer.valueOf(0));
            this.a.put(idq.b, Integer.valueOf(1));
            this.a.put(idq.c, Integer.valueOf(2));
            this.a.put(idq.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    idq.a(jyn);
                case wi.j /*1*/:
                    idq.b(jyn);
                case wi.l /*2*/:
                    idq.c(jyn);
                case wi.z /*3*/:
                    idq.d(jyn);
                default:
            }
        }
    }
}
