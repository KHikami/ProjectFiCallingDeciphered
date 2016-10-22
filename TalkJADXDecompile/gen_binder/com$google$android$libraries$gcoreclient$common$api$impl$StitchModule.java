package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import iej;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$common$api$impl$StitchModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(iej.a, Integer.valueOf(0));
            this.a.put(iej.b, Integer.valueOf(1));
            this.a.put(iej.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    iej.a(context, jyn);
                case wi.j /*1*/:
                    iej.a(jyn);
                case wi.l /*2*/:
                    iej.b(jyn);
                default:
            }
        }
    }
}
