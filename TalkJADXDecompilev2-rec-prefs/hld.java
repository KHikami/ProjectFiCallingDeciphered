package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public class hld {
    public final /* synthetic */ Context f17065a;
    public final /* synthetic */ duy f17066b;

    public void m20015a() {
        if (this.f17066b.f10592a == null || !this.f17066b.f10592a.mo1273h()) {
            Object obj = this.f17066b.f10593b;
            double d = this.f17066b.f10594c;
            double d2 = this.f17066b.f10595d;
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
            gwb.m2220g(intent);
            intent.addFlags(268435456);
            this.f17065a.startActivity(intent);
            return;
        }
        this.f17066b.f10592a.mo1272B();
    }

    public hld(duy duy, Context context) {
        this.f17066b = duy;
        this.f17065a = context;
    }
}
