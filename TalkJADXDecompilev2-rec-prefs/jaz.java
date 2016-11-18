package p000;

import java.util.regex.Pattern;

public final class jaz {
    private jba<String, Pattern> f19666a;

    public jaz(int i) {
        this.f19666a = new jba(i);
    }

    public Pattern m23741a(String str) {
        Pattern pattern = (Pattern) this.f19666a.m23758a(str);
        if (pattern != null) {
            return pattern;
        }
        pattern = Pattern.compile(str);
        this.f19666a.m23759a(str, pattern);
        return pattern;
    }
}
