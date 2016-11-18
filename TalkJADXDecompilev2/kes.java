package defpackage;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class kes extends GenericJson {
    @kfz(a = "exp")
    private Long a;
    @kfz(a = "iat")
    private Long b;
    @kfz(a = "iss")
    private String c;
    @kfz(a = "aud")
    private Object d;
    @kfz(a = "sub")
    private String e;

    public /* synthetic */ GenericJson clone() {
        return a();
    }

    public /* synthetic */ GenericData m9clone() {
        return a();
    }

    public /* synthetic */ Object m10clone() {
        return a();
    }

    public /* synthetic */ GenericJson set(String str, Object obj) {
        return a(str, obj);
    }

    public /* synthetic */ GenericData m11set(String str, Object obj) {
        return a(str, obj);
    }

    public kes a(Long l) {
        this.a = l;
        return this;
    }

    public kes b(Long l) {
        this.b = l;
        return this;
    }

    public kes a(String str) {
        this.c = str;
        return this;
    }

    public kes a(Object obj) {
        this.d = obj;
        return this;
    }

    public kes b(String str) {
        this.e = str;
        return this;
    }

    private kes a(String str, Object obj) {
        return (kes) super.set(str, obj);
    }

    private kes a() {
        return (kes) super.clone();
    }
}
