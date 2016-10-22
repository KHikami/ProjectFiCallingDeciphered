/* compiled from: PG */
public final class abc {
    public static abc a;
    public static abc b;
    public static abc c;
    public static abc d;
    public String e;
    public String f;
    public int g;
    public float h;
    public float i;
    public boolean j;

    static {
        a = new abc();
        b = new abc(null, null, 2, false);
        c = new abc(null, null, true);
        d = new abc(null, null, 2, true);
    }

    public abc() {
        this.g = 1;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = false;
    }

    public abc(String str, String str2, boolean z) {
        this(str, str2, 1, 1.0f, 0.0f, z);
    }

    public abc(String str, String str2, int i, boolean z) {
        this(str, str2, i, 1.0f, 0.0f, z);
    }

    public abc(String str, String str2, int i, float f, float f2, boolean z) {
        this.g = 1;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = false;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = f;
        this.i = f2;
        this.j = z;
    }
}
