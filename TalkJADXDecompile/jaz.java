import java.util.regex.Pattern;

public final class jaz {
    private jba<String, Pattern> a;

    public jaz(int i) {
        this.a = new jba(i);
    }

    public Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.a(str);
        if (pattern != null) {
            return pattern;
        }
        pattern = Pattern.compile(str);
        this.a.a(str, pattern);
        return pattern;
    }
}
