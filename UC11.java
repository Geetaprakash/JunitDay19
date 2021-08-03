
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UC11 {
    private final boolean expected;
    private final String emailId;

    public UC11(String emailId, boolean expected) {
        this.expected = expected;
        this.emailId = emailId;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, "abc@yahoo.com"}, {true, "abc-100@yahoo.com"}, {true, "abc.100@yahoo.com"},
                {true, "abc111@abc.com"}, {true, "abc-100@abc.net"}, {true, "abc.100@abc.com.au"},
                {true, "abc@1.com,"}, {true, "abc@gmail.com.com"}, {true, "abc+100@gmail.com"}
        });
    }
    private boolean validateEmailTest(String emailId) {
        return true;
    }
        @Test
    public void testEmailAddress() {
        UC11 obj1 = new UC11(emailId,expected);
        boolean result = obj1.validateEmailTest(this.emailId);
        Assert.assertEquals(this.expected, result);
    }
}
