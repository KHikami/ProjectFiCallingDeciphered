package defpackage;

/* compiled from: PG */
/* renamed from: aef */
public final class aef extends aax {
    public long f;
    public String g;
    String h;
    String i;
    int j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public String o;

    public aef(boolean z, boolean z2) {
        super(z, true);
        this.m = -1;
        this.n = true;
    }

    public final boolean a() {
        return this.j == 0 || this.j == 1;
    }

    public final String toString() {
        long j = this.f;
        String str = this.g;
        String str2 = this.h;
        String str3 = this.i;
        int i = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        int i2 = this.m;
        String str4 = this.o;
        return new StringBuilder((((String.valueOf(str).length() + 212) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("DirectoryPartition{mDirectoryId=").append(j).append(", mContentUri='").append(str).append("', mDirectoryType='").append(str2).append("', mDisplayName='").append(str3).append("', mStatus=").append(i).append(", mPriorityDirectory=").append(z).append(", mPhotoSupported=").append(z2).append(", mResultLimit=").append(i2).append(", mLabel='").append(str4).append("'}").toString();
    }
}
