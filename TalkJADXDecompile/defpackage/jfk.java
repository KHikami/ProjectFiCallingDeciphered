package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;

/* renamed from: jfk */
public class jfk {
    private Context a;

    public jfk(Context context) {
        this.a = context;
    }

    public String a(int i) {
        String str = null;
        try {
            str = this.a.getResources().getResourceName(i);
        } catch (NotFoundException e) {
        }
        return str;
    }
}
