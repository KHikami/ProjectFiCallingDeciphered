import java.util.Arrays;

public abstract class btr {
    public static final btr a;
    private static btr b;

    static {
        a = b((CharSequence) "\t\n\u000b\f\r \u0085\u1680\u2028\u2029\u205f\u3000\u00a0\u180e\u202f").a(a('\u2000', '\u200a'));
        b((CharSequence) "\t\n\u000b\f\r \u0085\u1680\u2028\u2029\u205f\u3000").a(a('\u2000', '\u2006')).a(a('\u2008', '\u200a'));
        a('\u0000', '\u007f');
        btr a = a('0', '9');
        btr btr = a;
        for (char c : "\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".toCharArray()) {
            btr = btr.a(a(c, (char) (c + 9)));
        }
        a('\t', '\r').a(a('\u001c', ' ')).a(b('\u1680')).a(b('\u180e')).a(a('\u2000', '\u2006')).a(a('\u2008', '\u200b')).a(a('\u2028', '\u2029')).a(b('\u205f')).a(b('\u3000'));
        bts bts = new bts();
        bty bty = new bty();
        btz btz = new btz();
        bua bua = new bua();
        bub bub = new bub();
        a('\u0000', '\u001f').a(a('\u007f', '\u009f'));
        a('\u0000', ' ').a(a('\u007f', '\u00a0')).a(b('\u00ad')).a(a('\u0600', '\u0603')).a(b((CharSequence) "\u06dd\u070f\u1680\u17b4\u17b5\u180e")).a(a('\u2000', '\u200f')).a(a('\u2028', '\u202f')).a(a('\u205f', '\u2064')).a(a('\u206a', '\u206f')).a(b('\u3000')).a(a('\ud800', '\uf8ff')).a(b((CharSequence) "\ufeff\ufff9\ufffa\ufffb"));
        a('\u0000', '\u04f9').a(b('\u05be')).a(a('\u05d0', '\u05ea')).a(b('\u05f3')).a(b('\u05f4')).a(a('\u0600', '\u06ff')).a(a('\u0750', '\u077f')).a(a('\u0e00', '\u0e7f')).a(a('\u1e00', '\u20af')).a(a('\u2100', '\u213a')).a(a('\ufb50', '\ufdff')).a(a('\ufe70', '\ufeff')).a(a('\uff61', '\uffdc'));
        buc buc = new buc();
        b = new btt();
    }

    private static btr a(char c, char c2) {
        buf.b(c2 >= c);
        return new btx(c, c2);
    }

    private static btr b(char c) {
        return new btu(c);
    }

    private static btr b(CharSequence charSequence) {
        switch (charSequence.length()) {
            case rl.c /*0*/:
                return b;
            case rq.b /*1*/:
                return b(charSequence.charAt(0));
            case rq.c /*2*/:
                return new btv(charSequence.charAt(0), charSequence.charAt(1));
            default:
                char[] toCharArray = charSequence.toString().toCharArray();
                Arrays.sort(toCharArray);
                return new btw(toCharArray);
        }
    }

    public btr a(btr btr) {
        return new bud(Arrays.asList(new btr[]{this, (btr) buf.A((Object) btr)}));
    }

    public abstract boolean a(char c);

    public boolean a(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!a(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
