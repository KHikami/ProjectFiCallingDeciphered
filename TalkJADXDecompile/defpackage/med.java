package defpackage;

/* renamed from: med */
final class med extends mep {
    static final med o;

    private static char[] c() {
        char[] cArr = new char[31];
        for (int i = 0; i < 31; i++) {
            cArr[i] = (char) ("0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".charAt(i) + 9);
        }
        return cArr;
    }

    static {
        o = new med();
    }

    private med() {
        super("CharMatcher.digit()", "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".toCharArray(), med.c());
    }
}
