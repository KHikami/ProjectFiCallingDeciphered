import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.TreeSet;

/* compiled from: PG */
abstract class dec {
    public int a;
    public final TreeSet b;

    public abstract int a(int i);

    public abstract void a(ObjectInput objectInput);

    public abstract void a(ObjectOutput objectOutput);

    public abstract String b(int i);

    dec() {
        this.a = 0;
        this.b = new TreeSet();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(a(i2)).append("|").append(b(i2)).append("\n");
        }
        return stringBuilder.toString();
    }
}
