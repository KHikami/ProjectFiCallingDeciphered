import java.util.List;

final class dum implements Runnable {
    final /* synthetic */ bls a;
    final /* synthetic */ String b;
    final /* synthetic */ duk c;

    dum(duk duk, bls bls, String str) {
        this.c = duk;
        this.a = bls;
        this.b = str;
    }

    public void run() {
        String str;
        String str2;
        if (this.a != null) {
            duk duk = this.c;
            str = this.b;
            bls bls = this.a;
            List<frj> c = duk.c(str);
            if (!(c == null || c.size() == 0)) {
                duk.d = false;
                for (frj frj : c) {
                    ((bkk) frj).b.a(bls);
                }
            }
            str2 = "Notify conversation load succeed for ";
            str = String.valueOf(this.b);
            if (str.length() != 0) {
                str2.concat(str);
                return;
            } else {
                str = new String(str2);
                return;
            }
        }
        this.c.a(this.b);
        str2 = "Notify conversation load failed for ";
        str = String.valueOf(this.b);
        if (str.length() != 0) {
            str2.concat(str);
        } else {
            str = new String(str2);
        }
    }
}
