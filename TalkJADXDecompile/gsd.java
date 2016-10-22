import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;

public final class gsd {
    private hxz a;

    public gsd() {
        this(new hxz());
    }

    public gsd(hxz hxz) {
        this.a = hxz;
    }

    public void a(String str) {
        this.a.a("7", str);
    }

    public void a(ArrayList<hxz> arrayList) {
        this.a.a("16", (ArrayList) arrayList);
    }

    public String a() {
        return this.a.b("18", "");
    }

    public void b(String str) {
        this.a.a("18", str);
    }

    public void c(String str) {
        this.a.a("23", str);
    }

    public void a(Asset asset) {
        this.a.a("5", asset);
    }

    public Asset b() {
        return this.a.f("5");
    }

    public long c() {
        return this.a.d("26");
    }

    public void a(long j) {
        this.a.a("26", j);
    }

    public void a(boolean z) {
        this.a.a("11", z);
    }

    public void b(boolean z) {
        this.a.a("14", z);
    }

    public void d(String str) {
        this.a.a("27", str);
    }

    public void a(int i) {
        this.a.a("22", i - 1);
    }

    public void b(int i) {
        this.a.a("34", i);
    }

    public void b(ArrayList<String> arrayList) {
        this.a.c("30", arrayList);
    }

    public void e(String str) {
        this.a.a("31", str);
    }

    public void c(boolean z) {
        this.a.a("33", z);
    }
}
