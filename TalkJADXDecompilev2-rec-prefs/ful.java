package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ful {
    private final jcf f14036a;
    private final SharedPreferences f14037b;

    ful(Context context) {
        this.f14036a = (jcf) jyn.m25426a(context, jcf.class);
        this.f14037b = jwy.m25356b(context);
    }

    public boolean m16264a(int i) {
        return this.f14036a.mo3456a(i).mo3439a("improve_hangouts_key", true);
    }

    public void m16263a(int i, boolean z) {
        this.f14036a.mo3464b(i).m23881b("improve_hangouts_key", true).m23891d();
    }

    public boolean m16265a(int i, int i2, long j) {
        Object string;
        JSONObject jSONObject;
        long j2;
        boolean z;
        long a;
        if (i == -1) {
            string = this.f14037b.getString("THROTTLED_IMPRESSIONS", "");
        } else {
            string = this.f14036a.mo3456a(i).mo3435a("THROTTLED_IMPRESSIONS", "");
        }
        String valueOf = String.valueOf(i2);
        if (TextUtils.isEmpty(string)) {
            jSONObject = null;
            j2 = -1;
        } else {
            JSONObject jSONObject2;
            try {
                jSONObject2 = new JSONObject(string);
                try {
                    j2 = jSONObject2.optLong(valueOf, -1);
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    glk.m17981d("Babel", String.format("JSON for throttles: [[%s]] failed to parse", new Object[]{string}), new Object[0]);
                    jSONObject = jSONObject2;
                    j2 = -1;
                    z = false;
                    a = glj.m17956a() / 1000;
                    z = true;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                        glk.m17970a("Babel", String.format("JSON for throttles is created for account %s", new Object[]{Integer.valueOf(i)}), new Object[0]);
                    }
                    try {
                        jSONObject.put(valueOf, a + j);
                        if (i == -1) {
                            this.f14037b.edit().putString("THROTTLED_IMPRESSIONS", jSONObject.toString()).apply();
                            return true;
                        }
                        this.f14036a.mo3464b(i).m23879b("THROTTLED_IMPRESSIONS", jSONObject.toString()).m23891d();
                        return true;
                    } catch (JSONException e2) {
                        glk.m17982e("Babel", String.format("JSON for throttles failed to put %d to %s", new Object[]{Long.valueOf(j2), valueOf}), new Object[0]);
                    }
                }
            } catch (JSONException e3) {
                jSONObject2 = null;
                glk.m17981d("Babel", String.format("JSON for throttles: [[%s]] failed to parse", new Object[]{string}), new Object[0]);
                jSONObject = jSONObject2;
                j2 = -1;
                z = false;
                a = glj.m17956a() / 1000;
                z = true;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    glk.m17970a("Babel", String.format("JSON for throttles is created for account %s", new Object[]{Integer.valueOf(i)}), new Object[0]);
                }
                jSONObject.put(valueOf, a + j);
                if (i == -1) {
                    this.f14036a.mo3464b(i).m23879b("THROTTLED_IMPRESSIONS", jSONObject.toString()).m23891d();
                    return true;
                }
                this.f14037b.edit().putString("THROTTLED_IMPRESSIONS", jSONObject.toString()).apply();
                return true;
            }
        }
        z = false;
        a = glj.m17956a() / 1000;
        if (j2 == -1 || j2 < a) {
            z = true;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                glk.m17970a("Babel", String.format("JSON for throttles is created for account %s", new Object[]{Integer.valueOf(i)}), new Object[0]);
            }
            jSONObject.put(valueOf, a + j);
            if (i == -1) {
                this.f14037b.edit().putString("THROTTLED_IMPRESSIONS", jSONObject.toString()).apply();
                return true;
            }
            this.f14036a.mo3464b(i).m23879b("THROTTLED_IMPRESSIONS", jSONObject.toString()).m23891d();
            return true;
        }
        return z;
    }

    public void m16266b(int i) {
        if (i != -1) {
            this.f14036a.mo3464b(i).m23893e("THROTTLED_IMPRESSIONS").m23891d();
        }
        this.f14037b.edit().remove("THROTTLED_IMPRESSIONS").apply();
    }

    public void m16262a(int i, String str, String str2, long j) {
        if (i != -1) {
            this.f14036a.mo3464b(i).m23879b("LAST_CALL_LOCAL_SESSION", str).m23879b("LAST_CALL_LOGS_PATH", str2).m23878b("LAST_CALL_START_TIME", j).m23891d();
        }
        this.f14037b.edit().putString("LAST_CALL_LOCAL_SESSION", str).putString("LAST_CALL_LOGS_PATH", str2).putLong("LAST_CALL_START_TIME", j).apply();
    }

    public String m16267c(int i) {
        String str;
        if (i == -1) {
            str = "";
        } else {
            str = this.f14036a.mo3456a(i).mo3440b("LAST_CALL_LOCAL_SESSION");
        }
        return TextUtils.isEmpty(str) ? this.f14037b.getString("LAST_CALL_LOCAL_SESSION", "") : str;
    }

    public String m16268d(int i) {
        String str;
        if (i == -1) {
            str = "";
        } else {
            str = this.f14036a.mo3456a(i).mo3440b("LAST_CALL_LOGS_PATH");
        }
        return TextUtils.isEmpty(str) ? this.f14037b.getString("LAST_CALL_LOGS_PATH", "") : str;
    }

    public long m16269e(int i) {
        long j;
        if (i == -1) {
            j = -1;
        } else {
            j = this.f14036a.mo3456a(i).mo3434a("LAST_CALL_START_TIME", -1);
        }
        return j == -1 ? this.f14037b.getLong("LAST_CALL_START_TIME", -1) : j;
    }
}
