import org.chromium.net.CronetEngine.Builder.LibraryLoader;

final class jrx extends jsd {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final LibraryLoader d;

    jrx(String str, boolean z, boolean z2, LibraryLoader libraryLoader) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = libraryLoader;
    }

    String a() {
        return this.a;
    }

    boolean b() {
        return this.b;
    }

    boolean c() {
        return this.c;
    }

    LibraryLoader d() {
        return this.d;
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        String valueOf = String.valueOf(this.d);
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
        if (this.a.equals(jsd.a()) && this.b == jsd.b() && this.c == jsd.c()) {
            if (this.d == null) {
                if (jsd.d() == null) {
                    return true;
                }
            } else if (this.d.equals(jsd.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((this.b ? 1231 : 1237) ^ ((this.a.hashCode() ^ 1000003) * 1000003)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return (this.d == null ? 0 : this.d.hashCode()) ^ ((hashCode ^ i) * 1000003);
    }
}
