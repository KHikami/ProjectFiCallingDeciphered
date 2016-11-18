package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public class hld {
    public final /* synthetic */ Context a;
    public final /* synthetic */ duy b;

    public void a() {
        if (this.b.a == null || !this.b.a.h()) {
            Object obj = this.b.b;
            double d = this.b.c;
            double d2 = this.b.d;
            String str = "geo:" + d + "," + d2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d);
            stringBuilder.append(",");
            stringBuilder.append(d2);
            if (!TextUtils.isEmpty(obj)) {
                stringBuilder.append("(");
                stringBuilder.append(obj);
                stringBuilder.append(")");
            }
            String encode = Uri.encode(stringBuilder.toString());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(encode).length()).append(str).append("?q=").append(encode).append("&z=16").toString()));
            gwb.g(intent);
            intent.addFlags(268435456);
            this.a.startActivity(intent);
            return;
        }
        this.b.a.B();
    }

    public hld(duy duy, Context context) {
        this.b = duy;
        this.a = context;
    }
}
