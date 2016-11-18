package p000;

import java.io.BufferedReader;
import java.io.Reader;

public final class akq extends BufferedReader {
    private long f1143a;
    private boolean f1144b;
    private String f1145c;

    public akq(Reader reader) {
        super(reader);
    }

    public String readLine() {
        if (this.f1144b) {
            String str = this.f1145c;
            this.f1145c = null;
            this.f1144b = false;
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        str = super.readLine();
        this.f1143a = (System.currentTimeMillis() - currentTimeMillis) + this.f1143a;
        return str;
    }

    public String m2775a() {
        if (!this.f1144b) {
            long currentTimeMillis = System.currentTimeMillis();
            String readLine = super.readLine();
            this.f1143a = (System.currentTimeMillis() - currentTimeMillis) + this.f1143a;
            this.f1145c = readLine;
            this.f1144b = true;
        }
        return this.f1145c;
    }
}
