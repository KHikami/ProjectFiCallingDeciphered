package defpackage;

import android.net.Uri;

/* renamed from: cjs */
public final class cjs {
    public final String a;
    public final cju b;
    public long c;
    long d;
    Uri e;
    String f;
    public long g;
    public boolean h;
    public long i;
    int j;
    int k;
    int l;

    cjs(String str, cju cju) {
        this.a = str;
        this.b = cju;
    }

    public String toString() {
        String str = this.a;
        long j = this.d;
        long j2 = this.c;
        String valueOf = String.valueOf(this.e);
        String str2 = this.f;
        String valueOf2 = String.valueOf(this.b);
        long j3 = this.g;
        long j4 = this.i;
        int i = this.j;
        int i2 = this.k;
        return new StringBuilder((((String.valueOf(str).length() + 252) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append("MediaStoreData{fileName=").append(str).append(", rowId=").append(j).append("fileSize=").append(j2).append(", uri=").append(valueOf).append(", mimeType='").append(str2).append("', type=").append(valueOf2).append(", dateTaken=").append(j3).append(", videoDuration=").append(j4).append(", videoHeight=").append(i).append(", videoWidth=").append(i2).append(", videoRotation=").append(this.l).append("}").toString();
    }
}
