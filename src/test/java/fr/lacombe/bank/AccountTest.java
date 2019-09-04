package fr.lacombe.bank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void deposit_increase_account_balance() {
        int deposedAmount = 100;
        Account account = new Account();
        int balance = account.deposit(deposedAmount);
        assertThat(balance).isEqualTo(deposedAmount);
    }

    @Test
    void deposit_increase_account_balance_triangulation() {
        Account account = new Account();
        int deposedAmount = 30;
        int balance = account.deposit(deposedAmount);
        assertThat(balance).isEqualTo(deposedAmount);
    }
}

