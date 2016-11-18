package p000;

import android.app.Activity;
import android.content.Context;

public class jte {
    public final /* synthetic */ eih f21022a;

    public int m25187a(Context context, String str) {
        return context.checkSelfPermission(str);
    }

    public void m25188a(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public jte(eih eih) {
        this.f21022a = eih;
    }
}
