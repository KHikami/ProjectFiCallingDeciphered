package defpackage;

final class gx implements hf {
    final String a;
    final int b;
    final String c;
    final boolean d = false;

    public gx(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public void a(fd fdVar) {
        if (this.d) {
            fdVar.a(this.a);
        } else {
            fdVar.a(this.a, this.b, this.c);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CancelTask[");
        stringBuilder.append("packageName:").append(this.a);
        stringBuilder.append(", id:").append(this.b);
        stringBuilder.append(", tag:").append(this.c);
        stringBuilder.append(", all:").append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
