package p000;

final class gx implements hf {
    final String f16317a;
    final int f16318b;
    final String f16319c;
    final boolean f16320d = false;

    public gx(String str, int i, String str2) {
        this.f16317a = str;
        this.f16318b = i;
        this.f16319c = str2;
    }

    public void mo2363a(fd fdVar) {
        if (this.f16320d) {
            fdVar.mo1986a(this.f16317a);
        } else {
            fdVar.mo1987a(this.f16317a, this.f16318b, this.f16319c);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CancelTask[");
        stringBuilder.append("packageName:").append(this.f16317a);
        stringBuilder.append(", id:").append(this.f16318b);
        stringBuilder.append(", tag:").append(this.f16319c);
        stringBuilder.append(", all:").append(this.f16320d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
