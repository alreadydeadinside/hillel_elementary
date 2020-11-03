package hw_1;

import java.io.IOException;

public interface DefaultService {
    public boolean entityVerification(MainEntity mainEntity) throws IOException;
    public void userDataWritten(MainEntity mainEntity) throws IOException;
}