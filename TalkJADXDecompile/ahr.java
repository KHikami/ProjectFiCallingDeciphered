import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class ahr {
    private InputStream a;
    private byte[] b;
    private boolean c;
    private int d;
    private int e;

    public ahr(InputStream inputStream, int i, boolean z) {
        this.d = 0;
        this.e = 0;
        this.a = inputStream;
        this.b = new byte[e(16)];
        this.c = false;
    }

    public byte a(int i) {
        bc.a("get");
        if (b(i)) {
            int i2 = i - this.d;
            bc.c();
            return this.b[i2];
        }
        bc.c();
        throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", new Object[]{Integer.valueOf(i)}));
    }

    public boolean b(int i) {
        bc.a("has");
        if (i < this.d) {
            bc.c();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.d)}));
        }
        int i2 = i - this.d;
        if (i2 >= this.e || i2 >= this.b.length) {
            bc.c();
            return d(i);
        }
        bc.c();
        return true;
    }

    public void c(int i) {
        bc.a("advance to");
        int i2 = i - this.d;
        if (i2 <= 0) {
            bc.c();
            return;
        }
        int i3;
        if (i2 < this.e) {
            if (i2 >= this.b.length) {
                throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.b.length)}));
            }
            for (i3 = 0; i3 + i2 < this.e; i3++) {
                this.b[i3] = this.b[i3 + i2];
            }
            this.d = i;
            this.e -= i2;
        } else if (this.a != null) {
            i3 = i2 - this.e;
            int i4 = 0;
            while (i3 > 0) {
                try {
                    long skip = this.a.skip((long) i3);
                    if (skip <= 0) {
                        i4++;
                    } else {
                        i3 = (int) (((long) i3) - skip);
                    }
                    if (i4 >= 5) {
                        i4 = i3;
                        i3 = 1;
                        break;
                    }
                } catch (IOException e) {
                    i4 = i3;
                    i3 = 1;
                }
            }
            i4 = i3;
            i3 = 0;
            if (i3 != 0) {
                this.a = null;
            }
            this.d = i - i4;
            this.e = 0;
        } else {
            this.d = i;
            this.e = 0;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            String.format("advanceTo %d buffer: %s", new Object[]{Integer.valueOf(i2), this});
        }
        bc.c();
    }

    private boolean d(int i) {
        bc.a("fill");
        if (i < this.d) {
            bc.c();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.d)}));
        }
        int i2 = i - this.d;
        if (this.a == null) {
            bc.c();
            return false;
        }
        int i3 = i2 + 1;
        if (i3 > this.b.length) {
            if (this.c) {
                c(i);
                i2 = i - this.d;
            } else {
                String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", new Object[]{Integer.valueOf(this.b.length), Integer.valueOf(e(i3))});
                this.b = Arrays.copyOf(this.b, i3);
            }
        }
        try {
            i3 = this.a.read(this.b, this.e, this.b.length - this.e);
        } catch (IOException e) {
            i3 = -1;
        }
        if (i3 != -1) {
            this.e = i3 + this.e;
        } else {
            this.a = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            String.format("fill %d      buffer: %s", new Object[]{Integer.valueOf(i2), this});
        }
        bc.c();
        if (i2 < this.e) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("+%d+%d [%d]", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.b.length), Integer.valueOf(this.e)});
    }

    private static int e(int i) {
        int i2 = i - 1;
        i2 |= i2 >> 1;
        i2 |= i2 >> 2;
        i2 |= i2 >> 4;
        i2 |= i2 >> 8;
        return (i2 | (i2 >> 16)) + 1;
    }
}
