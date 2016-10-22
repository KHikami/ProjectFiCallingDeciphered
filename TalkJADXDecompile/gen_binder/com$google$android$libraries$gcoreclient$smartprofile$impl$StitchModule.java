package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import ihs;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$smartprofile$impl$StitchModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(ihs.a, Integer.valueOf(0));
            this.a.put(ihs.b, Integer.valueOf(1));
            this.a.put(ihs.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    ihs.a(context, jyn);
                case wi.j /*1*/:
                    ihs.a(jyn);
                case wi.l /*2*/:
                    ihs.b(jyn);
                default:
            }
        }
    }
}
