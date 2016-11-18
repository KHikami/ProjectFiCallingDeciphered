package defpackage;

enum mok extends moh {
    mok(String str, int i, boolean z, boolean z2) {
        super(str, 2, false, false);
    }

    public boolean a(Object obj) {
        if (obj instanceof Character) {
            return true;
        }
        if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Character.isValidCodePoint(((Number) obj).intValue());
        }
        return false;
    }
}
