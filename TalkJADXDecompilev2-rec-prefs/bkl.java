package p000;

public final class bkl extends frj {
    private final bko f3626a;
    private final String f3627b;

    public bkl(String str, bko bko) {
        this.f3626a = bko;
        this.f3627b = str;
    }

    public String m5604a() {
        return this.f3627b;
    }

    public String mo594c() {
        String str = "###";
        String valueOf = String.valueOf(this.f3627b);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
