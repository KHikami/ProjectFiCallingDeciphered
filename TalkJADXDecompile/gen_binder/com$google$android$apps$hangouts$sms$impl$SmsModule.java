package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fzt;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$sms$impl$SmsModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(fzt.a, Integer.valueOf(0));
            this.a.put(fzt.b, Integer.valueOf(1));
            this.a.put(fzt.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    fzt.a(context, jyn);
                case wi.j /*1*/:
                    fzt.b(context, jyn);
                case wi.l /*2*/:
                    fzt.c(context, jyn);
                default:
            }
        }
    }
}
