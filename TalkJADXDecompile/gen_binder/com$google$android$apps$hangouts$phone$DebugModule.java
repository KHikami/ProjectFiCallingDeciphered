package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import end;
import java.util.HashMap;
import jyn;
import jyw;
import wi;

@UsedByReflection
public final class com$google$android$apps$hangouts$phone$DebugModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(1);
            this.a.put(end.a, Integer.valueOf(0));
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            switch (num.intValue()) {
                case wi.w /*0*/:
                    end.a(jyn);
                default:
            }
        }
    }
}
