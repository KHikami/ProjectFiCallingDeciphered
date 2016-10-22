package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import dya;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$mergedcontacts$impl$MergedContactsModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(16);
            this.a.put(dya.a, Integer.valueOf(0));
            this.a.put(dya.b, Integer.valueOf(1));
            this.a.put(dya.c, Integer.valueOf(2));
            this.a.put(dya.d, Integer.valueOf(3));
            this.a.put(dya.e, Integer.valueOf(4));
            this.a.put(dya.f, Integer.valueOf(5));
            this.a.put(dya.g, Integer.valueOf(6));
            this.a.put(dya.h, Integer.valueOf(7));
            this.a.put(dya.i, Integer.valueOf(8));
            this.a.put(dya.j, Integer.valueOf(9));
            this.a.put(dya.k, Integer.valueOf(10));
            this.a.put(dya.l, Integer.valueOf(11));
            this.a.put(dya.m, Integer.valueOf(12));
            this.a.put(dya.n, Integer.valueOf(13));
            this.a.put(dya.o, Integer.valueOf(14));
            this.a.put(dya.p, Integer.valueOf(15));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    dya.a(context, jyn);
                case wi.j /*1*/:
                    dya.b(context, jyn);
                case wi.l /*2*/:
                    dya.c(context, jyn);
                case wi.z /*3*/:
                    dya.d(context, jyn);
                case wi.h /*4*/:
                    dya.e(context, jyn);
                case wi.p /*5*/:
                    dya.f(context, jyn);
                case wi.s /*6*/:
                    dya.a(jyn);
                case wi.q /*7*/:
                    dya.b(jyn);
                case wi.m /*8*/:
                    dya.g(context, jyn);
                case wi.n /*9*/:
                    dya.c(jyn);
                case wi.dr /*10*/:
                    dya.h(context, jyn);
                case wi.dB /*11*/:
                    dya.i(context, jyn);
                case wi.dM /*12*/:
                    dya.d(jyn);
                case wi.dD /*13*/:
                    dya.j(context, jyn);
                case wi.g /*14*/:
                    dya.k(context, jyn);
                case wi.dJ /*15*/:
                    dya.l(context, jyn);
                default:
            }
        }
    }
}
