package defpackage;

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kga extends ByteArrayOutputStream {
    private int a;
    private final int b;
    private boolean c;
    private final Level d;
    private final Logger e;

    public kga(Logger logger, Level level, int i) {
        this.e = (Logger) bc.a((Object) logger);
        this.d = (Level) bc.a((Object) level);
        bc.a(i >= 0);
        this.b = i;
    }

    public synchronized void write(int i) {
        bc.a(!this.c);
        this.a++;
        if (this.count < this.b) {
            super.write(i);
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        bc.a(!this.c);
        this.a += i2;
        if (this.count < this.b) {
            int i3 = this.count + i2;
            if (i3 > this.b) {
                i2 += this.b - i3;
            }
            super.write(bArr, i, i2);
        }
    }

    public synchronized void close() {
        if (!this.c) {
            if (this.a != 0) {
                StringBuilder stringBuilder = new StringBuilder("Total: ");
                kga.a(stringBuilder, this.a);
                if (this.count != 0 && this.count < this.a) {
                    stringBuilder.append(" (logging first ");
                    kga.a(stringBuilder, this.count);
                    stringBuilder.append(")");
                }
                this.e.config(stringBuilder.toString());
                if (this.count != 0) {
                    this.e.log(this.d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.c = true;
        }
    }

    private static void a(StringBuilder stringBuilder, int i) {
        if (i == 1) {
            stringBuilder.append("1 byte");
        } else {
            stringBuilder.append(NumberFormat.getInstance().format((long) i)).append(" bytes");
        }
    }
}
