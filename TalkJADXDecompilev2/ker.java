package defpackage;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public class ker extends GenericJson {
    @kfz(a = "typ")
    private String a;

    public /* synthetic */ GenericJson clone() {
        return a();
    }

    public /* synthetic */ GenericData m12clone() {
        return a();
    }

    public /* synthetic */ Object m13clone() {
        return a();
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return a(str, obj);
    }

    public /* synthetic */ GenericData m14set(String str, Object obj) {
        return a(str, obj);
    }

    public ker d(String str) {
        this.a = str;
        return this;
    }

    public ker a(String str, Object obj) {
        return (ker) super.set(str, obj);
    }

    public ker a() {
        return (ker) super.clone();
    }
}
