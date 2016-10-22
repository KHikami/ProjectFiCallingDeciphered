package defpackage;

/* renamed from: iic */
public final class iic {
    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private int f;

    public iic() {
        this.d = -1;
        this.e = -1;
        this.f = -1;
    }

    public iic(iic iic) {
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.a = iic.a;
        this.b = iic.b;
        this.c = iic.c;
    }

    public iic a() {
        a(16);
        return this;
    }

    public iic b() {
        a(4);
        return this;
    }

    public iic c() {
        a(1);
        return this;
    }

    public iic d() {
        this.c = true;
        return this;
    }

    public boolean e() {
        return this.c;
    }

    public String a(String str, int i, int i2) {
        return jpo.a(str, this.a, i, i2, this.d, this.e, this.f);
    }

    private void a(int i) {
        this.a |= i;
        this.b |= i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iic)) {
            return false;
        }
        iic iic = (iic) obj;
        if (this.b == iic.b && this.c == iic.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.c ? 17 : 31) * 31) + this.b;
    }

    public String toString() {
        String str = (this.a & 16) != 0 ? "kill_animation " : "";
        String str2 = (this.a & 4) != 0 ? "no_overlay " : "";
        String str3 = (this.a & 8192) != 0 ? "app_domain " : "";
        String str4 = (this.a & 1) != 0 ? "crop " : "";
        String str5 = (this.a & 8) != 0 ? "smartcrop " : "";
        String str6 = (this.a & 4096) != 0 ? "loose_face_crop " : "";
        String str7 = (this.a & 512) != 0 ? "exif " : "";
        String str8 = (this.a & 2048) != 0 ? "jpeg " : "";
        String str9 = (this.a & 32) != 0 ? "webp " : "";
        String str10 = (this.a & 16384) != 0 ? "webp_animation " : "";
        String str11 = (this.a & 32768) != 0 ? "blur " : "";
        String str12 = (this.a & 131072) != 0 ? "mp4 " : "";
        String str13 = (this.a & 65536) != 0 ? "loop " : "";
        String str14 = (this.a & 262144) != 0 ? "no_silhouette " : "";
        String str15 = (this.a & 524288) != 0 ? "monogram " : "";
        String str16 = (this.a & 64) != 0 ? "no_upscale " : "";
        String str17 = this.c ? "custom_size" : "";
        return new StringBuilder(((((((((((((((((String.valueOf(str).length() + 18) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()) + String.valueOf(str8).length()) + String.valueOf(str9).length()) + String.valueOf(str10).length()) + String.valueOf(str11).length()) + String.valueOf(str12).length()) + String.valueOf(str13).length()) + String.valueOf(str14).length()) + String.valueOf(str15).length()) + String.valueOf(str16).length()) + String.valueOf(str17).length()).append("FifeUrlOptions{ ").append(str).append(str2).append(str3).append(str4).append(str5).append(str6).append(str7).append(str8).append(str9).append(str10).append(str11).append(str12).append(str13).append(str14).append(str15).append(str16).append(str17).append(" }").toString();
    }
}
