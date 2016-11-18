package defpackage;

final class kq implements ks {
    public static final kq a = new kq(true);
    public static final kq b = new kq(false);
    private final boolean c;

    public int a(CharSequence charSequence, int i, int i2) {
        int i3 = i + i2;
        int i4 = 0;
        while (i < i3) {
            switch (kp.a(Character.getDirectionality(charSequence.charAt(i)))) {
                case 0:
                    if (!this.c) {
                        i4 = 1;
                        break;
                    }
                    return 0;
                case 1:
                    if (this.c) {
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
        if (this.c) {
            return 1;
        }
        return 0;
    }

    private kq(boolean z) {
        this.c = z;
    }
}
