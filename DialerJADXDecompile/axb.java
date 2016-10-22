import java.util.ArrayList;

/* compiled from: PG */
public class axb {
    public int a;
    public int b;

    static {
        axb.class.getSimpleName();
    }

    public axb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static void a(ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            axb axb = (axb) arrayList.get(i2);
            axb.a += i;
            axb.b += i;
        }
    }
}
