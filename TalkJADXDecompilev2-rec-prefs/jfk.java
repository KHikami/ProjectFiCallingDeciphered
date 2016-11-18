package p000;

import android.content.Context;
import android.content.res.Resources.NotFoundException;

public class jfk {
    private Context f19960a;

    public jfk(Context context) {
        this.f19960a = context;
    }

    public String m24089a(int i) {
        String str = null;
        try {
            str = this.f19960a.getResources().getResourceName(i);
        } catch (NotFoundException e) {
        }
        return str;
    }
}
