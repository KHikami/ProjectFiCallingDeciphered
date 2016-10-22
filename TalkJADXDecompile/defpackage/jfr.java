package defpackage;

import android.content.Context;
import android.util.Property;
import org.json.JSONObject;

/* renamed from: jfr */
final class jfr {
    final float a;
    final float b;
    JSONObject c;
    lo<String, Object> d;
    final /* synthetic */ jfq e;

    public jfr(jfq jfq, Context context, int i, lo<String, Object> loVar, float f, float f2) {
        this.e = jfq;
        this.a = f;
        this.b = f2;
        JSONObject jSONObject = (JSONObject) jfq.b.get(i);
        if (jSONObject == null) {
            jSONObject = new JSONObject(jfq.a(context, i));
            jfq.b.put(i, jSONObject);
        }
        this.c = jSONObject;
        this.d = loVar;
    }

    public boolean a(Property<?, ?> property) {
        return ((this.a == -1.0f && property == jfw.e) || (this.b == -1.0f && property == jfw.f)) ? false : true;
    }
}
