package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class aww extends FilterInputStream {
    private volatile byte[] f2452a;
    private int f2453b;
    private int f2454c;
    private int f2455d;
    private int f2456e;
    private final aqy f2457f;

    public aww(InputStream inputStream, aqy aqy) {
        this(inputStream, aqy, 65536);
    }

    private aww(InputStream inputStream, aqy aqy, int i) {
        super(inputStream);
        this.f2455d = -1;
        this.f2457f = aqy;
        this.f2452a = (byte[]) aqy.m3780a(65536, byte[].class);
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f2452a == null || inputStream == null) {
            throw aww.m4231c();
        }
        return inputStream.available() + (this.f2453b - this.f2456e);
    }

    private static IOException m4231c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void m4232a() {
        this.f2454c = this.f2452a.length;
    }

    public synchronized void m4233b() {
        if (this.f2452a != null) {
            this.f2457f.m3785a(this.f2452a, byte[].class);
            this.f2452a = null;
        }
    }

    public void close() {
        if (this.f2452a != null) {
            this.f2457f.m3785a(this.f2452a, byte[].class);
            this.f2452a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int m4230a(InputStream inputStream, byte[] bArr) {
        int read;
        if (this.f2455d == -1 || this.f2456e - this.f2455d >= this.f2454c) {
            read = inputStream.read(bArr);
            if (read <= 0) {
                return read;
            }
            this.f2455d = -1;
            this.f2456e = 0;
            this.f2453b = read;
            return read;
        }
        if (this.f2455d == 0 && this.f2454c > bArr.length && this.f2453b == bArr.length) {
            read = bArr.length << 1;
            if (read > this.f2454c) {
                read = this.f2454c;
            }
            byte[] bArr2 = (byte[]) this.f2457f.m3780a(read, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f2452a = bArr2;
            this.f2457f.m3785a((Object) bArr, byte[].class);
            bArr = bArr2;
        } else if (this.f2455d > 0) {
            System.arraycopy(bArr, this.f2455d, bArr, 0, bArr.length - this.f2455d);
        }
        this.f2456e -= this.f2455d;
        this.f2455d = 0;
        this.f2453b = 0;
        int read2 = inputStream.read(bArr, this.f2456e, bArr.length - this.f2456e);
        this.f2453b = read2 <= 0 ? this.f2456e : this.f2456e + read2;
        return read2;
    }

    public synchronized void mark(int i) {
        this.f2454c = Math.max(this.f2454c, i);
        this.f2455d = this.f2456e;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized int read() {
        int i = -1;
        synchronized (this) {
            byte[] bArr = this.f2452a;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw aww.m4231c();
            }
            if (this.f2456e < this.f2453b || m4230a(inputStream, bArr) != -1) {
                if (bArr != this.f2452a) {
                    bArr = this.f2452a;
                    if (bArr == null) {
                        throw aww.m4231c();
                    }
                }
                if (this.f2453b - this.f2456e > 0) {
                    i = this.f2456e;
                    this.f2456e = i + 1;
                    i = bArr[i] & 255;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f2452a;
        if (bArr2 == null) {
            throw aww.m4231c();
        } else if (i2 == 0) {
            i2 = 0;
        } else {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw aww.m4231c();
            }
            int i3;
            int i4;
            if (this.f2456e < this.f2453b) {
                i3 = this.f2453b - this.f2456e >= i2 ? i2 : this.f2453b - this.f2456e;
                System.arraycopy(bArr2, this.f2456e, bArr, i, i3);
                this.f2456e += i3;
                if (i3 == i2 || inputStream.available() == 0) {
                    i2 = i3;
                } else {
                    i += i3;
                    i4 = i2 - i3;
                }
            } else {
                i4 = i2;
            }
            while (true) {
                if (this.f2455d == -1 && i4 >= bArr2.length) {
                    i3 = inputStream.read(bArr, i, i4);
                    if (i3 == -1) {
                        break;
                    }
                } else if (m4230a(inputStream, bArr2) == -1) {
                    break;
                } else {
                    if (bArr2 != this.f2452a) {
                        bArr2 = this.f2452a;
                        if (bArr2 == null) {
                            throw aww.m4231c();
                        }
                    }
                    if (this.f2453b - this.f2456e >= i4) {
                        i3 = i4;
                    } else {
                        i3 = this.f2453b - this.f2456e;
                    }
                    System.arraycopy(bArr2, this.f2456e, bArr, i, i3);
                    this.f2456e += i3;
                }
                i4 -= i3;
                if (i4 == 0) {
                    break;
                } else if (inputStream.available() == 0) {
                    break;
                } else {
                    i += i3;
                }
            }
            i2 = i4 == i2 ? -1 : i2 - i4;
        }
        return i2;
    }

    public synchronized void reset() {
        if (this.f2452a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 == this.f2455d) {
            int i = this.f2456e;
            throw new awx("Mark has been invalidated, pos: " + i + " markLimit: " + this.f2454c);
        } else {
            this.f2456e = this.f2455d;
        }
    }

    public synchronized long skip(long j) {
        byte[] bArr = this.f2452a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw aww.m4231c();
        } else if (j < 1) {
            j = 0;
        } else if (inputStream == null) {
            throw aww.m4231c();
        } else if (((long) (this.f2453b - this.f2456e)) >= j) {
            this.f2456e = (int) (((long) this.f2456e) + j);
        } else {
            long j2 = (long) (this.f2453b - this.f2456e);
            this.f2456e = this.f2453b;
            if (this.f2455d == -1 || j > ((long) this.f2454c)) {
                j = j2 + inputStream.skip(j - j2);
            } else if (m4230a(inputStream, bArr) == -1) {
                j = j2;
            } else if (((long) (this.f2453b - this.f2456e)) >= j - j2) {
                this.f2456e = (int) ((j - j2) + ((long) this.f2456e));
            } else {
                j = (j2 + ((long) this.f2453b)) - ((long) this.f2456e);
                this.f2456e = this.f2453b;
            }
        }
        return j;
    }
}
