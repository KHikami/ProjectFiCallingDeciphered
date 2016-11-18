package p000;

import android.app.Notification;

final class hb implements hf {
    final String f16491a;
    final int f16492b;
    final String f16493c;
    final Notification f16494d;

    public hb(String str, int i, String str2, Notification notification) {
        this.f16491a = str;
        this.f16492b = i;
        this.f16493c = str2;
        this.f16494d = notification;
    }

    public void mo2363a(fd fdVar) {
        fdVar.mo1988a(this.f16491a, this.f16492b, this.f16493c, this.f16494d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
        stringBuilder.append("packageName:").append(this.f16491a);
        stringBuilder.append(", id:").append(this.f16492b);
        stringBuilder.append(", tag:").append(this.f16493c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
