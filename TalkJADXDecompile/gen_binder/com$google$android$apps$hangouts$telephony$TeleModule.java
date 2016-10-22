package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import gdv;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$telephony$TeleModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(8);
            this.a.put(gdv.a, Integer.valueOf(0));
            this.a.put(gdv.b, Integer.valueOf(1));
            this.a.put(gdv.c, Integer.valueOf(2));
            this.a.put(gdv.d, Integer.valueOf(3));
            this.a.put(gdv.e, Integer.valueOf(4));
            this.a.put(gdv.f, Integer.valueOf(5));
            this.a.put(gdv.g, Integer.valueOf(6));
            this.a.put(gdv.h, Integer.valueOf(7));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    gdv.a(context, jyn);
                case wi.j /*1*/:
                    gdv.b(context, jyn);
                case wi.l /*2*/:
                    gdv.c(context, jyn);
                case wi.z /*3*/:
                    gdv.d(context, jyn);
                case wi.h /*4*/:
                    gdv.e(context, jyn);
                case wi.p /*5*/:
                    gdv.a(jyn);
                case wi.s /*6*/:
                    gdv.f(context, jyn);
                case wi.q /*7*/:
                    gdv.g(context, jyn);
                default:
            }
        }
    }
}
