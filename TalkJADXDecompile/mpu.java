import java.text.MessageFormat;

final class mpu extends mps<Object> {
    mpu(Object obj) {
        super(obj);
    }

    protected String a() {
        return ((MessageFormat) mpt.a.clone()).format(new Object[]{this.b}, new StringBuffer(), null).toString();
    }
}
