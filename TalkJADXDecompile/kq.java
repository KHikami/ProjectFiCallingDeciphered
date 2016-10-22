final class kq implements ks {
    public static final kq a;
    public static final kq b;
    private final boolean c;

    public int a(CharSequence charSequence, int i, int i2) {
        int i3 = i + i2;
        int i4 = 0;
        while (i < i3) {
            switch (kp.a(Character.getDirectionality(charSequence.charAt(i)))) {
                case wi.w /*0*/:
                    if (!this.c) {
                        i4 = 1;
                        break;
                    }
                    return 0;
                case wi.j /*1*/:
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

    static {
        a = new kq(true);
        b = new kq(false);
    }
}
