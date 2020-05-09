import org.junit.*;

public class TestNPE {

    @Test
    public void true_npe() {
        try {
            Object o = null;
            o.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Test
    public void throw_npe() {
        throw new NullPointerException("My own message");
    }
}
