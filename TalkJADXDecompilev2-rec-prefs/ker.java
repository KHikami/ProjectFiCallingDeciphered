package p000;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public class ker extends GenericJson {
    @kfz(a = "typ")
    private String f21504a;

    public /* synthetic */ GenericJson clone() {
        return mo3665a();
    }

    public /* synthetic */ GenericData m41644clone() {
        return mo3665a();
    }

    public /* synthetic */ Object m41645clone() {
        return mo3665a();
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return mo3666a(str, obj);
    }

    public /* synthetic */ GenericData m41646set(String str, Object obj) {
        return mo3666a(str, obj);
    }

    public ker mo3667d(String str) {
        this.f21504a = str;
        return this;
    }

    public ker mo3666a(String str, Object obj) {
        return (ker) super.set(str, obj);
    }

    public ker mo3665a() {
        return (ker) super.clone();
    }
}
