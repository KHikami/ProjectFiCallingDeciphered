package p000;

final class jpk {
    int f20693a;
    int f20694b;
    String f20695c;
    jpk f20696d;

    public jpk(int i, int i2) {
        this(i, i2, null);
    }

    private jpk(int i, int i2, jpk jpk) {
        this.f20693a = i;
        this.f20694b = i2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('-');
        switch (i) {
            case 3:
                stringBuilder.append('l');
                break;
            case 6:
                stringBuilder.append('A');
                break;
            case 7:
                stringBuilder.append('B');
                break;
            case 8:
                stringBuilder.append('C');
                break;
        }
        switch (i2) {
            case 1:
                stringBuilder.append('p');
                break;
            case 2:
                stringBuilder.append('s');
                break;
            case 3:
                stringBuilder.append('h');
                break;
        }
        this.f20695c = stringBuilder.toString();
        this.f20696d = jpk;
    }

    public jpk m24929a(jpk jpk) {
        return new jpk(this.f20693a, this.f20694b, jpk);
    }
}
