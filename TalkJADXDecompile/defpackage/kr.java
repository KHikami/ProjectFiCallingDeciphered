package defpackage;

/* renamed from: kr */
final class kr implements ks {
    public static final kr a;

    public int a(CharSequence charSequence, int i, int i2) {
        int i3 = i + i2;
        int i4 = 2;
        while (i < i3 && i4 == 2) {
            i4 = kp.b(Character.getDirectionality(charSequence.charAt(i)));
            i++;
        }
        return i4;
    }

    private kr() {
    }

    static {
        a = new kr();
    }
}
