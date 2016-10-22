import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class kep extends ker {
    @kfz(a = "alg")
    private String a;
    @kfz(a = "kid")
    private String b;

    public /* synthetic */ ker a() {
        return b();
    }

    public /* synthetic */ ker a(String str, Object obj) {
        return b(str, obj);
    }

    public /* synthetic */ GenericJson clone() {
        return b();
    }

    public /* synthetic */ GenericData clone() {
        return b();
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public /* synthetic */ ker d(String str) {
        return a(str);
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return b(str, obj);
    }

    public /* synthetic */ GenericData set(String str, Object obj) {
        return b(str, obj);
    }

    public kep a(String str) {
        super.d(str);
        return this;
    }

    public kep b(String str) {
        this.a = str;
        return this;
    }

    public kep c(String str) {
        this.b = str;
        return this;
    }

    private kep b(String str, Object obj) {
        return (kep) super.a(str, obj);
    }

    private kep b() {
        return (kep) super.a();
    }
}
