package defpackage;

import android.app.Activity;
import android.content.Context;

public class jte {
    public final /* synthetic */ eih a;

    public int a(Context context, String str) {
        return context.checkSelfPermission(str);
    }

    public void a(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public jte(eih eih) {
        this.a = eih;
    }
}
