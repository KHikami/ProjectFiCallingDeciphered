package gen_binder;

import android.content.Context;
import bfi;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$callerid$impl$CallerIdModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(10);
            this.a.put(bfi.a, Integer.valueOf(0));
            this.a.put(bfi.b, Integer.valueOf(1));
            this.a.put(bfi.c, Integer.valueOf(2));
            this.a.put(bfi.d, Integer.valueOf(3));
            this.a.put(bfi.e, Integer.valueOf(4));
            this.a.put(bfi.f, Integer.valueOf(5));
            this.a.put(bfi.g, Integer.valueOf(6));
            this.a.put(bfi.h, Integer.valueOf(7));
            this.a.put(bfi.i, Integer.valueOf(8));
            this.a.put(bfi.j, Integer.valueOf(9));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    bfi.a(context, jyn);
                case wi.j /*1*/:
                    bfi.b(context, jyn);
                case wi.l /*2*/:
                    bfi.c(context, jyn);
                case wi.z /*3*/:
                    bfi.d(context, jyn);
                case wi.h /*4*/:
                    bfi.e(context, jyn);
                case wi.p /*5*/:
                    bfi.f(context, jyn);
                case wi.s /*6*/:
                    bfi.a(jyn);
                case wi.q /*7*/:
                    bfi.g(context, jyn);
                case wi.m /*8*/:
                    bfi.h(context, jyn);
                case wi.n /*9*/:
                    bfi.i(context, jyn);
                default:
            }
        }
    }
}
