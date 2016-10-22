package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import eeo;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$peertopeer$impl$PeerToPeerModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(5);
            this.a.put(eeo.a, Integer.valueOf(0));
            this.a.put(eeo.b, Integer.valueOf(1));
            this.a.put(eeo.c, Integer.valueOf(2));
            this.a.put(eeo.d, Integer.valueOf(3));
            this.a.put(eeo.e, Integer.valueOf(4));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    eeo.a(context, jyn);
                case wi.j /*1*/:
                    eeo.b(context, jyn);
                case wi.l /*2*/:
                    eeo.c(context, jyn);
                case wi.z /*3*/:
                    eeo.d(context, jyn);
                case wi.h /*4*/:
                    eeo.a(jyn);
                default:
            }
        }
    }
}
