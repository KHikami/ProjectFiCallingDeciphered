package p000;

import android.net.Uri;
import java.security.MessageDigest;

final class iib implements anv {
    private final atu f17717b;
    private String f17718c;

    iib(atu atu) {
        this.f17717b = atu;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f17717b);
        String valueOf2 = String.valueOf(m21851a());
        return new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("FifeUrlKey{glideUrl=").append(valueOf).append(", key='").append(valueOf2).append("'}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iib)) {
            return false;
        }
        return m21851a().equals(((iib) obj).m21851a());
    }

    public int hashCode() {
        return m21851a().hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(m21851a().getBytes(a));
    }

    private synchronized String m21851a() {
        if (this.f17718c == null) {
            this.f17718c = Uri.parse(this.f17717b.m4021d()).getPath();
        }
        return this.f17718c;
    }
}
