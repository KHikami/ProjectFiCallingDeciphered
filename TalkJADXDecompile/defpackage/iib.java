package defpackage;

import android.net.Uri;
import java.security.MessageDigest;

/* renamed from: iib */
final class iib implements anv {
    private final atu b;
    private String c;

    iib(atu atu) {
        this.b = atu;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(a());
        return new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("FifeUrlKey{glideUrl=").append(valueOf).append(", key='").append(valueOf2).append("'}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iib)) {
            return false;
        }
        return a().equals(((iib) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(a().getBytes(a));
    }

    private synchronized String a() {
        if (this.c == null) {
            this.c = Uri.parse(this.b.d()).getPath();
        }
        return this.c;
    }
}
