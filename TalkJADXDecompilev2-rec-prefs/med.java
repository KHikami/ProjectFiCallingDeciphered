package p000;

final class med extends mep {
    static final med f27573o = new med();

    private static char[] m31941c() {
        char[] cArr = new char[31];
        for (int i = 0; i < 31; i++) {
            cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9);
        }
        return cArr;
    }

    private med() {
        super("CharMatcher.digit()", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), med.m31941c());
    }
}
