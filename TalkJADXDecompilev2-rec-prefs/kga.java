package p000;

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kga extends ByteArrayOutputStream {
    private int f21634a;
    private final int f21635b;
    private boolean f21636c;
    private final Level f21637d;
    private final Logger f21638e;

    public kga(Logger logger, Level level, int i) {
        this.f21638e = (Logger) bc.m4799a((Object) logger);
        this.f21637d = (Level) bc.m4799a((Object) level);
        bc.m4814a(i >= 0);
        this.f21635b = i;
    }

    public synchronized void write(int i) {
        bc.m4814a(!this.f21636c);
        this.f21634a++;
        if (this.count < this.f21635b) {
            super.write(i);
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        bc.m4814a(!this.f21636c);
        this.f21634a += i2;
        if (this.count < this.f21635b) {
            int i3 = this.count + i2;
            if (i3 > this.f21635b) {
                i2 += this.f21635b - i3;
            }
            super.write(bArr, i, i2);
        }
    }

    public synchronized void close() {
        if (!this.f21636c) {
            if (this.f21634a != 0) {
                StringBuilder stringBuilder = new StringBuilder("Total: ");
                kga.m25766a(stringBuilder, this.f21634a);
                if (this.count != 0 && this.count < this.f21634a) {
                    stringBuilder.append(" (logging first ");
                    kga.m25766a(stringBuilder, this.count);
                    stringBuilder.append(")");
                }
                this.f21638e.config(stringBuilder.toString());
                if (this.count != 0) {
                    this.f21638e.log(this.f21637d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.f21636c = true;
        }
    }

    private static void m25766a(StringBuilder stringBuilder, int i) {
        if (i == 1) {
            stringBuilder.append("1 byte");
        } else {
            stringBuilder.append(NumberFormat.getInstance().format((long) i)).append(" bytes");
        }
    }
}
