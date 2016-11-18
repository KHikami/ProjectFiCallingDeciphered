package p000;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public class ked extends GenericJson {
    @kfz(a = "access_token")
    String f21469a;
    @kfz(a = "expires_in")
    Long f21470b;
    @kfz(a = "refresh_token")
    String f21471c;

    public /* synthetic */ GenericJson clone() {
        return m25644a();
    }

    public /* synthetic */ GenericData m41635clone() {
        return m25644a();
    }

    public /* synthetic */ Object m41636clone() {
        return m25644a();
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return m25645a(str, obj);
    }

    public /* synthetic */ GenericData m41637set(String str, Object obj) {
        return m25645a(str, obj);
    }

    public ked m25645a(String str, Object obj) {
        return (ked) super.set(str, obj);
    }

    public ked m25644a() {
        return (ked) super.clone();
    }
}
