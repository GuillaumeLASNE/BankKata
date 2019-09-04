package fr.lacombe.bank;

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
    void balance_is_the_sum_of_deposits() {
        int firstDeposit = 80;
        int secondDeposit = 70;
        Account account = new Account();

        account.deposit(firstDeposit);
        int balance = account.deposit(secondDeposit);


        int sumOfDeposits = firstDeposit + secondDeposit;
        assertThat(balance).isEqualTo(sumOfDeposits);
    }
}

