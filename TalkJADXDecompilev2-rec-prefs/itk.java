package p000;

public final class itk {
    private final String f18968a;
    private String f18969b;

    public itk(String str) {
        this.f18968a = str;
    }

    public String m23222a() {
        return this.f18968a;
    }

    public itk m23221a(String str) {
        this.f18969b = str;
        return this;
    }

    public String m23223b() {
        return this.f18969b;
    }

    public String toString() {
        String str = this.f18968a;
        String str2 = this.f18969b;
        return new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append("JoinInfo(hangoutId=").append(str).append(",localParticipantId=").append(str2).append(")").toString();
    }
}
