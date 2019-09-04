import fr.lacombe.bank.Bank;
import fr.lacombe.bank.Printer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BankAcceptanceTest {
    @Test
    void rename_me() {
        Printer printer = mock(Printer.class);

        // In order to save money
        //
        // As a bank client
        Session session = Bank.authenticateClient(credentials);

        Bank.deposit(amount, session, account)

        // I want to make a deposit in my account
        Bank.printAccountStatement(session, account);
        verify(printer).print("| account number | date       | operation | balance  |" + System.lineSeparator()
                        +     "|            001 | MM/dd/YYYY | +1000.00  | +1000.00 |"
        );

    }
}