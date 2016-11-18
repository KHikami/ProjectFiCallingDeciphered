package p000;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class kes extends GenericJson {
    @kfz(a = "exp")
    private Long f21507a;
    @kfz(a = "iat")
    private Long f21508b;
    @kfz(a = "iss")
    private String f21509c;
    @kfz(a = "aud")
    private Object f21510d;
    @kfz(a = "sub")
    private String f21511e;

    public /* synthetic */ GenericJson clone() {
        return m25674a();
    }

    public /* synthetic */ GenericData m41641clone() {
        return m25674a();
    }

    public /* synthetic */ Object m41642clone() {
        return m25674a();
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return m25675a(str, obj);
    }

    public /* synthetic */ GenericData m41643set(String str, Object obj) {
        return m25675a(str, obj);
    }

    public kes m25676a(Long l) {
        this.f21507a = l;
        return this;
    }

    public kes m25679b(Long l) {
        this.f21508b = l;
        return this;
    }

    public kes m25678a(String str) {
        this.f21509c = str;
        return this;
    }

    public kes m25677a(Object obj) {
        this.f21510d = obj;
        return this;
    }

    public kes m25680b(String str) {
        this.f21511e = str;
        return this;
    }

    private kes m25675a(String str, Object obj) {
        return (kes) super.set(str, obj);
    }

    private kes m25674a() {
        return (kes) super.clone();
    }
}
