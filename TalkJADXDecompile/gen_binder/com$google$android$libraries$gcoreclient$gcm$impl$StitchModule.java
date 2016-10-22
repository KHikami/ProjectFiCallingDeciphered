package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import igv;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$libraries$gcoreclient$gcm$impl$StitchModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(7);
            this.a.put(igv.a, Integer.valueOf(0));
            this.a.put(igv.b, Integer.valueOf(1));
            this.a.put(igv.c, Integer.valueOf(2));
            this.a.put(igv.d, Integer.valueOf(3));
            this.a.put(igv.e, Integer.valueOf(4));
            this.a.put(igv.f, Integer.valueOf(5));
            this.a.put(igv.g, Integer.valueOf(6));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    igv.a(context, jyn);
                case wi.j /*1*/:
                    igv.a(jyn);
                case wi.l /*2*/:
                    igv.b(jyn);
                case wi.z /*3*/:
                    igv.b(context, jyn);
                case wi.h /*4*/:
                    igv.c(jyn);
                case wi.p /*5*/:
                    igv.c(context, jyn);
                case wi.s /*6*/:
                    igv.d(context, jyn);
                default:
            }
        }
    }
}
