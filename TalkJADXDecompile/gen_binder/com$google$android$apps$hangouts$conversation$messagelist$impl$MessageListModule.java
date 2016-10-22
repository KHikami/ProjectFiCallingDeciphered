package gen_binder;

import android.content.Context;
import bva;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$conversation$messagelist$impl$MessageListModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(7);
            this.a.put(bva.a, Integer.valueOf(0));
            this.a.put(bva.b, Integer.valueOf(1));
            this.a.put(bva.c, Integer.valueOf(2));
            this.a.put(bva.d, Integer.valueOf(3));
            this.a.put(bva.e, Integer.valueOf(4));
            this.a.put(bva.f, Integer.valueOf(5));
            this.a.put(bva.g, Integer.valueOf(6));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    bva.a(context, jyn);
                case wi.j /*1*/:
                    bva.b(context, jyn);
                case wi.l /*2*/:
                    bva.c(context, jyn);
                case wi.z /*3*/:
                    bva.d(context, jyn);
                case wi.h /*4*/:
                    bva.e(context, jyn);
                case wi.p /*5*/:
                    bva.f(context, jyn);
                case wi.s /*6*/:
                    bva.g(context, jyn);
                default:
            }
        }
    }
}
