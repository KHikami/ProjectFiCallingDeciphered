package p000;

final class kq implements ks {
    public static final kq f22722a = new kq(true);
    public static final kq f22723b = new kq(false);
    private final boolean f22724c;

    public int mo3678a(CharSequence charSequence, int i, int i2) {
        int i3 = i + i2;
        int i4 = 0;
        while (i < i3) {
            switch (kp.m26866a(Character.getDirectionality(charSequence.charAt(i)))) {
                case 0:
                    if (!this.f22724c) {
                        i4 = 1;
                        break;
                    }
                    return 0;
                case 1:
                    if (this.f22724c) {
                        i4 = 1;
                        break;
                    }
                    return 1;
                default:
                    break;
            }
            i++;
        }
        if (i4 == 0) {
            return 2;
        }
        if (this.f22724c) {
            return 1;
        }
        return 0;
    }

    private kq(boolean z) {
        this.f22724c = z;
    }
}
