package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.List;

public class cgt implements Serializable {
    public final int a;
    public final int b;
    public final String c;

    public void a(Context context) {
        ((cnh) jyn.a(context, cnh.class)).a(2323, this.a, this.b, this.c != null ? Integer.valueOf(gwb.p(this.c)) : null);
    }

    public cgt(List<cjs> list) {
        int i = 0;
        String str = null;
        int i2 = 0;
        for (cjs cjs : list) {
            if (cjs.b == cju.IMAGE) {
                i2++;
            } else {
                int i3;
                String str2;
                if (cjs.b == cju.VIDEO) {
                    i3 = i + 1;
                    if (i3 == 1) {
                        str2 = cjs.a;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = str;
                    i3 = i;
                }
                i = i3;
                str = str2;
            }
        }
        this.a = i2;
        this.b = i;
        this.c = str;
    }
}
