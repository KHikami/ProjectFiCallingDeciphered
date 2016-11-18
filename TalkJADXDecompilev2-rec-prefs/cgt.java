package p000;

import android.content.Context;
import java.io.Serializable;
import java.util.List;

public class cgt implements Serializable {
    public final int f5262a;
    public final int f5263b;
    public final String f5264c;

    public void m7573a(Context context) {
        ((cnh) jyn.m25426a(context, cnh.class)).m7969a(2323, this.f5262a, this.f5263b, this.f5264c != null ? Integer.valueOf(gwb.m2321p(this.f5264c)) : null);
    }

    public cgt(List<cjs> list) {
        int i = 0;
        String str = null;
        int i2 = 0;
        for (cjs cjs : list) {
            if (cjs.f5444b == cju.IMAGE) {
                i2++;
            } else {
                int i3;
                String str2;
                if (cjs.f5444b == cju.VIDEO) {
                    i3 = i + 1;
                    if (i3 == 1) {
                        str2 = cjs.f5443a;
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
        this.f5262a = i2;
        this.f5263b = i;
        this.f5264c = str;
    }
}
