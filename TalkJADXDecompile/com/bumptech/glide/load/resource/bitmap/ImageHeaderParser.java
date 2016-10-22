package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import aqy;
import awr;
import aws;
import awt;
import awu;
import gwb;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class ImageHeaderParser {
    private static final byte[] a;
    private static final int[] b;
    private final aqy c;
    private final awt d;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean a;

        private ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }
    }

    static {
        a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    public ImageHeaderParser(InputStream inputStream, aqy aqy) {
        gwb.I((Object) inputStream);
        this.c = (aqy) gwb.I((Object) aqy);
        this.d = new awu(inputStream);
    }

    public ImageHeaderParser(ByteBuffer byteBuffer, aqy aqy) {
        gwb.I((Object) byteBuffer);
        this.c = (aqy) gwb.I((Object) aqy);
        this.d = new awr(byteBuffer);
    }

    public boolean a() {
        return b().hasAlpha();
    }

    public ImageType b() {
        int a = this.d.a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        a = ((a << 16) & -65536) | (this.d.a() & 65535);
        if (a == -1991225785) {
            this.d.a(21);
            return this.d.c() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (a != 1380533830) {
                return ImageType.UNKNOWN;
            }
            this.d.a(4);
            if ((((this.d.a() << 16) & -65536) | (this.d.a() & 65535)) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            a = ((this.d.a() << 16) & -65536) | (this.d.a() & 65535);
            if ((a & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            if ((a & 255) == 88) {
                this.d.a(4);
                return (this.d.c() & 16) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            } else if ((a & 255) != 76) {
                return ImageType.WEBP;
            } else {
                this.d.a(4);
                return (this.d.c() & 8) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            }
        }
    }

    public int c() {
        Object obj;
        int i = -1;
        int a = this.d.a();
        if ((a & 65496) == 65496 || a == 19789 || a == 18761) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            a = d();
            if (a != -1) {
                obj = (byte[]) this.c.a(a, byte[].class);
                try {
                    int a2 = this.d.a(obj, a);
                    if (a2 != a) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            new StringBuilder(81).append("Unable to read exif segment data, length: ").append(a).append(", actually read: ").append(a2);
                        }
                    } else if (a(obj, a)) {
                        i = a(new aws(obj, a));
                    }
                    this.c.a(obj, byte[].class);
                } catch (Throwable th) {
                    this.c.a(obj, byte[].class);
                }
            }
        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
            new StringBuilder(47).append("Parser doesn't handle magic number: ").append(a);
        }
        return i;
    }

    private static boolean a(byte[] bArr, int i) {
        boolean z = bArr != null && i > a.length;
        if (z) {
            for (int i2 = 0; i2 < a.length; i2++) {
                if (bArr[i2] != a[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private int d() {
        long a;
        int a2;
        do {
            short b;
            short b2 = this.d.b();
            if (b2 == (short) 255) {
                b = this.d.b();
                if (b == (short) 218 || b == (short) 217) {
                    return -1;
                }
                a2 = this.d.a() - 2;
                if (b == (short) 225) {
                    return a2;
                }
                a = this.d.a((long) a2);
            } else if (!Log.isLoggable("ImageHeaderParser", 3)) {
                return -1;
            } else {
                new StringBuilder(24).append("Unknown segmentId=").append(b2);
                return -1;
            }
        } while (a == ((long) a2));
        if (!Log.isLoggable("ImageHeaderParser", 3)) {
            return -1;
        }
        new StringBuilder(113).append("Unable to skip enough data, type: ").append(b).append(", wanted to skip: ").append(a2).append(", but actually skipped: ").append(a);
        return -1;
    }

    private static int a(aws aws) {
        ByteOrder byteOrder;
        int a;
        short b;
        int i;
        short b2;
        short b3;
        short b4 = aws.b(6);
        if (b4 != (short) 19789) {
            if (b4 == (short) 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                aws.a(byteOrder);
                a = 6 + aws.a(10);
                b = aws.b(a);
                for (b4 = (short) 0; b4 < b; b4++) {
                    i = (a + 2) + (b4 * 12);
                    b2 = aws.b(i);
                    if (b2 == (short) 274) {
                        b3 = aws.b(i + 2);
                        if (b3 <= (short) 0 && b3 <= (short) 12) {
                            int a2 = aws.a(i + 4);
                            if (a2 >= 0) {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    new StringBuilder(94).append("Got tagIndex=").append(b4).append(" tagType=").append(b2).append(" formatCode=").append(b3).append(" componentCount=").append(a2);
                                }
                                a2 += b[b3];
                                if (a2 <= 4) {
                                    i += 8;
                                    if (i < 0 || i > aws.a()) {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            new StringBuilder(54).append("Illegal tagValueOffset=").append(i).append(" tagType=").append(b2);
                                        }
                                    } else if (a2 >= 0 && i + a2 <= aws.a()) {
                                        return aws.b(i);
                                    } else {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            new StringBuilder(59).append("Illegal number of bytes for TI tag data tagType=").append(b2);
                                        }
                                    }
                                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    new StringBuilder(71).append("Got byte count > 4, not orientation, continuing, formatCode=").append(b3);
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            new StringBuilder(37).append("Got invalid format code = ").append(b3);
                        }
                    }
                }
                return -1;
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                new StringBuilder(27).append("Unknown endianness = ").append(b4);
            }
        }
        byteOrder = ByteOrder.BIG_ENDIAN;
        aws.a(byteOrder);
        a = 6 + aws.a(10);
        b = aws.b(a);
        while (b4 < b) {
            i = (a + 2) + (b4 * 12);
            b2 = aws.b(i);
            if (b2 == (short) 274) {
                b3 = aws.b(i + 2);
                if (b3 <= (short) 0) {
                }
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    new StringBuilder(37).append("Got invalid format code = ").append(b3);
                }
            }
        }
        return -1;
    }
}
