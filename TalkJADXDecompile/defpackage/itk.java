package defpackage;

/* renamed from: itk */
public final class itk {
    private final String a;
    private String b;

    public itk(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public itk a(String str) {
        this.b = str;
        return this;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append("JoinInfo(hangoutId=").append(str).append(",localParticipantId=").append(str2).append(")").toString();
    }
}
