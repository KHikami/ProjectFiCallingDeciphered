package p000;

public final class iic {
    private int f17719a;
    private int f17720b;
    private boolean f17721c;
    private int f17722d = -1;
    private int f17723e = -1;
    private int f17724f = -1;

    public iic(iic iic) {
        this.f17719a = iic.f17719a;
        this.f17720b = iic.f17720b;
        this.f17721c = iic.f17721c;
    }

    public iic m21854a() {
        m21853a(16);
        return this;
    }

    public iic m21856b() {
        m21853a(4);
        return this;
    }

    public iic m21857c() {
        m21853a(1);
        return this;
    }

    public iic m21858d() {
        this.f17721c = true;
        return this;
    }

    public boolean m21859e() {
        return this.f17721c;
    }

    public String m21855a(String str, int i, int i2) {
        return jpo.m24936a(str, this.f17719a, i, i2, this.f17722d, this.f17723e, this.f17724f);
    }

    private void m21853a(int i) {
        this.f17719a |= i;
        this.f17720b |= i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iic)) {
            return false;
        }
        iic iic = (iic) obj;
        if (this.f17720b == iic.f17720b && this.f17721c == iic.f17721c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f17721c ? 17 : 31) * 31) + this.f17720b;
    }

    public String toString() {
        String str = (this.f17719a & 16) != 0 ? "kill_animation " : "";
        String str2 = (this.f17719a & 4) != 0 ? "no_overlay " : "";
        String str3 = (this.f17719a & 8192) != 0 ? "app_domain " : "";
        String str4 = (this.f17719a & 1) != 0 ? "crop " : "";
        String str5 = (this.f17719a & 8) != 0 ? "smartcrop " : "";
        String str6 = (this.f17719a & 4096) != 0 ? "loose_face_crop " : "";
        String str7 = (this.f17719a & 512) != 0 ? "exif " : "";
        String str8 = (this.f17719a & 2048) != 0 ? "jpeg " : "";
        String str9 = (this.f17719a & 32) != 0 ? "webp " : "";
        String str10 = (this.f17719a & 16384) != 0 ? "webp_animation " : "";
        String str11 = (this.f17719a & 32768) != 0 ? "blur " : "";
        String str12 = (this.f17719a & 131072) != 0 ? "mp4 " : "";
        String str13 = (this.f17719a & 65536) != 0 ? "loop " : "";
        String str14 = (this.f17719a & 262144) != 0 ? "no_silhouette " : "";
        String str15 = (this.f17719a & 524288) != 0 ? "monogram " : "";
        String str16 = (this.f17719a & 64) != 0 ? "no_upscale " : "";
        String str17 = this.f17721c ? "custom_size" : "";
        return new StringBuilder(((((((((((((((((String.valueOf(str).length() + 18) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()) + String.valueOf(str8).length()) + String.valueOf(str9).length()) + String.valueOf(str10).length()) + String.valueOf(str11).length()) + String.valueOf(str12).length()) + String.valueOf(str13).length()) + String.valueOf(str14).length()) + String.valueOf(str15).length()) + String.valueOf(str16).length()) + String.valueOf(str17).length()).append("FifeUrlOptions{ ").append(str).append(str2).append(str3).append(str4).append(str5).append(str6).append(str7).append(str8).append(str9).append(str10).append(str11).append(str12).append(str13).append(str14).append(str15).append(str16).append(str17).append(" }").toString();
    }
}
