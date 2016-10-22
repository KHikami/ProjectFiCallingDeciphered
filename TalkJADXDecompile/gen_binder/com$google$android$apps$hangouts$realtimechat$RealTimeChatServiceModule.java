package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import fis;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$realtimechat$RealTimeChatServiceModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(4);
            this.a.put(fis.a, Integer.valueOf(0));
            this.a.put(fis.b, Integer.valueOf(1));
            this.a.put(fis.c, Integer.valueOf(2));
            this.a.put(fis.d, Integer.valueOf(3));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    fis.a(context, jyn);
                case wi.j /*1*/:
                    fis.a(jyn);
                case wi.l /*2*/:
                    fis.b(jyn);
                case wi.z /*3*/:
                    fis.c(jyn);
                default:
            }
        }
    }
}
