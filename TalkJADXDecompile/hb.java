import android.app.Notification;

final class hb implements hf {
    final String a;
    final int b;
    final String c;
    final Notification d;

    public hb(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public void a(fd fdVar) {
        fdVar.a(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
        stringBuilder.append("packageName:").append(this.a);
        stringBuilder.append(", id:").append(this.b);
        stringBuilder.append(", tag:").append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
