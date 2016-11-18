package p000;

import android.net.Uri;

public final class cjs {
    public final String f5443a;
    public final cju f5444b;
    public long f5445c;
    long f5446d;
    Uri f5447e;
    String f5448f;
    public long f5449g;
    public boolean f5450h;
    public long f5451i;
    int f5452j;
    int f5453k;
    int f5454l;

    cjs(String str, cju cju) {
        this.f5443a = str;
        this.f5444b = cju;
    }

    public String toString() {
        String str = this.f5443a;
        long j = this.f5446d;
        long j2 = this.f5445c;
        String valueOf = String.valueOf(this.f5447e);
        String str2 = this.f5448f;
        String valueOf2 = String.valueOf(this.f5444b);
        long j3 = this.f5449g;
        long j4 = this.f5451i;
        int i = this.f5452j;
        int i2 = this.f5453k;
        return new StringBuilder((((String.valueOf(str).length() + 252) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append("MediaStoreData{fileName=").append(str).append(", rowId=").append(j).append("fileSize=").append(j2).append(", uri=").append(valueOf).append(", mimeType='").append(str2).append("', type=").append(valueOf2).append(", dateTaken=").append(j3).append(", videoDuration=").append(j4).append(", videoHeight=").append(i).append(", videoWidth=").append(i2).append(", videoRotation=").append(this.f5454l).append("}").toString();
    }
}
