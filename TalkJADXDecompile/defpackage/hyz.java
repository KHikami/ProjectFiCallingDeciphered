package defpackage;

/* renamed from: hyz */
public final class hyz implements hxx {
    private final String a;
    private final String b;

    public hyz(hxx hxx) {
        this.a = hxx.a();
        this.b = hxx.b();
    }

    private hxx c() {
        return this;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean e() {
        return true;
    }

    public /* synthetic */ Object f() {
        return c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetEntity[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(",");
            stringBuilder.append(this.a);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
