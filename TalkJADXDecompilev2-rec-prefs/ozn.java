package p000;

public final class ozn extends nyx<ozn> {
    public /* synthetic */ nzf m40038a(nyt nyt) {
        return m40036b(nyt);
    }

    public ozn() {
        m40037d();
    }

    private ozn m40037d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ozn)) {
            return false;
        }
        ozn ozn = (ozn) obj;
        if (this.unknownFieldData != null && !this.unknownFieldData.m37228b()) {
            return this.unknownFieldData.equals(ozn.unknownFieldData);
        }
        if (ozn.unknownFieldData == null || ozn.unknownFieldData.m37228b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        if (this.unknownFieldData == null || this.unknownFieldData.m37228b()) {
            i = 0;
        } else {
            i = this.unknownFieldData.hashCode();
        }
        return i + hashCode;
    }

    private ozn m40036b(nyt nyt) {
        int a;
        do {
            a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                default:
                    break;
            }
            return this;
        } while (super.a(nyt, a));
        return this;
    }
}
