package p000;

public final class hyz implements hxx {
    private final String f17485a;
    private final String f17486b;

    public hyz(hxx hxx) {
        this.f17485a = hxx.mo1289a();
        this.f17486b = hxx.mo1290b();
    }

    private hxx m21326c() {
        return this;
    }

    public String mo1289a() {
        return this.f17485a;
    }

    public String mo1290b() {
        return this.f17486b;
    }

    public boolean mo1287e() {
        return true;
    }

    public /* synthetic */ Object mo1288f() {
        return m21326c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetEntity[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f17485a == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(",");
            stringBuilder.append(this.f17485a);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.f17486b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
