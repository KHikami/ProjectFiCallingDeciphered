package p000;

import org.chromium.net.CronetEngine.Builder.LibraryLoader;

public class jse {
    String f20975a;
    Boolean f20976b;
    Boolean f20977c;
    LibraryLoader f20978d;

    jse() {
    }

    public jse m25158a(String str) {
        this.f20975a = str;
        return this;
    }

    public jse m25159a(boolean z) {
        this.f20976b = Boolean.valueOf(z);
        return this;
    }

    public jse m25160b(boolean z) {
        this.f20977c = Boolean.valueOf(z);
        return this;
    }

    public jsd m25157a() {
        String str = "";
        if (this.f20975a == null) {
            str = String.valueOf(str).concat(" storagePath");
        }
        if (this.f20976b == null) {
            str = String.valueOf(str).concat(" enableQuic");
        }
        if (this.f20977c == null) {
            str = String.valueOf(str).concat(" enableCertificateCache");
        }
        if (str.isEmpty()) {
            return new jrx(this.f20975a, this.f20976b.booleanValue(), this.f20977c.booleanValue(), this.f20978d);
        }
        String str2 = "Missing required properties:";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public jse(byte b) {
        this();
    }
}
