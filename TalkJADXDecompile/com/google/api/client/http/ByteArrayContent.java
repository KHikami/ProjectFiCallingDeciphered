package com.google.api.client.http;

import bc;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import kgn;

public final class ByteArrayContent extends AbstractInputStreamContent {
    private final byte[] byteArray;
    private final int length;
    private final int offset;

    public ByteArrayContent(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    public ByteArrayContent(String str, byte[] bArr, int i, int i2) {
        boolean z;
        super(str);
        this.byteArray = (byte[]) bc.a((Object) bArr);
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            z = false;
        } else {
            z = true;
        }
        bc.a(z, "offset %s, length %s, array length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length));
        this.offset = i;
        this.length = i2;
    }

    public static ByteArrayContent fromString(String str, String str2) {
        return new ByteArrayContent(str, kgn.a(str2));
    }

    public long getLength() {
        return (long) this.length;
    }

    public boolean retrySupported() {
        return true;
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.byteArray, this.offset, this.length);
    }

    public ByteArrayContent setType(String str) {
        return (ByteArrayContent) super.setType(str);
    }

    public ByteArrayContent setCloseInputStream(boolean z) {
        return (ByteArrayContent) super.setCloseInputStream(z);
    }
}
