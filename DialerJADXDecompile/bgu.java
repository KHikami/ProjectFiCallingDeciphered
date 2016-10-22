import java.io.BufferedReader;
import java.io.Reader;

/* compiled from: PG */
public final class bgu extends BufferedReader {
    private long a;
    private boolean b;
    private String c;

    public bgu(Reader reader) {
        super(reader);
    }

    public final String readLine() {
        if (this.b) {
            String str = this.c;
            this.c = null;
            this.b = false;
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        str = super.readLine();
        this.a = (System.currentTimeMillis() - currentTimeMillis) + this.a;
        return str;
    }

    public final String a() {
        if (!this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            String readLine = super.readLine();
            this.a = (System.currentTimeMillis() - currentTimeMillis) + this.a;
            this.c = readLine;
            this.b = true;
        }
        return this.c;
    }
}
