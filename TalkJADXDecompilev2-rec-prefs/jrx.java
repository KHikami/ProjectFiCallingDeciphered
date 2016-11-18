package p000;

import org.chromium.net.CronetEngine.Builder.LibraryLoader;

final class jrx extends jsd {
    private final String f20963a;
    private final boolean f20964b;
    private final boolean f20965c;
    private final LibraryLoader f20966d;

    jrx(String str, boolean z, boolean z2, LibraryLoader libraryLoader) {
        this.f20963a = str;
        this.f20964b = z;
        this.f20965c = z2;
        this.f20966d = libraryLoader;
    }

    String mo3596a() {
        return this.f20963a;
    }

    boolean mo3597b() {
        return this.f20964b;
    }

    boolean mo3598c() {
        return this.f20965c;
    }

    LibraryLoader mo3599d() {
        return this.f20966d;
    }

    public String toString() {
        String str = this.f20963a;
        boolean z = this.f20964b;
        boolean z2 = this.f20965c;
        String valueOf = String.valueOf(this.f20966d);
        return new StringBuilder((String.valueOf(str).length() + 90) + String.valueOf(valueOf).length()).append("CronetConfig{storagePath=").append(str).append(", enableQuic=").append(z).append(", enableCertificateCache=").append(z2).append(", libraryLoader=").append(valueOf).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jsd)) {
            return false;
        }
        jsd jsd = (jsd) obj;
        if (this.f20963a.equals(jsd.mo3596a()) && this.f20964b == jsd.mo3597b() && this.f20965c == jsd.mo3598c()) {
            if (this.f20966d == null) {
                if (jsd.mo3599d() == null) {
                    return true;
                }
            } else if (this.f20966d.equals(jsd.mo3599d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((this.f20964b ? 1231 : 1237) ^ ((this.f20963a.hashCode() ^ 1000003) * 1000003)) * 1000003;
        if (!this.f20965c) {
            i = 1237;
        }
        return (this.f20966d == null ? 0 : this.f20966d.hashCode()) ^ ((hashCode ^ i) * 1000003);
    }
}
