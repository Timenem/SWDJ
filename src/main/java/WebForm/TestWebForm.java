package WebForm;

import Base.BasePage;
import org.junit.jupiter.api.Test;

public class TestWebForm extends BasePage {
//    String textVal,String passwordVal,String textAreaVal
    @Test
    public void checkWebForm() {
    WebForm webForm = new WebForm(driver);
    webForm.sendDate("k","kml","kml");

    }
}
