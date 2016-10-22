package defpackage;

import java.io.BufferedReader;
import java.io.Reader;

/* renamed from: akq */
public final class akq extends BufferedReader {
    private long a;
    private boolean b;
    private String c;

    public akq(Reader reader) {
        super(reader);
    }

    public String readLine() {
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

    public String a() {
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
