package gen_binder;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.HashMap;
import jyn;
import jyw;

@UsedByReflection
public final class com$google$android$apps$hangouts$prerelease$PrereleaseModule implements jyw {
    private HashMap<String, Integer> a;

    public void a(Context context, Class<?> cls, jyn jyn) {
        if (this.a == null) {
            this.a = new HashMap(0);
        }
        Integer num = (Integer) this.a.get(cls.getName());
        if (num != null) {
            num.intValue();
        }
    }
}
