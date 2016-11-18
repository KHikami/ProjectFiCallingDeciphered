package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ful {
    private final jcf a;
    private final SharedPreferences b;

    ful(Context context) {
        this.a = (jcf) jyn.a(context, jcf.class);
        this.b = jwy.b(context);
    }

    public boolean a(int i) {
        return this.a.a(i).a("improve_hangouts_key", true);
    }

    public void a(int i, boolean z) {
        this.a.b(i).b("improve_hangouts_key", true).d();
    }

    public boolean a(int i, int i2, long j) {
        Object string;
        JSONObject jSONObject;
        long j2;
        JSONObject jSONObject2;
        boolean z;
        long a;
        if (i == -1) {
            string = this.b.getString("THROTTLED_IMPRESSIONS", "");
        } else {
            string = this.a.a(i).a("THROTTLED_IMPRESSIONS", "");
        }
        String valueOf = String.valueOf(i2);
        if (TextUtils.isEmpty(string)) {
            jSONObject = null;
            j2 = -1;
        } else {
            try {
                jSONObject2 = new JSONObject(string);
                try {
                    j2 = jSONObject2.optLong(valueOf, -1);
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    glk.d("Babel", String.format("JSON for throttles: [[%s]] failed to parse", new Object[]{string}), new Object[0]);
                    jSONObject = jSONObject2;
                    j2 = -1;
                    z = false;
                    a = glj.a() / 1000;
                    z = true;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                        glk.a("Babel", String.format("JSON for throttles is created for account %s", new Object[]{Integer.valueOf(i)}), new Object[0]);
                    }
                    try {
                        jSONObject.put(valueOf, a + j);
                        if (i == -1) {
                            this.b.edit().putString("THROTTLED_IMPRESSIONS", jSONObject.toString()).apply();
                            return true;
                        }
                        this.a.b(i).b("THROTTLED_IMPRESSIONS", jSONObject.toString()).d();
                        return true;
                    } catch (JSONException e2) {
                        glk.e("Babel", String.format("JSON for throttles failed to put %d to %s", new Object[]{Long.valueOf(j2), valueOf}), new Object[0]);
                    }
                }
            } catch (JSONException e3) {
                jSONObject2 = null;
                glk.d("Babel", String.format("JSON for throttles: [[%s]] failed to parse", new Object[]{string}), new Object[0]);
                jSONObject = jSONObject2;
                j2 = -1;
                z = false;
                a = glj.a() / 1000;
                z = true;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    glk.a("Babel", String.format("JSON for throttles is created for account %s", new Object[]{Integer.valueOf(i)}), new Object[0]);
                }
                jSONObject.put(valueOf, a + j);
                if (i == -1) {
                    this.a.b(i).b("THROTTLED_IMPRESSIONS", jSONObject.toString()).d();
                    return true;
                }
                this.b.edit().putString("THROTTLED_IMPRESSIONS", jSONObject.toString()).apply();
                return true;
            }
        }
        z = false;
        a = glj.a() / 1000;
        if (j2 == -1 || j2 < a) {
            z = true;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                glk.a("Babel", String.format("JSON for throttles is created for account %s", new Object[]{Integer.valueOf(i)}), new Object[0]);
            }
            jSONObject.put(valueOf, a + j);
            if (i == -1) {
                this.b.edit().putString("THROTTLED_IMPRESSIONS", jSONObject.toString()).apply();
                return true;
            }
            this.a.b(i).b("THROTTLED_IMPRESSIONS", jSONObject.toString()).d();
            return true;
        }
        return z;
    }

    public void b(int i) {
        if (i != -1) {
            this.a.b(i).e("THROTTLED_IMPRESSIONS").d();
        }
        this.b.edit().remove("THROTTLED_IMPRESSIONS").apply();
    }

    public void a(int i, String str, String str2, long j) {
        if (i != -1) {
            this.a.b(i).b("LAST_CALL_LOCAL_SESSION", str).b("LAST_CALL_LOGS_PATH", str2).b("LAST_CALL_START_TIME", j).d();
        }
        this.b.edit().putString("LAST_CALL_LOCAL_SESSION", str).putString("LAST_CALL_LOGS_PATH", str2).putLong("LAST_CALL_START_TIME", j).apply();
    }

    public String c(int i) {
        String str;
        if (i == -1) {
            str = "";
        } else {
            str = this.a.a(i).b("LAST_CALL_LOCAL_SESSION");
        }
        return TextUtils.isEmpty(str) ? this.b.getString("LAST_CALL_LOCAL_SESSION", "") : str;
    }

    public String d(int i) {
        String str;
        if (i == -1) {
            str = "";
        } else {
            str = this.a.a(i).b("LAST_CALL_LOGS_PATH");
        }
        return TextUtils.isEmpty(str) ? this.b.getString("LAST_CALL_LOGS_PATH", "") : str;
    }

    public long e(int i) {
        long j;
        if (i == -1) {
            j = -1;
        } else {
            j = this.a.a(i).a("LAST_CALL_START_TIME", -1);
        }
        return j == -1 ? this.b.getLong("LAST_CALL_START_TIME", -1) : j;
    }
}
