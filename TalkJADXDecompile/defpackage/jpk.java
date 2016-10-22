package defpackage;

/* renamed from: jpk */
final class jpk {
    int a;
    int b;
    String c;
    jpk d;

    public jpk(int i, int i2) {
        this(i, i2, null);
    }

    private jpk(int i, int i2, jpk jpk) {
        this.a = i;
        this.b = i2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('-');
        switch (i) {
            case wi.z /*3*/:
                stringBuilder.append('l');
                break;
            case wi.s /*6*/:
                stringBuilder.append('A');
                break;
            case wi.q /*7*/:
                stringBuilder.append('B');
                break;
            case wi.m /*8*/:
                stringBuilder.append('C');
                break;
        }
        switch (i2) {
            case wi.j /*1*/:
                stringBuilder.append('p');
                break;
            case wi.l /*2*/:
                stringBuilder.append('s');
                break;
            case wi.z /*3*/:
                stringBuilder.append('h');
                break;
        }
        this.c = stringBuilder.toString();
        this.d = jpk;
    }

    public jpk a(jpk jpk) {
        return new jpk(this.a, this.b, jpk);
    }
}
