import com.thoughtworks.gauge.Step;

/**
 * Created by limsim on 14/10/2016.
 */
public class gooImpl {
    @Step("goo")
    public void implementation1() {
        System.out.println("********************* goo");
    }

    @Step("hoo")
    public void implementation2() {
        System.out.println("********************* hoo");
    }

    @Step("ioo")
    public void implementation3() {
        System.out.println("********************* ioo");
    }
}
