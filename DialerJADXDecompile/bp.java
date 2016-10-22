import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;

/* compiled from: PG */
final class bp extends br {
    int[] a;
    int b;
    float c;
    int d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Cap j;
    Join k;
    float l;
    private int p;

    public bp() {
        this.b = 0;
        this.c = 0.0f;
        this.d = 0;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Cap.BUTT;
        this.k = Join.MITER;
        this.l = 4.0f;
    }

    public bp(bp bpVar) {
        super(bpVar);
        this.b = 0;
        this.c = 0.0f;
        this.d = 0;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Cap.BUTT;
        this.k = Join.MITER;
        this.l = 4.0f;
        this.a = bpVar.a;
        this.b = bpVar.b;
        this.c = bpVar.c;
        this.e = bpVar.e;
        this.d = bpVar.d;
        this.p = bpVar.p;
        this.f = bpVar.f;
        this.g = bpVar.g;
        this.h = bpVar.h;
        this.i = bpVar.i;
        this.j = bpVar.j;
        this.k = bpVar.k;
        this.l = bpVar.l;
    }
}
