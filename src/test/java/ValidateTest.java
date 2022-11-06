import com.saxion.utils.Validate;
import org.junit.jupiter.api.Test;

public class ValidateTest {
    @Test
    public void ValidateEmail() {
        assert Validate.IsEmailValid("user@example.com");
        assert Validate.IsEmailValid("test@email.eu");
        assert !Validate.IsEmailValid("invalid@email");
        assert !Validate.IsEmailValid("invalid@.com");
    }

    @Test
    public void ValidateDate() {
        assert Validate.IsDateValid("01-01-2021");
        assert Validate.IsDateValid("31-12-2021");
        assert !Validate.IsDateValid("32-01-2021");
        assert !Validate.IsDateValid("01-13-2021");
        assert !Validate.IsDateValid("01-01-202");
    }

    @Test
    public void ValidatePhoneNumber() {
        assert Validate.IsPhoneNumberValid("+31612345678");
        assert Validate.IsPhoneNumberValid("0612345678");
        assert Validate.IsPhoneNumberValid("664702803");
        assert !Validate.IsPhoneNumberValid("0612345678a");
    }
}
