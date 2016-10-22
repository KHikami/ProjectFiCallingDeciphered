package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import ehs;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$peoplelistv2$impl$PeopleListV2Module implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(6);
            this.a.put(ehs.a, Integer.valueOf(0));
            this.a.put(ehs.b, Integer.valueOf(1));
            this.a.put(ehs.c, Integer.valueOf(2));
            this.a.put(ehs.d, Integer.valueOf(3));
            this.a.put(ehs.e, Integer.valueOf(4));
            this.a.put(ehs.f, Integer.valueOf(5));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    ehs.a(jyn);
                case wi.j /*1*/:
                    ehs.b(jyn);
                case wi.l /*2*/:
                    ehs.c(jyn);
                case wi.z /*3*/:
                    ehs.d(jyn);
                case wi.h /*4*/:
                    ehs.e(jyn);
                case wi.p /*5*/:
                    ehs.f(jyn);
                default:
            }
        }
    }
}
