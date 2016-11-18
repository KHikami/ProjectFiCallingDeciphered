package p000;

import android.content.Context;
import android.util.Property;
import org.json.JSONObject;

final class jfr {
    final float f19974a;
    final float f19975b;
    JSONObject f19976c;
    lo<String, Object> f19977d;
    final /* synthetic */ jfq f19978e;

    public jfr(jfq jfq, Context context, int i, lo<String, Object> loVar, float f, float f2) {
        this.f19978e = jfq;
        this.f19974a = f;
        this.f19975b = f2;
        JSONObject jSONObject = (JSONObject) jfq.f19971b.get(i);
        if (jSONObject == null) {
            jSONObject = new JSONObject(jfq.m24101a(context, i));
            jfq.f19971b.put(i, jSONObject);
        }
        this.f19976c = jSONObject;
        this.f19977d = loVar;
    }

    public boolean m24106a(Property<?, ?> property) {
        return ((this.f19974a == -1.0f && property == jfw.f19987e) || (this.f19975b == -1.0f && property == jfw.f19988f)) ? false : true;
    }
}
