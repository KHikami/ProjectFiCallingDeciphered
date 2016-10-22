import java.io.File;

public class atp<Data> implements auj<File, Data> {
    private final ats<Data> a;

    public atp(ats<Data> ats_Data) {
        this.a = ats_Data;
    }

    public final auh<File, Data> a(aup aup) {
        return new ato(this.a);
    }

    public atp() {
        this(new atq());
    }

    public atp(byte b) {
        this(new att());
    }
}
