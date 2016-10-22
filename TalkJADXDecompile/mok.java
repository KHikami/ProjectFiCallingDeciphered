enum mok extends moh {
    mok(String str, int i, boolean z, boolean z2) {
        super(2, false, false, (byte) 0);
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
