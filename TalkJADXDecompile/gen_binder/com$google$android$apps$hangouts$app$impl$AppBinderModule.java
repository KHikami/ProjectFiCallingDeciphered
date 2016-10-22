package gen_binder;

import android.content.Context;
import bcx;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$app$impl$AppBinderModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(8);
            this.a.put(bcx.a, Integer.valueOf(0));
            this.a.put(bcx.b, Integer.valueOf(1));
            this.a.put(bcx.c, Integer.valueOf(2));
            this.a.put(bcx.d, Integer.valueOf(3));
            this.a.put(bcx.e, Integer.valueOf(4));
            this.a.put(bcx.f, Integer.valueOf(5));
            this.a.put(bcx.g, Integer.valueOf(6));
            this.a.put(bcx.h, Integer.valueOf(7));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    bcx.a(context, jyn);
                case wi.j /*1*/:
                    bcx.b(context, jyn);
                case wi.l /*2*/:
                    bcx.c(context, jyn);
                case wi.z /*3*/:
                    bcx.d(context, jyn);
                case wi.h /*4*/:
                    bcx.e(context, jyn);
                case wi.p /*5*/:
                    bcx.f(context, jyn);
                case wi.s /*6*/:
                    bcx.g(context, jyn);
                case wi.q /*7*/:
                    bcx.h(context, jyn);
                default:
            }
        }
    }
}
