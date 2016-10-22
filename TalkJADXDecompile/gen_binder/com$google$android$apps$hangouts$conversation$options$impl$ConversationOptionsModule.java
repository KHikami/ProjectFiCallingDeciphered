package gen_binder;

import android.content.Context;
import caj;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$conversation$options$impl$ConversationOptionsModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(caj.a, Integer.valueOf(0));
            this.a.put(caj.b, Integer.valueOf(1));
            this.a.put(caj.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    caj.a(jyn);
                case wi.j /*1*/:
                    caj.b(jyn);
                case wi.l /*2*/:
                    caj.c(jyn);
                default:
            }
        }
    }
}
