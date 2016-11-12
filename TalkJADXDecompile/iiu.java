import android.content.Context;

public class iiu {//account username holder it seems (since the string that's passed to gss is used as
    //username for the newly accounted account it seems...

    final String a;

    public String a() {
        return this.a;
    }

    public String a(Context context, String str) {

        return gss.a(context, this.a, str);//gss.a(Context,String,String)
        //this gss method is being deprecated => iiu won't get called for this...
        //but seems to used to be a account maker
    }

    public void b(Context context, String str) {
        iiq.a(new iiw(this, context, str));//failed to compile object fed into a Async Task generator
    }

    public iiu(String str) {
        this.a = str;
    }
}
