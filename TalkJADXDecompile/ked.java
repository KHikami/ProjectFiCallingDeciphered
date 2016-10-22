import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public class ked extends GenericJson {
    @kfz(a = "access_token")
    String a;
    @kfz(a = "expires_in")
    Long b;
    @kfz(a = "refresh_token")
    String c;

    public /* synthetic */ GenericJson clone() {
        return a();
    }

    public /* synthetic */ GenericData clone() {
        return a();
    }

    public /* synthetic */ Object clone() {
        return a();
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return a(str, obj);
    }

    public /* synthetic */ GenericData set(String str, Object obj) {
        return a(str, obj);
    }

    public ked a(String str, Object obj) {
        return (ked) super.set(str, obj);
    }

    public ked a() {
        return (ked) super.clone();
    }
}
