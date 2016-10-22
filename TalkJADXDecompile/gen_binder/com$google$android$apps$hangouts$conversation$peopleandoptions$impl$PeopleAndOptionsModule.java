package gen_binder;

import android.content.Context;
import cbr;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$conversation$peopleandoptions$impl$PeopleAndOptionsModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(3);
            this.a.put(cbr.a, Integer.valueOf(0));
            this.a.put(cbr.b, Integer.valueOf(1));
            this.a.put(cbr.c, Integer.valueOf(2));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    cbr.a(context, jyn);
                case wi.j /*1*/:
                    cbr.b(context, jyn);
                case wi.l /*2*/:
                    cbr.c(context, jyn);
                default:
            }
        }
    }
}
