package zone01dakar.productservice.error;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrorResponse {
    private List<String> errors = new ArrayList<>();

    public void addError(String error) {
        this.errors.add(error);
    }

    public List<String> getErrors() {
        return errors;
    }
}
