package defpackage;

final class med extends mep {
    static final med o = new med();

    private static char[] c() {
        char[] cArr = new char[31];
        for (int i = 0; i < 31; i++) {
            cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9);
        }
        return cArr;
    }

    private med() {
        super("CharMatcher.digit()", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), med.c());
    }
}
