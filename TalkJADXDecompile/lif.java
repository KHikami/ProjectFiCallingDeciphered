import android.app.Activity;
import java.util.Map;
import java.util.Set;

public final class lif implements onc {
    private final onc<Activity> a;
    private final onc<Set<a>> b;
    private final onc<lfp> c;
    private final onc<Map<String, onc<a>>> d;

    public /* synthetic */ Object a() {
        return b();
    }

    public lif(onc<Activity> onc_android_app_Activity, onc<Set<a>> onc_java_util_Set_a, onc<lfp> onc_lfp, onc<Map<String, onc<a>>> onc_java_util_Map_java_lang_String__onc_a) {
        this.a = onc_android_app_Activity;
        this.b = onc_java_util_Set_a;
        this.c = onc_lfp;
        this.d = onc_java_util_Map_java_lang_String__onc_a;
    }

    private lie b() {
        return new lie((Activity) this.a.a(), (Set) this.b.a(), (lfp) this.c.a(), (Map) this.d.a());
    }
}
